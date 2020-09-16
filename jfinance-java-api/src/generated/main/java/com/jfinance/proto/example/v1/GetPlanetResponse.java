// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: example/v1/style.proto

package com.jfinance.proto.example.v1;

/**
 * Protobuf type {@code jfinance.proto.example.v1.GetPlanetResponse}
 */
public  final class GetPlanetResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:jfinance.proto.example.v1.GetPlanetResponse)
    GetPlanetResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetPlanetResponse.newBuilder() to construct.
  private GetPlanetResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetPlanetResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetPlanetResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetPlanetResponse(
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
            com.jfinance.proto.example.v1.Planet.Builder subBuilder = null;
            if (planet_ != null) {
              subBuilder = planet_.toBuilder();
            }
            planet_ = input.readMessage(com.jfinance.proto.example.v1.Planet.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(planet_);
              planet_ = subBuilder.buildPartial();
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
    return com.jfinance.proto.example.v1.Uber1Proto.internal_static_jfinance_proto_example_v1_GetPlanetResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.jfinance.proto.example.v1.Uber1Proto.internal_static_jfinance_proto_example_v1_GetPlanetResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.jfinance.proto.example.v1.GetPlanetResponse.class, com.jfinance.proto.example.v1.GetPlanetResponse.Builder.class);
  }

  public static final int PLANET_FIELD_NUMBER = 1;
  private com.jfinance.proto.example.v1.Planet planet_;
  /**
   * <code>.jfinance.proto.example.v1.Planet planet = 1;</code>
   * @return Whether the planet field is set.
   */
  public boolean hasPlanet() {
    return planet_ != null;
  }
  /**
   * <code>.jfinance.proto.example.v1.Planet planet = 1;</code>
   * @return The planet.
   */
  public com.jfinance.proto.example.v1.Planet getPlanet() {
    return planet_ == null ? com.jfinance.proto.example.v1.Planet.getDefaultInstance() : planet_;
  }
  /**
   * <code>.jfinance.proto.example.v1.Planet planet = 1;</code>
   */
  public com.jfinance.proto.example.v1.PlanetOrBuilder getPlanetOrBuilder() {
    return getPlanet();
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
    if (planet_ != null) {
      output.writeMessage(1, getPlanet());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (planet_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPlanet());
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
    if (!(obj instanceof com.jfinance.proto.example.v1.GetPlanetResponse)) {
      return super.equals(obj);
    }
    com.jfinance.proto.example.v1.GetPlanetResponse other = (com.jfinance.proto.example.v1.GetPlanetResponse) obj;

    if (hasPlanet() != other.hasPlanet()) return false;
    if (hasPlanet()) {
      if (!getPlanet()
          .equals(other.getPlanet())) return false;
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
    if (hasPlanet()) {
      hash = (37 * hash) + PLANET_FIELD_NUMBER;
      hash = (53 * hash) + getPlanet().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.jfinance.proto.example.v1.GetPlanetResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jfinance.proto.example.v1.GetPlanetResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jfinance.proto.example.v1.GetPlanetResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jfinance.proto.example.v1.GetPlanetResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jfinance.proto.example.v1.GetPlanetResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jfinance.proto.example.v1.GetPlanetResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jfinance.proto.example.v1.GetPlanetResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.jfinance.proto.example.v1.GetPlanetResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.jfinance.proto.example.v1.GetPlanetResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.jfinance.proto.example.v1.GetPlanetResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.jfinance.proto.example.v1.GetPlanetResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.jfinance.proto.example.v1.GetPlanetResponse parseFrom(
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
  public static Builder newBuilder(com.jfinance.proto.example.v1.GetPlanetResponse prototype) {
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
   * Protobuf type {@code jfinance.proto.example.v1.GetPlanetResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:jfinance.proto.example.v1.GetPlanetResponse)
      com.jfinance.proto.example.v1.GetPlanetResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.jfinance.proto.example.v1.Uber1Proto.internal_static_jfinance_proto_example_v1_GetPlanetResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.jfinance.proto.example.v1.Uber1Proto.internal_static_jfinance_proto_example_v1_GetPlanetResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.jfinance.proto.example.v1.GetPlanetResponse.class, com.jfinance.proto.example.v1.GetPlanetResponse.Builder.class);
    }

    // Construct using com.jfinance.proto.example.v1.GetPlanetResponse.newBuilder()
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
      if (planetBuilder_ == null) {
        planet_ = null;
      } else {
        planet_ = null;
        planetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.jfinance.proto.example.v1.Uber1Proto.internal_static_jfinance_proto_example_v1_GetPlanetResponse_descriptor;
    }

    @java.lang.Override
    public com.jfinance.proto.example.v1.GetPlanetResponse getDefaultInstanceForType() {
      return com.jfinance.proto.example.v1.GetPlanetResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.jfinance.proto.example.v1.GetPlanetResponse build() {
      com.jfinance.proto.example.v1.GetPlanetResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.jfinance.proto.example.v1.GetPlanetResponse buildPartial() {
      com.jfinance.proto.example.v1.GetPlanetResponse result = new com.jfinance.proto.example.v1.GetPlanetResponse(this);
      if (planetBuilder_ == null) {
        result.planet_ = planet_;
      } else {
        result.planet_ = planetBuilder_.build();
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
      if (other instanceof com.jfinance.proto.example.v1.GetPlanetResponse) {
        return mergeFrom((com.jfinance.proto.example.v1.GetPlanetResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.jfinance.proto.example.v1.GetPlanetResponse other) {
      if (other == com.jfinance.proto.example.v1.GetPlanetResponse.getDefaultInstance()) return this;
      if (other.hasPlanet()) {
        mergePlanet(other.getPlanet());
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
      com.jfinance.proto.example.v1.GetPlanetResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.jfinance.proto.example.v1.GetPlanetResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.jfinance.proto.example.v1.Planet planet_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.jfinance.proto.example.v1.Planet, com.jfinance.proto.example.v1.Planet.Builder, com.jfinance.proto.example.v1.PlanetOrBuilder> planetBuilder_;
    /**
     * <code>.jfinance.proto.example.v1.Planet planet = 1;</code>
     * @return Whether the planet field is set.
     */
    public boolean hasPlanet() {
      return planetBuilder_ != null || planet_ != null;
    }
    /**
     * <code>.jfinance.proto.example.v1.Planet planet = 1;</code>
     * @return The planet.
     */
    public com.jfinance.proto.example.v1.Planet getPlanet() {
      if (planetBuilder_ == null) {
        return planet_ == null ? com.jfinance.proto.example.v1.Planet.getDefaultInstance() : planet_;
      } else {
        return planetBuilder_.getMessage();
      }
    }
    /**
     * <code>.jfinance.proto.example.v1.Planet planet = 1;</code>
     */
    public Builder setPlanet(com.jfinance.proto.example.v1.Planet value) {
      if (planetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        planet_ = value;
        onChanged();
      } else {
        planetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.jfinance.proto.example.v1.Planet planet = 1;</code>
     */
    public Builder setPlanet(
        com.jfinance.proto.example.v1.Planet.Builder builderForValue) {
      if (planetBuilder_ == null) {
        planet_ = builderForValue.build();
        onChanged();
      } else {
        planetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.jfinance.proto.example.v1.Planet planet = 1;</code>
     */
    public Builder mergePlanet(com.jfinance.proto.example.v1.Planet value) {
      if (planetBuilder_ == null) {
        if (planet_ != null) {
          planet_ =
            com.jfinance.proto.example.v1.Planet.newBuilder(planet_).mergeFrom(value).buildPartial();
        } else {
          planet_ = value;
        }
        onChanged();
      } else {
        planetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.jfinance.proto.example.v1.Planet planet = 1;</code>
     */
    public Builder clearPlanet() {
      if (planetBuilder_ == null) {
        planet_ = null;
        onChanged();
      } else {
        planet_ = null;
        planetBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.jfinance.proto.example.v1.Planet planet = 1;</code>
     */
    public com.jfinance.proto.example.v1.Planet.Builder getPlanetBuilder() {
      
      onChanged();
      return getPlanetFieldBuilder().getBuilder();
    }
    /**
     * <code>.jfinance.proto.example.v1.Planet planet = 1;</code>
     */
    public com.jfinance.proto.example.v1.PlanetOrBuilder getPlanetOrBuilder() {
      if (planetBuilder_ != null) {
        return planetBuilder_.getMessageOrBuilder();
      } else {
        return planet_ == null ?
            com.jfinance.proto.example.v1.Planet.getDefaultInstance() : planet_;
      }
    }
    /**
     * <code>.jfinance.proto.example.v1.Planet planet = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.jfinance.proto.example.v1.Planet, com.jfinance.proto.example.v1.Planet.Builder, com.jfinance.proto.example.v1.PlanetOrBuilder> 
        getPlanetFieldBuilder() {
      if (planetBuilder_ == null) {
        planetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.jfinance.proto.example.v1.Planet, com.jfinance.proto.example.v1.Planet.Builder, com.jfinance.proto.example.v1.PlanetOrBuilder>(
                getPlanet(),
                getParentForChildren(),
                isClean());
        planet_ = null;
      }
      return planetBuilder_;
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


    // @@protoc_insertion_point(builder_scope:jfinance.proto.example.v1.GetPlanetResponse)
  }

  // @@protoc_insertion_point(class_scope:jfinance.proto.example.v1.GetPlanetResponse)
  private static final com.jfinance.proto.example.v1.GetPlanetResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.jfinance.proto.example.v1.GetPlanetResponse();
  }

  public static com.jfinance.proto.example.v1.GetPlanetResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetPlanetResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetPlanetResponse>() {
    @java.lang.Override
    public GetPlanetResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetPlanetResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetPlanetResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetPlanetResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.jfinance.proto.example.v1.GetPlanetResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

