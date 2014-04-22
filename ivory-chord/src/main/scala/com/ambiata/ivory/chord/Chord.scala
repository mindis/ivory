package com.ambiata.ivory.chord

import com.nicta.scoobi.Scoobi._
import scalaz.{DList => _, _}, Scalaz._, effect._
import scala.math.{Ordering => SOrdering}
import org.joda.time.{LocalDate, LocalDateTime}
import org.apache.hadoop.fs.Path
import java.util.HashMap 
import com.ambiata.mundane.io._
import com.ambiata.mundane.time.DateTimex
import com.ambiata.mundane.parse._

import com.ambiata.ivory.core._
import com.ambiata.ivory.scoobi.WireFormats._
import com.ambiata.ivory.scoobi.ScoobiAction
import com.ambiata.ivory.storage._
import com.ambiata.ivory.validate.Validate
import com.ambiata.ivory.alien.hdfs._

case class HdfsChord(repoPath: Path, store: String, dictName: String, entities: Path, errorPath: Path, storer: IvoryScoobiStorer[Fact, DList[_]]) {
  import IvoryStorage._

  type Priority = Short

  def withStorer(newStorer: IvoryScoobiStorer[Fact, DList[_]]): HdfsChord =
    copy(storer = newStorer)

  def run: ScoobiAction[Unit] = for {
    r  <- ScoobiAction.value(Repository.fromHdfsPath(repoPath))
    d  <- ScoobiAction.fromHdfs(dictionaryFromIvory(r, dictName))
    s  <- ScoobiAction.fromHdfs(storeFromIvory(r, store))
    es <- ScoobiAction.fromHdfs(readEntities(entities))
    _  <- scoobiJob(r, d, s, es)
    _  <- storer.storeMeta
  } yield ()

  def readEntities(path: Path): Hdfs[HashMap[EntityId, ShortDate]] = for {
    lines <- Hdfs.readWith(path, is => Streams.read(is)).map(_.lines.toList)
    map   <- Hdfs.fromDisjunction(parseLines(lines))
  } yield map

  def parseLines(lines: List[String]): String \/ HashMap[EntityId, ShortDate] =
    lines.traverseU(l => Chord.entityParser.run(Delimited.parsePsv(l)).disjunction).map(entries => {
      val map = new HashMap[EntityId, ShortDate]
      entries.foreach({ case (k, v) => map.put(k, v) })
      map
    })

  def scoobiJob(repo: HdfsRepository, dict: Dictionary, store: FeatureStore, entities: HashMap[EntityId, ShortDate]): ScoobiAction[Unit] =
    ScoobiAction.scoobiJob({ implicit sc: ScoobiConfiguration =>
      lazy val factsetMap = store.factSets.map(fs => (fs.priority.toShort, fs.name)).toMap

      factsFromIvoryStore(repo, store).map(input => {
        val errors: DList[String] = input.collect {
          case -\/(e) => e
        }

        def ofInterest(f: Fact): Boolean =
          Option(entities.get(EntityId.fromString(f.entity))).map(sd => f.date.isBefore(sd.localDate)).getOrElse(false)

        val facts: DList[(Priority, Fact)] = input.collect {
          case \/-((p, _, f)) if ofInterest(f) => (p.toShort, f)
        }

        /*
         * 1. group by entity and feature id
         * 2. take the minimum fact in the group using fact time then priority to determine order
         */
        implicit val revDateOrder: Order[LocalDateTime] = DateTimex.LocalDateTimeHasOrder.reverseOrder
        val ord: Order[(Priority, Fact)] = Order.orderBy { case (p, f) => (f.time, p) }
        val latest: DList[(Priority, Fact)] = facts.groupBy { case (p, f) => (f.entity, f.featureId.toString) }
                                                   .reduceValues(Reduction.minimum(ord))
                                                   .collect { case (_, (p, f)) if !f.isTombstone => (p, f) }

        val validated: DList[String \/ Fact] = latest.map({ case (p, f) =>
          Validate.validateFact(f, dict).disjunction.leftMap(e => e + " - Factset " + factsetMap.get(p).getOrElse("Unknown, priority " + p))
        })

        val valErrors = validated.collect {
          case -\/(e) => e
        }

        val good = validated.collect {
          case \/-(f) => f
        }

        persist(errors.toTextFile((new Path(errorPath, "parse")).toString),
                valErrors.toTextFile((new Path(errorPath, "validation")).toString),
                storer.storeScoobi(good))(sc)
        ()
      })
    }).flatten
}

object Chord {

  def onHdfs(repoPath: Path, store: String, dictName: String, entities: Path, output: Path, errorPath: Path, storer: IvoryScoobiStorer[Fact, DList[_]]): ScoobiAction[Unit] =
    HdfsChord(repoPath, store, dictName, entities, errorPath, storer).run

  def entityParser: ListParser[(EntityId, ShortDate)] = {
    import ListParser._
    for {
      e <- string.nonempty
      d <- localDate
    } yield (EntityId.fromString(e), ShortDate(d.getYear.toShort, d.getMonthOfYear.toByte, d.getDayOfMonth.toByte))
  }
}

case class EntityId(value: EntityIdValue) {
  def stringValue: String = value match {
    case StringEntityId(v) => v
    case IntEntityId(v)    => v.toString
  }
}

object EntityId {
  def fromString(str: String): EntityId =
    EntityId(str.parseInt.map(IntEntityId.apply).toOption.getOrElse(StringEntityId(str)))
}

sealed trait EntityIdValue
case class StringEntityId(v: String) extends EntityIdValue
case class IntEntityId(v: Int) extends EntityIdValue

case class ShortDate(year: Short, month: Byte, day: Byte) {
  def localDate: LocalDate =
    new LocalDate(year.toInt, month.toInt, day.toInt)
}
