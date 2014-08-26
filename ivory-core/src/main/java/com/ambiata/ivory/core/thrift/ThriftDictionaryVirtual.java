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

public class ThriftDictionaryVirtual implements org.apache.thrift.TBase<ThriftDictionaryVirtual, ThriftDictionaryVirtual._Fields>, java.io.Serializable, Cloneable, Comparable<ThriftDictionaryVirtual> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftDictionaryVirtual");

  private static final org.apache.thrift.protocol.TField ALIAS_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("aliasName", org.apache.thrift.protocol.TType.STRUCT, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ThriftDictionaryVirtualStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ThriftDictionaryVirtualTupleSchemeFactory());
  }

  public ThriftDictionaryFeatureId aliasName; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ALIAS_NAME((short)1, "aliasName");

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
        case 1: // ALIAS_NAME
          return ALIAS_NAME;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ALIAS_NAME, new org.apache.thrift.meta_data.FieldMetaData("aliasName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThriftDictionaryFeatureId.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftDictionaryVirtual.class, metaDataMap);
  }

  public ThriftDictionaryVirtual() {
  }

  public ThriftDictionaryVirtual(
    ThriftDictionaryFeatureId aliasName)
  {
    this();
    this.aliasName = aliasName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftDictionaryVirtual(ThriftDictionaryVirtual other) {
    if (other.isSetAliasName()) {
      this.aliasName = new ThriftDictionaryFeatureId(other.aliasName);
    }
  }

  public ThriftDictionaryVirtual deepCopy() {
    return new ThriftDictionaryVirtual(this);
  }

  @Override
  public void clear() {
    this.aliasName = null;
  }

  public ThriftDictionaryFeatureId getAliasName() {
    return this.aliasName;
  }

  public ThriftDictionaryVirtual setAliasName(ThriftDictionaryFeatureId aliasName) {
    this.aliasName = aliasName;
    return this;
  }

  public void unsetAliasName() {
    this.aliasName = null;
  }

  /** Returns true if field aliasName is set (has been assigned a value) and false otherwise */
  public boolean isSetAliasName() {
    return this.aliasName != null;
  }

  public void setAliasNameIsSet(boolean value) {
    if (!value) {
      this.aliasName = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ALIAS_NAME:
      if (value == null) {
        unsetAliasName();
      } else {
        setAliasName((ThriftDictionaryFeatureId)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ALIAS_NAME:
      return getAliasName();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ALIAS_NAME:
      return isSetAliasName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftDictionaryVirtual)
      return this.equals((ThriftDictionaryVirtual)that);
    return false;
  }

  public boolean equals(ThriftDictionaryVirtual that) {
    if (that == null)
      return false;

    boolean this_present_aliasName = true && this.isSetAliasName();
    boolean that_present_aliasName = true && that.isSetAliasName();
    if (this_present_aliasName || that_present_aliasName) {
      if (!(this_present_aliasName && that_present_aliasName))
        return false;
      if (!this.aliasName.equals(that.aliasName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(ThriftDictionaryVirtual other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAliasName()).compareTo(other.isSetAliasName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAliasName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.aliasName, other.aliasName);
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
    StringBuilder sb = new StringBuilder("ThriftDictionaryVirtual(");
    boolean first = true;

    sb.append("aliasName:");
    if (this.aliasName == null) {
      sb.append("null");
    } else {
      sb.append(this.aliasName);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (aliasName != null) {
      aliasName.validate();
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ThriftDictionaryVirtualStandardSchemeFactory implements SchemeFactory {
    public ThriftDictionaryVirtualStandardScheme getScheme() {
      return new ThriftDictionaryVirtualStandardScheme();
    }
  }

  private static class ThriftDictionaryVirtualStandardScheme extends StandardScheme<ThriftDictionaryVirtual> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThriftDictionaryVirtual struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ALIAS_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.aliasName = new ThriftDictionaryFeatureId();
              struct.aliasName.read(iprot);
              struct.setAliasNameIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThriftDictionaryVirtual struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.aliasName != null) {
        oprot.writeFieldBegin(ALIAS_NAME_FIELD_DESC);
        struct.aliasName.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThriftDictionaryVirtualTupleSchemeFactory implements SchemeFactory {
    public ThriftDictionaryVirtualTupleScheme getScheme() {
      return new ThriftDictionaryVirtualTupleScheme();
    }
  }

  private static class ThriftDictionaryVirtualTupleScheme extends TupleScheme<ThriftDictionaryVirtual> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ThriftDictionaryVirtual struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAliasName()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetAliasName()) {
        struct.aliasName.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThriftDictionaryVirtual struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.aliasName = new ThriftDictionaryFeatureId();
        struct.aliasName.read(iprot);
        struct.setAliasNameIsSet(true);
      }
    }
  }

}

