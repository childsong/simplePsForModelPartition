// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ps.proto

package net;

/**
 * Protobuf type {@code net.Gradient}
 */
public  final class Gradient extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:net.Gradient)
    GradientOrBuilder {
  // Use Gradient.newBuilder() to construct.
  private Gradient(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Gradient() {
    gradient_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Gradient(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              gradient_ = new java.util.ArrayList<net.Map>();
              mutable_bitField0_ |= 0x00000001;
            }
            gradient_.add(input.readMessage(net.Map.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        gradient_ = java.util.Collections.unmodifiableList(gradient_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.Ps.internal_static_net_Gradient_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.Ps.internal_static_net_Gradient_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.Gradient.class, net.Gradient.Builder.class);
  }

  public static final int GRADIENT_FIELD_NUMBER = 1;
  private java.util.List<net.Map> gradient_;
  /**
   * <code>repeated .net.Map gradient = 1;</code>
   */
  public java.util.List<net.Map> getGradientList() {
    return gradient_;
  }
  /**
   * <code>repeated .net.Map gradient = 1;</code>
   */
  public java.util.List<? extends net.MapOrBuilder> 
      getGradientOrBuilderList() {
    return gradient_;
  }
  /**
   * <code>repeated .net.Map gradient = 1;</code>
   */
  public int getGradientCount() {
    return gradient_.size();
  }
  /**
   * <code>repeated .net.Map gradient = 1;</code>
   */
  public net.Map getGradient(int index) {
    return gradient_.get(index);
  }
  /**
   * <code>repeated .net.Map gradient = 1;</code>
   */
  public net.MapOrBuilder getGradientOrBuilder(
      int index) {
    return gradient_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < gradient_.size(); i++) {
      output.writeMessage(1, gradient_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < gradient_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, gradient_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static net.Gradient parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.Gradient parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.Gradient parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.Gradient parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.Gradient parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static net.Gradient parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static net.Gradient parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static net.Gradient parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static net.Gradient parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static net.Gradient parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(net.Gradient prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code net.Gradient}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:net.Gradient)
      net.GradientOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.Ps.internal_static_net_Gradient_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.Ps.internal_static_net_Gradient_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.Gradient.class, net.Gradient.Builder.class);
    }

    // Construct using net.Gradient.newBuilder()
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
        getGradientFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (gradientBuilder_ == null) {
        gradient_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        gradientBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.Ps.internal_static_net_Gradient_descriptor;
    }

    public net.Gradient getDefaultInstanceForType() {
      return net.Gradient.getDefaultInstance();
    }

    public net.Gradient build() {
      net.Gradient result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public net.Gradient buildPartial() {
      net.Gradient result = new net.Gradient(this);
      int from_bitField0_ = bitField0_;
      if (gradientBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          gradient_ = java.util.Collections.unmodifiableList(gradient_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.gradient_ = gradient_;
      } else {
        result.gradient_ = gradientBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof net.Gradient) {
        return mergeFrom((net.Gradient)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.Gradient other) {
      if (other == net.Gradient.getDefaultInstance()) return this;
      if (gradientBuilder_ == null) {
        if (!other.gradient_.isEmpty()) {
          if (gradient_.isEmpty()) {
            gradient_ = other.gradient_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGradientIsMutable();
            gradient_.addAll(other.gradient_);
          }
          onChanged();
        }
      } else {
        if (!other.gradient_.isEmpty()) {
          if (gradientBuilder_.isEmpty()) {
            gradientBuilder_.dispose();
            gradientBuilder_ = null;
            gradient_ = other.gradient_;
            bitField0_ = (bitField0_ & ~0x00000001);
            gradientBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getGradientFieldBuilder() : null;
          } else {
            gradientBuilder_.addAllMessages(other.gradient_);
          }
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      net.Gradient parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (net.Gradient) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<net.Map> gradient_ =
      java.util.Collections.emptyList();
    private void ensureGradientIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        gradient_ = new java.util.ArrayList<net.Map>(gradient_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        net.Map, net.Map.Builder, net.MapOrBuilder> gradientBuilder_;

    /**
     * <code>repeated .net.Map gradient = 1;</code>
     */
    public java.util.List<net.Map> getGradientList() {
      if (gradientBuilder_ == null) {
        return java.util.Collections.unmodifiableList(gradient_);
      } else {
        return gradientBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .net.Map gradient = 1;</code>
     */
    public int getGradientCount() {
      if (gradientBuilder_ == null) {
        return gradient_.size();
      } else {
        return gradientBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .net.Map gradient = 1;</code>
     */
    public net.Map getGradient(int index) {
      if (gradientBuilder_ == null) {
        return gradient_.get(index);
      } else {
        return gradientBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .net.Map gradient = 1;</code>
     */
    public Builder setGradient(
        int index, net.Map value) {
      if (gradientBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGradientIsMutable();
        gradient_.set(index, value);
        onChanged();
      } else {
        gradientBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .net.Map gradient = 1;</code>
     */
    public Builder setGradient(
        int index, net.Map.Builder builderForValue) {
      if (gradientBuilder_ == null) {
        ensureGradientIsMutable();
        gradient_.set(index, builderForValue.build());
        onChanged();
      } else {
        gradientBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .net.Map gradient = 1;</code>
     */
    public Builder addGradient(net.Map value) {
      if (gradientBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGradientIsMutable();
        gradient_.add(value);
        onChanged();
      } else {
        gradientBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .net.Map gradient = 1;</code>
     */
    public Builder addGradient(
        int index, net.Map value) {
      if (gradientBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGradientIsMutable();
        gradient_.add(index, value);
        onChanged();
      } else {
        gradientBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .net.Map gradient = 1;</code>
     */
    public Builder addGradient(
        net.Map.Builder builderForValue) {
      if (gradientBuilder_ == null) {
        ensureGradientIsMutable();
        gradient_.add(builderForValue.build());
        onChanged();
      } else {
        gradientBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .net.Map gradient = 1;</code>
     */
    public Builder addGradient(
        int index, net.Map.Builder builderForValue) {
      if (gradientBuilder_ == null) {
        ensureGradientIsMutable();
        gradient_.add(index, builderForValue.build());
        onChanged();
      } else {
        gradientBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .net.Map gradient = 1;</code>
     */
    public Builder addAllGradient(
        java.lang.Iterable<? extends net.Map> values) {
      if (gradientBuilder_ == null) {
        ensureGradientIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, gradient_);
        onChanged();
      } else {
        gradientBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .net.Map gradient = 1;</code>
     */
    public Builder clearGradient() {
      if (gradientBuilder_ == null) {
        gradient_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        gradientBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .net.Map gradient = 1;</code>
     */
    public Builder removeGradient(int index) {
      if (gradientBuilder_ == null) {
        ensureGradientIsMutable();
        gradient_.remove(index);
        onChanged();
      } else {
        gradientBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .net.Map gradient = 1;</code>
     */
    public net.Map.Builder getGradientBuilder(
        int index) {
      return getGradientFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .net.Map gradient = 1;</code>
     */
    public net.MapOrBuilder getGradientOrBuilder(
        int index) {
      if (gradientBuilder_ == null) {
        return gradient_.get(index);  } else {
        return gradientBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .net.Map gradient = 1;</code>
     */
    public java.util.List<? extends net.MapOrBuilder> 
         getGradientOrBuilderList() {
      if (gradientBuilder_ != null) {
        return gradientBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(gradient_);
      }
    }
    /**
     * <code>repeated .net.Map gradient = 1;</code>
     */
    public net.Map.Builder addGradientBuilder() {
      return getGradientFieldBuilder().addBuilder(
          net.Map.getDefaultInstance());
    }
    /**
     * <code>repeated .net.Map gradient = 1;</code>
     */
    public net.Map.Builder addGradientBuilder(
        int index) {
      return getGradientFieldBuilder().addBuilder(
          index, net.Map.getDefaultInstance());
    }
    /**
     * <code>repeated .net.Map gradient = 1;</code>
     */
    public java.util.List<net.Map.Builder> 
         getGradientBuilderList() {
      return getGradientFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        net.Map, net.Map.Builder, net.MapOrBuilder> 
        getGradientFieldBuilder() {
      if (gradientBuilder_ == null) {
        gradientBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            net.Map, net.Map.Builder, net.MapOrBuilder>(
                gradient_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        gradient_ = null;
      }
      return gradientBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:net.Gradient)
  }

  // @@protoc_insertion_point(class_scope:net.Gradient)
  private static final net.Gradient DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.Gradient();
  }

  public static net.Gradient getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Gradient>
      PARSER = new com.google.protobuf.AbstractParser<Gradient>() {
    public Gradient parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new Gradient(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<Gradient> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Gradient> getParserForType() {
    return PARSER;
  }

  public net.Gradient getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

