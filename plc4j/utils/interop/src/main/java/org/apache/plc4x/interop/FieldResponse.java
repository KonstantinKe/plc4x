/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.plc4x.interop;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-04-14")
public class FieldResponse implements org.apache.thrift.TBase<FieldResponse, FieldResponse._Fields>, java.io.Serializable, Cloneable, Comparable<FieldResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FieldResponse");

  private static final org.apache.thrift.protocol.TField RESPONSE_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("responseCode", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField BOOL_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("boolValue", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField LONG_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("longValue", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField DOUBLE_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("doubleValue", org.apache.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.thrift.protocol.TField STRING_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("stringValue", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new FieldResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new FieldResponseTupleSchemeFactory();

  /**
   * 
   * @see RESPONSE_CODE
   */
  public @org.apache.thrift.annotation.Nullable RESPONSE_CODE responseCode; // required
  public boolean boolValue; // optional
  public long longValue; // optional
  public double doubleValue; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String stringValue; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see RESPONSE_CODE
     */
    RESPONSE_CODE((short)1, "responseCode"),
    BOOL_VALUE((short)2, "boolValue"),
    LONG_VALUE((short)3, "longValue"),
    DOUBLE_VALUE((short)4, "doubleValue"),
    STRING_VALUE((short)5, "stringValue");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // RESPONSE_CODE
          return RESPONSE_CODE;
        case 2: // BOOL_VALUE
          return BOOL_VALUE;
        case 3: // LONG_VALUE
          return LONG_VALUE;
        case 4: // DOUBLE_VALUE
          return DOUBLE_VALUE;
        case 5: // STRING_VALUE
          return STRING_VALUE;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __BOOLVALUE_ISSET_ID = 0;
  private static final int __LONGVALUE_ISSET_ID = 1;
  private static final int __DOUBLEVALUE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.BOOL_VALUE,_Fields.LONG_VALUE,_Fields.DOUBLE_VALUE,_Fields.STRING_VALUE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESPONSE_CODE, new org.apache.thrift.meta_data.FieldMetaData("responseCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, RESPONSE_CODE.class)));
    tmpMap.put(_Fields.BOOL_VALUE, new org.apache.thrift.meta_data.FieldMetaData("boolValue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.LONG_VALUE, new org.apache.thrift.meta_data.FieldMetaData("longValue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DOUBLE_VALUE, new org.apache.thrift.meta_data.FieldMetaData("doubleValue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.STRING_VALUE, new org.apache.thrift.meta_data.FieldMetaData("stringValue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FieldResponse.class, metaDataMap);
  }

  public FieldResponse() {
  }

  public FieldResponse(
    RESPONSE_CODE responseCode)
  {
    this();
    this.responseCode = responseCode;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FieldResponse(FieldResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetResponseCode()) {
      this.responseCode = other.responseCode;
    }
    this.boolValue = other.boolValue;
    this.longValue = other.longValue;
    this.doubleValue = other.doubleValue;
    if (other.isSetStringValue()) {
      this.stringValue = other.stringValue;
    }
  }

  public FieldResponse deepCopy() {
    return new FieldResponse(this);
  }

  @Override
  public void clear() {
    this.responseCode = null;
    setBoolValueIsSet(false);
    this.boolValue = false;
    setLongValueIsSet(false);
    this.longValue = 0;
    setDoubleValueIsSet(false);
    this.doubleValue = 0.0;
    this.stringValue = null;
  }

  /**
   * 
   * @see RESPONSE_CODE
   */
  @org.apache.thrift.annotation.Nullable
  public RESPONSE_CODE getResponseCode() {
    return this.responseCode;
  }

  /**
   * 
   * @see RESPONSE_CODE
   */
  public FieldResponse setResponseCode(@org.apache.thrift.annotation.Nullable RESPONSE_CODE responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  public void unsetResponseCode() {
    this.responseCode = null;
  }

  /** Returns true if field responseCode is set (has been assigned a value) and false otherwise */
  public boolean isSetResponseCode() {
    return this.responseCode != null;
  }

  public void setResponseCodeIsSet(boolean value) {
    if (!value) {
      this.responseCode = null;
    }
  }

  public boolean isBoolValue() {
    return this.boolValue;
  }

  public FieldResponse setBoolValue(boolean boolValue) {
    this.boolValue = boolValue;
    setBoolValueIsSet(true);
    return this;
  }

  public void unsetBoolValue() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BOOLVALUE_ISSET_ID);
  }

  /** Returns true if field boolValue is set (has been assigned a value) and false otherwise */
  public boolean isSetBoolValue() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BOOLVALUE_ISSET_ID);
  }

  public void setBoolValueIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BOOLVALUE_ISSET_ID, value);
  }

  public long getLongValue() {
    return this.longValue;
  }

  public FieldResponse setLongValue(long longValue) {
    this.longValue = longValue;
    setLongValueIsSet(true);
    return this;
  }

  public void unsetLongValue() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LONGVALUE_ISSET_ID);
  }

  /** Returns true if field longValue is set (has been assigned a value) and false otherwise */
  public boolean isSetLongValue() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LONGVALUE_ISSET_ID);
  }

  public void setLongValueIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LONGVALUE_ISSET_ID, value);
  }

  public double getDoubleValue() {
    return this.doubleValue;
  }

  public FieldResponse setDoubleValue(double doubleValue) {
    this.doubleValue = doubleValue;
    setDoubleValueIsSet(true);
    return this;
  }

  public void unsetDoubleValue() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DOUBLEVALUE_ISSET_ID);
  }

  /** Returns true if field doubleValue is set (has been assigned a value) and false otherwise */
  public boolean isSetDoubleValue() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DOUBLEVALUE_ISSET_ID);
  }

  public void setDoubleValueIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DOUBLEVALUE_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getStringValue() {
    return this.stringValue;
  }

  public FieldResponse setStringValue(@org.apache.thrift.annotation.Nullable java.lang.String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

  public void unsetStringValue() {
    this.stringValue = null;
  }

  /** Returns true if field stringValue is set (has been assigned a value) and false otherwise */
  public boolean isSetStringValue() {
    return this.stringValue != null;
  }

  public void setStringValueIsSet(boolean value) {
    if (!value) {
      this.stringValue = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case RESPONSE_CODE:
      if (value == null) {
        unsetResponseCode();
      } else {
        setResponseCode((RESPONSE_CODE)value);
      }
      break;

    case BOOL_VALUE:
      if (value == null) {
        unsetBoolValue();
      } else {
        setBoolValue((java.lang.Boolean)value);
      }
      break;

    case LONG_VALUE:
      if (value == null) {
        unsetLongValue();
      } else {
        setLongValue((java.lang.Long)value);
      }
      break;

    case DOUBLE_VALUE:
      if (value == null) {
        unsetDoubleValue();
      } else {
        setDoubleValue((java.lang.Double)value);
      }
      break;

    case STRING_VALUE:
      if (value == null) {
        unsetStringValue();
      } else {
        setStringValue((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case RESPONSE_CODE:
      return getResponseCode();

    case BOOL_VALUE:
      return isBoolValue();

    case LONG_VALUE:
      return getLongValue();

    case DOUBLE_VALUE:
      return getDoubleValue();

    case STRING_VALUE:
      return getStringValue();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case RESPONSE_CODE:
      return isSetResponseCode();
    case BOOL_VALUE:
      return isSetBoolValue();
    case LONG_VALUE:
      return isSetLongValue();
    case DOUBLE_VALUE:
      return isSetDoubleValue();
    case STRING_VALUE:
      return isSetStringValue();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof FieldResponse)
      return this.equals((FieldResponse)that);
    return false;
  }

  public boolean equals(FieldResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_responseCode = true && this.isSetResponseCode();
    boolean that_present_responseCode = true && that.isSetResponseCode();
    if (this_present_responseCode || that_present_responseCode) {
      if (!(this_present_responseCode && that_present_responseCode))
        return false;
      if (!this.responseCode.equals(that.responseCode))
        return false;
    }

    boolean this_present_boolValue = true && this.isSetBoolValue();
    boolean that_present_boolValue = true && that.isSetBoolValue();
    if (this_present_boolValue || that_present_boolValue) {
      if (!(this_present_boolValue && that_present_boolValue))
        return false;
      if (this.boolValue != that.boolValue)
        return false;
    }

    boolean this_present_longValue = true && this.isSetLongValue();
    boolean that_present_longValue = true && that.isSetLongValue();
    if (this_present_longValue || that_present_longValue) {
      if (!(this_present_longValue && that_present_longValue))
        return false;
      if (this.longValue != that.longValue)
        return false;
    }

    boolean this_present_doubleValue = true && this.isSetDoubleValue();
    boolean that_present_doubleValue = true && that.isSetDoubleValue();
    if (this_present_doubleValue || that_present_doubleValue) {
      if (!(this_present_doubleValue && that_present_doubleValue))
        return false;
      if (this.doubleValue != that.doubleValue)
        return false;
    }

    boolean this_present_stringValue = true && this.isSetStringValue();
    boolean that_present_stringValue = true && that.isSetStringValue();
    if (this_present_stringValue || that_present_stringValue) {
      if (!(this_present_stringValue && that_present_stringValue))
        return false;
      if (!this.stringValue.equals(that.stringValue))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetResponseCode()) ? 131071 : 524287);
    if (isSetResponseCode())
      hashCode = hashCode * 8191 + responseCode.getValue();

    hashCode = hashCode * 8191 + ((isSetBoolValue()) ? 131071 : 524287);
    if (isSetBoolValue())
      hashCode = hashCode * 8191 + ((boolValue) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetLongValue()) ? 131071 : 524287);
    if (isSetLongValue())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(longValue);

    hashCode = hashCode * 8191 + ((isSetDoubleValue()) ? 131071 : 524287);
    if (isSetDoubleValue())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(doubleValue);

    hashCode = hashCode * 8191 + ((isSetStringValue()) ? 131071 : 524287);
    if (isSetStringValue())
      hashCode = hashCode * 8191 + stringValue.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(FieldResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetResponseCode()).compareTo(other.isSetResponseCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResponseCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.responseCode, other.responseCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetBoolValue()).compareTo(other.isSetBoolValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBoolValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.boolValue, other.boolValue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLongValue()).compareTo(other.isSetLongValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLongValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.longValue, other.longValue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDoubleValue()).compareTo(other.isSetDoubleValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDoubleValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.doubleValue, other.doubleValue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStringValue()).compareTo(other.isSetStringValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStringValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stringValue, other.stringValue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("FieldResponse(");
    boolean first = true;

    sb.append("responseCode:");
    if (this.responseCode == null) {
      sb.append("null");
    } else {
      sb.append(this.responseCode);
    }
    first = false;
    if (isSetBoolValue()) {
      if (!first) sb.append(", ");
      sb.append("boolValue:");
      sb.append(this.boolValue);
      first = false;
    }
    if (isSetLongValue()) {
      if (!first) sb.append(", ");
      sb.append("longValue:");
      sb.append(this.longValue);
      first = false;
    }
    if (isSetDoubleValue()) {
      if (!first) sb.append(", ");
      sb.append("doubleValue:");
      sb.append(this.doubleValue);
      first = false;
    }
    if (isSetStringValue()) {
      if (!first) sb.append(", ");
      sb.append("stringValue:");
      if (this.stringValue == null) {
        sb.append("null");
      } else {
        sb.append(this.stringValue);
      }
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class FieldResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public FieldResponseStandardScheme getScheme() {
      return new FieldResponseStandardScheme();
    }
  }

  private static class FieldResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<FieldResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FieldResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESPONSE_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.responseCode = org.apache.plc4x.interop.RESPONSE_CODE.findByValue(iprot.readI32());
              struct.setResponseCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BOOL_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.boolValue = iprot.readBool();
              struct.setBoolValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LONG_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.longValue = iprot.readI64();
              struct.setLongValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DOUBLE_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.doubleValue = iprot.readDouble();
              struct.setDoubleValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // STRING_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.stringValue = iprot.readString();
              struct.setStringValueIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, FieldResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.responseCode != null) {
        oprot.writeFieldBegin(RESPONSE_CODE_FIELD_DESC);
        oprot.writeI32(struct.responseCode.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.isSetBoolValue()) {
        oprot.writeFieldBegin(BOOL_VALUE_FIELD_DESC);
        oprot.writeBool(struct.boolValue);
        oprot.writeFieldEnd();
      }
      if (struct.isSetLongValue()) {
        oprot.writeFieldBegin(LONG_VALUE_FIELD_DESC);
        oprot.writeI64(struct.longValue);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDoubleValue()) {
        oprot.writeFieldBegin(DOUBLE_VALUE_FIELD_DESC);
        oprot.writeDouble(struct.doubleValue);
        oprot.writeFieldEnd();
      }
      if (struct.stringValue != null) {
        if (struct.isSetStringValue()) {
          oprot.writeFieldBegin(STRING_VALUE_FIELD_DESC);
          oprot.writeString(struct.stringValue);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FieldResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public FieldResponseTupleScheme getScheme() {
      return new FieldResponseTupleScheme();
    }
  }

  private static class FieldResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<FieldResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FieldResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetResponseCode()) {
        optionals.set(0);
      }
      if (struct.isSetBoolValue()) {
        optionals.set(1);
      }
      if (struct.isSetLongValue()) {
        optionals.set(2);
      }
      if (struct.isSetDoubleValue()) {
        optionals.set(3);
      }
      if (struct.isSetStringValue()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetResponseCode()) {
        oprot.writeI32(struct.responseCode.getValue());
      }
      if (struct.isSetBoolValue()) {
        oprot.writeBool(struct.boolValue);
      }
      if (struct.isSetLongValue()) {
        oprot.writeI64(struct.longValue);
      }
      if (struct.isSetDoubleValue()) {
        oprot.writeDouble(struct.doubleValue);
      }
      if (struct.isSetStringValue()) {
        oprot.writeString(struct.stringValue);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FieldResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.responseCode = org.apache.plc4x.interop.RESPONSE_CODE.findByValue(iprot.readI32());
        struct.setResponseCodeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.boolValue = iprot.readBool();
        struct.setBoolValueIsSet(true);
      }
      if (incoming.get(2)) {
        struct.longValue = iprot.readI64();
        struct.setLongValueIsSet(true);
      }
      if (incoming.get(3)) {
        struct.doubleValue = iprot.readDouble();
        struct.setDoubleValueIsSet(true);
      }
      if (incoming.get(4)) {
        struct.stringValue = iprot.readString();
        struct.setStringValueIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
