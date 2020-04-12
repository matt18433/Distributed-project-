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
    internal_static_smartkitchen_itemsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartkitchen_itemsResponse_fieldAccessorTable;
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
      "\n\014fridge.proto\022\014smartkitchen\"(\n\020statusOf" +
      "Switches\022\024\n\014switchStatus\030\001 \001(\010\"\036\n\ritemsI" +
      "nFridge\022\r\n\005items\030\001 \001(\t\"\036\n\ritemsResponse\022" +
      "\r\n\005items\030\001 \001(\t\"7\n\014statusOfDoor\022\016\n\006status" +
      "\030\001 \001(\010\022\027\n\017statusOfDoorMsg\030\002 \001(\t\"\007\n\005Empty" +
      "2\361\002\n\013smartFridge\022A\n\010switchOn\022\023.smartkitc" +
      "hen.Empty\032\036.smartkitchen.statusOfSwitche" +
      "s\"\000\022B\n\tswitchOff\022\023.smartkitchen.Empty\032\036." +
      "smartkitchen.statusOfSwitches\"\000\022D\n\010doorO" +
      "pen\022\032.smartkitchen.statusOfDoor\032\032.smartk" +
      "itchen.statusOfDoor\"\000\022F\n\ndoorClosed\022\032.sm" +
      "artkitchen.statusOfDoor\032\032.smartkitchen.s" +
      "tatusOfDoor\"\000\022M\n\013fridgeItems\022\033.smartkitc" +
      "hen.itemsInFridge\032\033.smartkitchen.itemsRe" +
      "sponse\"\000(\0010\001B9\n\035com.matthewmurphy.smartf" +
      "ridgeB\026SmartKitchenFridgeImplP\001b\006proto3"
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
        new java.lang.String[] { "SwitchStatus", });
    internal_static_smartkitchen_itemsInFridge_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_smartkitchen_itemsInFridge_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartkitchen_itemsInFridge_descriptor,
        new java.lang.String[] { "Items", });
    internal_static_smartkitchen_itemsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_smartkitchen_itemsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartkitchen_itemsResponse_descriptor,
        new java.lang.String[] { "Items", });
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
