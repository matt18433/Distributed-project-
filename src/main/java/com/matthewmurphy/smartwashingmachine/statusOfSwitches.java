// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: washingmachine.proto

package com.matthewmurphy.smartwashingmachine;

/**
 * Protobuf type {@code smartkitchen.statusOfSwitches}
 */
public  final class statusOfSwitches extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:smartkitchen.statusOfSwitches)
    statusOfSwitchesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use statusOfSwitches.newBuilder() to construct.
  private statusOfSwitches(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private statusOfSwitches() {
    switchStatus_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private statusOfSwitches(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            switchStatus_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.matthewmurphy.smartwashingmachine.SmartKitchenWashingmachineImpl.internal_static_smartkitchen_statusOfSwitches_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.matthewmurphy.smartwashingmachine.SmartKitchenWashingmachineImpl.internal_static_smartkitchen_statusOfSwitches_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.matthewmurphy.smartwashingmachine.statusOfSwitches.class, com.matthewmurphy.smartwashingmachine.statusOfSwitches.Builder.class);
  }

  public static final int SWITCHSTATUS_FIELD_NUMBER = 1;
  private boolean switchStatus_;
  /**
   * <code>bool switchStatus = 1;</code>
   */
  public boolean getSwitchStatus() {
    return switchStatus_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (switchStatus_ != false) {
      output.writeBool(1, switchStatus_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (switchStatus_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, switchStatus_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.matthewmurphy.smartwashingmachine.statusOfSwitches)) {
      return super.equals(obj);
    }
    com.matthewmurphy.smartwashingmachine.statusOfSwitches other = (com.matthewmurphy.smartwashingmachine.statusOfSwitches) obj;

    boolean result = true;
    result = result && (getSwitchStatus()
        == other.getSwitchStatus());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SWITCHSTATUS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSwitchStatus());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.matthewmurphy.smartwashingmachine.statusOfSwitches parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.matthewmurphy.smartwashingmachine.statusOfSwitches parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.matthewmurphy.smartwashingmachine.statusOfSwitches parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.matthewmurphy.smartwashingmachine.statusOfSwitches parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.matthewmurphy.smartwashingmachine.statusOfSwitches parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.matthewmurphy.smartwashingmachine.statusOfSwitches parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.matthewmurphy.smartwashingmachine.statusOfSwitches parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.matthewmurphy.smartwashingmachine.statusOfSwitches parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.matthewmurphy.smartwashingmachine.statusOfSwitches parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.matthewmurphy.smartwashingmachine.statusOfSwitches parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.matthewmurphy.smartwashingmachine.statusOfSwitches parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.matthewmurphy.smartwashingmachine.statusOfSwitches parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.matthewmurphy.smartwashingmachine.statusOfSwitches prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code smartkitchen.statusOfSwitches}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:smartkitchen.statusOfSwitches)
      com.matthewmurphy.smartwashingmachine.statusOfSwitchesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.matthewmurphy.smartwashingmachine.SmartKitchenWashingmachineImpl.internal_static_smartkitchen_statusOfSwitches_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.matthewmurphy.smartwashingmachine.SmartKitchenWashingmachineImpl.internal_static_smartkitchen_statusOfSwitches_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.matthewmurphy.smartwashingmachine.statusOfSwitches.class, com.matthewmurphy.smartwashingmachine.statusOfSwitches.Builder.class);
    }

    // Construct using com.matthewmurphy.smartwashingmachine.statusOfSwitches.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      switchStatus_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.matthewmurphy.smartwashingmachine.SmartKitchenWashingmachineImpl.internal_static_smartkitchen_statusOfSwitches_descriptor;
    }

    @java.lang.Override
    public com.matthewmurphy.smartwashingmachine.statusOfSwitches getDefaultInstanceForType() {
      return com.matthewmurphy.smartwashingmachine.statusOfSwitches.getDefaultInstance();
    }

    @java.lang.Override
    public com.matthewmurphy.smartwashingmachine.statusOfSwitches build() {
      com.matthewmurphy.smartwashingmachine.statusOfSwitches result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.matthewmurphy.smartwashingmachine.statusOfSwitches buildPartial() {
      com.matthewmurphy.smartwashingmachine.statusOfSwitches result = new com.matthewmurphy.smartwashingmachine.statusOfSwitches(this);
      result.switchStatus_ = switchStatus_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.matthewmurphy.smartwashingmachine.statusOfSwitches) {
        return mergeFrom((com.matthewmurphy.smartwashingmachine.statusOfSwitches)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.matthewmurphy.smartwashingmachine.statusOfSwitches other) {
      if (other == com.matthewmurphy.smartwashingmachine.statusOfSwitches.getDefaultInstance()) return this;
      if (other.getSwitchStatus() != false) {
        setSwitchStatus(other.getSwitchStatus());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.matthewmurphy.smartwashingmachine.statusOfSwitches parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.matthewmurphy.smartwashingmachine.statusOfSwitches) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean switchStatus_ ;
    /**
     * <code>bool switchStatus = 1;</code>
     */
    public boolean getSwitchStatus() {
      return switchStatus_;
    }
    /**
     * <code>bool switchStatus = 1;</code>
     */
    public Builder setSwitchStatus(boolean value) {
      
      switchStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool switchStatus = 1;</code>
     */
    public Builder clearSwitchStatus() {
      
      switchStatus_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:smartkitchen.statusOfSwitches)
  }

  // @@protoc_insertion_point(class_scope:smartkitchen.statusOfSwitches)
  private static final com.matthewmurphy.smartwashingmachine.statusOfSwitches DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.matthewmurphy.smartwashingmachine.statusOfSwitches();
  }

  public static com.matthewmurphy.smartwashingmachine.statusOfSwitches getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<statusOfSwitches>
      PARSER = new com.google.protobuf.AbstractParser<statusOfSwitches>() {
    @java.lang.Override
    public statusOfSwitches parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new statusOfSwitches(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<statusOfSwitches> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<statusOfSwitches> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.matthewmurphy.smartwashingmachine.statusOfSwitches getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

