// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: models/items_service.proto

package grpcDelivery.models;

public final class ItemsServiceContainer {
  private ItemsServiceContainer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ItemsServiceRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:grpcDelivery.models.ItemsServiceRequest)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>string project_id = 1;</code>
     * @return The projectId.
     */
    java.lang.String getProjectId();
    /**
     * <code>string project_id = 1;</code>
     * @return The bytes for projectId.
     */
    com.google.protobuf.ByteString
        getProjectIdBytes();

    /**
     * <code>string codename = 2;</code>
     * @return The codename.
     */
    java.lang.String getCodename();
    /**
     * <code>string codename = 2;</code>
     * @return The bytes for codename.
     */
    com.google.protobuf.ByteString
        getCodenameBytes();
  }
  /**
   * Protobuf type {@code grpcDelivery.models.ItemsServiceRequest}
   */
  public  static final class ItemsServiceRequest extends
      com.google.protobuf.GeneratedMessageLite<
          ItemsServiceRequest, ItemsServiceRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:grpcDelivery.models.ItemsServiceRequest)
      ItemsServiceRequestOrBuilder {
    private ItemsServiceRequest() {
      projectId_ = "";
      codename_ = "";
    }
    public static final int PROJECT_ID_FIELD_NUMBER = 1;
    private java.lang.String projectId_;
    /**
     * <code>string project_id = 1;</code>
     * @return The projectId.
     */
    @java.lang.Override
    public java.lang.String getProjectId() {
      return projectId_;
    }
    /**
     * <code>string project_id = 1;</code>
     * @return The bytes for projectId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getProjectIdBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(projectId_);
    }
    /**
     * <code>string project_id = 1;</code>
     * @param value The projectId to set.
     */
    private void setProjectId(
        java.lang.String value) {
      value.getClass();
  
      projectId_ = value;
    }
    /**
     * <code>string project_id = 1;</code>
     */
    private void clearProjectId() {
      
      projectId_ = getDefaultInstance().getProjectId();
    }
    /**
     * <code>string project_id = 1;</code>
     * @param value The bytes for projectId to set.
     */
    private void setProjectIdBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      projectId_ = value.toStringUtf8();
      
    }

    public static final int CODENAME_FIELD_NUMBER = 2;
    private java.lang.String codename_;
    /**
     * <code>string codename = 2;</code>
     * @return The codename.
     */
    @java.lang.Override
    public java.lang.String getCodename() {
      return codename_;
    }
    /**
     * <code>string codename = 2;</code>
     * @return The bytes for codename.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCodenameBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(codename_);
    }
    /**
     * <code>string codename = 2;</code>
     * @param value The codename to set.
     */
    private void setCodename(
        java.lang.String value) {
      value.getClass();
  
      codename_ = value;
    }
    /**
     * <code>string codename = 2;</code>
     */
    private void clearCodename() {
      
      codename_ = getDefaultInstance().getCodename();
    }
    /**
     * <code>string codename = 2;</code>
     * @param value The bytes for codename to set.
     */
    private void setCodenameBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      codename_ = value.toStringUtf8();
      
    }

    public static grpcDelivery.models.ItemsServiceContainer.ItemsServiceRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static grpcDelivery.models.ItemsServiceContainer.ItemsServiceRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static grpcDelivery.models.ItemsServiceContainer.ItemsServiceRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static grpcDelivery.models.ItemsServiceContainer.ItemsServiceRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static grpcDelivery.models.ItemsServiceContainer.ItemsServiceRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static grpcDelivery.models.ItemsServiceContainer.ItemsServiceRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static grpcDelivery.models.ItemsServiceContainer.ItemsServiceRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static grpcDelivery.models.ItemsServiceContainer.ItemsServiceRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static grpcDelivery.models.ItemsServiceContainer.ItemsServiceRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static grpcDelivery.models.ItemsServiceContainer.ItemsServiceRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static grpcDelivery.models.ItemsServiceContainer.ItemsServiceRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static grpcDelivery.models.ItemsServiceContainer.ItemsServiceRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(grpcDelivery.models.ItemsServiceContainer.ItemsServiceRequest prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code grpcDelivery.models.ItemsServiceRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          grpcDelivery.models.ItemsServiceContainer.ItemsServiceRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:grpcDelivery.models.ItemsServiceRequest)
        grpcDelivery.models.ItemsServiceContainer.ItemsServiceRequestOrBuilder {
      // Construct using grpcDelivery.models.ItemsServiceContainer.ItemsServiceRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>string project_id = 1;</code>
       * @return The projectId.
       */
      @java.lang.Override
      public java.lang.String getProjectId() {
        return instance.getProjectId();
      }
      /**
       * <code>string project_id = 1;</code>
       * @return The bytes for projectId.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getProjectIdBytes() {
        return instance.getProjectIdBytes();
      }
      /**
       * <code>string project_id = 1;</code>
       * @param value The projectId to set.
       * @return This builder for chaining.
       */
      public Builder setProjectId(
          java.lang.String value) {
        copyOnWrite();
        instance.setProjectId(value);
        return this;
      }
      /**
       * <code>string project_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearProjectId() {
        copyOnWrite();
        instance.clearProjectId();
        return this;
      }
      /**
       * <code>string project_id = 1;</code>
       * @param value The bytes for projectId to set.
       * @return This builder for chaining.
       */
      public Builder setProjectIdBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setProjectIdBytes(value);
        return this;
      }

      /**
       * <code>string codename = 2;</code>
       * @return The codename.
       */
      @java.lang.Override
      public java.lang.String getCodename() {
        return instance.getCodename();
      }
      /**
       * <code>string codename = 2;</code>
       * @return The bytes for codename.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getCodenameBytes() {
        return instance.getCodenameBytes();
      }
      /**
       * <code>string codename = 2;</code>
       * @param value The codename to set.
       * @return This builder for chaining.
       */
      public Builder setCodename(
          java.lang.String value) {
        copyOnWrite();
        instance.setCodename(value);
        return this;
      }
      /**
       * <code>string codename = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCodename() {
        copyOnWrite();
        instance.clearCodename();
        return this;
      }
      /**
       * <code>string codename = 2;</code>
       * @param value The bytes for codename to set.
       * @return This builder for chaining.
       */
      public Builder setCodenameBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setCodenameBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:grpcDelivery.models.ItemsServiceRequest)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new grpcDelivery.models.ItemsServiceContainer.ItemsServiceRequest();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "projectId_",
              "codename_",
            };
            java.lang.String info =
                "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
                "";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<grpcDelivery.models.ItemsServiceContainer.ItemsServiceRequest> parser = PARSER;
          if (parser == null) {
            synchronized (grpcDelivery.models.ItemsServiceContainer.ItemsServiceRequest.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<grpcDelivery.models.ItemsServiceContainer.ItemsServiceRequest>(
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


    // @@protoc_insertion_point(class_scope:grpcDelivery.models.ItemsServiceRequest)
    private static final grpcDelivery.models.ItemsServiceContainer.ItemsServiceRequest DEFAULT_INSTANCE;
    static {
      ItemsServiceRequest defaultInstance = new ItemsServiceRequest();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        ItemsServiceRequest.class, defaultInstance);
    }

    public static grpcDelivery.models.ItemsServiceContainer.ItemsServiceRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ItemsServiceRequest> PARSER;

    public static com.google.protobuf.Parser<ItemsServiceRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface PokusResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:grpcDelivery.models.PokusResponse)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>string project_id = 1;</code>
     * @return The projectId.
     */
    java.lang.String getProjectId();
    /**
     * <code>string project_id = 1;</code>
     * @return The bytes for projectId.
     */
    com.google.protobuf.ByteString
        getProjectIdBytes();

    /**
     * <code>string codename = 2;</code>
     * @return The codename.
     */
    java.lang.String getCodename();
    /**
     * <code>string codename = 2;</code>
     * @return The bytes for codename.
     */
    com.google.protobuf.ByteString
        getCodenameBytes();
  }
  /**
   * Protobuf type {@code grpcDelivery.models.PokusResponse}
   */
  public  static final class PokusResponse extends
      com.google.protobuf.GeneratedMessageLite<
          PokusResponse, PokusResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:grpcDelivery.models.PokusResponse)
      PokusResponseOrBuilder {
    private PokusResponse() {
      projectId_ = "";
      codename_ = "";
    }
    public static final int PROJECT_ID_FIELD_NUMBER = 1;
    private java.lang.String projectId_;
    /**
     * <code>string project_id = 1;</code>
     * @return The projectId.
     */
    @java.lang.Override
    public java.lang.String getProjectId() {
      return projectId_;
    }
    /**
     * <code>string project_id = 1;</code>
     * @return The bytes for projectId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getProjectIdBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(projectId_);
    }
    /**
     * <code>string project_id = 1;</code>
     * @param value The projectId to set.
     */
    private void setProjectId(
        java.lang.String value) {
      value.getClass();
  
      projectId_ = value;
    }
    /**
     * <code>string project_id = 1;</code>
     */
    private void clearProjectId() {
      
      projectId_ = getDefaultInstance().getProjectId();
    }
    /**
     * <code>string project_id = 1;</code>
     * @param value The bytes for projectId to set.
     */
    private void setProjectIdBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      projectId_ = value.toStringUtf8();
      
    }

    public static final int CODENAME_FIELD_NUMBER = 2;
    private java.lang.String codename_;
    /**
     * <code>string codename = 2;</code>
     * @return The codename.
     */
    @java.lang.Override
    public java.lang.String getCodename() {
      return codename_;
    }
    /**
     * <code>string codename = 2;</code>
     * @return The bytes for codename.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCodenameBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(codename_);
    }
    /**
     * <code>string codename = 2;</code>
     * @param value The codename to set.
     */
    private void setCodename(
        java.lang.String value) {
      value.getClass();
  
      codename_ = value;
    }
    /**
     * <code>string codename = 2;</code>
     */
    private void clearCodename() {
      
      codename_ = getDefaultInstance().getCodename();
    }
    /**
     * <code>string codename = 2;</code>
     * @param value The bytes for codename to set.
     */
    private void setCodenameBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      codename_ = value.toStringUtf8();
      
    }

    public static grpcDelivery.models.ItemsServiceContainer.PokusResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static grpcDelivery.models.ItemsServiceContainer.PokusResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static grpcDelivery.models.ItemsServiceContainer.PokusResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static grpcDelivery.models.ItemsServiceContainer.PokusResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static grpcDelivery.models.ItemsServiceContainer.PokusResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static grpcDelivery.models.ItemsServiceContainer.PokusResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static grpcDelivery.models.ItemsServiceContainer.PokusResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static grpcDelivery.models.ItemsServiceContainer.PokusResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static grpcDelivery.models.ItemsServiceContainer.PokusResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static grpcDelivery.models.ItemsServiceContainer.PokusResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static grpcDelivery.models.ItemsServiceContainer.PokusResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static grpcDelivery.models.ItemsServiceContainer.PokusResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(grpcDelivery.models.ItemsServiceContainer.PokusResponse prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code grpcDelivery.models.PokusResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          grpcDelivery.models.ItemsServiceContainer.PokusResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:grpcDelivery.models.PokusResponse)
        grpcDelivery.models.ItemsServiceContainer.PokusResponseOrBuilder {
      // Construct using grpcDelivery.models.ItemsServiceContainer.PokusResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>string project_id = 1;</code>
       * @return The projectId.
       */
      @java.lang.Override
      public java.lang.String getProjectId() {
        return instance.getProjectId();
      }
      /**
       * <code>string project_id = 1;</code>
       * @return The bytes for projectId.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getProjectIdBytes() {
        return instance.getProjectIdBytes();
      }
      /**
       * <code>string project_id = 1;</code>
       * @param value The projectId to set.
       * @return This builder for chaining.
       */
      public Builder setProjectId(
          java.lang.String value) {
        copyOnWrite();
        instance.setProjectId(value);
        return this;
      }
      /**
       * <code>string project_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearProjectId() {
        copyOnWrite();
        instance.clearProjectId();
        return this;
      }
      /**
       * <code>string project_id = 1;</code>
       * @param value The bytes for projectId to set.
       * @return This builder for chaining.
       */
      public Builder setProjectIdBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setProjectIdBytes(value);
        return this;
      }

      /**
       * <code>string codename = 2;</code>
       * @return The codename.
       */
      @java.lang.Override
      public java.lang.String getCodename() {
        return instance.getCodename();
      }
      /**
       * <code>string codename = 2;</code>
       * @return The bytes for codename.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getCodenameBytes() {
        return instance.getCodenameBytes();
      }
      /**
       * <code>string codename = 2;</code>
       * @param value The codename to set.
       * @return This builder for chaining.
       */
      public Builder setCodename(
          java.lang.String value) {
        copyOnWrite();
        instance.setCodename(value);
        return this;
      }
      /**
       * <code>string codename = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCodename() {
        copyOnWrite();
        instance.clearCodename();
        return this;
      }
      /**
       * <code>string codename = 2;</code>
       * @param value The bytes for codename to set.
       * @return This builder for chaining.
       */
      public Builder setCodenameBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setCodenameBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:grpcDelivery.models.PokusResponse)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new grpcDelivery.models.ItemsServiceContainer.PokusResponse();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "projectId_",
              "codename_",
            };
            java.lang.String info =
                "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
                "";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<grpcDelivery.models.ItemsServiceContainer.PokusResponse> parser = PARSER;
          if (parser == null) {
            synchronized (grpcDelivery.models.ItemsServiceContainer.PokusResponse.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<grpcDelivery.models.ItemsServiceContainer.PokusResponse>(
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


    // @@protoc_insertion_point(class_scope:grpcDelivery.models.PokusResponse)
    private static final grpcDelivery.models.ItemsServiceContainer.PokusResponse DEFAULT_INSTANCE;
    static {
      PokusResponse defaultInstance = new PokusResponse();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        PokusResponse.class, defaultInstance);
    }

    public static grpcDelivery.models.ItemsServiceContainer.PokusResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<PokusResponse> PARSER;

    public static com.google.protobuf.Parser<PokusResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}