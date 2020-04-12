// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fridge.proto

package com.matthewmurphy.smartfridge;

/**
 * Protobuf type {@code smartkitchen.itemsResponse}
 */
public  final class itemsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:smartkitchen.itemsResponse)
    itemsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use itemsResponse.newBuilder() to construct.
  private itemsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private itemsResponse() {
    items_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private itemsResponse(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            items_ = s;
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
    return com.matthewmurphy.smartfridge.SmartKitchenFridgeImpl.internal_static_smartkitchen_itemsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.matthewmurphy.smartfridge.SmartKitchenFridgeImpl.internal_static_smartkitchen_itemsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.matthewmurphy.smartfridge.itemsResponse.class, com.matthewmurphy.smartfridge.itemsResponse.Builder.class);
  }

  public static final int ITEMS_FIELD_NUMBER = 1;
  private volatile java.lang.Object items_;
  /**
   * <code>string items = 1;</code>
   */
  public java.lang.String getItems() {
    java.lang.Object ref = items_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      items_ = s;
      return s;
    }
  }
  /**
   * <code>string items = 1;</code>
   */
  public com.google.protobuf.ByteString
      getItemsBytes() {
    java.lang.Object ref = items_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      items_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getItemsBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, items_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getItemsBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, items_);
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
    if (!(obj instanceof com.matthewmurphy.smartfridge.itemsResponse)) {
      return super.equals(obj);
    }
    com.matthewmurphy.smartfridge.itemsResponse other = (com.matthewmurphy.smartfridge.itemsResponse) obj;

    boolean result = true;
    result = result && getItems()
        .equals(other.getItems());
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
    hash = (37 * hash) + ITEMS_FIELD_NUMBER;
    hash = (53 * hash) + getItems().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.matthewmurphy.smartfridge.itemsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.matthewmurphy.smartfridge.itemsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.matthewmurphy.smartfridge.itemsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.matthewmurphy.smartfridge.itemsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.matthewmurphy.smartfridge.itemsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.matthewmurphy.smartfridge.itemsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.matthewmurphy.smartfridge.itemsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.matthewmurphy.smartfridge.itemsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.matthewmurphy.smartfridge.itemsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.matthewmurphy.smartfridge.itemsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.matthewmurphy.smartfridge.itemsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.matthewmurphy.smartfridge.itemsResponse parseFrom(
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
  public static Builder newBuilder(com.matthewmurphy.smartfridge.itemsResponse prototype) {
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
   * Protobuf type {@code smartkitchen.itemsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:smartkitchen.itemsResponse)
      com.matthewmurphy.smartfridge.itemsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.matthewmurphy.smartfridge.SmartKitchenFridgeImpl.internal_static_smartkitchen_itemsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.matthewmurphy.smartfridge.SmartKitchenFridgeImpl.internal_static_smartkitchen_itemsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.matthewmurphy.smartfridge.itemsResponse.class, com.matthewmurphy.smartfridge.itemsResponse.Builder.class);
    }

    // Construct using com.matthewmurphy.smartfridge.itemsResponse.newBuilder()
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
      items_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.matthewmurphy.smartfridge.SmartKitchenFridgeImpl.internal_static_smartkitchen_itemsResponse_descriptor;
    }

    @java.lang.Override
    public com.matthewmurphy.smartfridge.itemsResponse getDefaultInstanceForType() {
      return com.matthewmurphy.smartfridge.itemsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.matthewmurphy.smartfridge.itemsResponse build() {
      com.matthewmurphy.smartfridge.itemsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.matthewmurphy.smartfridge.itemsResponse buildPartial() {
      com.matthewmurphy.smartfridge.itemsResponse result = new com.matthewmurphy.smartfridge.itemsResponse(this);
      result.items_ = items_;
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
      if (other instanceof com.matthewmurphy.smartfridge.itemsResponse) {
        return mergeFrom((com.matthewmurphy.smartfridge.itemsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.matthewmurphy.smartfridge.itemsResponse other) {
      if (other == com.matthewmurphy.smartfridge.itemsResponse.getDefaultInstance()) return this;
      if (!other.getItems().isEmpty()) {
        items_ = other.items_;
        onChanged();
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
      com.matthewmurphy.smartfridge.itemsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.matthewmurphy.smartfridge.itemsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object items_ = "";
    /**
     * <code>string items = 1;</code>
     */
    public java.lang.String getItems() {
      java.lang.Object ref = items_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        items_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string items = 1;</code>
     */
    public com.google.protobuf.ByteString
        getItemsBytes() {
      java.lang.Object ref = items_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        items_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string items = 1;</code>
     */
    public Builder setItems(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      items_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string items = 1;</code>
     */
    public Builder clearItems() {
      
      items_ = getDefaultInstance().getItems();
      onChanged();
      return this;
    }
    /**
     * <code>string items = 1;</code>
     */
    public Builder setItemsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      items_ = value;
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


    // @@protoc_insertion_point(builder_scope:smartkitchen.itemsResponse)
  }

  // @@protoc_insertion_point(class_scope:smartkitchen.itemsResponse)
  private static final com.matthewmurphy.smartfridge.itemsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.matthewmurphy.smartfridge.itemsResponse();
  }

  public static com.matthewmurphy.smartfridge.itemsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<itemsResponse>
      PARSER = new com.google.protobuf.AbstractParser<itemsResponse>() {
    @java.lang.Override
    public itemsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new itemsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<itemsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<itemsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.matthewmurphy.smartfridge.itemsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
