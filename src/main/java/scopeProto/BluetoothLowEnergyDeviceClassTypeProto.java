package scopeProto;

//Generated by the protocol buffer compiler.  DO NOT EDIT!
//source: BluetoothLowEnergyDeviceClassTypeProto.proto

public final class BluetoothLowEnergyDeviceClassTypeProto {
private BluetoothLowEnergyDeviceClassTypeProto() {}
public static void registerAllExtensions(
   com.google.protobuf.ExtensionRegistry registry) {
}
/**
* Protobuf enum {@code BluetoothLowEnergyDeviceClassType}
*
* <pre>
* The BluetoothLowEnergy device class
* </pre>
*/
public enum BluetoothLowEnergyDeviceClassType
   implements com.google.protobuf.ProtocolMessageEnum {
 /**
  * <code>BLUETOOTH_LOW_ENERGY_DEVICE_CLASS_UNDEFINED = 0;</code>
  *
  * <pre>
  * Undefined
  * </pre>
  */
 BLUETOOTH_LOW_ENERGY_DEVICE_CLASS_UNDEFINED(0, 0),
 /**
  * <code>BLUETOOTH_LOW_ENERGY_DEVICE_CLASS_SENSOR = 1;</code>
  *
  * <pre>
  * Sensor
  * </pre>
  */
 BLUETOOTH_LOW_ENERGY_DEVICE_CLASS_SENSOR(1, 1),
 /**
  * <code>BLUETOOTH_LOW_ENERGY_DEVICE_CLASS_REMOTE = 2;</code>
  *
  * <pre>
  * Remote
  * </pre>
  */
 BLUETOOTH_LOW_ENERGY_DEVICE_CLASS_REMOTE(2, 2),
 ;

 /**
  * <code>BLUETOOTH_LOW_ENERGY_DEVICE_CLASS_UNDEFINED = 0;</code>
  *
  * <pre>
  * Undefined
  * </pre>
  */
 public static final int BLUETOOTH_LOW_ENERGY_DEVICE_CLASS_UNDEFINED_VALUE = 0;
 /**
  * <code>BLUETOOTH_LOW_ENERGY_DEVICE_CLASS_SENSOR = 1;</code>
  *
  * <pre>
  * Sensor
  * </pre>
  */
 public static final int BLUETOOTH_LOW_ENERGY_DEVICE_CLASS_SENSOR_VALUE = 1;
 /**
  * <code>BLUETOOTH_LOW_ENERGY_DEVICE_CLASS_REMOTE = 2;</code>
  *
  * <pre>
  * Remote
  * </pre>
  */
 public static final int BLUETOOTH_LOW_ENERGY_DEVICE_CLASS_REMOTE_VALUE = 2;


 public final int getNumber() { return value; }

 public static BluetoothLowEnergyDeviceClassType valueOf(int value) {
   switch (value) {
     case 0: return BLUETOOTH_LOW_ENERGY_DEVICE_CLASS_UNDEFINED;
     case 1: return BLUETOOTH_LOW_ENERGY_DEVICE_CLASS_SENSOR;
     case 2: return BLUETOOTH_LOW_ENERGY_DEVICE_CLASS_REMOTE;
     default: return null;
   }
 }

 public static com.google.protobuf.Internal.EnumLiteMap<BluetoothLowEnergyDeviceClassType>
     internalGetValueMap() {
   return internalValueMap;
 }
 private static com.google.protobuf.Internal.EnumLiteMap<BluetoothLowEnergyDeviceClassType>
     internalValueMap =
       new com.google.protobuf.Internal.EnumLiteMap<BluetoothLowEnergyDeviceClassType>() {
         public BluetoothLowEnergyDeviceClassType findValueByNumber(int number) {
           return BluetoothLowEnergyDeviceClassType.valueOf(number);
         }
       };

 public final com.google.protobuf.Descriptors.EnumValueDescriptor
     getValueDescriptor() {
   return getDescriptor().getValues().get(index);
 }
 public final com.google.protobuf.Descriptors.EnumDescriptor
     getDescriptorForType() {
   return getDescriptor();
 }
 public static final com.google.protobuf.Descriptors.EnumDescriptor
     getDescriptor() {
   return BluetoothLowEnergyDeviceClassTypeProto.getDescriptor().getEnumTypes().get(0);
 }

 private static final BluetoothLowEnergyDeviceClassType[] VALUES = values();

 public static BluetoothLowEnergyDeviceClassType valueOf(
     com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
   if (desc.getType() != getDescriptor()) {
     throw new java.lang.IllegalArgumentException(
       "EnumValueDescriptor is not for this type.");
   }
   return VALUES[desc.getIndex()];
 }

 private final int index;
 private final int value;

 private BluetoothLowEnergyDeviceClassType(int index, int value) {
   this.index = index;
   this.value = value;
 }

 // @@protoc_insertion_point(enum_scope:BluetoothLowEnergyDeviceClassType)
}


public static com.google.protobuf.Descriptors.FileDescriptor
   getDescriptor() {
 return descriptor;
}
private static com.google.protobuf.Descriptors.FileDescriptor
   descriptor;
static {
 java.lang.String[] descriptorData = {
   "\n,BluetoothLowEnergyDeviceClassTypeProto" +
   ".proto*\260\001\n!BluetoothLowEnergyDeviceClass" +
   "Type\022/\n+BLUETOOTH_LOW_ENERGY_DEVICE_CLAS" +
   "S_UNDEFINED\020\000\022,\n(BLUETOOTH_LOW_ENERGY_DE" +
   "VICE_CLASS_SENSOR\020\001\022,\n(BLUETOOTH_LOW_ENE" +
   "RGY_DEVICE_CLASS_REMOTE\020\002"
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
     }, assigner);
}

// @@protoc_insertion_point(outer_class_scope)
}