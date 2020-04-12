// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fridge.proto

package com.matthewmurphy.smartfridge;

public final class SmartKitchenFridgeImpl {
  private SmartKitchenFridgeImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartkitchen_statusOfSwitches_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartkitchen_statusOfSwitches_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartkitchen_itemsInFridge_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartkitchen_itemsInFridge_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartkitchen_numResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartkitchen_numResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartkitchen_statusOfDoor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartkitchen_statusOfDoor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartkitchen_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartkitchen_Empty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014fridge.proto\022\014smartkitchen\";\n\020statusOf" +
      "Switches\022\024\n\014switchStatus\030\001 \001(\010\022\021\n\tstatus" +
      "Msg\030\002 \001(\t\"1\n\ritemsInFridge\022\r\n\005items\030\001 \001(" +
      "\t\022\021\n\tstatusMsg\030\002 \001(\t\"/\n\013numResponse\022\r\n\005i" +
      "tems\030\001 \001(\t\022\021\n\tstatusMsg\030\002 \001(\t\"7\n\014statusO" +
      "fDoor\022\016\n\006status\030\001 \001(\010\022\027\n\017statusOfDoorMsg" +
      "\030\002 \001(\t\"\007\n\005Empty2\357\002\n\013smartFridge\022A\n\010switc" +
      "hOn\022\023.smartkitchen.Empty\032\036.smartkitchen." +
      "statusOfSwitches\"\000\022B\n\tswitchOff\022\023.smartk" +
      "itchen.Empty\032\036.smartkitchen.statusOfSwit" +
      "ches\"\000\022D\n\010doorOpen\022\032.smartkitchen.status" +
      "OfDoor\032\032.smartkitchen.statusOfDoor\"\000\022F\n\n" +
      "doorClosed\022\032.smartkitchen.statusOfDoor\032\032" +
      ".smartkitchen.statusOfDoor\"\000\022K\n\013fridgeIt" +
      "ems\022\033.smartkitchen.itemsInFridge\032\031.smart" +
      "kitchen.numResponse\"\000(\0010\001B9\n\035com.matthew" +
      "murphy.smartfridgeB\026SmartKitchenFridgeIm" +
      "plP\001b\006proto3"
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
    internal_static_smartkitchen_statusOfSwitches_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_smartkitchen_statusOfSwitches_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartkitchen_statusOfSwitches_descriptor,
        new java.lang.String[] { "SwitchStatus", "StatusMsg", });
    internal_static_smartkitchen_itemsInFridge_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_smartkitchen_itemsInFridge_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartkitchen_itemsInFridge_descriptor,
        new java.lang.String[] { "Items", "StatusMsg", });
    internal_static_smartkitchen_numResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_smartkitchen_numResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartkitchen_numResponse_descriptor,
        new java.lang.String[] { "Items", "StatusMsg", });
    internal_static_smartkitchen_statusOfDoor_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_smartkitchen_statusOfDoor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartkitchen_statusOfDoor_descriptor,
        new java.lang.String[] { "Status", "StatusOfDoorMsg", });
    internal_static_smartkitchen_Empty_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_smartkitchen_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartkitchen_Empty_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
