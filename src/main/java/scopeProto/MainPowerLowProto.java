package scopeProto;

//Generated by the protocol buffer compiler.  DO NOT EDIT!
//source: MainPowerLowProto.proto

public final class MainPowerLowProto {
private MainPowerLowProto() {}
public static void registerAllExtensions(
   com.google.protobuf.ExtensionRegistry registry) {
}
public interface MainPowerLowOrBuilder extends
   // @@protoc_insertion_point(interface_extends:MainPowerLow)
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
  * <code>optional uint32 duration_seconds = 2;</code>
  *
  * <pre>
  * Duration in seconds
  * </pre>
  */
 boolean hasDurationSeconds();
 /**
  * <code>optional uint32 duration_seconds = 2;</code>
  *
  * <pre>
  * Duration in seconds
  * </pre>
  */
 int getDurationSeconds();

 /**
  * <code>optional float threshold_volts = 3;</code>
  *
  * <pre>
  * Threshold value in volts. 0..25.5
  * </pre>
  */
 boolean hasThresholdVolts();
 /**
  * <code>optional float threshold_volts = 3;</code>
  *
  * <pre>
  * Threshold value in volts. 0..25.5
  * </pre>
  */
 float getThresholdVolts();

 /**
  * <code>optional float value_volts = 4;</code>
  *
  * <pre>
  * Value in volts. 0..25.5
  * </pre>
  */
 boolean hasValueVolts();
 /**
  * <code>optional float value_volts = 4;</code>
  *
  * <pre>
  * Value in volts. 0..25.5
  * </pre>
  */
 float getValueVolts();
}
/**
* Protobuf type {@code MainPowerLow}
*
* <pre>
* Main Power Low
* </pre>
*/
public static final class MainPowerLow extends
   com.google.protobuf.GeneratedMessage implements
   // @@protoc_insertion_point(message_implements:MainPowerLow)
   MainPowerLowOrBuilder {
 // Use MainPowerLow.newBuilder() to construct.
 private MainPowerLow(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
   super(builder);
   this.unknownFields = builder.getUnknownFields();
 }
 private MainPowerLow(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

 private static final MainPowerLow defaultInstance;
 public static MainPowerLow getDefaultInstance() {
   return defaultInstance;
 }

 public MainPowerLow getDefaultInstanceForType() {
   return defaultInstance;
 }

 private final com.google.protobuf.UnknownFieldSet unknownFields;
 @java.lang.Override
 public final com.google.protobuf.UnknownFieldSet
     getUnknownFields() {
   return this.unknownFields;
 }
 private MainPowerLow(
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
           durationSeconds_ = input.readUInt32();
           break;
         }
         case 29: {
           bitField0_ |= 0x00000004;
           thresholdVolts_ = input.readFloat();
           break;
         }
         case 37: {
           bitField0_ |= 0x00000008;
           valueVolts_ = input.readFloat();
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
   return MainPowerLowProto.internal_static_MainPowerLow_descriptor;
 }

 protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
     internalGetFieldAccessorTable() {
   return MainPowerLowProto.internal_static_MainPowerLow_fieldAccessorTable
       .ensureFieldAccessorsInitialized(
           MainPowerLowProto.MainPowerLow.class, MainPowerLowProto.MainPowerLow.Builder.class);
 }

 public static com.google.protobuf.Parser<MainPowerLow> PARSER =
     new com.google.protobuf.AbstractParser<MainPowerLow>() {
   public MainPowerLow parsePartialFrom(
       com.google.protobuf.CodedInputStream input,
       com.google.protobuf.ExtensionRegistryLite extensionRegistry)
       throws com.google.protobuf.InvalidProtocolBufferException {
     return new MainPowerLow(input, extensionRegistry);
   }
 };

 @java.lang.Override
 public com.google.protobuf.Parser<MainPowerLow> getParserForType() {
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

 public static final int DURATION_SECONDS_FIELD_NUMBER = 2;
 private int durationSeconds_;
 /**
  * <code>optional uint32 duration_seconds = 2;</code>
  *
  * <pre>
  * Duration in seconds
  * </pre>
  */
 public boolean hasDurationSeconds() {
   return ((bitField0_ & 0x00000002) == 0x00000002);
 }
 /**
  * <code>optional uint32 duration_seconds = 2;</code>
  *
  * <pre>
  * Duration in seconds
  * </pre>
  */
 public int getDurationSeconds() {
   return durationSeconds_;
 }

 public static final int THRESHOLD_VOLTS_FIELD_NUMBER = 3;
 private float thresholdVolts_;
 /**
  * <code>optional float threshold_volts = 3;</code>
  *
  * <pre>
  * Threshold value in volts. 0..25.5
  * </pre>
  */
 public boolean hasThresholdVolts() {
   return ((bitField0_ & 0x00000004) == 0x00000004);
 }
 /**
  * <code>optional float threshold_volts = 3;</code>
  *
  * <pre>
  * Threshold value in volts. 0..25.5
  * </pre>
  */
 public float getThresholdVolts() {
   return thresholdVolts_;
 }

 public static final int VALUE_VOLTS_FIELD_NUMBER = 4;
 private float valueVolts_;
 /**
  * <code>optional float value_volts = 4;</code>
  *
  * <pre>
  * Value in volts. 0..25.5
  * </pre>
  */
 public boolean hasValueVolts() {
   return ((bitField0_ & 0x00000008) == 0x00000008);
 }
 /**
  * <code>optional float value_volts = 4;</code>
  *
  * <pre>
  * Value in volts. 0..25.5
  * </pre>
  */
 public float getValueVolts() {
   return valueVolts_;
 }

 private void initFields() {
   header_ = EventHeaderProto.EventHeader.getDefaultInstance();
   durationSeconds_ = 0;
   thresholdVolts_ = 0F;
   valueVolts_ = 0F;
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
     output.writeUInt32(2, durationSeconds_);
   }
   if (((bitField0_ & 0x00000004) == 0x00000004)) {
     output.writeFloat(3, thresholdVolts_);
   }
   if (((bitField0_ & 0x00000008) == 0x00000008)) {
     output.writeFloat(4, valueVolts_);
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
       .computeUInt32Size(2, durationSeconds_);
   }
   if (((bitField0_ & 0x00000004) == 0x00000004)) {
     size += com.google.protobuf.CodedOutputStream
       .computeFloatSize(3, thresholdVolts_);
   }
   if (((bitField0_ & 0x00000008) == 0x00000008)) {
     size += com.google.protobuf.CodedOutputStream
       .computeFloatSize(4, valueVolts_);
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

 public static MainPowerLowProto.MainPowerLow parseFrom(
     com.google.protobuf.ByteString data)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data);
 }
 public static MainPowerLowProto.MainPowerLow parseFrom(
     com.google.protobuf.ByteString data,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data, extensionRegistry);
 }
 public static MainPowerLowProto.MainPowerLow parseFrom(byte[] data)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data);
 }
 public static MainPowerLowProto.MainPowerLow parseFrom(
     byte[] data,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data, extensionRegistry);
 }
 public static MainPowerLowProto.MainPowerLow parseFrom(java.io.InputStream input)
     throws java.io.IOException {
   return PARSER.parseFrom(input);
 }
 public static MainPowerLowProto.MainPowerLow parseFrom(
     java.io.InputStream input,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws java.io.IOException {
   return PARSER.parseFrom(input, extensionRegistry);
 }
 public static MainPowerLowProto.MainPowerLow parseDelimitedFrom(java.io.InputStream input)
     throws java.io.IOException {
   return PARSER.parseDelimitedFrom(input);
 }
 public static MainPowerLowProto.MainPowerLow parseDelimitedFrom(
     java.io.InputStream input,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws java.io.IOException {
   return PARSER.parseDelimitedFrom(input, extensionRegistry);
 }
 public static MainPowerLowProto.MainPowerLow parseFrom(
     com.google.protobuf.CodedInputStream input)
     throws java.io.IOException {
   return PARSER.parseFrom(input);
 }
 public static MainPowerLowProto.MainPowerLow parseFrom(
     com.google.protobuf.CodedInputStream input,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws java.io.IOException {
   return PARSER.parseFrom(input, extensionRegistry);
 }

 public static Builder newBuilder() { return Builder.create(); }
 public Builder newBuilderForType() { return newBuilder(); }
 public static Builder newBuilder(MainPowerLowProto.MainPowerLow prototype) {
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
  * Protobuf type {@code MainPowerLow}
  *
  * <pre>
  * Main Power Low
  * </pre>
  */
 public static final class Builder extends
     com.google.protobuf.GeneratedMessage.Builder<Builder> implements
     // @@protoc_insertion_point(builder_implements:MainPowerLow)
     MainPowerLowProto.MainPowerLowOrBuilder {
   public static final com.google.protobuf.Descriptors.Descriptor
       getDescriptor() {
     return MainPowerLowProto.internal_static_MainPowerLow_descriptor;
   }

   protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
       internalGetFieldAccessorTable() {
     return MainPowerLowProto.internal_static_MainPowerLow_fieldAccessorTable
         .ensureFieldAccessorsInitialized(
             MainPowerLowProto.MainPowerLow.class, MainPowerLowProto.MainPowerLow.Builder.class);
   }

   // Construct using MainPowerLowProto.MainPowerLow.newBuilder()
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
     durationSeconds_ = 0;
     bitField0_ = (bitField0_ & ~0x00000002);
     thresholdVolts_ = 0F;
     bitField0_ = (bitField0_ & ~0x00000004);
     valueVolts_ = 0F;
     bitField0_ = (bitField0_ & ~0x00000008);
     return this;
   }

   public Builder clone() {
     return create().mergeFrom(buildPartial());
   }

   public com.google.protobuf.Descriptors.Descriptor
       getDescriptorForType() {
     return MainPowerLowProto.internal_static_MainPowerLow_descriptor;
   }

   public MainPowerLowProto.MainPowerLow getDefaultInstanceForType() {
     return MainPowerLowProto.MainPowerLow.getDefaultInstance();
   }

   public MainPowerLowProto.MainPowerLow build() {
     MainPowerLowProto.MainPowerLow result = buildPartial();
     if (!result.isInitialized()) {
       throw newUninitializedMessageException(result);
     }
     return result;
   }

   public MainPowerLowProto.MainPowerLow buildPartial() {
     MainPowerLowProto.MainPowerLow result = new MainPowerLowProto.MainPowerLow(this);
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
     result.durationSeconds_ = durationSeconds_;
     if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
       to_bitField0_ |= 0x00000004;
     }
     result.thresholdVolts_ = thresholdVolts_;
     if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
       to_bitField0_ |= 0x00000008;
     }
     result.valueVolts_ = valueVolts_;
     result.bitField0_ = to_bitField0_;
     onBuilt();
     return result;
   }

   public Builder mergeFrom(com.google.protobuf.Message other) {
     if (other instanceof MainPowerLowProto.MainPowerLow) {
       return mergeFrom((MainPowerLowProto.MainPowerLow)other);
     } else {
       super.mergeFrom(other);
       return this;
     }
   }

   public Builder mergeFrom(MainPowerLowProto.MainPowerLow other) {
     if (other == MainPowerLowProto.MainPowerLow.getDefaultInstance()) return this;
     if (other.hasHeader()) {
       mergeHeader(other.getHeader());
     }
     if (other.hasDurationSeconds()) {
       setDurationSeconds(other.getDurationSeconds());
     }
     if (other.hasThresholdVolts()) {
       setThresholdVolts(other.getThresholdVolts());
     }
     if (other.hasValueVolts()) {
       setValueVolts(other.getValueVolts());
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
     MainPowerLowProto.MainPowerLow parsedMessage = null;
     try {
       parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
     } catch (com.google.protobuf.InvalidProtocolBufferException e) {
       parsedMessage = (MainPowerLowProto.MainPowerLow) e.getUnfinishedMessage();
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

   private int durationSeconds_ ;
   /**
    * <code>optional uint32 duration_seconds = 2;</code>
    *
    * <pre>
    * Duration in seconds
    * </pre>
    */
   public boolean hasDurationSeconds() {
     return ((bitField0_ & 0x00000002) == 0x00000002);
   }
   /**
    * <code>optional uint32 duration_seconds = 2;</code>
    *
    * <pre>
    * Duration in seconds
    * </pre>
    */
   public int getDurationSeconds() {
     return durationSeconds_;
   }
   /**
    * <code>optional uint32 duration_seconds = 2;</code>
    *
    * <pre>
    * Duration in seconds
    * </pre>
    */
   public Builder setDurationSeconds(int value) {
     bitField0_ |= 0x00000002;
     durationSeconds_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>optional uint32 duration_seconds = 2;</code>
    *
    * <pre>
    * Duration in seconds
    * </pre>
    */
   public Builder clearDurationSeconds() {
     bitField0_ = (bitField0_ & ~0x00000002);
     durationSeconds_ = 0;
     onChanged();
     return this;
   }

   private float thresholdVolts_ ;
   /**
    * <code>optional float threshold_volts = 3;</code>
    *
    * <pre>
    * Threshold value in volts. 0..25.5
    * </pre>
    */
   public boolean hasThresholdVolts() {
     return ((bitField0_ & 0x00000004) == 0x00000004);
   }
   /**
    * <code>optional float threshold_volts = 3;</code>
    *
    * <pre>
    * Threshold value in volts. 0..25.5
    * </pre>
    */
   public float getThresholdVolts() {
     return thresholdVolts_;
   }
   /**
    * <code>optional float threshold_volts = 3;</code>
    *
    * <pre>
    * Threshold value in volts. 0..25.5
    * </pre>
    */
   public Builder setThresholdVolts(float value) {
     bitField0_ |= 0x00000004;
     thresholdVolts_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>optional float threshold_volts = 3;</code>
    *
    * <pre>
    * Threshold value in volts. 0..25.5
    * </pre>
    */
   public Builder clearThresholdVolts() {
     bitField0_ = (bitField0_ & ~0x00000004);
     thresholdVolts_ = 0F;
     onChanged();
     return this;
   }

   private float valueVolts_ ;
   /**
    * <code>optional float value_volts = 4;</code>
    *
    * <pre>
    * Value in volts. 0..25.5
    * </pre>
    */
   public boolean hasValueVolts() {
     return ((bitField0_ & 0x00000008) == 0x00000008);
   }
   /**
    * <code>optional float value_volts = 4;</code>
    *
    * <pre>
    * Value in volts. 0..25.5
    * </pre>
    */
   public float getValueVolts() {
     return valueVolts_;
   }
   /**
    * <code>optional float value_volts = 4;</code>
    *
    * <pre>
    * Value in volts. 0..25.5
    * </pre>
    */
   public Builder setValueVolts(float value) {
     bitField0_ |= 0x00000008;
     valueVolts_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>optional float value_volts = 4;</code>
    *
    * <pre>
    * Value in volts. 0..25.5
    * </pre>
    */
   public Builder clearValueVolts() {
     bitField0_ = (bitField0_ & ~0x00000008);
     valueVolts_ = 0F;
     onChanged();
     return this;
   }

   // @@protoc_insertion_point(builder_scope:MainPowerLow)
 }

 static {
   defaultInstance = new MainPowerLow(true);
   defaultInstance.initFields();
 }

 // @@protoc_insertion_point(class_scope:MainPowerLow)
}

private static final com.google.protobuf.Descriptors.Descriptor
 internal_static_MainPowerLow_descriptor;
private static
 com.google.protobuf.GeneratedMessage.FieldAccessorTable
   internal_static_MainPowerLow_fieldAccessorTable;

public static com.google.protobuf.Descriptors.FileDescriptor
   getDescriptor() {
 return descriptor;
}
private static com.google.protobuf.Descriptors.FileDescriptor
   descriptor;
static {
 java.lang.String[] descriptorData = {
   "\n\027MainPowerLowProto.proto\032\026EventHeaderPr" +
   "oto.proto\"t\n\014MainPowerLow\022\034\n\006header\030\001 \002(" +
   "\0132\014.EventHeader\022\030\n\020duration_seconds\030\002 \001(" +
   "\r\022\027\n\017threshold_volts\030\003 \001(\002\022\023\n\013value_volt" +
   "s\030\004 \001(\002"
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
 internal_static_MainPowerLow_descriptor =
   getDescriptor().getMessageTypes().get(0);
 internal_static_MainPowerLow_fieldAccessorTable = new
   com.google.protobuf.GeneratedMessage.FieldAccessorTable(
     internal_static_MainPowerLow_descriptor,
     new java.lang.String[] { "Header", "DurationSeconds", "ThresholdVolts", "ValueVolts", });
 EventHeaderProto.getDescriptor();
}

// @@protoc_insertion_point(outer_class_scope)
}
