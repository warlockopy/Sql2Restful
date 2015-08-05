package scopeProto;

//Generated by the protocol buffer compiler.  DO NOT EDIT!
//source: DevicePlugInProto.proto

public final class DevicePlugInProto {
private DevicePlugInProto() {}
public static void registerAllExtensions(
   com.google.protobuf.ExtensionRegistry registry) {
}
public interface DevicePlugInOrBuilder extends
   // @@protoc_insertion_point(interface_extends:DevicePlugIn)
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
  * <code>optional string vin = 2;</code>
  *
  * <pre>
  * Vehicle identification number
  * </pre>
  */
 boolean hasVin();
 /**
  * <code>optional string vin = 2;</code>
  *
  * <pre>
  * Vehicle identification number
  * </pre>
  */
 java.lang.String getVin();
 /**
  * <code>optional string vin = 2;</code>
  *
  * <pre>
  * Vehicle identification number
  * </pre>
  */
 com.google.protobuf.ByteString
     getVinBytes();

 /**
  * <code>optional .OBD2Protocol obd2_protocol = 3 [default = OBD2_PROTOCOL_NOT_SUPPORTED];</code>
  *
  * <pre>
  * Device signaling ODB-II protocol
  * </pre>
  */
 boolean hasObd2Protocol();
 /**
  * <code>optional .OBD2Protocol obd2_protocol = 3 [default = OBD2_PROTOCOL_NOT_SUPPORTED];</code>
  *
  * <pre>
  * Device signaling ODB-II protocol
  * </pre>
  */
 OBD2ProtocolProto.OBD2Protocol getObd2Protocol();
}
/**
* Protobuf type {@code DevicePlugIn}
*
* <pre>
* Device plug-in event
* </pre>
*/
public static final class DevicePlugIn extends
   com.google.protobuf.GeneratedMessage implements
   // @@protoc_insertion_point(message_implements:DevicePlugIn)
   DevicePlugInOrBuilder {
 // Use DevicePlugIn.newBuilder() to construct.
 private DevicePlugIn(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
   super(builder);
   this.unknownFields = builder.getUnknownFields();
 }
 private DevicePlugIn(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

 private static final DevicePlugIn defaultInstance;
 public static DevicePlugIn getDefaultInstance() {
   return defaultInstance;
 }

 public DevicePlugIn getDefaultInstanceForType() {
   return defaultInstance;
 }

 private final com.google.protobuf.UnknownFieldSet unknownFields;
 @java.lang.Override
 public final com.google.protobuf.UnknownFieldSet
     getUnknownFields() {
   return this.unknownFields;
 }
 private DevicePlugIn(
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
         case 18: {
           com.google.protobuf.ByteString bs = input.readBytes();
           bitField0_ |= 0x00000002;
           vin_ = bs;
           break;
         }
         case 24: {
           int rawValue = input.readEnum();
           OBD2ProtocolProto.OBD2Protocol value = OBD2ProtocolProto.OBD2Protocol.valueOf(rawValue);
           if (value == null) {
             unknownFields.mergeVarintField(3, rawValue);
           } else {
             bitField0_ |= 0x00000004;
             obd2Protocol_ = value;
           }
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
   return DevicePlugInProto.internal_static_DevicePlugIn_descriptor;
 }

 protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
     internalGetFieldAccessorTable() {
   return DevicePlugInProto.internal_static_DevicePlugIn_fieldAccessorTable
       .ensureFieldAccessorsInitialized(
           DevicePlugInProto.DevicePlugIn.class, DevicePlugInProto.DevicePlugIn.Builder.class);
 }

 public static com.google.protobuf.Parser<DevicePlugIn> PARSER =
     new com.google.protobuf.AbstractParser<DevicePlugIn>() {
   public DevicePlugIn parsePartialFrom(
       com.google.protobuf.CodedInputStream input,
       com.google.protobuf.ExtensionRegistryLite extensionRegistry)
       throws com.google.protobuf.InvalidProtocolBufferException {
     return new DevicePlugIn(input, extensionRegistry);
   }
 };

 @java.lang.Override
 public com.google.protobuf.Parser<DevicePlugIn> getParserForType() {
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

 public static final int VIN_FIELD_NUMBER = 2;
 private java.lang.Object vin_;
 /**
  * <code>optional string vin = 2;</code>
  *
  * <pre>
  * Vehicle identification number
  * </pre>
  */
 public boolean hasVin() {
   return ((bitField0_ & 0x00000002) == 0x00000002);
 }
 /**
  * <code>optional string vin = 2;</code>
  *
  * <pre>
  * Vehicle identification number
  * </pre>
  */
 public java.lang.String getVin() {
   java.lang.Object ref = vin_;
   if (ref instanceof java.lang.String) {
     return (java.lang.String) ref;
   } else {
     com.google.protobuf.ByteString bs = 
         (com.google.protobuf.ByteString) ref;
     java.lang.String s = bs.toStringUtf8();
     if (bs.isValidUtf8()) {
       vin_ = s;
     }
     return s;
   }
 }
 /**
  * <code>optional string vin = 2;</code>
  *
  * <pre>
  * Vehicle identification number
  * </pre>
  */
 public com.google.protobuf.ByteString
     getVinBytes() {
   java.lang.Object ref = vin_;
   if (ref instanceof java.lang.String) {
     com.google.protobuf.ByteString b = 
         com.google.protobuf.ByteString.copyFromUtf8(
             (java.lang.String) ref);
     vin_ = b;
     return b;
   } else {
     return (com.google.protobuf.ByteString) ref;
   }
 }

 public static final int OBD2_PROTOCOL_FIELD_NUMBER = 3;
 private OBD2ProtocolProto.OBD2Protocol obd2Protocol_;
 /**
  * <code>optional .OBD2Protocol obd2_protocol = 3 [default = OBD2_PROTOCOL_NOT_SUPPORTED];</code>
  *
  * <pre>
  * Device signaling ODB-II protocol
  * </pre>
  */
 public boolean hasObd2Protocol() {
   return ((bitField0_ & 0x00000004) == 0x00000004);
 }
 /**
  * <code>optional .OBD2Protocol obd2_protocol = 3 [default = OBD2_PROTOCOL_NOT_SUPPORTED];</code>
  *
  * <pre>
  * Device signaling ODB-II protocol
  * </pre>
  */
 public OBD2ProtocolProto.OBD2Protocol getObd2Protocol() {
   return obd2Protocol_;
 }

 private void initFields() {
   header_ = EventHeaderProto.EventHeader.getDefaultInstance();
   vin_ = "";
   obd2Protocol_ = OBD2ProtocolProto.OBD2Protocol.OBD2_PROTOCOL_NOT_SUPPORTED;
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
     output.writeBytes(2, getVinBytes());
   }
   if (((bitField0_ & 0x00000004) == 0x00000004)) {
     output.writeEnum(3, obd2Protocol_.getNumber());
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
       .computeBytesSize(2, getVinBytes());
   }
   if (((bitField0_ & 0x00000004) == 0x00000004)) {
     size += com.google.protobuf.CodedOutputStream
       .computeEnumSize(3, obd2Protocol_.getNumber());
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

 public static DevicePlugInProto.DevicePlugIn parseFrom(
     com.google.protobuf.ByteString data)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data);
 }
 public static DevicePlugInProto.DevicePlugIn parseFrom(
     com.google.protobuf.ByteString data,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data, extensionRegistry);
 }
 public static DevicePlugInProto.DevicePlugIn parseFrom(byte[] data)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data);
 }
 public static DevicePlugInProto.DevicePlugIn parseFrom(
     byte[] data,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data, extensionRegistry);
 }
 public static DevicePlugInProto.DevicePlugIn parseFrom(java.io.InputStream input)
     throws java.io.IOException {
   return PARSER.parseFrom(input);
 }
 public static DevicePlugInProto.DevicePlugIn parseFrom(
     java.io.InputStream input,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws java.io.IOException {
   return PARSER.parseFrom(input, extensionRegistry);
 }
 public static DevicePlugInProto.DevicePlugIn parseDelimitedFrom(java.io.InputStream input)
     throws java.io.IOException {
   return PARSER.parseDelimitedFrom(input);
 }
 public static DevicePlugInProto.DevicePlugIn parseDelimitedFrom(
     java.io.InputStream input,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws java.io.IOException {
   return PARSER.parseDelimitedFrom(input, extensionRegistry);
 }
 public static DevicePlugInProto.DevicePlugIn parseFrom(
     com.google.protobuf.CodedInputStream input)
     throws java.io.IOException {
   return PARSER.parseFrom(input);
 }
 public static DevicePlugInProto.DevicePlugIn parseFrom(
     com.google.protobuf.CodedInputStream input,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws java.io.IOException {
   return PARSER.parseFrom(input, extensionRegistry);
 }

 public static Builder newBuilder() { return Builder.create(); }
 public Builder newBuilderForType() { return newBuilder(); }
 public static Builder newBuilder(DevicePlugInProto.DevicePlugIn prototype) {
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
  * Protobuf type {@code DevicePlugIn}
  *
  * <pre>
  * Device plug-in event
  * </pre>
  */
 public static final class Builder extends
     com.google.protobuf.GeneratedMessage.Builder<Builder> implements
     // @@protoc_insertion_point(builder_implements:DevicePlugIn)
     DevicePlugInProto.DevicePlugInOrBuilder {
   public static final com.google.protobuf.Descriptors.Descriptor
       getDescriptor() {
     return DevicePlugInProto.internal_static_DevicePlugIn_descriptor;
   }

   protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
       internalGetFieldAccessorTable() {
     return DevicePlugInProto.internal_static_DevicePlugIn_fieldAccessorTable
         .ensureFieldAccessorsInitialized(
             DevicePlugInProto.DevicePlugIn.class, DevicePlugInProto.DevicePlugIn.Builder.class);
   }

   // Construct using DevicePlugInProto.DevicePlugIn.newBuilder()
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
     vin_ = "";
     bitField0_ = (bitField0_ & ~0x00000002);
     obd2Protocol_ = OBD2ProtocolProto.OBD2Protocol.OBD2_PROTOCOL_NOT_SUPPORTED;
     bitField0_ = (bitField0_ & ~0x00000004);
     return this;
   }

   public Builder clone() {
     return create().mergeFrom(buildPartial());
   }

   public com.google.protobuf.Descriptors.Descriptor
       getDescriptorForType() {
     return DevicePlugInProto.internal_static_DevicePlugIn_descriptor;
   }

   public DevicePlugInProto.DevicePlugIn getDefaultInstanceForType() {
     return DevicePlugInProto.DevicePlugIn.getDefaultInstance();
   }

   public DevicePlugInProto.DevicePlugIn build() {
     DevicePlugInProto.DevicePlugIn result = buildPartial();
     if (!result.isInitialized()) {
       throw newUninitializedMessageException(result);
     }
     return result;
   }

   public DevicePlugInProto.DevicePlugIn buildPartial() {
     DevicePlugInProto.DevicePlugIn result = new DevicePlugInProto.DevicePlugIn(this);
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
     result.vin_ = vin_;
     if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
       to_bitField0_ |= 0x00000004;
     }
     result.obd2Protocol_ = obd2Protocol_;
     result.bitField0_ = to_bitField0_;
     onBuilt();
     return result;
   }

   public Builder mergeFrom(com.google.protobuf.Message other) {
     if (other instanceof DevicePlugInProto.DevicePlugIn) {
       return mergeFrom((DevicePlugInProto.DevicePlugIn)other);
     } else {
       super.mergeFrom(other);
       return this;
     }
   }

   public Builder mergeFrom(DevicePlugInProto.DevicePlugIn other) {
     if (other == DevicePlugInProto.DevicePlugIn.getDefaultInstance()) return this;
     if (other.hasHeader()) {
       mergeHeader(other.getHeader());
     }
     if (other.hasVin()) {
       bitField0_ |= 0x00000002;
       vin_ = other.vin_;
       onChanged();
     }
     if (other.hasObd2Protocol()) {
       setObd2Protocol(other.getObd2Protocol());
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
     DevicePlugInProto.DevicePlugIn parsedMessage = null;
     try {
       parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
     } catch (com.google.protobuf.InvalidProtocolBufferException e) {
       parsedMessage = (DevicePlugInProto.DevicePlugIn) e.getUnfinishedMessage();
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

   private java.lang.Object vin_ = "";
   /**
    * <code>optional string vin = 2;</code>
    *
    * <pre>
    * Vehicle identification number
    * </pre>
    */
   public boolean hasVin() {
     return ((bitField0_ & 0x00000002) == 0x00000002);
   }
   /**
    * <code>optional string vin = 2;</code>
    *
    * <pre>
    * Vehicle identification number
    * </pre>
    */
   public java.lang.String getVin() {
     java.lang.Object ref = vin_;
     if (!(ref instanceof java.lang.String)) {
       com.google.protobuf.ByteString bs =
           (com.google.protobuf.ByteString) ref;
       java.lang.String s = bs.toStringUtf8();
       if (bs.isValidUtf8()) {
         vin_ = s;
       }
       return s;
     } else {
       return (java.lang.String) ref;
     }
   }
   /**
    * <code>optional string vin = 2;</code>
    *
    * <pre>
    * Vehicle identification number
    * </pre>
    */
   public com.google.protobuf.ByteString
       getVinBytes() {
     java.lang.Object ref = vin_;
     if (ref instanceof String) {
       com.google.protobuf.ByteString b = 
           com.google.protobuf.ByteString.copyFromUtf8(
               (java.lang.String) ref);
       vin_ = b;
       return b;
     } else {
       return (com.google.protobuf.ByteString) ref;
     }
   }
   /**
    * <code>optional string vin = 2;</code>
    *
    * <pre>
    * Vehicle identification number
    * </pre>
    */
   public Builder setVin(
       java.lang.String value) {
     if (value == null) {
 throw new NullPointerException();
}
bitField0_ |= 0x00000002;
     vin_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>optional string vin = 2;</code>
    *
    * <pre>
    * Vehicle identification number
    * </pre>
    */
   public Builder clearVin() {
     bitField0_ = (bitField0_ & ~0x00000002);
     vin_ = getDefaultInstance().getVin();
     onChanged();
     return this;
   }
   /**
    * <code>optional string vin = 2;</code>
    *
    * <pre>
    * Vehicle identification number
    * </pre>
    */
   public Builder setVinBytes(
       com.google.protobuf.ByteString value) {
     if (value == null) {
 throw new NullPointerException();
}
bitField0_ |= 0x00000002;
     vin_ = value;
     onChanged();
     return this;
   }

   private OBD2ProtocolProto.OBD2Protocol obd2Protocol_ = OBD2ProtocolProto.OBD2Protocol.OBD2_PROTOCOL_NOT_SUPPORTED;
   /**
    * <code>optional .OBD2Protocol obd2_protocol = 3 [default = OBD2_PROTOCOL_NOT_SUPPORTED];</code>
    *
    * <pre>
    * Device signaling ODB-II protocol
    * </pre>
    */
   public boolean hasObd2Protocol() {
     return ((bitField0_ & 0x00000004) == 0x00000004);
   }
   /**
    * <code>optional .OBD2Protocol obd2_protocol = 3 [default = OBD2_PROTOCOL_NOT_SUPPORTED];</code>
    *
    * <pre>
    * Device signaling ODB-II protocol
    * </pre>
    */
   public OBD2ProtocolProto.OBD2Protocol getObd2Protocol() {
     return obd2Protocol_;
   }
   /**
    * <code>optional .OBD2Protocol obd2_protocol = 3 [default = OBD2_PROTOCOL_NOT_SUPPORTED];</code>
    *
    * <pre>
    * Device signaling ODB-II protocol
    * </pre>
    */
   public Builder setObd2Protocol(OBD2ProtocolProto.OBD2Protocol value) {
     if (value == null) {
       throw new NullPointerException();
     }
     bitField0_ |= 0x00000004;
     obd2Protocol_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>optional .OBD2Protocol obd2_protocol = 3 [default = OBD2_PROTOCOL_NOT_SUPPORTED];</code>
    *
    * <pre>
    * Device signaling ODB-II protocol
    * </pre>
    */
   public Builder clearObd2Protocol() {
     bitField0_ = (bitField0_ & ~0x00000004);
     obd2Protocol_ = OBD2ProtocolProto.OBD2Protocol.OBD2_PROTOCOL_NOT_SUPPORTED;
     onChanged();
     return this;
   }

   // @@protoc_insertion_point(builder_scope:DevicePlugIn)
 }

 static {
   defaultInstance = new DevicePlugIn(true);
   defaultInstance.initFields();
 }

 // @@protoc_insertion_point(class_scope:DevicePlugIn)
}

private static final com.google.protobuf.Descriptors.Descriptor
 internal_static_DevicePlugIn_descriptor;
private static
 com.google.protobuf.GeneratedMessage.FieldAccessorTable
   internal_static_DevicePlugIn_fieldAccessorTable;

public static com.google.protobuf.Descriptors.FileDescriptor
   getDescriptor() {
 return descriptor;
}
private static com.google.protobuf.Descriptors.FileDescriptor
   descriptor;
static {
 java.lang.String[] descriptorData = {
   "\n\027DevicePlugInProto.proto\032\026EventHeaderPr" +
   "oto.proto\032\035Enums/OBD2ProtocolProto.proto" +
   "\"|\n\014DevicePlugIn\022\034\n\006header\030\001 \002(\0132\014.Event" +
   "Header\022\013\n\003vin\030\002 \001(\t\022A\n\robd2_protocol\030\003 \001" +
   "(\0162\r.OBD2Protocol:\033OBD2_PROTOCOL_NOT_SUP" +
   "PORTED"
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
       OBD2ProtocolProto.getDescriptor(),
     }, assigner);
 internal_static_DevicePlugIn_descriptor =
   getDescriptor().getMessageTypes().get(0);
 internal_static_DevicePlugIn_fieldAccessorTable = new
   com.google.protobuf.GeneratedMessage.FieldAccessorTable(
     internal_static_DevicePlugIn_descriptor,
     new java.lang.String[] { "Header", "Vin", "Obd2Protocol", });
 EventHeaderProto.getDescriptor();
 OBD2ProtocolProto.getDescriptor();
}

// @@protoc_insertion_point(outer_class_scope)
}
