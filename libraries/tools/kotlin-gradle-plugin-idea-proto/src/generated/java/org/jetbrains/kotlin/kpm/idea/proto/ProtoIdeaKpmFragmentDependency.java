// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto_idea_kpm.proto

package org.jetbrains.kotlin.kpm.idea.proto;

/**
 * Protobuf type {@code org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency}
 */
public final class ProtoIdeaKpmFragmentDependency extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency)
    ProtoIdeaKpmFragmentDependencyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProtoIdeaKpmFragmentDependency.newBuilder() to construct.
  private ProtoIdeaKpmFragmentDependency(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProtoIdeaKpmFragmentDependency() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProtoIdeaKpmFragmentDependency();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProtoIdeaKpmFragmentDependency(
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
          case 8: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 18: {
            org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates.Builder subBuilder = null;
            if (coordinates_ != null) {
              subBuilder = coordinates_.toBuilder();
            }
            coordinates_ = input.readMessage(org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(coordinates_);
              coordinates_ = subBuilder.buildPartial();
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
    return org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpm.internal_static_org_jetbrains_kotlin_kpm_idea_proto_ProtoIdeaKpmFragmentDependency_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpm.internal_static_org_jetbrains_kotlin_kpm_idea_proto_ProtoIdeaKpmFragmentDependency_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency.class, org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency.Builder.class);
  }

  /**
   * Protobuf enum {@code org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency.Type}
   */
  public enum Type
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>REGULAR = 0;</code>
     */
    REGULAR(0),
    /**
     * <code>FRIEND = 1;</code>
     */
    FRIEND(1),
    /**
     * <code>REFINES = 2;</code>
     */
    REFINES(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>REGULAR = 0;</code>
     */
    public static final int REGULAR_VALUE = 0;
    /**
     * <code>FRIEND = 1;</code>
     */
    public static final int FRIEND_VALUE = 1;
    /**
     * <code>REFINES = 2;</code>
     */
    public static final int REFINES_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Type forNumber(int value) {
      switch (value) {
        case 0: return REGULAR;
        case 1: return FRIEND;
        case 2: return REFINES;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Type> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Type>() {
            public Type findValueByNumber(int number) {
              return Type.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency.getDescriptor().getEnumTypes().get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency.Type)
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>.org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency.Type type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency.Type type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency.Type getType() {
    @SuppressWarnings("deprecation")
    org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency.Type result = org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency.Type.valueOf(type_);
    return result == null ? org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency.Type.UNRECOGNIZED : result;
  }

  public static final int COORDINATES_FIELD_NUMBER = 2;
  private org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates coordinates_;
  /**
   * <code>.org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates coordinates = 2;</code>
   * @return Whether the coordinates field is set.
   */
  @java.lang.Override
  public boolean hasCoordinates() {
    return coordinates_ != null;
  }
  /**
   * <code>.org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates coordinates = 2;</code>
   * @return The coordinates.
   */
  @java.lang.Override
  public org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates getCoordinates() {
    return coordinates_ == null ? org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates.getDefaultInstance() : coordinates_;
  }
  /**
   * <code>.org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates coordinates = 2;</code>
   */
  @java.lang.Override
  public org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinatesOrBuilder getCoordinatesOrBuilder() {
    return getCoordinates();
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
    if (type_ != org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency.Type.REGULAR.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (coordinates_ != null) {
      output.writeMessage(2, getCoordinates());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency.Type.REGULAR.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (coordinates_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCoordinates());
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
    if (!(obj instanceof org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency)) {
      return super.equals(obj);
    }
    org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency other = (org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency) obj;

    if (type_ != other.type_) return false;
    if (hasCoordinates() != other.hasCoordinates()) return false;
    if (hasCoordinates()) {
      if (!getCoordinates()
          .equals(other.getCoordinates())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    if (hasCoordinates()) {
      hash = (37 * hash) + COORDINATES_FIELD_NUMBER;
      hash = (53 * hash) + getCoordinates().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency parseFrom(
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
  public static Builder newBuilder(org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency prototype) {
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
   * Protobuf type {@code org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency)
      org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependencyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpm.internal_static_org_jetbrains_kotlin_kpm_idea_proto_ProtoIdeaKpmFragmentDependency_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpm.internal_static_org_jetbrains_kotlin_kpm_idea_proto_ProtoIdeaKpmFragmentDependency_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency.class, org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency.Builder.class);
    }

    // Construct using org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency.newBuilder()
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
      type_ = 0;

      if (coordinatesBuilder_ == null) {
        coordinates_ = null;
      } else {
        coordinates_ = null;
        coordinatesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpm.internal_static_org_jetbrains_kotlin_kpm_idea_proto_ProtoIdeaKpmFragmentDependency_descriptor;
    }

    @java.lang.Override
    public org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency getDefaultInstanceForType() {
      return org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency.getDefaultInstance();
    }

    @java.lang.Override
    public org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency build() {
      org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency buildPartial() {
      org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency result = new org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency(this);
      result.type_ = type_;
      if (coordinatesBuilder_ == null) {
        result.coordinates_ = coordinates_;
      } else {
        result.coordinates_ = coordinatesBuilder_.build();
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
      if (other instanceof org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency) {
        return mergeFrom((org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency other) {
      if (other == org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.hasCoordinates()) {
        mergeCoordinates(other.getCoordinates());
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
      org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ = 0;
    /**
     * <code>.org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency.Type type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency.Type type = 1;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency.Type type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency.Type getType() {
      @SuppressWarnings("deprecation")
      org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency.Type result = org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency.Type.valueOf(type_);
      return result == null ? org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency.Type.UNRECOGNIZED : result;
    }
    /**
     * <code>.org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency.Type type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency.Type type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates coordinates_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates, org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates.Builder, org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinatesOrBuilder> coordinatesBuilder_;
    /**
     * <code>.org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates coordinates = 2;</code>
     * @return Whether the coordinates field is set.
     */
    public boolean hasCoordinates() {
      return coordinatesBuilder_ != null || coordinates_ != null;
    }
    /**
     * <code>.org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates coordinates = 2;</code>
     * @return The coordinates.
     */
    public org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates getCoordinates() {
      if (coordinatesBuilder_ == null) {
        return coordinates_ == null ? org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates.getDefaultInstance() : coordinates_;
      } else {
        return coordinatesBuilder_.getMessage();
      }
    }
    /**
     * <code>.org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates coordinates = 2;</code>
     */
    public Builder setCoordinates(org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates value) {
      if (coordinatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        coordinates_ = value;
        onChanged();
      } else {
        coordinatesBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates coordinates = 2;</code>
     */
    public Builder setCoordinates(
        org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates.Builder builderForValue) {
      if (coordinatesBuilder_ == null) {
        coordinates_ = builderForValue.build();
        onChanged();
      } else {
        coordinatesBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates coordinates = 2;</code>
     */
    public Builder mergeCoordinates(org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates value) {
      if (coordinatesBuilder_ == null) {
        if (coordinates_ != null) {
          coordinates_ =
            org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates.newBuilder(coordinates_).mergeFrom(value).buildPartial();
        } else {
          coordinates_ = value;
        }
        onChanged();
      } else {
        coordinatesBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates coordinates = 2;</code>
     */
    public Builder clearCoordinates() {
      if (coordinatesBuilder_ == null) {
        coordinates_ = null;
        onChanged();
      } else {
        coordinates_ = null;
        coordinatesBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates coordinates = 2;</code>
     */
    public org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates.Builder getCoordinatesBuilder() {
      
      onChanged();
      return getCoordinatesFieldBuilder().getBuilder();
    }
    /**
     * <code>.org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates coordinates = 2;</code>
     */
    public org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinatesOrBuilder getCoordinatesOrBuilder() {
      if (coordinatesBuilder_ != null) {
        return coordinatesBuilder_.getMessageOrBuilder();
      } else {
        return coordinates_ == null ?
            org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates.getDefaultInstance() : coordinates_;
      }
    }
    /**
     * <code>.org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates coordinates = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates, org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates.Builder, org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinatesOrBuilder> 
        getCoordinatesFieldBuilder() {
      if (coordinatesBuilder_ == null) {
        coordinatesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates, org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinates.Builder, org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentCoordinatesOrBuilder>(
                getCoordinates(),
                getParentForChildren(),
                isClean());
        coordinates_ = null;
      }
      return coordinatesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency)
  }

  // @@protoc_insertion_point(class_scope:org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency)
  private static final org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency();
  }

  public static org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProtoIdeaKpmFragmentDependency>
      PARSER = new com.google.protobuf.AbstractParser<ProtoIdeaKpmFragmentDependency>() {
    @java.lang.Override
    public ProtoIdeaKpmFragmentDependency parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProtoIdeaKpmFragmentDependency(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProtoIdeaKpmFragmentDependency> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProtoIdeaKpmFragmentDependency> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmFragmentDependency getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

