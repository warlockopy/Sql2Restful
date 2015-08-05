package scopeProto;

//Generated by the protocol buffer compiler.  DO NOT EDIT!
//source: DailyTripSummaryProto.proto

public final class DailyTripSummaryProto {
private DailyTripSummaryProto() {}
public static void registerAllExtensions(
   com.google.protobuf.ExtensionRegistry registry) {
}
public interface DailyTripSummaryOrBuilder extends
   // @@protoc_insertion_point(interface_extends:DailyTripSummary)
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
  * <code>optional uint32 total_trip_distance = 2;</code>
  *
  * <pre>
  * Total trip distance (meters)
  * </pre>
  */
 boolean hasTotalTripDistance();
 /**
  * <code>optional uint32 total_trip_distance = 2;</code>
  *
  * <pre>
  * Total trip distance (meters)
  * </pre>
  */
 int getTotalTripDistance();

 /**
  * <code>optional uint32 number_of_trips = 3;</code>
  *
  * <pre>
  * Number of trips
  * </pre>
  */
 boolean hasNumberOfTrips();
 /**
  * <code>optional uint32 number_of_trips = 3;</code>
  *
  * <pre>
  * Number of trips
  * </pre>
  */
 int getNumberOfTrips();

 /**
  * <code>optional uint32 total_trip_time = 4;</code>
  *
  * <pre>
  * Total trip time (seconds)
  * </pre>
  */
 boolean hasTotalTripTime();
 /**
  * <code>optional uint32 total_trip_time = 4;</code>
  *
  * <pre>
  * Total trip time (seconds)
  * </pre>
  */
 int getTotalTripTime();

 /**
  * <code>optional uint32 time_timeslot1 = 5;</code>
  *
  * <pre>
  * Time in Timeslot 1 (seconds)
  * </pre>
  */
 boolean hasTimeTimeslot1();
 /**
  * <code>optional uint32 time_timeslot1 = 5;</code>
  *
  * <pre>
  * Time in Timeslot 1 (seconds)
  * </pre>
  */
 int getTimeTimeslot1();

 /**
  * <code>optional uint32 time_timeslot2 = 6;</code>
  *
  * <pre>
  * Time in Timeslot 2 (seconds)
  * </pre>
  */
 boolean hasTimeTimeslot2();
 /**
  * <code>optional uint32 time_timeslot2 = 6;</code>
  *
  * <pre>
  * Time in Timeslot 2 (seconds)
  * </pre>
  */
 int getTimeTimeslot2();

 /**
  * <code>optional uint32 maximum_speed = 7;</code>
  *
  * <pre>
  * Maximum Speed (km/h)
  * </pre>
  */
 boolean hasMaximumSpeed();
 /**
  * <code>optional uint32 maximum_speed = 7;</code>
  *
  * <pre>
  * Maximum Speed (km/h)
  * </pre>
  */
 int getMaximumSpeed();

