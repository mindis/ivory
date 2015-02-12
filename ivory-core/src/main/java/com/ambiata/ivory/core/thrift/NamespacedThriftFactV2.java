/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ambiata.ivory.core.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NamespacedThriftFactV2 implements org.apache.thrift.TBase<NamespacedThriftFactV2, NamespacedThriftFactV2._Fields>, java.io.Serializable, Cloneable, Comparable<NamespacedThriftFactV2> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("NamespacedThriftFactV2");

  private static final org.apache.thrift.protocol.TField ENTY_FIELD_DESC = new org.apache.thrift.protocol.TField("enty", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField FINDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("findex", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField TVALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("tvalue", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField YYYY_MMDD_FIELD_DESC = new org.apache.thrift.protocol.TField("yyyyMMdd", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField SECS_FIELD_DESC = new org.apache.thrift.protocol.TField("secs", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new NamespacedThriftFactV2StandardSchemeFactory());
    schemes.put(TupleScheme.class, new NamespacedThriftFactV2TupleSchemeFactory());
  }

  public String enty; // required
  public int findex; // required
  public ThriftFactValue tvalue; // required
  public int yyyyMMdd; // required
  public int secs; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ENTY((short)1, "enty"),
    FINDEX((short)2, "findex"),
    TVALUE((short)3, "tvalue"),
    YYYY_MMDD((short)4, "yyyyMMdd"),
    SECS((short)5, "secs");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ENTY
          return ENTY;
        case 2: // FINDEX
          return FINDEX;
        case 3: // TVALUE
          return TVALUE;
        case 4: // YYYY_MMDD
          return YYYY_MMDD;
        case 5: // SECS
          return SECS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __FINDEX_ISSET_ID = 0;
  private static final int __YYYYMMDD_ISSET_ID = 1;
  private static final int __SECS_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.SECS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ENTY, new org.apache.thrift.meta_data.FieldMetaData("enty", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FINDEX, new org.apache.thrift.meta_data.FieldMetaData("findex", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TVALUE, new org.apache.thrift.meta_data.FieldMetaData("tvalue", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThriftFactValue.class)));
    tmpMap.put(_Fields.YYYY_MMDD, new org.apache.thrift.meta_data.FieldMetaData("yyyyMMdd", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SECS, new org.apache.thrift.meta_data.FieldMetaData("secs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NamespacedThriftFactV2.class, metaDataMap);
  }

  public NamespacedThriftFactV2() {
  }

  public NamespacedThriftFactV2(
    String enty,
    int findex,
    ThriftFactValue tvalue,
    int yyyyMMdd)
  {
    this();
    this.enty = enty;
    this.findex = findex;
    setFindexIsSet(true);
    this.tvalue = tvalue;
    this.yyyyMMdd = yyyyMMdd;
    setYyyyMMddIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NamespacedThriftFactV2(NamespacedThriftFactV2 other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetEnty()) {
      this.enty = other.enty;
    }
    this.findex = other.findex;
    if (other.isSetTvalue()) {
      this.tvalue = new ThriftFactValue(other.tvalue);
    }
    this.yyyyMMdd = other.yyyyMMdd;
    this.secs = other.secs;
  }

  public NamespacedThriftFactV2 deepCopy() {
    return new NamespacedThriftFactV2(this);
  }

  @Override
  public void clear() {
    this.enty = null;
    setFindexIsSet(false);
    this.findex = 0;
    this.tvalue = null;
    setYyyyMMddIsSet(false);
    this.yyyyMMdd = 0;
    setSecsIsSet(false);
    this.secs = 0;
  }

  public String getEnty() {
    return this.enty;
  }

  public NamespacedThriftFactV2 setEnty(String enty) {
    this.enty = enty;
    return this;
  }

  public void unsetEnty() {
    this.enty = null;
  }

  /** Returns true if field enty is set (has been assigned a value) and false otherwise */
  public boolean isSetEnty() {
    return this.enty != null;
  }

  public void setEntyIsSet(boolean value) {
    if (!value) {
      this.enty = null;
    }
  }

  public int getFindex() {
    return this.findex;
  }

  public NamespacedThriftFactV2 setFindex(int findex) {
    this.findex = findex;
    setFindexIsSet(true);
    return this;
  }

  public void unsetFindex() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FINDEX_ISSET_ID);
  }

  /** Returns true if field findex is set (has been assigned a value) and false otherwise */
  public boolean isSetFindex() {
    return EncodingUtils.testBit(__isset_bitfield, __FINDEX_ISSET_ID);
  }

  public void setFindexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FINDEX_ISSET_ID, value);
  }

  public ThriftFactValue getTvalue() {
    return this.tvalue;
  }

  public NamespacedThriftFactV2 setTvalue(ThriftFactValue tvalue) {
    this.tvalue = tvalue;
    return this;
  }

  public void unsetTvalue() {
    this.tvalue = null;
  }

  /** Returns true if field tvalue is set (has been assigned a value) and false otherwise */
  public boolean isSetTvalue() {
    return this.tvalue != null;
  }

  public void setTvalueIsSet(boolean value) {
    if (!value) {
      this.tvalue = null;
    }
  }

  public int getYyyyMMdd() {
    return this.yyyyMMdd;
  }

  public NamespacedThriftFactV2 setYyyyMMdd(int yyyyMMdd) {
    this.yyyyMMdd = yyyyMMdd;
    setYyyyMMddIsSet(true);
    return this;
  }

  public void unsetYyyyMMdd() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __YYYYMMDD_ISSET_ID);
  }

  /** Returns true if field yyyyMMdd is set (has been assigned a value) and false otherwise */
  public boolean isSetYyyyMMdd() {
    return EncodingUtils.testBit(__isset_bitfield, __YYYYMMDD_ISSET_ID);
  }

  public void setYyyyMMddIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __YYYYMMDD_ISSET_ID, value);
  }

  public int getSecs() {
    return this.secs;
  }

  public NamespacedThriftFactV2 setSecs(int secs) {
    this.secs = secs;
    setSecsIsSet(true);
    return this;
  }

  public void unsetSecs() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SECS_ISSET_ID);
  }

  /** Returns true if field secs is set (has been assigned a value) and false otherwise */
  public boolean isSetSecs() {
    return EncodingUtils.testBit(__isset_bitfield, __SECS_ISSET_ID);
  }

  public void setSecsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SECS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ENTY:
      if (value == null) {
        unsetEnty();
      } else {
        setEnty((String)value);
      }
      break;

    case FINDEX:
      if (value == null) {
        unsetFindex();
      } else {
        setFindex((Integer)value);
      }
      break;

    case TVALUE:
      if (value == null) {
        unsetTvalue();
      } else {
        setTvalue((ThriftFactValue)value);
      }
      break;

    case YYYY_MMDD:
      if (value == null) {
        unsetYyyyMMdd();
      } else {
        setYyyyMMdd((Integer)value);
      }
      break;

    case SECS:
      if (value == null) {
        unsetSecs();
      } else {
        setSecs((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ENTY:
      return getEnty();

    case FINDEX:
      return Integer.valueOf(getFindex());

    case TVALUE:
      return getTvalue();

    case YYYY_MMDD:
      return Integer.valueOf(getYyyyMMdd());

    case SECS:
      return Integer.valueOf(getSecs());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ENTY:
      return isSetEnty();
    case FINDEX:
      return isSetFindex();
    case TVALUE:
      return isSetTvalue();
    case YYYY_MMDD:
      return isSetYyyyMMdd();
    case SECS:
      return isSetSecs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof NamespacedThriftFactV2)
      return this.equals((NamespacedThriftFactV2)that);
    return false;
  }

  public boolean equals(NamespacedThriftFactV2 that) {
    if (that == null)
      return false;

    boolean this_present_enty = true && this.isSetEnty();
    boolean that_present_enty = true && that.isSetEnty();
    if (this_present_enty || that_present_enty) {
      if (!(this_present_enty && that_present_enty))
        return false;
      if (!this.enty.equals(that.enty))
        return false;
    }

    boolean this_present_findex = true;
    boolean that_present_findex = true;
    if (this_present_findex || that_present_findex) {
      if (!(this_present_findex && that_present_findex))
        return false;
      if (this.findex != that.findex)
        return false;
    }

    boolean this_present_tvalue = true && this.isSetTvalue();
    boolean that_present_tvalue = true && that.isSetTvalue();
    if (this_present_tvalue || that_present_tvalue) {
      if (!(this_present_tvalue && that_present_tvalue))
        return false;
      if (!this.tvalue.equals(that.tvalue))
        return false;
    }

    boolean this_present_yyyyMMdd = true;
    boolean that_present_yyyyMMdd = true;
    if (this_present_yyyyMMdd || that_present_yyyyMMdd) {
      if (!(this_present_yyyyMMdd && that_present_yyyyMMdd))
        return false;
      if (this.yyyyMMdd != that.yyyyMMdd)
        return false;
    }

    boolean this_present_secs = true && this.isSetSecs();
    boolean that_present_secs = true && that.isSetSecs();
    if (this_present_secs || that_present_secs) {
      if (!(this_present_secs && that_present_secs))
        return false;
      if (this.secs != that.secs)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(NamespacedThriftFactV2 other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetEnty()).compareTo(other.isSetEnty());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEnty()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.enty, other.enty);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFindex()).compareTo(other.isSetFindex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFindex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.findex, other.findex);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTvalue()).compareTo(other.isSetTvalue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTvalue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tvalue, other.tvalue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetYyyyMMdd()).compareTo(other.isSetYyyyMMdd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetYyyyMMdd()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.yyyyMMdd, other.yyyyMMdd);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSecs()).compareTo(other.isSetSecs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSecs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.secs, other.secs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("NamespacedThriftFactV2(");
    boolean first = true;

    sb.append("enty:");
    if (this.enty == null) {
      sb.append("null");
    } else {
      sb.append(this.enty);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("findex:");
    sb.append(this.findex);
    first = false;
    if (!first) sb.append(", ");
    sb.append("tvalue:");
    if (this.tvalue == null) {
      sb.append("null");
    } else {
      sb.append(this.tvalue);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("yyyyMMdd:");
    sb.append(this.yyyyMMdd);
    first = false;
    if (isSetSecs()) {
      if (!first) sb.append(", ");
      sb.append("secs:");
      sb.append(this.secs);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class NamespacedThriftFactV2StandardSchemeFactory implements SchemeFactory {
    public NamespacedThriftFactV2StandardScheme getScheme() {
      return new NamespacedThriftFactV2StandardScheme();
    }
  }

  private static class NamespacedThriftFactV2StandardScheme extends StandardScheme<NamespacedThriftFactV2> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, NamespacedThriftFactV2 struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ENTY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.enty = iprot.readString();
              struct.setEntyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FINDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.findex = iprot.readI32();
              struct.setFindexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TVALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.tvalue = new ThriftFactValue();
              struct.tvalue.read(iprot);
              struct.setTvalueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // YYYY_MMDD
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.yyyyMMdd = iprot.readI32();
              struct.setYyyyMMddIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SECS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.secs = iprot.readI32();
              struct.setSecsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, NamespacedThriftFactV2 struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.enty != null) {
        oprot.writeFieldBegin(ENTY_FIELD_DESC);
        oprot.writeString(struct.enty);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(FINDEX_FIELD_DESC);
      oprot.writeI32(struct.findex);
      oprot.writeFieldEnd();
      if (struct.tvalue != null) {
        oprot.writeFieldBegin(TVALUE_FIELD_DESC);
        struct.tvalue.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(YYYY_MMDD_FIELD_DESC);
      oprot.writeI32(struct.yyyyMMdd);
      oprot.writeFieldEnd();
      if (struct.isSetSecs()) {
        oprot.writeFieldBegin(SECS_FIELD_DESC);
        oprot.writeI32(struct.secs);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class NamespacedThriftFactV2TupleSchemeFactory implements SchemeFactory {
    public NamespacedThriftFactV2TupleScheme getScheme() {
      return new NamespacedThriftFactV2TupleScheme();
    }
  }

  private static class NamespacedThriftFactV2TupleScheme extends TupleScheme<NamespacedThriftFactV2> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, NamespacedThriftFactV2 struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetEnty()) {
        optionals.set(0);
      }
      if (struct.isSetFindex()) {
        optionals.set(1);
      }
      if (struct.isSetTvalue()) {
        optionals.set(2);
      }
      if (struct.isSetYyyyMMdd()) {
        optionals.set(3);
      }
      if (struct.isSetSecs()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetEnty()) {
        oprot.writeString(struct.enty);
      }
      if (struct.isSetFindex()) {
        oprot.writeI32(struct.findex);
      }
      if (struct.isSetTvalue()) {
        struct.tvalue.write(oprot);
      }
      if (struct.isSetYyyyMMdd()) {
        oprot.writeI32(struct.yyyyMMdd);
      }
      if (struct.isSetSecs()) {
        oprot.writeI32(struct.secs);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, NamespacedThriftFactV2 struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.enty = iprot.readString();
        struct.setEntyIsSet(true);
      }
      if (incoming.get(1)) {
        struct.findex = iprot.readI32();
        struct.setFindexIsSet(true);
      }
      if (incoming.get(2)) {
        struct.tvalue = new ThriftFactValue();
        struct.tvalue.read(iprot);
        struct.setTvalueIsSet(true);
      }
      if (incoming.get(3)) {
        struct.yyyyMMdd = iprot.readI32();
        struct.setYyyyMMddIsSet(true);
      }
      if (incoming.get(4)) {
        struct.secs = iprot.readI32();
        struct.setSecsIsSet(true);
      }
    }
  }

}

