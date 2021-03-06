// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: example/v1/style.proto

package com.jfinance.proto.example.v1;

/**
 * Protobuf type {@code jfinance.proto.example.v1.StreamGalaxiesResponse}
 */
public  final class StreamGalaxiesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:jfinance.proto.example.v1.StreamGalaxiesResponse)
    StreamGalaxiesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StreamGalaxiesResponse.newBuilder() to construct.
  private StreamGalaxiesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StreamGalaxiesResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StreamGalaxiesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StreamGalaxiesResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            com.jfinance.proto.example.v1.Galaxy.Builder subBuilder = null;
            if (galaxy_ != null) {
              subBuilder = galaxy_.toBuilder();
            }
            galaxy_ = input.readMessage(com.jfinance.proto.example.v1.Galaxy.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(galaxy_);
              galaxy_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
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
    return com.jfinance.proto.example.v1.Uber1Proto.internal_static_jfinance_proto_example_v1_StreamGalaxiesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.jfinance.proto.example.v1.Uber1Proto.internal_static_jfinance_proto_example_v1_StreamGalaxiesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.jfinance.proto.example.v1.StreamGalaxiesResponse.class, com.jfinance.proto.example.v1.StreamGalaxiesResponse.Builder.class);
  }

  public static final int GALAXY_FIELD_NUMBER = 1;
  private com.jfinance.proto.example.v1.Galaxy galaxy_;
  /**
   * <code>.jfinance.proto.example.v1.Galaxy galaxy = 1;</code>
   * @return Whether the galaxy field is set.
   */
  public boolean hasGalaxy() {
    return galaxy_ != null;
  }
  /**
   * <code>.jfinance.proto.example.v1.Galaxy galaxy = 1;</code>
   * @return The galaxy.
   */
  public com.jfinance.proto.example.v1.Galaxy getGalaxy() {
    return galaxy_ == null ? com.jfinance.proto.example.v1.Galaxy.getDefaultInstance() : galaxy_;
  }
  /**
   * <code>.jfinance.proto.example.v1.Galaxy galaxy = 1;</code>
   */
  public com.jfinance.proto.example.v1.GalaxyOrBuilder getGalaxyOrBuilder() {
    return getGalaxy();
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
    if (galaxy_ != null) {
      output.writeMessage(1, getGalaxy());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (galaxy_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGalaxy());
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
    if (!(obj instanceof com.jfinance.proto.example.v1.StreamGalaxiesResponse)) {
      return super.equals(obj);
    }
    com.jfinance.proto.example.v1.StreamGalaxiesResponse other = (com.jfinance.proto.example.v1.StreamGalaxiesResponse) obj;

    if (hasGalaxy() != other.hasGalaxy()) return false;
    if (hasGalaxy()) {
      if (!getGalaxy()
          .equals(other.getGalaxy())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasGalaxy()) {
      hash = (37 * hash) + GALAXY_FIELD_NUMBER;
      hash = (53 * hash) + getGalaxy().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.jfinance.proto.example.v1.StreamGalaxiesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jfinance.proto.example.v1.StreamGalaxiesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jfinance.proto.example.v1.StreamGalaxiesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jfinance.proto.example.v1.StreamGalaxiesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jfinance.proto.example.v1.StreamGalaxiesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jfinance.proto.example.v1.StreamGalaxiesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jfinance.proto.example.v1.StreamGalaxiesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.jfinance.proto.example.v1.StreamGalaxiesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.jfinance.proto.example.v1.StreamGalaxiesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.jfinance.proto.example.v1.StreamGalaxiesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.jfinance.proto.example.v1.StreamGalaxiesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.jfinance.proto.example.v1.StreamGalaxiesResponse parseFrom(
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
  public static Builder newBuilder(com.jfinance.proto.example.v1.StreamGalaxiesResponse prototype) {
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
   * Protobuf type {@code jfinance.proto.example.v1.StreamGalaxiesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:jfinance.proto.example.v1.StreamGalaxiesResponse)
      com.jfinance.proto.example.v1.StreamGalaxiesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.jfinance.proto.example.v1.Uber1Proto.internal_static_jfinance_proto_example_v1_StreamGalaxiesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.jfinance.proto.example.v1.Uber1Proto.internal_static_jfinance_proto_example_v1_StreamGalaxiesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.jfinance.proto.example.v1.StreamGalaxiesResponse.class, com.jfinance.proto.example.v1.StreamGalaxiesResponse.Builder.class);
    }

    // Construct using com.jfinance.proto.example.v1.StreamGalaxiesResponse.newBuilder()
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
      if (galaxyBuilder_ == null) {
        galaxy_ = null;
      } else {
        galaxy_ = null;
        galaxyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.jfinance.proto.example.v1.Uber1Proto.internal_static_jfinance_proto_example_v1_StreamGalaxiesResponse_descriptor;
    }

    @java.lang.Override
    public com.jfinance.proto.example.v1.StreamGalaxiesResponse getDefaultInstanceForType() {
      return com.jfinance.proto.example.v1.StreamGalaxiesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.jfinance.proto.example.v1.StreamGalaxiesResponse build() {
      com.jfinance.proto.example.v1.StreamGalaxiesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.jfinance.proto.example.v1.StreamGalaxiesResponse buildPartial() {
      com.jfinance.proto.example.v1.StreamGalaxiesResponse result = new com.jfinance.proto.example.v1.StreamGalaxiesResponse(this);
      if (galaxyBuilder_ == null) {
        result.galaxy_ = galaxy_;
      } else {
        result.galaxy_ = galaxyBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.jfinance.proto.example.v1.StreamGalaxiesResponse) {
        return mergeFrom((com.jfinance.proto.example.v1.StreamGalaxiesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.jfinance.proto.example.v1.StreamGalaxiesResponse other) {
      if (other == com.jfinance.proto.example.v1.StreamGalaxiesResponse.getDefaultInstance()) return this;
      if (other.hasGalaxy()) {
        mergeGalaxy(other.getGalaxy());
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
      com.jfinance.proto.example.v1.StreamGalaxiesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.jfinance.proto.example.v1.StreamGalaxiesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.jfinance.proto.example.v1.Galaxy galaxy_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.jfinance.proto.example.v1.Galaxy, com.jfinance.proto.example.v1.Galaxy.Builder, com.jfinance.proto.example.v1.GalaxyOrBuilder> galaxyBuilder_;
    /**
     * <code>.jfinance.proto.example.v1.Galaxy galaxy = 1;</code>
     * @return Whether the galaxy field is set.
     */
    public boolean hasGalaxy() {
      return galaxyBuilder_ != null || galaxy_ != null;
    }
    /**
     * <code>.jfinance.proto.example.v1.Galaxy galaxy = 1;</code>
     * @return The galaxy.
     */
    public com.jfinance.proto.example.v1.Galaxy getGalaxy() {
      if (galaxyBuilder_ == null) {
        return galaxy_ == null ? com.jfinance.proto.example.v1.Galaxy.getDefaultInstance() : galaxy_;
      } else {
        return galaxyBuilder_.getMessage();
      }
    }
    /**
     * <code>.jfinance.proto.example.v1.Galaxy galaxy = 1;</code>
     */
    public Builder setGalaxy(com.jfinance.proto.example.v1.Galaxy value) {
      if (galaxyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        galaxy_ = value;
        onChanged();
      } else {
        galaxyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.jfinance.proto.example.v1.Galaxy galaxy = 1;</code>
     */
    public Builder setGalaxy(
        com.jfinance.proto.example.v1.Galaxy.Builder builderForValue) {
      if (galaxyBuilder_ == null) {
        galaxy_ = builderForValue.build();
        onChanged();
      } else {
        galaxyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.jfinance.proto.example.v1.Galaxy galaxy = 1;</code>
     */
    public Builder mergeGalaxy(com.jfinance.proto.example.v1.Galaxy value) {
      if (galaxyBuilder_ == null) {
        if (galaxy_ != null) {
          galaxy_ =
            com.jfinance.proto.example.v1.Galaxy.newBuilder(galaxy_).mergeFrom(value).buildPartial();
        } else {
          galaxy_ = value;
        }
        onChanged();
      } else {
        galaxyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.jfinance.proto.example.v1.Galaxy galaxy = 1;</code>
     */
    public Builder clearGalaxy() {
      if (galaxyBuilder_ == null) {
        galaxy_ = null;
        onChanged();
      } else {
        galaxy_ = null;
        galaxyBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.jfinance.proto.example.v1.Galaxy galaxy = 1;</code>
     */
    public com.jfinance.proto.example.v1.Galaxy.Builder getGalaxyBuilder() {
      
      onChanged();
      return getGalaxyFieldBuilder().getBuilder();
    }
    /**
     * <code>.jfinance.proto.example.v1.Galaxy galaxy = 1;</code>
     */
    public com.jfinance.proto.example.v1.GalaxyOrBuilder getGalaxyOrBuilder() {
      if (galaxyBuilder_ != null) {
        return galaxyBuilder_.getMessageOrBuilder();
      } else {
        return galaxy_ == null ?
            com.jfinance.proto.example.v1.Galaxy.getDefaultInstance() : galaxy_;
      }
    }
    /**
     * <code>.jfinance.proto.example.v1.Galaxy galaxy = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.jfinance.proto.example.v1.Galaxy, com.jfinance.proto.example.v1.Galaxy.Builder, com.jfinance.proto.example.v1.GalaxyOrBuilder> 
        getGalaxyFieldBuilder() {
      if (galaxyBuilder_ == null) {
        galaxyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.jfinance.proto.example.v1.Galaxy, com.jfinance.proto.example.v1.Galaxy.Builder, com.jfinance.proto.example.v1.GalaxyOrBuilder>(
                getGalaxy(),
                getParentForChildren(),
                isClean());
        galaxy_ = null;
      }
      return galaxyBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:jfinance.proto.example.v1.StreamGalaxiesResponse)
  }

  // @@protoc_insertion_point(class_scope:jfinance.proto.example.v1.StreamGalaxiesResponse)
  private static final com.jfinance.proto.example.v1.StreamGalaxiesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.jfinance.proto.example.v1.StreamGalaxiesResponse();
  }

  public static com.jfinance.proto.example.v1.StreamGalaxiesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamGalaxiesResponse>
      PARSER = new com.google.protobuf.AbstractParser<StreamGalaxiesResponse>() {
    @java.lang.Override
    public StreamGalaxiesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StreamGalaxiesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StreamGalaxiesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamGalaxiesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.jfinance.proto.example.v1.StreamGalaxiesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