 /**
  * <code>optional uint32 total_speeding_time = 8;</code>
  *
  * <pre>
  * Total Speeding Time (seconds)
  * </pre>
  */
 boolean hasTotalSpeedingTime();
 /**
  * <code>optional uint32 total_speeding_time = 8;</code>
  *
  * <pre>
  * Total Speeding Time (seconds)
  * </pre>
  */
 int getTotalSpeedingTime();
}
/**
* Protobuf type {@code DailyTripSummary}
*
* <pre>
* Daily trip summary
* </pre>
*/
public static final class DailyTripSummary extends
   com.google.protobuf.GeneratedMessage implements
   // @@protoc_insertion_point(message_implements:DailyTripSummary)
   DailyTripSummaryOrBuilder {
 // Use DailyTripSummary.newBuilder() to construct.
 private DailyTripSummary(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
   super(builder);
   this.unknownFields = builder.getUnknownFields();
 }
 private DailyTripSummary(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

 private static final DailyTripSummary defaultInstance;
 public static DailyTripSummary getDefaultInstance() {
   return defaultInstance;
 }

 public DailyTripSummary getDefaultInstanceForType() {
   return defaultInstance;
 }

 private final com.google.protobuf.UnknownFieldSet unknownFields;
 @java.lang.Override
 public final com.google.protobuf.UnknownFieldSet
     getUnknownFields() {
   return this.unknownFields;
 }
 private DailyTripSummary(
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
           totalTripDistance_ = input.readUInt32();
           break;
         }
         case 24: {
           bitField0_ |= 0x00000004;
           numberOfTrips_ = input.readUInt32();
           break;
         }
         case 32: {
           bitField0_ |= 0x00000008;
           totalTripTime_ = input.readUInt32();
           break;
         }
         case 40: {
           bitField0_ |= 0x00000010;
           timeTimeslot1_ = input.readUInt32();
           break;
         }
         case 48: {
           bitField0_ |= 0x00000020;
           timeTimeslot2_ = input.readUInt32();
           break;
         }
         case 56: {
           bitField0_ |= 0x00000040;
           maximumSpeed_ = input.readUInt32();
           break;
         }
         case 64: {
           bitField0_ |= 0x00000080;
           totalSpeedingTime_ = input.readUInt32();
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
   return DailyTripSummaryProto.internal_static_DailyTripSummary_descriptor;
 }

 protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
     internalGetFieldAccessorTable() {
   return DailyTripSummaryProto.internal_static_DailyTripSummary_fieldAccessorTable
       .ensureFieldAccessorsInitialized(
           DailyTripSummaryProto.DailyTripSummary.class, DailyTripSummaryProto.DailyTripSummary.Builder.class);
 }

 public static com.google.protobuf.Parser<DailyTripSummary> PARSER =
     new com.google.protobuf.AbstractParser<DailyTripSummary>() {
   public DailyTripSummary parsePartialFrom(
       com.google.protobuf.CodedInputStream input,
       com.google.protobuf.ExtensionRegistryLite extensionRegistry)
       throws com.google.protobuf.InvalidProtocolBufferException {
     return new DailyTripSummary(input, extensionRegistry);
   }
 };

 @java.lang.Override
 public com.google.protobuf.Parser<DailyTripSummary> getParserForType() {
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

 public static final int TOTAL_TRIP_DISTANCE_FIELD_NUMBER = 2;
 private int totalTripDistance_;
 /**
  * <code>optional uint32 total_trip_distance = 2;</code>
  *
  * <pre>
  * Total trip distance (meters)
  * </pre>
  */
 public boolean hasTotalTripDistance() {
   return ((bitField0_ & 0x00000002) == 0x00000002);
 }
 /**
  * <code>optional uint32 total_trip_distance = 2;</code>
  *
  * <pre>
  * Total trip distance (meters)
  * </pre>
  */
 public int getTotalTripDistance() {
   return totalTripDistance_;
 }

 public static final int NUMBER_OF_TRIPS_FIELD_NUMBER = 3;
 private int numberOfTrips_;
 /**
  * <code>optional uint32 number_of_trips = 3;</code>
  *
  * <pre>
  * Number of trips
  * </pre>
  */
 public boolean hasNumberOfTrips() {
   return ((bitField0_ & 0x00000004) == 0x00000004);
 }
 /**
  * <code>optional uint32 number_of_trips = 3;</code>
  *
  * <pre>
  * Number of trips
  * </pre>
  */
 public int getNumberOfTrips() {
   return numberOfTrips_;
 }

 public static final int TOTAL_TRIP_TIME_FIELD_NUMBER = 4;
 private int totalTripTime_;
 /**
  * <code>optional uint32 total_trip_time = 4;</code>
  *
  * <pre>
  * Total trip time (seconds)
  * </pre>
  */
 public boolean hasTotalTripTime() {
   return ((bitField0_ & 0x00000008) == 0x00000008);
 }
 /**
  * <code>optional uint32 total_trip_time = 4;</code>
  *
  * <pre>
  * Total trip time (seconds)
  * </pre>
  */
 public int getTotalTripTime() {
   return totalTripTime_;
 }

 public static final int TIME_TIMESLOT1_FIELD_NUMBER = 5;
 private int timeTimeslot1_;
 /**
  * <code>optional uint32 time_timeslot1 = 5;</code>
  *
  * <pre>
  * Time in Timeslot 1 (seconds)
  * </pre>
  */
 public boolean hasTimeTimeslot1() {
   return ((bitField0_ & 0x00000010) == 0x00000010);
 }
 /**
  * <code>optional uint32 time_timeslot1 = 5;</code>
  *
  * <pre>
  * Time in Timeslot 1 (seconds)
  * </pre>
  */
 public int getTimeTimeslot1() {
   return timeTimeslot1_;
 }

 public static final int TIME_TIMESLOT2_FIELD_NUMBER = 6;
 private int timeTimeslot2_;
 /**
  * <code>optional uint32 time_timeslot2 = 6;</code>
  *
  * <pre>
  * Time in Timeslot 2 (seconds)
  * </pre>
  */
 public boolean hasTimeTimeslot2() {
   return ((bitField0_ & 0x00000020) == 0x00000020);
 }
 /**
  * <code>optional uint32 time_timeslot2 = 6;</code>
  *
  * <pre>
  * Time in Timeslot 2 (seconds)
  * </pre>
  */
 public int getTimeTimeslot2() {
   return timeTimeslot2_;
 }

 public static final int MAXIMUM_SPEED_FIELD_NUMBER = 7;
 private int maximumSpeed_;
 /**
  * <code>optional uint32 maximum_speed = 7;</code>
  *
  * <pre>
  * Maximum Speed (km/h)
  * </pre>
  */
 public boolean hasMaximumSpeed() {
   return ((bitField0_ & 0x00000040) == 0x00000040);
 }
 /**
  * <code>optional uint32 maximum_speed = 7;</code>
  *
  * <pre>
  * Maximum Speed (km/h)
  * </pre>
  */
 public int getMaximumSpeed() {
   return maximumSpeed_;
 }

 public static final int TOTAL_SPEEDING_TIME_FIELD_NUMBER = 8;
 private int totalSpeedingTime_;
 /**
  * <code>optional uint32 total_speeding_time = 8;</code>
  *
  * <pre>
  * Total Speeding Time (seconds)
  * </pre>
  */
 public boolean hasTotalSpeedingTime() {
   return ((bitField0_ & 0x00000080) == 0x00000080);
 }
 /**
  * <code>optional uint32 total_speeding_time = 8;</code>
  *
  * <pre>
  * Total Speeding Time (seconds)
  * </pre>
  */
 public int getTotalSpeedingTime() {
   return totalSpeedingTime_;
 }

 private void initFields() {
   header_ = EventHeaderProto.EventHeader.getDefaultInstance();
   totalTripDistance_ = 0;
   numberOfTrips_ = 0;
   totalTripTime_ = 0;
   timeTimeslot1_ = 0;
   timeTimeslot2_ = 0;
   maximumSpeed_ = 0;
   totalSpeedingTime_ = 0;
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
     output.writeUInt32(2, totalTripDistance_);
   }
   if (((bitField0_ & 0x00000004) == 0x00000004)) {
     output.writeUInt32(3, numberOfTrips_);
   }
   if (((bitField0_ & 0x00000008) == 0x00000008)) {
     output.writeUInt32(4, totalTripTime_);
   }
   if (((bitField0_ & 0x00000010) == 0x00000010)) {
     output.writeUInt32(5, timeTimeslot1_);
   }
   if (((bitField0_ & 0x00000020) == 0x00000020)) {
     output.writeUInt32(6, timeTimeslot2_);
   }
   if (((bitField0_ & 0x00000040) == 0x00000040)) {
     output.writeUInt32(7, maximumSpeed_);
   }
   if (((bitField0_ & 0x00000080) == 0x00000080)) {
     output.writeUInt32(8, totalSpeedingTime_);
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
       .computeUInt32Size(2, totalTripDistance_);
   }
   if (((bitField0_ & 0x00000004) == 0x00000004)) {
     size += com.google.protobuf.CodedOutputStream
       .computeUInt32Size(3, numberOfTrips_);
   }
   if (((bitField0_ & 0x00000008) == 0x00000008)) {
     size += com.google.protobuf.CodedOutputStream
       .computeUInt32Size(4, totalTripTime_);
   }
   if (((bitField0_ & 0x00000010) == 0x00000010)) {
     size += com.google.protobuf.CodedOutputStream
       .computeUInt32Size(5, timeTimeslot1_);
   }
   if (((bitField0_ & 0x00000020) == 0x00000020)) {
     size += com.google.protobuf.CodedOutputStream
       .computeUInt32Size(6, timeTimeslot2_);
   }
   if (((bitField0_ & 0x00000040) == 0x00000040)) {
     size += com.google.protobuf.CodedOutputStream
       .computeUInt32Size(7, maximumSpeed_);
   }
   if (((bitField0_ & 0x00000080) == 0x00000080)) {
     size += com.google.protobuf.CodedOutputStream
       .computeUInt32Size(8, totalSpeedingTime_);
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

 public static DailyTripSummaryProto.DailyTripSummary parseFrom(
     com.google.protobuf.ByteString data)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data);
 }
 public static DailyTripSummaryProto.DailyTripSummary parseFrom(
     com.google.protobuf.ByteString data,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data, extensionRegistry);
 }
 public static DailyTripSummaryProto.DailyTripSummary parseFrom(byte[] data)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data);
 }
 public static DailyTripSummaryProto.DailyTripSummary parseFrom(
     byte[] data,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data, extensionRegistry);
 }
 public static DailyTripSummaryProto.DailyTripSummary parseFrom(java.io.InputStream input)
     throws java.io.IOException {
   return PARSER.parseFrom(input);
 }
 public static DailyTripSummaryProto.DailyTripSummary parseFrom(
     java.io.InputStream input,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws java.io.IOException {
   return PARSER.parseFrom(input, extensionRegistry);
 }
 public static DailyTripSummaryProto.DailyTripSummary parseDelimitedFrom(java.io.InputStream input)
     throws java.io.IOException {
   return PARSER.parseDelimitedFrom(input);
 }
 public static DailyTripSummaryProto.DailyTripSummary parseDelimitedFrom(
     java.io.InputStream input,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws java.io.IOException {
   return PARSER.parseDelimitedFrom(input, extensionRegistry);
 }
 public static DailyTripSummaryProto.DailyTripSummary parseFrom(
     com.google.protobuf.CodedInputStream input)
     throws java.io.IOException {
   return PARSER.parseFrom(input);
 }
 public static DailyTripSummaryProto.DailyTripSummary parseFrom(
     com.google.protobuf.CodedInputStream input,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws java.io.IOException {
   return PARSER.parseFrom(input, extensionRegistry);
 }

 public static Builder newBuilder() { return Builder.create(); }
 public Builder newBuilderForType() { return newBuilder(); }
 public static Builder newBuilder(DailyTripSummaryProto.DailyTripSummary prototype) {
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
  * Protobuf type {@code DailyTripSummary}
  *
  * <pre>
  * Daily trip summary
  * </pre>
  */
 public static final class Builder extends
     com.google.protobuf.GeneratedMessage.Builder<Builder> implements
     // @@protoc_insertion_point(builder_implements:DailyTripSummary)
     DailyTripSummaryProto.DailyTripSummaryOrBuilder {
   public static final com.google.protobuf.Descriptors.Descriptor
       getDescriptor() {
     return DailyTripSummaryProto.internal_static_DailyTripSummary_descriptor;
   }

   protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
       internalGetFieldAccessorTable() {
     return DailyTripSummaryProto.internal_static_DailyTripSummary_fieldAccessorTable
         .ensureFieldAccessorsInitialized(
             DailyTripSummaryProto.DailyTripSummary.class, DailyTripSummaryProto.DailyTripSummary.Builder.class);
   }

   // Construct using DailyTripSummaryProto.DailyTripSummary.newBuilder()
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
     totalTripDistance_ = 0;
     bitField0_ = (bitField0_ & ~0x00000002);
     numberOfTrips_ = 0;
     bitField0_ = (bitField0_ & ~0x00000004);
     totalTripTime_ = 0;
     bitField0_ = (bitField0_ & ~0x00000008);
     timeTimeslot1_ = 0;
     bitField0_ = (bitField0_ & ~0x00000010);
     timeTimeslot2_ = 0;
     bitField0_ = (bitField0_ & ~0x00000020);
     maximumSpeed_ = 0;
     bitField0_ = (bitField0_ & ~0x00000040);
     totalSpeedingTime_ = 0;
     bitField0_ = (bitField0_ & ~0x00000080);
     return this;
   }

   public Builder clone() {
     return create().mergeFrom(buildPartial());
   }

   public com.google.protobuf.Descriptors.Descriptor
       getDescriptorForType() {
     return DailyTripSummaryProto.internal_static_DailyTripSummary_descriptor;
   }

   public DailyTripSummaryProto.DailyTripSummary getDefaultInstanceForType() {
     return DailyTripSummaryProto.DailyTripSummary.getDefaultInstance();
   }

   public DailyTripSummaryProto.DailyTripSummary build() {
     DailyTripSummaryProto.DailyTripSummary result = buildPartial();
     if (!result.isInitialized()) {
       throw newUninitializedMessageException(result);
     }
     return result;
   }

   public DailyTripSummaryProto.DailyTripSummary buildPartial() {
     DailyTripSummaryProto.DailyTripSummary result = new DailyTripSummaryProto.DailyTripSummary(this);
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
     result.totalTripDistance_ = totalTripDistance_;
     if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
       to_bitField0_ |= 0x00000004;
     }
     result.numberOfTrips_ = numberOfTrips_;
     if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
       to_bitField0_ |= 0x00000008;
     }
     result.totalTripTime_ = totalTripTime_;
     if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
       to_bitField0_ |= 0x00000010;
     }
     result.timeTimeslot1_ = timeTimeslot1_;
     if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
       to_bitField0_ |= 0x00000020;
     }
     result.timeTimeslot2_ = timeTimeslot2_;
     if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
       to_bitField0_ |= 0x00000040;
     }
     result.maximumSpeed_ = maximumSpeed_;
     if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
       to_bitField0_ |= 0x00000080;
     }
     result.totalSpeedingTime_ = totalSpeedingTime_;
     result.bitField0_ = to_bitField0_;
     onBuilt();
     return result;
   }

   public Builder mergeFrom(com.google.protobuf.Message other) {
     if (other instanceof DailyTripSummaryProto.DailyTripSummary) {
       return mergeFrom((DailyTripSummaryProto.DailyTripSummary)other);
     } else {
       super.mergeFrom(other);
       return this;
     }
   }

   public Builder mergeFrom(DailyTripSummaryProto.DailyTripSummary other) {
     if (other == DailyTripSummaryProto.DailyTripSummary.getDefaultInstance()) return this;
     if (other.hasHeader()) {
       mergeHeader(other.getHeader());
     }
     if (other.hasTotalTripDistance()) {
       setTotalTripDistance(other.getTotalTripDistance());
     }
     if (other.hasNumberOfTrips()) {
       setNumberOfTrips(other.getNumberOfTrips());
     }
     if (other.hasTotalTripTime()) {
       setTotalTripTime(other.getTotalTripTime());
     }
     if (other.hasTimeTimeslot1()) {
       setTimeTimeslot1(other.getTimeTimeslot1());
     }
     if (other.hasTimeTimeslot2()) {
       setTimeTimeslot2(other.getTimeTimeslot2());
     }
     if (other.hasMaximumSpeed()) {
       setMaximumSpeed(other.getMaximumSpeed());
     }
     if (other.hasTotalSpeedingTime()) {
       setTotalSpeedingTime(other.getTotalSpeedingTime());
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
     DailyTripSummaryProto.DailyTripSummary parsedMessage = null;
     try {
       parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
     } catch (com.google.protobuf.InvalidProtocolBufferException e) {
       parsedMessage = (DailyTripSummaryProto.DailyTripSummary) e.getUnfinishedMessage();
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

   private int totalTripDistance_ ;
   /**
    * <code>optional uint32 total_trip_distance = 2;</code>
    *
    * <pre>
    * Total trip distance (meters)
    * </pre>
    */
   public boolean hasTotalTripDistance() {
     return ((bitField0_ & 0x00000002) == 0x00000002);
   }
   /**
    * <code>optional uint32 total_trip_distance = 2;</code>
    *
    * <pre>
    * Total trip distance (meters)
    * </pre>
    */
   public int getTotalTripDistance() {
     return totalTripDistance_;
   }
   /**
    * <code>optional uint32 total_trip_distance = 2;</code>
    *
    * <pre>
    * Total trip distance (meters)
    * </pre>
    */
   public Builder setTotalTripDistance(int value) {
     bitField0_ |= 0x00000002;
     totalTripDistance_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>optional uint32 total_trip_distance = 2;</code>
    *
    * <pre>
    * Total trip distance (meters)
    * </pre>
    */
   public Builder clearTotalTripDistance() {
     bitField0_ = (bitField0_ & ~0x00000002);
     totalTripDistance_ = 0;
     onChanged();
     return this;
   }

   private int numberOfTrips_ ;
   /**
    * <code>optional uint32 number_of_trips = 3;</code>
    *
    * <pre>
    * Number of trips
    * </pre>
    */
   public boolean hasNumberOfTrips() {
     return ((bitField0_ & 0x00000004) == 0x00000004);
   }
   /**
    * <code>optional uint32 number_of_trips = 3;</code>
    *
    * <pre>
    * Number of trips
    * </pre>
    */
   public int getNumberOfTrips() {
     return numberOfTrips_;
   }
   /**
    * <code>optional uint32 number_of_trips = 3;</code>
    *
    * <pre>
    * Number of trips
    * </pre>
    */
   public Builder setNumberOfTrips(int value) {
     bitField0_ |= 0x00000004;
     numberOfTrips_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>optional uint32 number_of_trips = 3;</code>
    *
    * <pre>
    * Number of trips
    * </pre>
    */
   public Builder clearNumberOfTrips() {
     bitField0_ = (bitField0_ & ~0x00000004);
     numberOfTrips_ = 0;
     onChanged();
     return this;
   }

   private int totalTripTime_ ;
   /**
    * <code>optional uint32 total_trip_time = 4;</code>
    *
    * <pre>
    * Total trip time (seconds)
    * </pre>
    */
   public boolean hasTotalTripTime() {
     return ((bitField0_ & 0x00000008) == 0x00000008);
   }
   /**
    * <code>optional uint32 total_trip_time = 4;</code>
    *
    * <pre>
    * Total trip time (seconds)
    * </pre>
    */
   public int getTotalTripTime() {
     return totalTripTime_;
   }
   /**
    * <code>optional uint32 total_trip_time = 4;</code>
    *
    * <pre>
    * Total trip time (seconds)
    * </pre>
    */
   public Builder setTotalTripTime(int value) {
     bitField0_ |= 0x00000008;
     totalTripTime_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>optional uint32 total_trip_time = 4;</code>
    *
    * <pre>
    * Total trip time (seconds)
    * </pre>
    */
   public Builder clearTotalTripTime() {
     bitField0_ = (bitField0_ & ~0x00000008);
     totalTripTime_ = 0;
     onChanged();
     return this;
   }

   private int timeTimeslot1_ ;
   /**
    * <code>optional uint32 time_timeslot1 = 5;</code>
    *
    * <pre>
    * Time in Timeslot 1 (seconds)
    * </pre>
    */
   public boolean hasTimeTimeslot1() {
     return ((bitField0_ & 0x00000010) == 0x00000010);
   }
   /**
    * <code>optional uint32 time_timeslot1 = 5;</code>
    *
    * <pre>
    * Time in Timeslot 1 (seconds)
    * </pre>
    */
   public int getTimeTimeslot1() {
     return timeTimeslot1_;
   }
   /**
    * <code>optional uint32 time_timeslot1 = 5;</code>
    *
    * <pre>
    * Time in Timeslot 1 (seconds)
    * </pre>
    */
   public Builder setTimeTimeslot1(int value) {
     bitField0_ |= 0x00000010;
     timeTimeslot1_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>optional uint32 time_timeslot1 = 5;</code>
    *
    * <pre>
    * Time in Timeslot 1 (seconds)
    * </pre>
    */
   public Builder clearTimeTimeslot1() {
     bitField0_ = (bitField0_ & ~0x00000010);
     timeTimeslot1_ = 0;
     onChanged();
     return this;
   }

   private int timeTimeslot2_ ;
   /**
    * <code>optional uint32 time_timeslot2 = 6;</code>
    *
    * <pre>
    * Time in Timeslot 2 (seconds)
    * </pre>
    */
   public boolean hasTimeTimeslot2() {
     return ((bitField0_ & 0x00000020) == 0x00000020);
   }
   /**
    * <code>optional uint32 time_timeslot2 = 6;</code>
    *
    * <pre>
    * Time in Timeslot 2 (seconds)
    * </pre>
    */
   public int getTimeTimeslot2() {
     return timeTimeslot2_;
   }
   /**
    * <code>optional uint32 time_timeslot2 = 6;</code>
    *
    * <pre>
    * Time in Timeslot 2 (seconds)
    * </pre>
    */
   public Builder setTimeTimeslot2(int value) {
     bitField0_ |= 0x00000020;
     timeTimeslot2_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>optional uint32 time_timeslot2 = 6;</code>
    *
    * <pre>
    * Time in Timeslot 2 (seconds)
    * </pre>
    */
   public Builder clearTimeTimeslot2() {
     bitField0_ = (bitField0_ & ~0x00000020);
     timeTimeslot2_ = 0;
     onChanged();
     return this;
   }

   private int maximumSpeed_ ;
   /**
    * <code>optional uint32 maximum_speed = 7;</code>
    *
    * <pre>
    * Maximum Speed (km/h)
    * </pre>
    */
   public boolean hasMaximumSpeed() {
     return ((bitField0_ & 0x00000040) == 0x00000040);
   }
   /**
    * <code>optional uint32 maximum_speed = 7;</code>
    *
    * <pre>
    * Maximum Speed (km/h)
    * </pre>
    */
   public int getMaximumSpeed() {
     return maximumSpeed_;
   }
   /**
    * <code>optional uint32 maximum_speed = 7;</code>
    *
    * <pre>
    * Maximum Speed (km/h)
    * </pre>
    */
   public Builder setMaximumSpeed(int value) {
     bitField0_ |= 0x00000040;
     maximumSpeed_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>optional uint32 maximum_speed = 7;</code>
    *
    * <pre>
    * Maximum Speed (km/h)
    * </pre>
    */
   public Builder clearMaximumSpeed() {
     bitField0_ = (bitField0_ & ~0x00000040);
     maximumSpeed_ = 0;
     onChanged();
     return this;
   }

   private int totalSpeedingTime_ ;
   /**
    * <code>optional uint32 total_speeding_time = 8;</code>
    *
    * <pre>
    * Total Speeding Time (seconds)
    * </pre>
    */
   public boolean hasTotalSpeedingTime() {
     return ((bitField0_ & 0x00000080) == 0x00000080);
   }
   /**
    * <code>optional uint32 total_speeding_time = 8;</code>
    *
    * <pre>
    * Total Speeding Time (seconds)
    * </pre>
    */
   public int getTotalSpeedingTime() {
     return totalSpeedingTime_;
   }
   /**
    * <code>optional uint32 total_speeding_time = 8;</code>
    *
    * <pre>
    * Total Speeding Time (seconds)
    * </pre>
    */
   public Builder setTotalSpeedingTime(int value) {
     bitField0_ |= 0x00000080;
     totalSpeedingTime_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>optional uint32 total_speeding_time = 8;</code>
    *
    * <pre>
    * Total Speeding Time (seconds)
    * </pre>
    */
   public Builder clearTotalSpeedingTime() {
     bitField0_ = (bitField0_ & ~0x00000080);
     totalSpeedingTime_ = 0;
     onChanged();
     return this;
   }

   // @@protoc_insertion_point(builder_scope:DailyTripSummary)
 }

 static {
   defaultInstance = new DailyTripSummary(true);
   defaultInstance.initFields();
 }

 // @@protoc_insertion_point(class_scope:DailyTripSummary)
}

private static final com.google.protobuf.Descriptors.Descriptor
 internal_static_DailyTripSummary_descriptor;
private static
 com.google.protobuf.GeneratedMessage.FieldAccessorTable
   internal_static_DailyTripSummary_fieldAccessorTable;

public static com.google.protobuf.Descriptors.FileDescriptor
   getDescriptor() {
 return descriptor;
}
private static com.google.protobuf.Descriptors.FileDescriptor
   descriptor;
static {
 java.lang.String[] descriptorData = {
   "\n\033DailyTripSummaryProto.proto\032\026EventHead" +
   "erProto.proto\"\343\001\n\020DailyTripSummary\022\034\n\006he" +
   "ader\030\001 \002(\0132\014.EventHeader\022\033\n\023total_trip_d" +
   "istance\030\002 \001(\r\022\027\n\017number_of_trips\030\003 \001(\r\022\027" +
   "\n\017total_trip_time\030\004 \001(\r\022\026\n\016time_timeslot" +
   "1\030\005 \001(\r\022\026\n\016time_timeslot2\030\006 \001(\r\022\025\n\rmaxim" +
   "um_speed\030\007 \001(\r\022\033\n\023total_speeding_time\030\010 " +
   "\001(\r"
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
 internal_static_DailyTripSummary_descriptor =
   getDescriptor().getMessageTypes().get(0);
 internal_static_DailyTripSummary_fieldAccessorTable = new
   com.google.protobuf.GeneratedMessage.FieldAccessorTable(
     internal_static_DailyTripSummary_descriptor,
     new java.lang.String[] { "Header", "TotalTripDistance", "NumberOfTrips", "TotalTripTime", "TimeTimeslot1", "TimeTimeslot2", "MaximumSpeed", "TotalSpeedingTime", });
 EventHeaderProto.getDescriptor();
}

// @@protoc_insertion_point(outer_class_scope)
}
