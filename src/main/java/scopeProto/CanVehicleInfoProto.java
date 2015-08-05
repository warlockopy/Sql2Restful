package scopeProto;

//Generated by the protocol buffer compiler.  DO NOT EDIT!
//source: CanVehicleInfoProto.proto

public final class CanVehicleInfoProto {
private CanVehicleInfoProto() {}
public static void registerAllExtensions(
   com.google.protobuf.ExtensionRegistry registry) {
}
public interface CanVehicleInfoOrBuilder extends
   // @@protoc_insertion_point(interface_extends:CanVehicleInfo)
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
  * <code>optional uint32 instantaneous_fuel_economy = 2;</code>
  *
  * <pre>
  * Instantaneous Fuel Economy (km/L) = value. Precision: 1
  * </pre>
  */
 boolean hasInstantaneousFuelEconomy();
 /**
  * <code>optional uint32 instantaneous_fuel_economy = 2;</code>
  *
  * <pre>
  * Instantaneous Fuel Economy (km/L) = value. Precision: 1
  * </pre>
  */
 int getInstantaneousFuelEconomy();

 /**
  * <code>optional uint32 brake_count = 3;</code>
  *
  * <pre>
  * Count of brakes
  * </pre>
  */
 boolean hasBrakeCount();
 /**
  * <code>optional uint32 brake_count = 3;</code>
  *
  * <pre>
  * Count of brakes
  * </pre>
  */
 int getBrakeCount();

 /**
  * <code>optional float brake_duration_seconds = 4;</code>
  */
 boolean hasBrakeDurationSeconds();
 /**
  * <code>optional float brake_duration_seconds = 4;</code>
  */
 float getBrakeDurationSeconds();

 /**
  * <code>optional uint32 engine_load_percent = 5;</code>
  *
  * <pre>
  * Engine load percentage. 0..255. Precision: 1
  * </pre>
  */
 boolean hasEngineLoadPercent();
 /**
  * <code>optional uint32 engine_load_percent = 5;</code>
  *
  * <pre>
  * Engine load percentage. 0..255. Precision: 1
  * </pre>
  */
 int getEngineLoadPercent();

 /**
  * <code>optional sint32 engine_coolant_temperature = 6;</code>
  *
  * <pre>
  * Engine coolant Temperature (in degrees Celsius). Precision: 1
  * </pre>
  */
 boolean hasEngineCoolantTemperature();
 /**
  * <code>optional sint32 engine_coolant_temperature = 6;</code>
  *
  * <pre>
  * Engine coolant Temperature (in degrees Celsius). Precision: 1
  * </pre>
  */
 int getEngineCoolantTemperature();

