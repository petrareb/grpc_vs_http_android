// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: models/element_model.proto

package grpcDelivery.models;

public final class ElementModelContainer {
  private ElementModelContainer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ElementModelOrBuilder extends
      // @@protoc_insertion_point(interface_extends:grpcDelivery.models.ElementModel)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>.google.protobuf.Any element = 1;</code>
     * @return Whether the element field is set.
     */
    boolean hasElement();
    /**
     * <code>.google.protobuf.Any element = 1;</code>
     * @return The element.
     */
    com.google.protobuf.Any getElement();
  }
  /**
   * Protobuf type {@code grpcDelivery.models.ElementModel}
   */
  public  static final class ElementModel extends
      com.google.protobuf.GeneratedMessageLite<
          ElementModel, ElementModel.Builder> implements
      // @@protoc_insertion_point(message_implements:grpcDelivery.models.ElementModel)
      ElementModelOrBuilder {
    private ElementModel() {
    }
    public static final int ELEMENT_FIELD_NUMBER = 1;
    private com.google.protobuf.Any element_;
    /**
     * <code>.google.protobuf.Any element = 1;</code>
     */
    @java.lang.Override
    public boolean hasElement() {
      return element_ != null;
    }
    /**
     * <code>.google.protobuf.Any element = 1;</code>
     */
    @java.lang.Override
    public com.google.protobuf.Any getElement() {
      return element_ == null ? com.google.protobuf.Any.getDefaultInstance() : element_;
    }
    /**
     * <code>.google.protobuf.Any element = 1;</code>
     */
    private void setElement(com.google.protobuf.Any value) {
      value.getClass();
  element_ = value;
      
      }
    /**
     * <code>.google.protobuf.Any element = 1;</code>
     */
    @java.lang.SuppressWarnings({"ReferenceEquality"})
    private void mergeElement(com.google.protobuf.Any value) {
      value.getClass();
  if (element_ != null &&
          element_ != com.google.protobuf.Any.getDefaultInstance()) {
        element_ =
          com.google.protobuf.Any.newBuilder(element_).mergeFrom(value).buildPartial();
      } else {
        element_ = value;
      }
      
    }
    /**
     * <code>.google.protobuf.Any element = 1;</code>
     */
    private void clearElement() {  element_ = null;
      
    }

    public static grpcDelivery.models.ElementModelContainer.ElementModel parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static grpcDelivery.models.ElementModelContainer.ElementModel parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static grpcDelivery.models.ElementModelContainer.ElementModel parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static grpcDelivery.models.ElementModelContainer.ElementModel parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static grpcDelivery.models.ElementModelContainer.ElementModel parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static grpcDelivery.models.ElementModelContainer.ElementModel parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static grpcDelivery.models.ElementModelContainer.ElementModel parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static grpcDelivery.models.ElementModelContainer.ElementModel parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static grpcDelivery.models.ElementModelContainer.ElementModel parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static grpcDelivery.models.ElementModelContainer.ElementModel parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static grpcDelivery.models.ElementModelContainer.ElementModel parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static grpcDelivery.models.ElementModelContainer.ElementModel parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(grpcDelivery.models.ElementModelContainer.ElementModel prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code grpcDelivery.models.ElementModel}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          grpcDelivery.models.ElementModelContainer.ElementModel, Builder> implements
        // @@protoc_insertion_point(builder_implements:grpcDelivery.models.ElementModel)
        grpcDelivery.models.ElementModelContainer.ElementModelOrBuilder {
      // Construct using grpcDelivery.models.ElementModelContainer.ElementModel.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>.google.protobuf.Any element = 1;</code>
       */
      @java.lang.Override
      public boolean hasElement() {
        return instance.hasElement();
      }
      /**
       * <code>.google.protobuf.Any element = 1;</code>
       */
      @java.lang.Override
      public com.google.protobuf.Any getElement() {
        return instance.getElement();
      }
      /**
       * <code>.google.protobuf.Any element = 1;</code>
       */
      public Builder setElement(com.google.protobuf.Any value) {
        copyOnWrite();
        instance.setElement(value);
        return this;
        }
      /**
       * <code>.google.protobuf.Any element = 1;</code>
       */
      public Builder setElement(
          com.google.protobuf.Any.Builder builderForValue) {
        copyOnWrite();
        instance.setElement(builderForValue.build());
        return this;
      }
      /**
       * <code>.google.protobuf.Any element = 1;</code>
       */
      public Builder mergeElement(com.google.protobuf.Any value) {
        copyOnWrite();
        instance.mergeElement(value);
        return this;
      }
      /**
       * <code>.google.protobuf.Any element = 1;</code>
       */
      public Builder clearElement() {  copyOnWrite();
        instance.clearElement();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:grpcDelivery.models.ElementModel)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new grpcDelivery.models.ElementModelContainer.ElementModel();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "element_",
            };
            java.lang.String info =
                "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<grpcDelivery.models.ElementModelContainer.ElementModel> parser = PARSER;
          if (parser == null) {
            synchronized (grpcDelivery.models.ElementModelContainer.ElementModel.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<grpcDelivery.models.ElementModelContainer.ElementModel>(
                        DEFAULT_INSTANCE);
                PARSER = parser;
              }
            }
          }
          return parser;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return (byte) 1;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:grpcDelivery.models.ElementModel)
    private static final grpcDelivery.models.ElementModelContainer.ElementModel DEFAULT_INSTANCE;
    static {
      ElementModel defaultInstance = new ElementModel();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        ElementModel.class, defaultInstance);
    }

    public static grpcDelivery.models.ElementModelContainer.ElementModel getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ElementModel> PARSER;

    public static com.google.protobuf.Parser<ElementModel> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
