package com.ambiata.ivory.cli

import org.apache.hadoop.io.compress.{CompressionCodec, SnappyCodec}

object Codec {

  // This should be the _only_ place where we need to specify Snappy directly
  def apply(): Option[CompressionCodec] =
    sys.env.get("IVORY_NO_CODEC").map { _ =>
      println("*** WARNING: Codec has been disabled - do NOT do this in production! ***")
      None
    }.getOrElse(Some(new SnappyCodec))
}
