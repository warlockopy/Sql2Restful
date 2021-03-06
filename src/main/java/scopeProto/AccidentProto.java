package scopeProto;

//Generated by the protocol buffer compiler.  DO NOT EDIT!
//source: AccidentProto.proto

public final class AccidentProto {
private AccidentProto() {}
public static void registerAllExtensions(
   com.google.protobuf.ExtensionRegistry registry) {
}
public interface AccidentOrBuilder extends
   // @@protoc_insertion_point(interface_extends:Accident)
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
  * <code>optional uint32 impact_direction = 2;</code>
  *
  * <pre>
  * Impact direction. Degrees 0..360
  * </pre>
  */
 boolean hasImpactDirection();
 /**
  * <code>optional uint32 impact_direction = 2;</code>
  *
  * <pre>
  * Impact direction. Degrees 0..360
  * </pre>
  */
 int getImpactDirection();

 /**
  * <code>optional float accelerometer_x = 3;</code>
  *
  * <pre>
  * Accelerometer reading on X axis. G units. Precision: 0.01
  * </pre>
  */
 boolean hasAccelerometerX();
 /**
  * <code>optional float accelerometer_x = 3;</code>
  *
  * <pre>
  * Accelerometer reading on X axis. G units. Precision: 0.01
  * </pre>
  */
 float getAccelerometerX();

 /**
  * <code>optional float accelerometer_y = 4;</code>
  *
  * <pre>
  * Accelerometer reading on Y axis. G units. Precision: 0.01
  * </pre>
  */
 boolean hasAccelerometerY();
 /**
  * <code>optional float accelerometer_y = 4;</code>
  *
  * <pre>
  * Accelerometer reading on Y axis. G units. Precision: 0.01
  * </pre>
  */
 float getAccelerometerY();

 /**
  * <code>optional float accelerometer_z = 5;</code>
  *
  * <pre>
  * Accelerometer reading on Z axis. G units. Precision: 0.01
  * </pre>
  */
 boolean hasAccelerometerZ();
 /**
  * <code>optional float accelerometer_z = 5;</code>
  *
  * <pre>
  * Accelerometer reading on Z axis. G units. Precision: 0.01
  * </pre>
  */
 float getAccelerometerZ();

 /**
  * <code>optional uint32 gforcelimit_x = 6;</code>
  *
  * <pre>
  * Limit of G force on X axis over which accident is recorded. G units. Precision: 1
  * </pre>
  */
 boolean hasGforcelimitX();
 /**
  * <code>optional uint32 gforcelimit_x = 6;</code>
  *
  * <pre>
  * Limit of G force on X axis over which accident is recorded. G units. Precision: 1
  * </pre>
  */
 int getGforcelimitX();

 /**
  * <code>optional uint32 gforcelimit_y = 7;</code>
  *
  * <pre>
  * Limit of G force on Y axis over which accident is recorded. G units. Precision: 1
  * </pre>
  */
 boolean hasGforcelimitY();
 /**
  * <code>optional uint32 gforcelimit_y = 7;</code>
  *
  * <pre>
  * Limit of G force on Y axis over which accident is recorded. G units. Precision: 1
  * </pre>
  */
 int getGforcelimitY();

