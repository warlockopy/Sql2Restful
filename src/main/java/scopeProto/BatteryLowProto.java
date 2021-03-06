package scopeProto;

//Generated by the protocol buffer compiler.  DO NOT EDIT!
//source: BatteryLowProto.proto

public final class BatteryLowProto {
private BatteryLowProto() {}
public static void registerAllExtensions(
   com.google.protobuf.ExtensionRegistry registry) {
}
public interface BatteryLowOrBuilder extends
   // @@protoc_insertion_point(interface_extends:BatteryLow)
   com.google.protobuf.MessageOrBuilder {

 /**
  * <code>required .EventHeader header = 1;</code>
  */
 boolean hasHeader();
 /**
  * <code>required .EventHeader header = 1;</code>
  */
 EventHeaderProto.EventHeader getHeader();
 /**
  * <code>required .EventHeader header = 1;</code>
  */
 EventHeaderProto.EventHeaderOrBuilder getHeaderOrBuilder();

 /**
  * <code>optional sint32 temperature = 2;</code>
  *
  * <pre>
  * Temperature (in degrees Celsius). Precision: 1
  * </pre>
  */
 boolean hasTemperature();
 /**
  * <code>optional sint32 temperature = 2;</code>
  *
  * <pre>
  * Temperature (in degrees Celsius). Precision: 1
  * </pre>
  */
 int getTemperature();

 /**
  * <code>optional uint32 voltage = 3;</code>
  *
  * <pre>
  * Voltage in volts. Precision: 1
  * </pre>
  */
 boolean hasVoltage();
 /**
  * <code>optional uint32 voltage = 3;</code>
  *
  * <pre>
  * Voltage in volts. Precision: 1
  * </pre>
  */
 int getVoltage();

 /**
  * <code>optional uint32 battery_age = 4;</code>
  *
  * <pre>
  * Number of charges
  * </pre>
  */
 boolean hasBatteryAge();
 /**
  * <code>optional uint32 battery_age = 4;</code>
  *
  * <pre>
  * Number of charges
  * </pre>
  */
 int getBatteryAge();

 /**
  * <code>optional uint32 charge_level_percentage = 5;</code>
  *
  * <pre>
  * Remaining battery charge level in percentage. 0..100. Precision: 1
  * </pre>
  */
 boolean hasChargeLevelPercentage();
 /**
  * <code>optional uint32 charge_level_percentage = 5;</code>
  *
  * <pre>
  * Remaining battery charge level in percentage. 0..100. Precision: 1
  * </pre>
  */
 int getChargeLevelPercentage();
}
/**
* Protobuf type {@code BatteryLow}
*
* <pre>
* Battery Low event
* </pre>
*/
public static final class BatteryLow extends
   com.google.protobuf.GeneratedMessage implements
   // @@protoc_insertion_point(message_implements:BatteryLow)
   BatteryLowOrBuilder {
 // Use BatteryLow.newBuilder() to construct.
 private BatteryLow(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
   super(builder);
   this.unknownFields = builder.getUnknownFields();
 }
 private BatteryLow(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

 private static final BatteryLow defaultInstance;
 public static BatteryLow getDefaultInstance() {
   return defaultInstance;
 }

 public BatteryLow getDefaultInstanceForType() {
   return defaultInstance;
 }

 private final com.google.protobuf.UnknownFieldSet unknownFields;
 @java.lang.Override
 public final com.google.protobuf.UnknownFieldSet
     getUnknownFields() {
   return this.unknownFields;
 }
 private BatteryLow(
     com.google.protobuf.CodedInputStream input,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws com.google.protobuf.InvalidProtocolBufferException {
   initFields();
   int mutable_bitField0_ = 0;
   com.google.protobuf.UnknownFieldSet.Builder unknownFields =
       com.google.protobuf.UnknownFieldSet.newBuilder();
   try {
     boolean done = false;
     while (!done) {
       int tag = input.readTag();
       switch (tag) {
         case 0:
           done = true;
           break;
         default: {
           if (!parseUnknownField(input, unknownFields,
                                  extensionRegistry, tag)) {
             done = true;
           }
           break;
         }
         case 10: {
           EventHeaderProto.EventHeader.Builder subBuilder = null;
           if (((bitField0_ & 0x00000001) == 0x00000001)) {
             subBuilder = header_.toBuilder();
           }
           header_ = input.readMessage(EventHeaderProto.EventHeader.PARSER, extensionRegistry);
           if (subBuilder != null) {
             subBuilder.mergeFrom(header_);
             header_ = subBuilder.buildPartial();
           }
           bitField0_ |= 0x00000001;
           break;
         }
         case 16: {
           bitField0_ |= 0x00000002;
           temperature_ = input.readSInt32();
           break;
         }
         case 24: {
           bitField0_ |= 0x00000004;
           voltage_ = input.readUInt32();
           break;
         }
         case 32: {
           bitField0_ |= 0x00000008;
           batteryAge_ = input.readUInt32();
           break;
         }
         case 40: {
           bitField0_ |= 0x00000010;
           chargeLevelPercentage_ = input.readUInt32();
           break;
         }
       }
     }
   } catch (com.google.protobuf.InvalidProtocolBufferException e) {
     throw e.setUnfinishedMessage(this);
   } catch (java.io.IOException e) {
     throw new com.google.protobuf.InvalidProtocolBufferException(
         e.getMessage()).setUnfinishedMessage(this);
   } finally {
     this.unknownFields = unknownFields.build();
     makeExtensionsImmutable();
   }
 }
 public static final com.google.protobuf.Descriptors.Descriptor
     getDescriptor() {
   return BatteryLowProto.internal_static_BatteryLow_descriptor;
 }

 protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
     internalGetFieldAccessorTable() {
   return BatteryLowProto.internal_static_BatteryLow_fieldAccessorTable
       .ensureFieldAccessorsInitialized(
           BatteryLowProto.BatteryLow.class, BatteryLowProto.BatteryLow.Builder.class);
 }

 public static com.google.protobuf.Parser<BatteryLow> PARSER =
     new com.google.protobuf.AbstractParser<BatteryLow>() {
   public BatteryLow parsePartialFrom(
       com.google.protobuf.CodedInputStream input,
       com.google.protobuf.ExtensionRegistryLite extensionRegistry)
       throws com.google.protobuf.InvalidProtocolBufferException {
     return new BatteryLow(input, extensionRegistry);
   }
 };

 @java.lang.Override
 public com.google.protobuf.Parser<BatteryLow> getParserForType() {
   return PARSER;
 }

 private int bitField0_;
 public static final int HEADER_FIELD_NUMBER = 1;
 private EventHeaderProto.EventHeader header_;
 /**
  * <code>required .EventHeader header = 1;</code>
  */
 public boolean hasHeader() {
   return ((bitField0_ & 0x00000001) == 0x00000001);
 }
 /**
  * <code>required .EventHeader header = 1;</code>
  */
 public EventHeaderProto.EventHeader getHeader() {
   return header_;
 }
 /**
  * <code>required .EventHeader header = 1;</code>
  */
 public EventHeaderProto.EventHeaderOrBuilder getHeaderOrBuilder() {
   return header_;
 }

 public static final int TEMPERATURE_FIELD_NUMBER = 2;
 private int temperature_;
 /**
  * <code>optional sint32 temperature = 2;</code>
  *
  * <pre>
  * Temperature (in degrees Celsius). Precision: 1
  * </pre>
  */
 public boolean hasTemperature() {
   return ((bitField0_ & 0x00000002) == 0x00000002);
 }
 /**
  * <code>optional sint32 temperature = 2;</code>
  *
  * <pre>
  * Temperature (in degrees Celsius). Precision: 1
  * </pre>
  */
 public int getTemperature() {
   return temperature_;
 }

 public static final int VOLTAGE_FIELD_NUMBER = 3;
 private int voltage_;
 /**
  * <code>optional uint32 voltage = 3;</code>
  *
  * <pre>
  * Voltage in volts. Precision: 1
  * </pre>
  */
 public boolean hasVoltage() {
   return ((bitField0_ & 0x00000004) == 0x00000004);
 }
 /**
  * <code>optional uint32 voltage = 3;</code>
  *
  * <pre>
  * Voltage in volts. Precision: 1
  * </pre>
  */
 public int getVoltage() {
   return voltage_;
 }

 public static final int BATTERY_AGE_FIELD_NUMBER = 4;
 private int batteryAge_;
 /**
  * <code>optional uint32 battery_age = 4;</code>
  *
  * <pre>
  * Number of charges
  * </pre>
  */
 public boolean hasBatteryAge() {
   return ((bitField0_ & 0x00000008) == 0x00000008);
 }
 /**
  * <code>optional uint32 battery_age = 4;</code>
  *
  * <pre>
  * Number of charges
  * </pre>
  */
 public int getBatteryAge() {
   return batteryAge_;
 }

 public static final int CHARGE_LEVEL_PERCENTAGE_FIELD_NUMBER = 5;
 private int chargeLevelPercentage_;
 /**
  * <code>optional uint32 charge_level_percentage = 5;</code>
  *
  * <pre>
  * Remaining battery charge level in percentage. 0..100. Precision: 1
  * </pre>
  */
 public boolean hasChargeLevelPercentage() {
   return ((bitField0_ & 0x00000010) == 0x00000010);
 }
 /**
  * <code>optional uint32 charge_level_percentage = 5;</code>
  *
  * <pre>
  * Remaining battery charge level in percentage. 0..100. Precision: 1
  * </pre>
  */
 public int getChargeLevelPercentage() {
   return chargeLevelPercentage_;
 }

 private void initFields() {
   header_ = EventHeaderProto.EventHeader.getDefaultInstance();
   temperature_ = 0;
   voltage_ = 0;
   batteryAge_ = 0;
   chargeLevelPercentage_ = 0;
 }
 private byte memoizedIsInitialized = -1;
 public final boolean isInitialized() {
   byte isInitialized = memoizedIsInitialized;
   if (isInitialized == 1) return true;
   if (isInitialized == 0) return false;

   if (!hasHeader()) {
     memoizedIsInitialized = 0;
     return false;
   }
   if (!getHeader().isInitialized()) {
     memoizedIsInitialized = 0;
     return false;
   }
   memoizedIsInitialized = 1;
   return true;
 }

 public void writeTo(com.google.protobuf.CodedOutputStream output)
                     throws java.io.IOException {
   getSerializedSize();
   if (((bitField0_ & 0x00000001) == 0x00000001)) {
     output.writeMessage(1, header_);
   }
   if (((bitField0_ & 0x00000002) == 0x00000002)) {
     output.writeSInt32(2, temperature_);
   }
   if (((bitField0_ & 0x00000004) == 0x00000004)) {
     output.writeUInt32(3, voltage_);
   }
   if (((bitField0_ & 0x00000008) == 0x00000008)) {
     output.writeUInt32(4, batteryAge_);
   }
   if (((bitField0_ & 0x00000010) == 0x00000010)) {
     output.writeUInt32(5, chargeLevelPercentage_);
   }
   getUnknownFields().writeTo(output);
 }

 private int memoizedSerializedSize = -1;
 public int getSerializedSize() {
   int size = memoizedSerializedSize;
   if (size != -1) return size;

   size = 0;
   if (((bitField0_ & 0x00000001) == 0x00000001)) {
     size += com.google.protobuf.CodedOutputStream
       .computeMessageSize(1, header_);
   }
   if (((bitField0_ & 0x00000002) == 0x00000002)) {
     size += com.google.protobuf.CodedOutputStream
       .computeSInt32Size(2, temperature_);
   }
   if (((bitField0_ & 0x00000004) == 0x00000004)) {
     size += com.google.protobuf.CodedOutputStream
       .computeUInt32Size(3, voltage_);
   }
   if (((bitField0_ & 0x00000008) == 0x00000008)) {
     size += com.google.protobuf.CodedOutputStream
       .computeUInt32Size(4, batteryAge_);
   }
   if (((bitField0_ & 0x00000010) == 0x00000010)) {
     size += com.google.protobuf.CodedOutputStream
       .computeUInt32Size(5, chargeLevelPercentage_);
   }
   size += getUnknownFields().getSerializedSize();
   memoizedSerializedSize = size;
   return size;
 }

 private static final long serialVersionUID = 0L;
 @java.lang.Override
 protected java.lang.Object writeReplace()
     throws java.io.ObjectStreamException {
   return super.writeReplace();
 }

 public static BatteryLowProto.BatteryLow parseFrom(
     com.google.protobuf.ByteString data)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data);
 }
 public static BatteryLowProto.BatteryLow parseFrom(
     com.google.protobuf.ByteString data,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data, extensionRegistry);
 }
 public static BatteryLowProto.BatteryLow parseFrom(byte[] data)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data);
 }
 public static BatteryLowProto.BatteryLow parseFrom(
     byte[] data,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data, extensionRegistry);
 }
 public static BatteryLowProto.BatteryLow parseFrom(java.io.InputStream input)
     throws java.io.IOException {
   return PARSER.parseFrom(input);
 }
 public static BatteryLowProto.BatteryLow parseFrom(
     java.io.InputStream input,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws java.io.IOException {
   return PARSER.parseFrom(input, extensionRegistry);
 }
 public static BatteryLowProto.BatteryLow parseDelimitedFrom(java.io.InputStream input)
     throws java.io.IOException {
   return PARSER.parseDelimitedFrom(input);
 }
 public static BatteryLowProto.BatteryLow parseDelimitedFrom(
     java.io.InputStream input,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws java.io.IOException {
   return PARSER.parseDelimitedFrom(input, extensionRegistry);
 }
 public static BatteryLowProto.BatteryLow parseFrom(
     com.google.protobuf.CodedInputStream input)
     throws java.io.IOException {
   return PARSER.parseFrom(input);
 }
 public static BatteryLowProto.BatteryLow parseFrom(
     com.google.protobuf.CodedInputStream input,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws java.io.IOException {
   return PARSER.parseFrom(input, extensionRegistry);
 }

 public static Builder newBuilder() { return Builder.create(); }
 public Builder newBuilderForType() { return newBuilder(); }
 public static Builder newBuilder(BatteryLowProto.BatteryLow prototype) {
   return newBuilder().mergeFrom(prototype);
 }
 public Builder toBuilder() { return newBuilder(this); }

 @java.lang.Override
 protected Builder newBuilderForType(
     com.google.protobuf.GeneratedMessage.BuilderParent parent) {
   Builder builder = new Builder(parent);
   return builder;
 }
 /**
  * Protobuf type {@code BatteryLow}
  *
  * <pre>
  * Battery Low event
  * </pre>
  */
 public static final class Builder extends
     com.google.protobuf.GeneratedMessage.Builder<Builder> implements
     // @@protoc_insertion_point(builder_implements:BatteryLow)
     BatteryLowProto.BatteryLowOrBuilder {
   public static final com.google.protobuf.Descriptors.Descriptor
       getDescriptor() {
     return BatteryLowProto.internal_static_BatteryLow_descriptor;
   }

   protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
       internalGetFieldAccessorTable() {
     return BatteryLowProto.internal_static_BatteryLow_fieldAccessorTable
         .ensureFieldAccessorsInitialized(
             BatteryLowProto.BatteryLow.class, BatteryLowProto.BatteryLow.Builder.class);
   }

   // Construct using BatteryLowProto.BatteryLow.newBuilder()
   private Builder() {
     maybeForceBuilderInitialization();
   }

   private Builder(
       com.google.protobuf.GeneratedMessage.BuilderParent parent) {
     super(parent);
     maybeForceBuilderInitialization();
   }
   private void maybeForceBuilderInitialization() {
     if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
       getHeaderFieldBuilder();
     }
   }
   private static Builder create() {
     return new Builder();
   }

   public Builder clear() {
     super.clear();
     if (headerBuilder_ == null) {
       header_ = EventHeaderProto.EventHeader.getDefaultInstance();
     } else {
       headerBuilder_.clear();
     }
     bitField0_ = (bitField0_ & ~0x00000001);
     temperature_ = 0;
     bitField0_ = (bitField0_ & ~0x00000002);
     voltage_ = 0;
     bitField0_ = (bitField0_ & ~0x00000004);
     batteryAge_ = 0;
     bitField0_ = (bitField0_ & ~0x00000008);
     chargeLevelPercentage_ = 0;
     bitField0_ = (bitField0_ & ~0x00000010);
     return this;
   }

   public Builder clone() {
     return create().mergeFrom(buildPartial());
   }

   public com.google.protobuf.Descriptors.Descriptor
       getDescriptorForType() {
     return BatteryLowProto.internal_static_BatteryLow_descriptor;
   }

   public BatteryLowProto.BatteryLow getDefaultInstanceForType() {
     return BatteryLowProto.BatteryLow.getDefaultInstance();
   }

   public BatteryLowProto.BatteryLow build() {
     BatteryLowProto.BatteryLow result = buildPartial();
     if (!result.isInitialized()) {
       throw newUninitializedMessageException(result);
     }
     return result;
   }

   public BatteryLowProto.BatteryLow buildPartial() {
     BatteryLowProto.BatteryLow result = new BatteryLowProto.BatteryLow(this);
     int from_bitField0_ = bitField0_;
     int to_bitField0_ = 0;
     if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
       to_bitField0_ |= 0x00000001;
     }
     if (headerBuilder_ == null) {
       result.header_ = header_;
     } else {
       result.header_ = headerBuilder_.build();
     }
     if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
       to_bitField0_ |= 0x00000002;
     }
     result.temperature_ = temperature_;
     if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
       to_bitField0_ |= 0x00000004;
     }
     result.voltage_ = voltage_;
     if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
       to_bitField0_ |= 0x00000008;
     }
     result.batteryAge_ = batteryAge_;
     if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
       to_bitField0_ |= 0x00000010;
     }
     result.chargeLevelPercentage_ = chargeLevelPercentage_;
     result.bitField0_ = to_bitField0_;
     onBuilt();
     return result;
   }

   public Builder mergeFrom(com.google.protobuf.Message other) {
     if (other instanceof BatteryLowProto.BatteryLow) {
       return mergeFrom((BatteryLowProto.BatteryLow)other);
     } else {
       super.mergeFrom(other);
       return this;
     }
   }

   public Builder mergeFrom(BatteryLowProto.BatteryLow other) {
     if (other == BatteryLowProto.BatteryLow.getDefaultInstance()) return this;
     if (other.hasHeader()) {
       mergeHeader(other.getHeader());
     }
     if (other.hasTemperature()) {
       setTemperature(other.getTemperature());
     }
     if (other.hasVoltage()) {
       setVoltage(other.getVoltage());
     }
     if (other.hasBatteryAge()) {
       setBatteryAge(other.getBatteryAge());
     }
     if (other.hasChargeLevelPercentage()) {
       setChargeLevelPercentage(other.getChargeLevelPercentage());
     }
     this.mergeUnknownFields(other.getUnknownFields());
     return this;
   }

   public final boolean isInitialized() {
     if (!hasHeader()) {
       
       return false;
     }
     if (!getHeader().isInitialized()) {
       
       return false;
     }
     return true;
   }

   public Builder mergeFrom(
       com.google.protobuf.CodedInputStream input,
       com.google.protobuf.ExtensionRegistryLite extensionRegistry)
       throws java.io.IOException {
     BatteryLowProto.BatteryLow parsedMessage = null;
     try {
       parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
     } catch (com.google.protobuf.InvalidProtocolBufferException e) {
       parsedMessage = (BatteryLowProto.BatteryLow) e.getUnfinishedMessage();
       throw e;
     } finally {
       if (parsedMessage != null) {
         mergeFrom(parsedMessage);
       }
     }
     return this;
   }
   private int bitField0_;

   private EventHeaderProto.EventHeader header_ = EventHeaderProto.EventHeader.getDefaultInstance();
   private com.google.protobuf.SingleFieldBuilder<
       EventHeaderProto.EventHeader, EventHeaderProto.EventHeader.Builder, EventHeaderProto.EventHeaderOrBuilder> headerBuilder_;
   /**
    * <code>required .EventHeader header = 1;</code>
    */
   public boolean hasHeader() {
     return ((bitField0_ & 0x00000001) == 0x00000001);
   }
   /**
    * <code>required .EventHeader header = 1;</code>
    */
   public EventHeaderProto.EventHeader getHeader() {
     if (headerBuilder_ == null) {
       return header_;
     } else {
       return headerBuilder_.getMessage();
     }
   }
   /**
    * <code>required .EventHeader header = 1;</code>
    */
   public Builder setHeader(EventHeaderProto.EventHeader value) {
     if (headerBuilder_ == null) {
       if (value == null) {
         throw new NullPointerException();
       }
       header_ = value;
       onChanged();
     } else {
       headerBuilder_.setMessage(value);
     }
     bitField0_ |= 0x00000001;
     return this;
   }
   /**
    * <code>required .EventHeader header = 1;</code>
    */
   public Builder setHeader(
       EventHeaderProto.EventHeader.Builder builderForValue) {
     if (headerBuilder_ == null) {
       header_ = builderForValue.build();
       onChanged();
     } else {
       headerBuilder_.setMessage(builderForValue.build());
     }
     bitField0_ |= 0x00000001;
     return this;
   }
   /**
    * <code>required .EventHeader header = 1;</code>
    */
   public Builder mergeHeader(EventHeaderProto.EventHeader value) {
     if (headerBuilder_ == null) {
       if (((bitField0_ & 0x00000001) == 0x00000001) &&
           header_ != EventHeaderProto.EventHeader.getDefaultInstance()) {
         header_ =
           EventHeaderProto.EventHeader.newBuilder(header_).mergeFrom(value).buildPartial();
       } else {
         header_ = value;
       }
       onChanged();
     } else {
       headerBuilder_.mergeFrom(value);
     }
     bitField0_ |= 0x00000001;
     return this;
   }
   /**
    * <code>required .EventHeader header = 1;</code>
    */
   public Builder clearHeader() {
     if (headerBuilder_ == null) {
       header_ = EventHeaderProto.EventHeader.getDefaultInstance();
       onChanged();
     } else {
       headerBuilder_.clear();
     }
     bitField0_ = (bitField0_ & ~0x00000001);
     return this;
   }
   /**
    * <code>required .EventHeader header = 1;</code>
    */
   public EventHeaderProto.EventHeader.Builder getHeaderBuilder() {
     bitField0_ |= 0x00000001;
     onChanged();
     return getHeaderFieldBuilder().getBuilder();
   }
   /**
    * <code>required .EventHeader header = 1;</code>
    */
   public EventHeaderProto.EventHeaderOrBuilder getHeaderOrBuilder() {
     if (headerBuilder_ != null) {
       return headerBuilder_.getMessageOrBuilder();
     } else {
       return header_;
     }
   }
   /**
    * <code>required .EventHeader header = 1;</code>
    */
   private com.google.protobuf.SingleFieldBuilder<
       EventHeaderProto.EventHeader, EventHeaderProto.EventHeader.Builder, EventHeaderProto.EventHeaderOrBuilder> 
       getHeaderFieldBuilder() {
     if (headerBuilder_ == null) {
       headerBuilder_ = new com.google.protobuf.SingleFieldBuilder<
           EventHeaderProto.EventHeader, EventHeaderProto.EventHeader.Builder, EventHeaderProto.EventHeaderOrBuilder>(
               getHeader(),
               getParentForChildren(),
               isClean());
       header_ = null;
     }
     return headerBuilder_;
   }

   private int temperature_ ;
   /**
    * <code>optional sint32 temperature = 2;</code>
    *
    * <pre>
    * Temperature (in degrees Celsius). Precision: 1
    * </pre>
    */
   public boolean hasTemperature() {
     return ((bitField0_ & 0x00000002) == 0x00000002);
   }
   /**
    * <code>optional sint32 temperature = 2;</code>
    *
    * <pre>
    * Temperature (in degrees Celsius). Precision: 1
    * </pre>
    */
   public int getTemperature() {
     return temperature_;
   }
   /**
    * <code>optional sint32 temperature = 2;</code>
    *
    * <pre>
    * Temperature (in degrees Celsius). Precision: 1
    * </pre>
    */
   public Builder setTemperature(int value) {
     bitField0_ |= 0x00000002;
     temperature_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>optional sint32 temperature = 2;</code>
    *
    * <pre>
    * Temperature (in degrees Celsius). Precision: 1
    * </pre>
    */
   public Builder clearTemperature() {
     bitField0_ = (bitField0_ & ~0x00000002);
     temperature_ = 0;
     onChanged();
     return this;
   }

   private int voltage_ ;
   /**
    * <code>optional uint32 voltage = 3;</code>
    *
    * <pre>
    * Voltage in volts. Precision: 1
    * </pre>
    */
   public boolean hasVoltage() {
     return ((bitField0_ & 0x00000004) == 0x00000004);
   }
   /**
    * <code>optional uint32 voltage = 3;</code>
    *
    * <pre>
    * Voltage in volts. Precision: 1
    * </pre>
    */
   public int getVoltage() {
     return voltage_;
   }
   /**
    * <code>optional uint32 voltage = 3;</code>
    *
    * <pre>
    * Voltage in volts. Precision: 1
    * </pre>
    */
   public Builder setVoltage(int value) {
     bitField0_ |= 0x00000004;
     voltage_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>optional uint32 voltage = 3;</code>
    *
    * <pre>
    * Voltage in volts. Precision: 1
    * </pre>
    */
   public Builder clearVoltage() {
     bitField0_ = (bitField0_ & ~0x00000004);
     voltage_ = 0;
     onChanged();
     return this;
   }

   private int batteryAge_ ;
   /**
    * <code>optional uint32 battery_age = 4;</code>
    *
    * <pre>
    * Number of charges
    * </pre>
    */
   public boolean hasBatteryAge() {
     return ((bitField0_ & 0x00000008) == 0x00000008);
   }
   /**
    * <code>optional uint32 battery_age = 4;</code>
    *
    * <pre>
    * Number of charges
    * </pre>
    */
   public int getBatteryAge() {
     return batteryAge_;
   }
   /**
    * <code>optional uint32 battery_age = 4;</code>
    *
    * <pre>
    * Number of charges
    * </pre>
    */
   public Builder setBatteryAge(int value) {
     bitField0_ |= 0x00000008;
     batteryAge_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>optional uint32 battery_age = 4;</code>
    *
    * <pre>
    * Number of charges
    * </pre>
    */
   public Builder clearBatteryAge() {
     bitField0_ = (bitField0_ & ~0x00000008);
     batteryAge_ = 0;
     onChanged();
     return this;
   }

   private int chargeLevelPercentage_ ;
   /**
    * <code>optional uint32 charge_level_percentage = 5;</code>
    *
    * <pre>
    * Remaining battery charge level in percentage. 0..100. Precision: 1
    * </pre>
    */
   public boolean hasChargeLevelPercentage() {
     return ((bitField0_ & 0x00000010) == 0x00000010);
   }
   /**
    * <code>optional uint32 charge_level_percentage = 5;</code>
    *
    * <pre>
    * Remaining battery charge level in percentage. 0..100. Precision: 1
    * </pre>
    */
   public int getChargeLevelPercentage() {
     return chargeLevelPercentage_;
   }
   /**
    * <code>optional uint32 charge_level_percentage = 5;</code>
    *
    * <pre>
    * Remaining battery charge level in percentage. 0..100. Precision: 1
    * </pre>
    */
   public Builder setChargeLevelPercentage(int value) {
     bitField0_ |= 0x00000010;
     chargeLevelPercentage_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>optional uint32 charge_level_percentage = 5;</code>
    *
    * <pre>
    * Remaining battery charge level in percentage. 0..100. Precision: 1
    * </pre>
    */
   public Builder clearChargeLevelPercentage() {
     bitField0_ = (bitField0_ & ~0x00000010);
     chargeLevelPercentage_ = 0;
     onChanged();
     return this;
   }

   // @@protoc_insertion_point(builder_scope:BatteryLow)
 }

 static {
   defaultInstance = new BatteryLow(true);
   defaultInstance.initFields();
 }

 // @@protoc_insertion_point(class_scope:BatteryLow)
}

private static final com.google.protobuf.Descriptors.Descriptor
 internal_static_BatteryLow_descriptor;
private static
 com.google.protobuf.GeneratedMessage.FieldAccessorTable
   internal_static_BatteryLow_fieldAccessorTable;

public static com.google.protobuf.Descriptors.FileDescriptor
   getDescriptor() {
 return descriptor;
}
private static com.google.protobuf.Descriptors.FileDescriptor
   descriptor;
static {
 java.lang.String[] descriptorData = {
   "\n\025BatteryLowProto.proto\032\026EventHeaderProt" +
   "o.proto\"\206\001\n\nBatteryLow\022\034\n\006header\030\001 \002(\0132\014" +
   ".EventHeader\022\023\n\013temperature\030\002 \001(\021\022\017\n\007vol" +
   "tage\030\003 \001(\r\022\023\n\013battery_age\030\004 \001(\r\022\037\n\027charg" +
   "e_level_percentage\030\005 \001(\r"
 };
 com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
     new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
       public com.google.protobuf.ExtensionRegistry assignDescriptors(
           com.google.protobuf.Descriptors.FileDescriptor root) {
         descriptor = root;
         return null;
       }
     };
 com.google.protobuf.Descriptors.FileDescriptor
   .internalBuildGeneratedFileFrom(descriptorData,
     new com.google.protobuf.Descriptors.FileDescriptor[] {
       EventHeaderProto.getDescriptor(),
     }, assigner);
 internal_static_BatteryLow_descriptor =
   getDescriptor().getMessageTypes().get(0);
 internal_static_BatteryLow_fieldAccessorTable = new
   com.google.protobuf.GeneratedMessage.FieldAccessorTable(
     internal_static_BatteryLow_descriptor,
     new java.lang.String[] { "Header", "Temperature", "Voltage", "BatteryAge", "ChargeLevelPercentage", });
 EventHeaderProto.getDescriptor();
}

// @@protoc_insertion_point(outer_class_scope)
}