 /**
  * <code>optional sint32 engine_oil_temperature = 7;</code>
  *
  * <pre>
  * Engine oil Temperature (in degrees Celsius). Precision: 1
  * </pre>
  */
 boolean hasEngineOilTemperature();
 /**
  * <code>optional sint32 engine_oil_temperature = 7;</code>
  *
  * <pre>
  * Engine oil Temperature (in degrees Celsius). Precision: 1
  * </pre>
  */
 int getEngineOilTemperature();
}
/**
* Protobuf type {@code CanVehicleInfo}
*
* <pre>
* CAN Vehicle Info
* </pre>
*/
public static final class CanVehicleInfo extends
   com.google.protobuf.GeneratedMessage implements
   // @@protoc_insertion_point(message_implements:CanVehicleInfo)
   CanVehicleInfoOrBuilder {
 // Use CanVehicleInfo.newBuilder() to construct.
 private CanVehicleInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
   super(builder);
   this.unknownFields = builder.getUnknownFields();
 }
 private CanVehicleInfo(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

 private static final CanVehicleInfo defaultInstance;
 public static CanVehicleInfo getDefaultInstance() {
   return defaultInstance;
 }

 public CanVehicleInfo getDefaultInstanceForType() {
   return defaultInstance;
 }

 private final com.google.protobuf.UnknownFieldSet unknownFields;
 @java.lang.Override
 public final com.google.protobuf.UnknownFieldSet
     getUnknownFields() {
   return this.unknownFields;
 }
 private CanVehicleInfo(
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
           instantaneousFuelEconomy_ = input.readUInt32();
           break;
         }
         case 24: {
           bitField0_ |= 0x00000004;
           brakeCount_ = input.readUInt32();
           break;
         }
         case 37: {
           bitField0_ |= 0x00000008;
           brakeDurationSeconds_ = input.readFloat();
           break;
         }
         case 40: {
           bitField0_ |= 0x00000010;
           engineLoadPercent_ = input.readUInt32();
           break;
         }
         case 48: {
           bitField0_ |= 0x00000020;
           engineCoolantTemperature_ = input.readSInt32();
           break;
         }
         case 56: {
           bitField0_ |= 0x00000040;
           engineOilTemperature_ = input.readSInt32();
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
   return CanVehicleInfoProto.internal_static_CanVehicleInfo_descriptor;
 }

 protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
     internalGetFieldAccessorTable() {
   return CanVehicleInfoProto.internal_static_CanVehicleInfo_fieldAccessorTable
       .ensureFieldAccessorsInitialized(
           CanVehicleInfoProto.CanVehicleInfo.class, CanVehicleInfoProto.CanVehicleInfo.Builder.class);
 }

 public static com.google.protobuf.Parser<CanVehicleInfo> PARSER =
     new com.google.protobuf.AbstractParser<CanVehicleInfo>() {
   public CanVehicleInfo parsePartialFrom(
       com.google.protobuf.CodedInputStream input,
       com.google.protobuf.ExtensionRegistryLite extensionRegistry)
       throws com.google.protobuf.InvalidProtocolBufferException {
     return new CanVehicleInfo(input, extensionRegistry);
   }
 };

 @java.lang.Override
 public com.google.protobuf.Parser<CanVehicleInfo> getParserForType() {
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

 public static final int INSTANTANEOUS_FUEL_ECONOMY_FIELD_NUMBER = 2;
 private int instantaneousFuelEconomy_;
 /**
  * <code>optional uint32 instantaneous_fuel_economy = 2;</code>
  *
  * <pre>
  * Instantaneous Fuel Economy (km/L) = value. Precision: 1
  * </pre>
  */
 public boolean hasInstantaneousFuelEconomy() {
   return ((bitField0_ & 0x00000002) == 0x00000002);
 }
 /**
  * <code>optional uint32 instantaneous_fuel_economy = 2;</code>
  *
  * <pre>
  * Instantaneous Fuel Economy (km/L) = value. Precision: 1
  * </pre>
  */
 public int getInstantaneousFuelEconomy() {
   return instantaneousFuelEconomy_;
 }

 public static final int BRAKE_COUNT_FIELD_NUMBER = 3;
 private int brakeCount_;
 /**
  * <code>optional uint32 brake_count = 3;</code>
  *
  * <pre>
  * Count of brakes
  * </pre>
  */
 public boolean hasBrakeCount() {
   return ((bitField0_ & 0x00000004) == 0x00000004);
 }
 /**
  * <code>optional uint32 brake_count = 3;</code>
  *
  * <pre>
  * Count of brakes
  * </pre>
  */
 public int getBrakeCount() {
   return brakeCount_;
 }

 public static final int BRAKE_DURATION_SECONDS_FIELD_NUMBER = 4;
 private float brakeDurationSeconds_;
 /**
  * <code>optional float brake_duration_seconds = 4;</code>
  */
 public boolean hasBrakeDurationSeconds() {
   return ((bitField0_ & 0x00000008) == 0x00000008);
 }
 /**
  * <code>optional float brake_duration_seconds = 4;</code>
  */
 public float getBrakeDurationSeconds() {
   return brakeDurationSeconds_;
 }

 public static final int ENGINE_LOAD_PERCENT_FIELD_NUMBER = 5;
 private int engineLoadPercent_;
 /**
  * <code>optional uint32 engine_load_percent = 5;</code>
  *
  * <pre>
  * Engine load percentage. 0..255. Precision: 1
  * </pre>
  */
 public boolean hasEngineLoadPercent() {
   return ((bitField0_ & 0x00000010) == 0x00000010);
 }
 /**
  * <code>optional uint32 engine_load_percent = 5;</code>
  *
  * <pre>
  * Engine load percentage. 0..255. Precision: 1
  * </pre>
  */
 public int getEngineLoadPercent() {
   return engineLoadPercent_;
 }

 public static final int ENGINE_COOLANT_TEMPERATURE_FIELD_NUMBER = 6;
 private int engineCoolantTemperature_;
 /**
  * <code>optional sint32 engine_coolant_temperature = 6;</code>
  *
  * <pre>
  * Engine coolant Temperature (in degrees Celsius). Precision: 1
  * </pre>
  */
 public boolean hasEngineCoolantTemperature() {
   return ((bitField0_ & 0x00000020) == 0x00000020);
 }
 /**
  * <code>optional sint32 engine_coolant_temperature = 6;</code>
  *
  * <pre>
  * Engine coolant Temperature (in degrees Celsius). Precision: 1
  * </pre>
  */
 public int getEngineCoolantTemperature() {
   return engineCoolantTemperature_;
 }

 public static final int ENGINE_OIL_TEMPERATURE_FIELD_NUMBER = 7;
 private int engineOilTemperature_;
 /**
  * <code>optional sint32 engine_oil_temperature = 7;</code>
  *
  * <pre>
  * Engine oil Temperature (in degrees Celsius). Precision: 1
  * </pre>
  */
 public boolean hasEngineOilTemperature() {
   return ((bitField0_ & 0x00000040) == 0x00000040);
 }
 /**
  * <code>optional sint32 engine_oil_temperature = 7;</code>
  *
  * <pre>
  * Engine oil Temperature (in degrees Celsius). Precision: 1
  * </pre>
  */
 public int getEngineOilTemperature() {
   return engineOilTemperature_;
 }

 private void initFields() {
   header_ = EventHeaderProto.EventHeader.getDefaultInstance();
   instantaneousFuelEconomy_ = 0;
   brakeCount_ = 0;
   brakeDurationSeconds_ = 0F;
   engineLoadPercent_ = 0;
   engineCoolantTemperature_ = 0;
   engineOilTemperature_ = 0;
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
     output.writeUInt32(2, instantaneousFuelEconomy_);
   }
   if (((bitField0_ & 0x00000004) == 0x00000004)) {
     output.writeUInt32(3, brakeCount_);
   }
   if (((bitField0_ & 0x00000008) == 0x00000008)) {
     output.writeFloat(4, brakeDurationSeconds_);
   }
   if (((bitField0_ & 0x00000010) == 0x00000010)) {
     output.writeUInt32(5, engineLoadPercent_);
   }
   if (((bitField0_ & 0x00000020) == 0x00000020)) {
     output.writeSInt32(6, engineCoolantTemperature_);
   }
   if (((bitField0_ & 0x00000040) == 0x00000040)) {
     output.writeSInt32(7, engineOilTemperature_);
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
       .computeUInt32Size(2, instantaneousFuelEconomy_);
   }
   if (((bitField0_ & 0x00000004) == 0x00000004)) {
     size += com.google.protobuf.CodedOutputStream
       .computeUInt32Size(3, brakeCount_);
   }
   if (((bitField0_ & 0x00000008) == 0x00000008)) {
     size += com.google.protobuf.CodedOutputStream
       .computeFloatSize(4, brakeDurationSeconds_);
   }
   if (((bitField0_ & 0x00000010) == 0x00000010)) {
     size += com.google.protobuf.CodedOutputStream
       .computeUInt32Size(5, engineLoadPercent_);
   }
   if (((bitField0_ & 0x00000020) == 0x00000020)) {
     size += com.google.protobuf.CodedOutputStream
       .computeSInt32Size(6, engineCoolantTemperature_);
   }
   if (((bitField0_ & 0x00000040) == 0x00000040)) {
     size += com.google.protobuf.CodedOutputStream
       .computeSInt32Size(7, engineOilTemperature_);
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

 public static CanVehicleInfoProto.CanVehicleInfo parseFrom(
     com.google.protobuf.ByteString data)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data);
 }
 public static CanVehicleInfoProto.CanVehicleInfo parseFrom(
     com.google.protobuf.ByteString data,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data, extensionRegistry);
 }
 public static CanVehicleInfoProto.CanVehicleInfo parseFrom(byte[] data)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data);
 }
 public static CanVehicleInfoProto.CanVehicleInfo parseFrom(
     byte[] data,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data, extensionRegistry);
 }
 public static CanVehicleInfoProto.CanVehicleInfo parseFrom(java.io.InputStream input)
     throws java.io.IOException {
   return PARSER.parseFrom(input);
 }
 public static CanVehicleInfoProto.CanVehicleInfo parseFrom(
     java.io.InputStream input,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws java.io.IOException {
   return PARSER.parseFrom(input, extensionRegistry);
 }
 public static CanVehicleInfoProto.CanVehicleInfo parseDelimitedFrom(java.io.InputStream input)
     throws java.io.IOException {
   return PARSER.parseDelimitedFrom(input);
 }
 public static CanVehicleInfoProto.CanVehicleInfo parseDelimitedFrom(
     java.io.InputStream input,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws java.io.IOException {
   return PARSER.parseDelimitedFrom(input, extensionRegistry);
 }
 public static CanVehicleInfoProto.CanVehicleInfo parseFrom(
     com.google.protobuf.CodedInputStream input)
     throws java.io.IOException {
   return PARSER.parseFrom(input);
 }
 public static CanVehicleInfoProto.CanVehicleInfo parseFrom(
     com.google.protobuf.CodedInputStream input,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws java.io.IOException {
   return PARSER.parseFrom(input, extensionRegistry);
 }

 public static Builder newBuilder() { return Builder.create(); }
 public Builder newBuilderForType() { return newBuilder(); }
 public static Builder newBuilder(CanVehicleInfoProto.CanVehicleInfo prototype) {
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
  * Protobuf type {@code CanVehicleInfo}
  *
  * <pre>
  * CAN Vehicle Info
  * </pre>
  */
 public static final class Builder extends
     com.google.protobuf.GeneratedMessage.Builder<Builder> implements
     // @@protoc_insertion_point(builder_implements:CanVehicleInfo)
     CanVehicleInfoProto.CanVehicleInfoOrBuilder {
   public static final com.google.protobuf.Descriptors.Descriptor
       getDescriptor() {
     return CanVehicleInfoProto.internal_static_CanVehicleInfo_descriptor;
   }

   protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
       internalGetFieldAccessorTable() {
     return CanVehicleInfoProto.internal_static_CanVehicleInfo_fieldAccessorTable
         .ensureFieldAccessorsInitialized(
             CanVehicleInfoProto.CanVehicleInfo.class, CanVehicleInfoProto.CanVehicleInfo.Builder.class);
   }

   // Construct using CanVehicleInfoProto.CanVehicleInfo.newBuilder()
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
     instantaneousFuelEconomy_ = 0;
     bitField0_ = (bitField0_ & ~0x00000002);
     brakeCount_ = 0;
     bitField0_ = (bitField0_ & ~0x00000004);
     brakeDurationSeconds_ = 0F;
     bitField0_ = (bitField0_ & ~0x00000008);
     engineLoadPercent_ = 0;
     bitField0_ = (bitField0_ & ~0x00000010);
     engineCoolantTemperature_ = 0;
     bitField0_ = (bitField0_ & ~0x00000020);
     engineOilTemperature_ = 0;
     bitField0_ = (bitField0_ & ~0x00000040);
     return this;
   }

   public Builder clone() {
     return create().mergeFrom(buildPartial());
   }

   public com.google.protobuf.Descriptors.Descriptor
       getDescriptorForType() {
     return CanVehicleInfoProto.internal_static_CanVehicleInfo_descriptor;
   }

   public CanVehicleInfoProto.CanVehicleInfo getDefaultInstanceForType() {
     return CanVehicleInfoProto.CanVehicleInfo.getDefaultInstance();
   }

   public CanVehicleInfoProto.CanVehicleInfo build() {
     CanVehicleInfoProto.CanVehicleInfo result = buildPartial();
     if (!result.isInitialized()) {
       throw newUninitializedMessageException(result);
     }
     return result;
   }

   public CanVehicleInfoProto.CanVehicleInfo buildPartial() {
     CanVehicleInfoProto.CanVehicleInfo result = new CanVehicleInfoProto.CanVehicleInfo(this);
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
     result.instantaneousFuelEconomy_ = instantaneousFuelEconomy_;
     if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
       to_bitField0_ |= 0x00000004;
     }
     result.brakeCount_ = brakeCount_;
     if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
       to_bitField0_ |= 0x00000008;
     }
     result.brakeDurationSeconds_ = brakeDurationSeconds_;
     if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
       to_bitField0_ |= 0x00000010;
     }
     result.engineLoadPercent_ = engineLoadPercent_;
     if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
       to_bitField0_ |= 0x00000020;
     }
     result.engineCoolantTemperature_ = engineCoolantTemperature_;
     if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
       to_bitField0_ |= 0x00000040;
     }
     result.engineOilTemperature_ = engineOilTemperature_;
     result.bitField0_ = to_bitField0_;
     onBuilt();
     return result;
   }

   public Builder mergeFrom(com.google.protobuf.Message other) {
     if (other instanceof CanVehicleInfoProto.CanVehicleInfo) {
       return mergeFrom((CanVehicleInfoProto.CanVehicleInfo)other);
     } else {
       super.mergeFrom(other);
       return this;
     }
   }

   public Builder mergeFrom(CanVehicleInfoProto.CanVehicleInfo other) {
     if (other == CanVehicleInfoProto.CanVehicleInfo.getDefaultInstance()) return this;
     if (other.hasHeader()) {
       mergeHeader(other.getHeader());
     }
     if (other.hasInstantaneousFuelEconomy()) {
       setInstantaneousFuelEconomy(other.getInstantaneousFuelEconomy());
     }
     if (other.hasBrakeCount()) {
       setBrakeCount(other.getBrakeCount());
     }
     if (other.hasBrakeDurationSeconds()) {
       setBrakeDurationSeconds(other.getBrakeDurationSeconds());
     }
     if (other.hasEngineLoadPercent()) {
       setEngineLoadPercent(other.getEngineLoadPercent());
     }
     if (other.hasEngineCoolantTemperature()) {
       setEngineCoolantTemperature(other.getEngineCoolantTemperature());
     }
     if (other.hasEngineOilTemperature()) {
       setEngineOilTemperature(other.getEngineOilTemperature());
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
     CanVehicleInfoProto.CanVehicleInfo parsedMessage = null;
     try {
       parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
     } catch (com.google.protobuf.InvalidProtocolBufferException e) {
       parsedMessage = (CanVehicleInfoProto.CanVehicleInfo) e.getUnfinishedMessage();
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

   private int instantaneousFuelEconomy_ ;
   /**
    * <code>optional uint32 instantaneous_fuel_economy = 2;</code>
    *
    * <pre>
    * Instantaneous Fuel Economy (km/L) = value. Precision: 1
    * </pre>
    */
   public boolean hasInstantaneousFuelEconomy() {
     return ((bitField0_ & 0x00000002) == 0x00000002);
   }
   /**
    * <code>optional uint32 instantaneous_fuel_economy = 2;</code>
    *
    * <pre>
    * Instantaneous Fuel Economy (km/L) = value. Precision: 1
    * </pre>
    */
   public int getInstantaneousFuelEconomy() {
     return instantaneousFuelEconomy_;
   }
   /**
    * <code>optional uint32 instantaneous_fuel_economy = 2;</code>
    *
    * <pre>
    * Instantaneous Fuel Economy (km/L) = value. Precision: 1
    * </pre>
    */
   public Builder setInstantaneousFuelEconomy(int value) {
     bitField0_ |= 0x00000002;
     instantaneousFuelEconomy_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>optional uint32 instantaneous_fuel_economy = 2;</code>
    *
    * <pre>
    * Instantaneous Fuel Economy (km/L) = value. Precision: 1
    * </pre>
    */
   public Builder clearInstantaneousFuelEconomy() {
     bitField0_ = (bitField0_ & ~0x00000002);
     instantaneousFuelEconomy_ = 0;
     onChanged();
     return this;
   }

   private int brakeCount_ ;
   /**
    * <code>optional uint32 brake_count = 3;</code>
    *
    * <pre>
    * Count of brakes
    * </pre>
    */
   public boolean hasBrakeCount() {
     return ((bitField0_ & 0x00000004) == 0x00000004);
   }
   /**
    * <code>optional uint32 brake_count = 3;</code>
    *
    * <pre>
    * Count of brakes
    * </pre>
    */
   public int getBrakeCount() {
     return brakeCount_;
   }
   /**
    * <code>optional uint32 brake_count = 3;</code>
    *
    * <pre>
    * Count of brakes
    * </pre>
    */
   public Builder setBrakeCount(int value) {
     bitField0_ |= 0x00000004;
     brakeCount_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>optional uint32 brake_count = 3;</code>
    *
    * <pre>
    * Count of brakes
    * </pre>
    */
   public Builder clearBrakeCount() {
     bitField0_ = (bitField0_ & ~0x00000004);
     brakeCount_ = 0;
     onChanged();
     return this;
   }

   private float brakeDurationSeconds_ ;
   /**
    * <code>optional float brake_duration_seconds = 4;</code>
    */
   public boolean hasBrakeDurationSeconds() {
     return ((bitField0_ & 0x00000008) == 0x00000008);
   }
   /**
    * <code>optional float brake_duration_seconds = 4;</code>
    */
   public float getBrakeDurationSeconds() {
     return brakeDurationSeconds_;
   }
   /**
    * <code>optional float brake_duration_seconds = 4;</code>
    */
   public Builder setBrakeDurationSeconds(float value) {
     bitField0_ |= 0x00000008;
     brakeDurationSeconds_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>optional float brake_duration_seconds = 4;</code>
    */
   public Builder clearBrakeDurationSeconds() {
     bitField0_ = (bitField0_ & ~0x00000008);
     brakeDurationSeconds_ = 0F;
     onChanged();
     return this;
   }

   private int engineLoadPercent_ ;
   /**
    * <code>optional uint32 engine_load_percent = 5;</code>
    *
    * <pre>
    * Engine load percentage. 0..255. Precision: 1
    * </pre>
    */
   public boolean hasEngineLoadPercent() {
     return ((bitField0_ & 0x00000010) == 0x00000010);
   }
   /**
    * <code>optional uint32 engine_load_percent = 5;</code>
    *
    * <pre>
    * Engine load percentage. 0..255. Precision: 1
    * </pre>
    */
   public int getEngineLoadPercent() {
     return engineLoadPercent_;
   }
   /**
    * <code>optional uint32 engine_load_percent = 5;</code>
    *
    * <pre>
    * Engine load percentage. 0..255. Precision: 1
    * </pre>
    */
   public Builder setEngineLoadPercent(int value) {
     bitField0_ |= 0x00000010;
     engineLoadPercent_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>optional uint32 engine_load_percent = 5;</code>
    *
    * <pre>
    * Engine load percentage. 0..255. Precision: 1
    * </pre>
    */
   public Builder clearEngineLoadPercent() {
     bitField0_ = (bitField0_ & ~0x00000010);
     engineLoadPercent_ = 0;
     onChanged();
     return this;
   }

   private int engineCoolantTemperature_ ;
   /**
    * <code>optional sint32 engine_coolant_temperature = 6;</code>
    *
    * <pre>
    * Engine coolant Temperature (in degrees Celsius). Precision: 1
    * </pre>
    */
   public boolean hasEngineCoolantTemperature() {
     return ((bitField0_ & 0x00000020) == 0x00000020);
   }
   /**
    * <code>optional sint32 engine_coolant_temperature = 6;</code>
    *
    * <pre>
    * Engine coolant Temperature (in degrees Celsius). Precision: 1
    * </pre>
    */
   public int getEngineCoolantTemperature() {
     return engineCoolantTemperature_;
   }
   /**
    * <code>optional sint32 engine_coolant_temperature = 6;</code>
    *
    * <pre>
    * Engine coolant Temperature (in degrees Celsius). Precision: 1
    * </pre>
    */
   public Builder setEngineCoolantTemperature(int value) {
     bitField0_ |= 0x00000020;
     engineCoolantTemperature_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>optional sint32 engine_coolant_temperature = 6;</code>
    *
    * <pre>
    * Engine coolant Temperature (in degrees Celsius). Precision: 1
    * </pre>
    */
   public Builder clearEngineCoolantTemperature() {
     bitField0_ = (bitField0_ & ~0x00000020);
     engineCoolantTemperature_ = 0;
     onChanged();
     return this;
   }

   private int engineOilTemperature_ ;
   /**
    * <code>optional sint32 engine_oil_temperature = 7;</code>
    *
    * <pre>
    * Engine oil Temperature (in degrees Celsius). Precision: 1
    * </pre>
    */
   public boolean hasEngineOilTemperature() {
     return ((bitField0_ & 0x00000040) == 0x00000040);
   }
   /**
    * <code>optional sint32 engine_oil_temperature = 7;</code>
    *
    * <pre>
    * Engine oil Temperature (in degrees Celsius). Precision: 1
    * </pre>
    */
   public int getEngineOilTemperature() {
     return engineOilTemperature_;
   }
   /**
    * <code>optional sint32 engine_oil_temperature = 7;</code>
    *
    * <pre>
    * Engine oil Temperature (in degrees Celsius). Precision: 1
    * </pre>
    */
   public Builder setEngineOilTemperature(int value) {
     bitField0_ |= 0x00000040;
     engineOilTemperature_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>optional sint32 engine_oil_temperature = 7;</code>
    *
    * <pre>
    * Engine oil Temperature (in degrees Celsius). Precision: 1
    * </pre>
    */
   public Builder clearEngineOilTemperature() {
     bitField0_ = (bitField0_ & ~0x00000040);
     engineOilTemperature_ = 0;
     onChanged();
     return this;
   }

   // @@protoc_insertion_point(builder_scope:CanVehicleInfo)
 }

 static {
   defaultInstance = new CanVehicleInfo(true);
   defaultInstance.initFields();
 }

 // @@protoc_insertion_point(class_scope:CanVehicleInfo)
}

private static final com.google.protobuf.Descriptors.Descriptor
 internal_static_CanVehicleInfo_descriptor;
private static
 com.google.protobuf.GeneratedMessage.FieldAccessorTable
   internal_static_CanVehicleInfo_fieldAccessorTable;

public static com.google.protobuf.Descriptors.FileDescriptor
   getDescriptor() {
 return descriptor;
}
private static com.google.protobuf.Descriptors.FileDescriptor
   descriptor;
static {
 java.lang.String[] descriptorData = {
   "\n\031CanVehicleInfoProto.proto\032\026EventHeader" +
   "Proto.proto\"\350\001\n\016CanVehicleInfo\022\034\n\006header" +
   "\030\001 \002(\0132\014.EventHeader\022\"\n\032instantaneous_fu" +
   "el_economy\030\002 \001(\r\022\023\n\013brake_count\030\003 \001(\r\022\036\n" +
   "\026brake_duration_seconds\030\004 \001(\002\022\033\n\023engine_" +
   "load_percent\030\005 \001(\r\022\"\n\032engine_coolant_tem" +
   "perature\030\006 \001(\021\022\036\n\026engine_oil_temperature" +
   "\030\007 \001(\021"
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
 internal_static_CanVehicleInfo_descriptor =
   getDescriptor().getMessageTypes().get(0);
 internal_static_CanVehicleInfo_fieldAccessorTable = new
   com.google.protobuf.GeneratedMessage.FieldAccessorTable(
     internal_static_CanVehicleInfo_descriptor,
     new java.lang.String[] { "Header", "InstantaneousFuelEconomy", "BrakeCount", "BrakeDurationSeconds", "EngineLoadPercent", "EngineCoolantTemperature", "EngineOilTemperature", });
 EventHeaderProto.getDescriptor();
}

// @@protoc_insertion_point(outer_class_scope)
}