 /**
  * <code>optional uint32 accident_recon_index = 8;</code>
  *
  * <pre>
  * Index that joins together this Accident event with all its AccidentLog events. 
  * </pre>
  */
 boolean hasAccidentReconIndex();
 /**
  * <code>optional uint32 accident_recon_index = 8;</code>
  *
  * <pre>
  * Index that joins together this Accident event with all its AccidentLog events. 
  * </pre>
  */
 int getAccidentReconIndex();
}
/**
* Protobuf type {@code Accident}
*
* <pre>
* Accident event is raised when an impact occurs. More accident details are with a number of regular AccidentLog events.
* </pre>
*/
public static final class Accident extends
   com.google.protobuf.GeneratedMessage implements
   // @@protoc_insertion_point(message_implements:Accident)
   AccidentOrBuilder {
 // Use Accident.newBuilder() to construct.
 private Accident(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
   super(builder);
   this.unknownFields = builder.getUnknownFields();
 }
 private Accident(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

 private static final Accident defaultInstance;
 public static Accident getDefaultInstance() {
   return defaultInstance;
 }

 public Accident getDefaultInstanceForType() {
   return defaultInstance;
 }

 private final com.google.protobuf.UnknownFieldSet unknownFields;
 @java.lang.Override
 public final com.google.protobuf.UnknownFieldSet
     getUnknownFields() {
   return this.unknownFields;
 }
 private Accident(
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
           impactDirection_ = input.readUInt32();
           break;
         }
         case 29: {
           bitField0_ |= 0x00000004;
           accelerometerX_ = input.readFloat();
           break;
         }
         case 37: {
           bitField0_ |= 0x00000008;
           accelerometerY_ = input.readFloat();
           break;
         }
         case 45: {
           bitField0_ |= 0x00000010;
           accelerometerZ_ = input.readFloat();
           break;
         }
         case 48: {
           bitField0_ |= 0x00000020;
           gforcelimitX_ = input.readUInt32();
           break;
         }
         case 56: {
           bitField0_ |= 0x00000040;
           gforcelimitY_ = input.readUInt32();
           break;
         }
         case 64: {
           bitField0_ |= 0x00000080;
           accidentReconIndex_ = input.readUInt32();
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
   return AccidentProto.internal_static_Accident_descriptor;
 }

 protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
     internalGetFieldAccessorTable() {
   return AccidentProto.internal_static_Accident_fieldAccessorTable
       .ensureFieldAccessorsInitialized(
           AccidentProto.Accident.class, AccidentProto.Accident.Builder.class);
 }

 public static com.google.protobuf.Parser<Accident> PARSER =
     new com.google.protobuf.AbstractParser<Accident>() {
   public Accident parsePartialFrom(
       com.google.protobuf.CodedInputStream input,
       com.google.protobuf.ExtensionRegistryLite extensionRegistry)
       throws com.google.protobuf.InvalidProtocolBufferException {
     return new Accident(input, extensionRegistry);
   }
 };

 @java.lang.Override
 public com.google.protobuf.Parser<Accident> getParserForType() {
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

 public static final int IMPACT_DIRECTION_FIELD_NUMBER = 2;
 private int impactDirection_;
 /**
  * <code>optional uint32 impact_direction = 2;</code>
  *
  * <pre>
  * Impact direction. Degrees 0..360
  * </pre>
  */
 public boolean hasImpactDirection() {
   return ((bitField0_ & 0x00000002) == 0x00000002);
 }
 /**
  * <code>optional uint32 impact_direction = 2;</code>
  *
  * <pre>
  * Impact direction. Degrees 0..360
  * </pre>
  */
 public int getImpactDirection() {
   return impactDirection_;
 }

 public static final int ACCELEROMETER_X_FIELD_NUMBER = 3;
 private float accelerometerX_;
 /**
  * <code>optional float accelerometer_x = 3;</code>
  *
  * <pre>
  * Accelerometer reading on X axis. G units. Precision: 0.01
  * </pre>
  */
 public boolean hasAccelerometerX() {
   return ((bitField0_ & 0x00000004) == 0x00000004);
 }
 /**
  * <code>optional float accelerometer_x = 3;</code>
  *
  * <pre>
  * Accelerometer reading on X axis. G units. Precision: 0.01
  * </pre>
  */
 public float getAccelerometerX() {
   return accelerometerX_;
 }

 public static final int ACCELEROMETER_Y_FIELD_NUMBER = 4;
 private float accelerometerY_;
 /**
  * <code>optional float accelerometer_y = 4;</code>
  *
  * <pre>
  * Accelerometer reading on Y axis. G units. Precision: 0.01
  * </pre>
  */
 public boolean hasAccelerometerY() {
   return ((bitField0_ & 0x00000008) == 0x00000008);
 }
 /**
  * <code>optional float accelerometer_y = 4;</code>
  *
  * <pre>
  * Accelerometer reading on Y axis. G units. Precision: 0.01
  * </pre>
  */
 public float getAccelerometerY() {
   return accelerometerY_;
 }

 public static final int ACCELEROMETER_Z_FIELD_NUMBER = 5;
 private float accelerometerZ_;
 /**
  * <code>optional float accelerometer_z = 5;</code>
  *
  * <pre>
  * Accelerometer reading on Z axis. G units. Precision: 0.01
  * </pre>
  */
 public boolean hasAccelerometerZ() {
   return ((bitField0_ & 0x00000010) == 0x00000010);
 }
 /**
  * <code>optional float accelerometer_z = 5;</code>
  *
  * <pre>
  * Accelerometer reading on Z axis. G units. Precision: 0.01
  * </pre>
  */
 public float getAccelerometerZ() {
   return accelerometerZ_;
 }

 public static final int GFORCELIMIT_X_FIELD_NUMBER = 6;
 private int gforcelimitX_;
 /**
  * <code>optional uint32 gforcelimit_x = 6;</code>
  *
  * <pre>
  * Limit of G force on X axis over which accident is recorded. G units. Precision: 1
  * </pre>
  */
 public boolean hasGforcelimitX() {
   return ((bitField0_ & 0x00000020) == 0x00000020);
 }
 /**
  * <code>optional uint32 gforcelimit_x = 6;</code>
  *
  * <pre>
  * Limit of G force on X axis over which accident is recorded. G units. Precision: 1
  * </pre>
  */
 public int getGforcelimitX() {
   return gforcelimitX_;
 }

 public static final int GFORCELIMIT_Y_FIELD_NUMBER = 7;
 private int gforcelimitY_;
 /**
  * <code>optional uint32 gforcelimit_y = 7;</code>
  *
  * <pre>
  * Limit of G force on Y axis over which accident is recorded. G units. Precision: 1
  * </pre>
  */
 public boolean hasGforcelimitY() {
   return ((bitField0_ & 0x00000040) == 0x00000040);
 }
 /**
  * <code>optional uint32 gforcelimit_y = 7;</code>
  *
  * <pre>
  * Limit of G force on Y axis over which accident is recorded. G units. Precision: 1
  * </pre>
  */
 public int getGforcelimitY() {
   return gforcelimitY_;
 }

 public static final int ACCIDENT_RECON_INDEX_FIELD_NUMBER = 8;
 private int accidentReconIndex_;
 /**
  * <code>optional uint32 accident_recon_index = 8;</code>
  *
  * <pre>
  * Index that joins together this Accident event with all its AccidentLog events. 
  * </pre>
  */
 public boolean hasAccidentReconIndex() {
   return ((bitField0_ & 0x00000080) == 0x00000080);
 }
 /**
  * <code>optional uint32 accident_recon_index = 8;</code>
  *
  * <pre>
  * Index that joins together this Accident event with all its AccidentLog events. 
  * </pre>
  */
 public int getAccidentReconIndex() {
   return accidentReconIndex_;
 }

 private void initFields() {
   header_ = EventHeaderProto.EventHeader.getDefaultInstance();
   impactDirection_ = 0;
   accelerometerX_ = 0F;
   accelerometerY_ = 0F;
   accelerometerZ_ = 0F;
   gforcelimitX_ = 0;
   gforcelimitY_ = 0;
   accidentReconIndex_ = 0;
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
     output.writeUInt32(2, impactDirection_);
   }
   if (((bitField0_ & 0x00000004) == 0x00000004)) {
     output.writeFloat(3, accelerometerX_);
   }
   if (((bitField0_ & 0x00000008) == 0x00000008)) {
     output.writeFloat(4, accelerometerY_);
   }
   if (((bitField0_ & 0x00000010) == 0x00000010)) {
     output.writeFloat(5, accelerometerZ_);
   }
   if (((bitField0_ & 0x00000020) == 0x00000020)) {
     output.writeUInt32(6, gforcelimitX_);
   }
   if (((bitField0_ & 0x00000040) == 0x00000040)) {
     output.writeUInt32(7, gforcelimitY_);
   }
   if (((bitField0_ & 0x00000080) == 0x00000080)) {
     output.writeUInt32(8, accidentReconIndex_);
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
       .computeUInt32Size(2, impactDirection_);
   }
   if (((bitField0_ & 0x00000004) == 0x00000004)) {
     size += com.google.protobuf.CodedOutputStream
       .computeFloatSize(3, accelerometerX_);
   }
   if (((bitField0_ & 0x00000008) == 0x00000008)) {
     size += com.google.protobuf.CodedOutputStream
       .computeFloatSize(4, accelerometerY_);
   }
   if (((bitField0_ & 0x00000010) == 0x00000010)) {
     size += com.google.protobuf.CodedOutputStream
       .computeFloatSize(5, accelerometerZ_);
   }
   if (((bitField0_ & 0x00000020) == 0x00000020)) {
     size += com.google.protobuf.CodedOutputStream
       .computeUInt32Size(6, gforcelimitX_);
   }
   if (((bitField0_ & 0x00000040) == 0x00000040)) {
     size += com.google.protobuf.CodedOutputStream
       .computeUInt32Size(7, gforcelimitY_);
   }
   if (((bitField0_ & 0x00000080) == 0x00000080)) {
     size += com.google.protobuf.CodedOutputStream
       .computeUInt32Size(8, accidentReconIndex_);
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

 public static AccidentProto.Accident parseFrom(
     com.google.protobuf.ByteString data)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data);
 }
 public static AccidentProto.Accident parseFrom(
     com.google.protobuf.ByteString data,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data, extensionRegistry);
 }
 public static AccidentProto.Accident parseFrom(byte[] data)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data);
 }
 public static AccidentProto.Accident parseFrom(
     byte[] data,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data, extensionRegistry);
 }
 public static AccidentProto.Accident parseFrom(java.io.InputStream input)
     throws java.io.IOException {
   return PARSER.parseFrom(input);
 }
 public static AccidentProto.Accident parseFrom(
     java.io.InputStream input,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws java.io.IOException {
   return PARSER.parseFrom(input, extensionRegistry);
 }
 public static AccidentProto.Accident parseDelimitedFrom(java.io.InputStream input)
     throws java.io.IOException {
   return PARSER.parseDelimitedFrom(input);
 }
 public static AccidentProto.Accident parseDelimitedFrom(
     java.io.InputStream input,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws java.io.IOException {
   return PARSER.parseDelimitedFrom(input, extensionRegistry);
 }
 public static AccidentProto.Accident parseFrom(
     com.google.protobuf.CodedInputStream input)
     throws java.io.IOException {
   return PARSER.parseFrom(input);
 }
 public static AccidentProto.Accident parseFrom(
     com.google.protobuf.CodedInputStream input,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws java.io.IOException {
   return PARSER.parseFrom(input, extensionRegistry);
 }

 public static Builder newBuilder() { return Builder.create(); }
 public Builder newBuilderForType() { return newBuilder(); }
 public static Builder newBuilder(AccidentProto.Accident prototype) {
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
  * Protobuf type {@code Accident}
  *
  * <pre>
  * Accident event is raised when an impact occurs. More accident details are with a number of regular AccidentLog events.
  * </pre>
  */
 public static final class Builder extends
     com.google.protobuf.GeneratedMessage.Builder<Builder> implements
     // @@protoc_insertion_point(builder_implements:Accident)
     AccidentProto.AccidentOrBuilder {
   public static final com.google.protobuf.Descriptors.Descriptor
       getDescriptor() {
     return AccidentProto.internal_static_Accident_descriptor;
   }

   protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
       internalGetFieldAccessorTable() {
     return AccidentProto.internal_static_Accident_fieldAccessorTable
         .ensureFieldAccessorsInitialized(
             AccidentProto.Accident.class, AccidentProto.Accident.Builder.class);
   }

   // Construct using AccidentProto.Accident.newBuilder()
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
     impactDirection_ = 0;
     bitField0_ = (bitField0_ & ~0x00000002);
     accelerometerX_ = 0F;
     bitField0_ = (bitField0_ & ~0x00000004);
     accelerometerY_ = 0F;
     bitField0_ = (bitField0_ & ~0x00000008);
     accelerometerZ_ = 0F;
     bitField0_ = (bitField0_ & ~0x00000010);
     gforcelimitX_ = 0;
     bitField0_ = (bitField0_ & ~0x00000020);
     gforcelimitY_ = 0;
     bitField0_ = (bitField0_ & ~0x00000040);
     accidentReconIndex_ = 0;
     bitField0_ = (bitField0_ & ~0x00000080);
     return this;
   }

   public Builder clone() {
     return create().mergeFrom(buildPartial());
   }

   public com.google.protobuf.Descriptors.Descriptor
       getDescriptorForType() {
     return AccidentProto.internal_static_Accident_descriptor;
   }

   public AccidentProto.Accident getDefaultInstanceForType() {
     return AccidentProto.Accident.getDefaultInstance();
   }

   public AccidentProto.Accident build() {
     AccidentProto.Accident result = buildPartial();
     if (!result.isInitialized()) {
       throw newUninitializedMessageException(result);
     }
     return result;
   }

   public AccidentProto.Accident buildPartial() {
     AccidentProto.Accident result = new AccidentProto.Accident(this);
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
     result.impactDirection_ = impactDirection_;
     if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
       to_bitField0_ |= 0x00000004;
     }
     result.accelerometerX_ = accelerometerX_;
     if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
       to_bitField0_ |= 0x00000008;
     }
     result.accelerometerY_ = accelerometerY_;
     if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
       to_bitField0_ |= 0x00000010;
     }
     result.accelerometerZ_ = accelerometerZ_;
     if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
       to_bitField0_ |= 0x00000020;
     }
     result.gforcelimitX_ = gforcelimitX_;
     if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
       to_bitField0_ |= 0x00000040;
     }
     result.gforcelimitY_ = gforcelimitY_;
     if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
       to_bitField0_ |= 0x00000080;
     }
     result.accidentReconIndex_ = accidentReconIndex_;
     result.bitField0_ = to_bitField0_;
     onBuilt();
     return result;
   }

   public Builder mergeFrom(com.google.protobuf.Message other) {
     if (other instanceof AccidentProto.Accident) {
       return mergeFrom((AccidentProto.Accident)other);
     } else {
       super.mergeFrom(other);
       return this;
     }
   }

   public Builder mergeFrom(AccidentProto.Accident other) {
     if (other == AccidentProto.Accident.getDefaultInstance()) return this;
     if (other.hasHeader()) {
       mergeHeader(other.getHeader());
     }
     if (other.hasImpactDirection()) {
       setImpactDirection(other.getImpactDirection());
     }
     if (other.hasAccelerometerX()) {
       setAccelerometerX(other.getAccelerometerX());
     }
     if (other.hasAccelerometerY()) {
       setAccelerometerY(other.getAccelerometerY());
     }
     if (other.hasAccelerometerZ()) {
       setAccelerometerZ(other.getAccelerometerZ());
     }
     if (other.hasGforcelimitX()) {
       setGforcelimitX(other.getGforcelimitX());
     }
     if (other.hasGforcelimitY()) {
       setGforcelimitY(other.getGforcelimitY());
     }
     if (other.hasAccidentReconIndex()) {
       setAccidentReconIndex(other.getAccidentReconIndex());
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
     AccidentProto.Accident parsedMessage = null;
     try {
       parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
     } catch (com.google.protobuf.InvalidProtocolBufferException e) {
       parsedMessage = (AccidentProto.Accident) e.getUnfinishedMessage();
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

   private int impactDirection_ ;
   /**
    * <code>optional uint32 impact_direction = 2;</code>
    *
    * <pre>
    * Impact direction. Degrees 0..360
    * </pre>
    */
   public boolean hasImpactDirection() {
     return ((bitField0_ & 0x00000002) == 0x00000002);
   }
   /**
    * <code>optional uint32 impact_direction = 2;</code>
    *
    * <pre>
    * Impact direction. Degrees 0..360
    * </pre>
    */
   public int getImpactDirection() {
     return impactDirection_;
   }
   /**
    * <code>optional uint32 impact_direction = 2;</code>
    *
    * <pre>
    * Impact direction. Degrees 0..360
    * </pre>
    */
   public Builder setImpactDirection(int value) {
     bitField0_ |= 0x00000002;
     impactDirection_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>optional uint32 impact_direction = 2;</code>
    *
    * <pre>
    * Impact direction. Degrees 0..360
    * </pre>
    */
   public Builder clearImpactDirection() {
     bitField0_ = (bitField0_ & ~0x00000002);
     impactDirection_ = 0;
     onChanged();
     return this;
   }

   private float accelerometerX_ ;
   /**
    * <code>optional float accelerometer_x = 3;</code>
    *
    * <pre>
    * Accelerometer reading on X axis. G units. Precision: 0.01
    * </pre>
    */
   public boolean hasAccelerometerX() {
     return ((bitField0_ & 0x00000004) == 0x00000004);
   }
   /**
    * <code>optional float accelerometer_x = 3;</code>
    *
    * <pre>
    * Accelerometer reading on X axis. G units. Precision: 0.01
    * </pre>
    */
   public float getAccelerometerX() {
     return accelerometerX_;
   }
   /**
    * <code>optional float accelerometer_x = 3;</code>
    *
    * <pre>
    * Accelerometer reading on X axis. G units. Precision: 0.01
    * </pre>
    */
   public Builder setAccelerometerX(float value) {
     bitField0_ |= 0x00000004;
     accelerometerX_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>optional float accelerometer_x = 3;</code>
    *
    * <pre>
    * Accelerometer reading on X axis. G units. Precision: 0.01
    * </pre>
    */
   public Builder clearAccelerometerX() {
     bitField0_ = (bitField0_ & ~0x00000004);
     accelerometerX_ = 0F;
     onChanged();
     return this;
   }

   private float accelerometerY_ ;
   /**
    * <code>optional float accelerometer_y = 4;</code>
    *
    * <pre>
    * Accelerometer reading on Y axis. G units. Precision: 0.01
    * </pre>
    */
   public boolean hasAccelerometerY() {
     return ((bitField0_ & 0x00000008) == 0x00000008);
   }
   /**
    * <code>optional float accelerometer_y = 4;</code>
    *
    * <pre>
    * Accelerometer reading on Y axis. G units. Precision: 0.01
    * </pre>
    */
   public float getAccelerometerY() {
     return accelerometerY_;
   }
   /**
    * <code>optional float accelerometer_y = 4;</code>
    *
    * <pre>
    * Accelerometer reading on Y axis. G units. Precision: 0.01
    * </pre>
    */
   public Builder setAccelerometerY(float value) {
     bitField0_ |= 0x00000008;
     accelerometerY_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>optional float accelerometer_y = 4;</code>
    *
    * <pre>
    * Accelerometer reading on Y axis. G units. Precision: 0.01
    * </pre>
    */
   public Builder clearAccelerometerY() {
     bitField0_ = (bitField0_ & ~0x00000008);
     accelerometerY_ = 0F;
     onChanged();
     return this;
   }

   private float accelerometerZ_ ;
   /**
    * <code>optional float accelerometer_z = 5;</code>
    *
    * <pre>
    * Accelerometer reading on Z axis. G units. Precision: 0.01
    * </pre>
    */
   public boolean hasAccelerometerZ() {
     return ((bitField0_ & 0x00000010) == 0x00000010);
   }
   /**
    * <code>optional float accelerometer_z = 5;</code>
    *
    * <pre>
    * Accelerometer reading on Z axis. G units. Precision: 0.01
    * </pre>
    */
   public float getAccelerometerZ() {
     return accelerometerZ_;
   }
   /**
    * <code>optional float accelerometer_z = 5;</code>
    *
    * <pre>
    * Accelerometer reading on Z axis. G units. Precision: 0.01
    * </pre>
    */
   public Builder setAccelerometerZ(float value) {
     bitField0_ |= 0x00000010;
     accelerometerZ_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>optional float accelerometer_z = 5;</code>
    *
    * <pre>
    * Accelerometer reading on Z axis. G units. Precision: 0.01
    * </pre>
    */
   public Builder clearAccelerometerZ() {
     bitField0_ = (bitField0_ & ~0x00000010);
     accelerometerZ_ = 0F;
     onChanged();
     return this;
   }

   private int gforcelimitX_ ;
   /**
    * <code>optional uint32 gforcelimit_x = 6;</code>
    *
    * <pre>
    * Limit of G force on X axis over which accident is recorded. G units. Precision: 1
    * </pre>
    */
   public boolean hasGforcelimitX() {
     return ((bitField0_ & 0x00000020) == 0x00000020);
   }
   /**
    * <code>optional uint32 gforcelimit_x = 6;</code>
    *
    * <pre>
    * Limit of G force on X axis over which accident is recorded. G units. Precision: 1
    * </pre>
    */
   public int getGforcelimitX() {
     return gforcelimitX_;
   }
   /**
    * <code>optional uint32 gforcelimit_x = 6;</code>
    *
    * <pre>
    * Limit of G force on X axis over which accident is recorded. G units. Precision: 1
    * </pre>
    */
   public Builder setGforcelimitX(int value) {
     bitField0_ |= 0x00000020;
     gforcelimitX_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>optional uint32 gforcelimit_x = 6;</code>
    *
    * <pre>
    * Limit of G force on X axis over which accident is recorded. G units. Precision: 1
    * </pre>
    */
   public Builder clearGforcelimitX() {
     bitField0_ = (bitField0_ & ~0x00000020);
     gforcelimitX_ = 0;
     onChanged();
     return this;
   }

   private int gforcelimitY_ ;
   /**
    * <code>optional uint32 gforcelimit_y = 7;</code>
    *
    * <pre>
    * Limit of G force on Y axis over which accident is recorded. G units. Precision: 1
    * </pre>
    */
   public boolean hasGforcelimitY() {
     return ((bitField0_ & 0x00000040) == 0x00000040);
   }
   /**
    * <code>optional uint32 gforcelimit_y = 7;</code>
    *
    * <pre>
    * Limit of G force on Y axis over which accident is recorded. G units. Precision: 1
    * </pre>
    */
   public int getGforcelimitY() {
     return gforcelimitY_;
   }
   /**
    * <code>optional uint32 gforcelimit_y = 7;</code>
    *
    * <pre>
    * Limit of G force on Y axis over which accident is recorded. G units. Precision: 1
    * </pre>
    */
   public Builder setGforcelimitY(int value) {
     bitField0_ |= 0x00000040;
     gforcelimitY_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>optional uint32 gforcelimit_y = 7;</code>
    *
    * <pre>
    * Limit of G force on Y axis over which accident is recorded. G units. Precision: 1
    * </pre>
    */
   public Builder clearGforcelimitY() {
     bitField0_ = (bitField0_ & ~0x00000040);
     gforcelimitY_ = 0;
     onChanged();
     return this;
   }

   private int accidentReconIndex_ ;
   /**
    * <code>optional uint32 accident_recon_index = 8;</code>
    *
    * <pre>
    * Index that joins together this Accident event with all its AccidentLog events. 
    * </pre>
    */
   public boolean hasAccidentReconIndex() {
     return ((bitField0_ & 0x00000080) == 0x00000080);
   }
   /**
    * <code>optional uint32 accident_recon_index = 8;</code>
    *
    * <pre>
    * Index that joins together this Accident event with all its AccidentLog events. 
    * </pre>
    */
   public int getAccidentReconIndex() {
     return accidentReconIndex_;
   }
   /**
    * <code>optional uint32 accident_recon_index = 8;</code>
    *
    * <pre>
    * Index that joins together this Accident event with all its AccidentLog events. 
    * </pre>
    */
   public Builder setAccidentReconIndex(int value) {
     bitField0_ |= 0x00000080;
     accidentReconIndex_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>optional uint32 accident_recon_index = 8;</code>
    *
    * <pre>
    * Index that joins together this Accident event with all its AccidentLog events. 
    * </pre>
    */
   public Builder clearAccidentReconIndex() {
     bitField0_ = (bitField0_ & ~0x00000080);
     accidentReconIndex_ = 0;
     onChanged();
     return this;
   }

   // @@protoc_insertion_point(builder_scope:Accident)
 }

 static {
   defaultInstance = new Accident(true);
   defaultInstance.initFields();
 }

 // @@protoc_insertion_point(class_scope:Accident)
}

private static final com.google.protobuf.Descriptors.Descriptor
 internal_static_Accident_descriptor;
private static
 com.google.protobuf.GeneratedMessage.FieldAccessorTable
   internal_static_Accident_fieldAccessorTable;

public static com.google.protobuf.Descriptors.FileDescriptor
   getDescriptor() {
 return descriptor;
}
private static com.google.protobuf.Descriptors.FileDescriptor
   descriptor;
static {
 java.lang.String[] descriptorData = {
   "\n\023AccidentProto.proto\032\026EventHeaderProto." +
   "proto\"\331\001\n\010Accident\022\034\n\006header\030\001 \002(\0132\014.Eve" +
   "ntHeader\022\030\n\020impact_direction\030\002 \001(\r\022\027\n\017ac" +
   "celerometer_x\030\003 \001(\002\022\027\n\017accelerometer_y\030\004" +
   " \001(\002\022\027\n\017accelerometer_z\030\005 \001(\002\022\025\n\rgforcel" +
   "imit_x\030\006 \001(\r\022\025\n\rgforcelimit_y\030\007 \001(\r\022\034\n\024a" +
   "ccident_recon_index\030\010 \001(\r"
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
 internal_static_Accident_descriptor =
   getDescriptor().getMessageTypes().get(0);
 internal_static_Accident_fieldAccessorTable = new
   com.google.protobuf.GeneratedMessage.FieldAccessorTable(
     internal_static_Accident_descriptor,
     new java.lang.String[] { "Header", "ImpactDirection", "AccelerometerX", "AccelerometerY", "AccelerometerZ", "GforcelimitX", "GforcelimitY", "AccidentReconIndex", });
 EventHeaderProto.getDescriptor();
}

// @@protoc_insertion_point(outer_class_scope)
}
