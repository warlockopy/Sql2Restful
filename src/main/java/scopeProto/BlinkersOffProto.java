package scopeProto;

//Generated by the protocol buffer compiler.  DO NOT EDIT!
//source: BlinkersOffProto.proto

public final class BlinkersOffProto {
private BlinkersOffProto() {}
public static void registerAllExtensions(
   com.google.protobuf.ExtensionRegistry registry) {
}
public interface BlinkersOffOrBuilder extends
   // @@protoc_insertion_point(interface_extends:BlinkersOff)
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
}
/**
* Protobuf type {@code BlinkersOff}
*
* <pre>
* Cellocator Transmission Reason: 31, Initiative: True, Command Numerator: 0x04
* </pre>
*/
public static final class BlinkersOff extends
   com.google.protobuf.GeneratedMessage implements
   // @@protoc_insertion_point(message_implements:BlinkersOff)
   BlinkersOffOrBuilder {
 // Use BlinkersOff.newBuilder() to construct.
 private BlinkersOff(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
   super(builder);
   this.unknownFields = builder.getUnknownFields();
 }
 private BlinkersOff(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

 private static final BlinkersOff defaultInstance;
 public static BlinkersOff getDefaultInstance() {
   return defaultInstance;
 }

 public BlinkersOff getDefaultInstanceForType() {
   return defaultInstance;
 }

 private final com.google.protobuf.UnknownFieldSet unknownFields;
 @java.lang.Override
 public final com.google.protobuf.UnknownFieldSet
     getUnknownFields() {
   return this.unknownFields;
 }
 private BlinkersOff(
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
   return BlinkersOffProto.internal_static_BlinkersOff_descriptor;
 }

 protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
     internalGetFieldAccessorTable() {
   return BlinkersOffProto.internal_static_BlinkersOff_fieldAccessorTable
       .ensureFieldAccessorsInitialized(
           BlinkersOffProto.BlinkersOff.class, BlinkersOffProto.BlinkersOff.Builder.class);
 }

 public static com.google.protobuf.Parser<BlinkersOff> PARSER =
     new com.google.protobuf.AbstractParser<BlinkersOff>() {
   public BlinkersOff parsePartialFrom(
       com.google.protobuf.CodedInputStream input,
       com.google.protobuf.ExtensionRegistryLite extensionRegistry)
       throws com.google.protobuf.InvalidProtocolBufferException {
     return new BlinkersOff(input, extensionRegistry);
   }
 };

 @java.lang.Override
 public com.google.protobuf.Parser<BlinkersOff> getParserForType() {
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

 private void initFields() {
   header_ = EventHeaderProto.EventHeader.getDefaultInstance();
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

 public static BlinkersOffProto.BlinkersOff parseFrom(
     com.google.protobuf.ByteString data)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data);
 }
 public static BlinkersOffProto.BlinkersOff parseFrom(
     com.google.protobuf.ByteString data,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data, extensionRegistry);
 }
 public static BlinkersOffProto.BlinkersOff parseFrom(byte[] data)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data);
 }
 public static BlinkersOffProto.BlinkersOff parseFrom(
     byte[] data,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data, extensionRegistry);
 }
 public static BlinkersOffProto.BlinkersOff parseFrom(java.io.InputStream input)
     throws java.io.IOException {
   return PARSER.parseFrom(input);
 }
 public static BlinkersOffProto.BlinkersOff parseFrom(
     java.io.InputStream input,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws java.io.IOException {
   return PARSER.parseFrom(input, extensionRegistry);
 }
 public static BlinkersOffProto.BlinkersOff parseDelimitedFrom(java.io.InputStream input)
     throws java.io.IOException {
   return PARSER.parseDelimitedFrom(input);
 }
 public static BlinkersOffProto.BlinkersOff parseDelimitedFrom(
     java.io.InputStream input,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws java.io.IOException {
   return PARSER.parseDelimitedFrom(input, extensionRegistry);
 }
 public static BlinkersOffProto.BlinkersOff parseFrom(
     com.google.protobuf.CodedInputStream input)
     throws java.io.IOException {
   return PARSER.parseFrom(input);
 }
 public static BlinkersOffProto.BlinkersOff parseFrom(
     com.google.protobuf.CodedInputStream input,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws java.io.IOException {
   return PARSER.parseFrom(input, extensionRegistry);
 }

 public static Builder newBuilder() { return Builder.create(); }
 public Builder newBuilderForType() { return newBuilder(); }
 public static Builder newBuilder(BlinkersOffProto.BlinkersOff prototype) {
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
  * Protobuf type {@code BlinkersOff}
  *
  * <pre>
  * Cellocator Transmission Reason: 31, Initiative: True, Command Numerator: 0x04
  * </pre>
  */
 public static final class Builder extends
     com.google.protobuf.GeneratedMessage.Builder<Builder> implements
     // @@protoc_insertion_point(builder_implements:BlinkersOff)
     BlinkersOffProto.BlinkersOffOrBuilder {
   public static final com.google.protobuf.Descriptors.Descriptor
       getDescriptor() {
     return BlinkersOffProto.internal_static_BlinkersOff_descriptor;
   }

   protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
       internalGetFieldAccessorTable() {
     return BlinkersOffProto.internal_static_BlinkersOff_fieldAccessorTable
         .ensureFieldAccessorsInitialized(
             BlinkersOffProto.BlinkersOff.class, BlinkersOffProto.BlinkersOff.Builder.class);
   }

   // Construct using BlinkersOffProto.BlinkersOff.newBuilder()
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
     return this;
   }

   public Builder clone() {
     return create().mergeFrom(buildPartial());
   }

   public com.google.protobuf.Descriptors.Descriptor
       getDescriptorForType() {
     return BlinkersOffProto.internal_static_BlinkersOff_descriptor;
   }

   public BlinkersOffProto.BlinkersOff getDefaultInstanceForType() {
     return BlinkersOffProto.BlinkersOff.getDefaultInstance();
   }

   public BlinkersOffProto.BlinkersOff build() {
     BlinkersOffProto.BlinkersOff result = buildPartial();
     if (!result.isInitialized()) {
       throw newUninitializedMessageException(result);
     }
     return result;
   }

   public BlinkersOffProto.BlinkersOff buildPartial() {
     BlinkersOffProto.BlinkersOff result = new BlinkersOffProto.BlinkersOff(this);
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
     result.bitField0_ = to_bitField0_;
     onBuilt();
     return result;
   }

   public Builder mergeFrom(com.google.protobuf.Message other) {
     if (other instanceof BlinkersOffProto.BlinkersOff) {
       return mergeFrom((BlinkersOffProto.BlinkersOff)other);
     } else {
       super.mergeFrom(other);
       return this;
     }
   }

   public Builder mergeFrom(BlinkersOffProto.BlinkersOff other) {
     if (other == BlinkersOffProto.BlinkersOff.getDefaultInstance()) return this;
     if (other.hasHeader()) {
       mergeHeader(other.getHeader());
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
     BlinkersOffProto.BlinkersOff parsedMessage = null;
     try {
       parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
     } catch (com.google.protobuf.InvalidProtocolBufferException e) {
       parsedMessage = (BlinkersOffProto.BlinkersOff) e.getUnfinishedMessage();
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

   // @@protoc_insertion_point(builder_scope:BlinkersOff)
 }

 static {
   defaultInstance = new BlinkersOff(true);
   defaultInstance.initFields();
 }

 // @@protoc_insertion_point(class_scope:BlinkersOff)
}

private static final com.google.protobuf.Descriptors.Descriptor
 internal_static_BlinkersOff_descriptor;
private static
 com.google.protobuf.GeneratedMessage.FieldAccessorTable
   internal_static_BlinkersOff_fieldAccessorTable;

public static com.google.protobuf.Descriptors.FileDescriptor
   getDescriptor() {
 return descriptor;
}
private static com.google.protobuf.Descriptors.FileDescriptor
   descriptor;
static {
 java.lang.String[] descriptorData = {
   "\n\026BlinkersOffProto.proto\032\026EventHeaderPro" +
   "to.proto\"+\n\013BlinkersOff\022\034\n\006header\030\001 \002(\0132" +
   "\014.EventHeader"
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
 internal_static_BlinkersOff_descriptor =
   getDescriptor().getMessageTypes().get(0);
 internal_static_BlinkersOff_fieldAccessorTable = new
   com.google.protobuf.GeneratedMessage.FieldAccessorTable(
     internal_static_BlinkersOff_descriptor,
     new java.lang.String[] { "Header", });
 EventHeaderProto.getDescriptor();
}

// @@protoc_insertion_point(outer_class_scope)
}
