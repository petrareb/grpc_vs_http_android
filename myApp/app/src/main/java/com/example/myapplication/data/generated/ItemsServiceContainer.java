// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: models/items_service.proto

package com.example.myapplication.data.generated;

public final class ItemsServiceContainer {
  private ItemsServiceContainer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ItemsServiceRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.example.myapplication.data.generated.ItemsServiceRequest)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>string project_id = 1;</code>
     * @return The projectId.
     */
    String getProjectId();
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
    String getCodename();
    /**
     * <code>string codename = 2;</code>
     * @return The bytes for codename.
     */
    com.google.protobuf.ByteString
        getCodenameBytes();
  }
  /**
   * Protobuf type {@code com.example.myapplication.data.generated.ItemsServiceRequest}
   */
  public  static final class ItemsServiceRequest extends
      com.google.protobuf.GeneratedMessageLite<
          ItemsServiceRequest, ItemsServiceRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:com.example.myapplication.data.generated.ItemsServiceRequest)
      ItemsServiceRequestOrBuilder {
    private ItemsServiceRequest() {
      projectId_ = "";
      codename_ = "";
    }
    public static final int PROJECT_ID_FIELD_NUMBER = 1;
    private String projectId_;
    /**
     * <code>string project_id = 1;</code>
     * @return The projectId.
     */
    @Override
    public String getProjectId() {
      return projectId_;
    }
    /**
     * <code>string project_id = 1;</code>
     * @return The bytes for projectId.
     */
    @Override
    public com.google.protobuf.ByteString
        getProjectIdBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(projectId_);
    }
    /**
     * <code>string project_id = 1;</code>
     * @param value The projectId to set.
     */
    private void setProjectId(
        String value) {
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
    private String codename_;
    /**
     * <code>string codename = 2;</code>
     * @return The codename.
     */
    @Override
    public String getCodename() {
      return codename_;
    }
    /**
     * <code>string codename = 2;</code>
     * @return The bytes for codename.
     */
    @Override
    public com.google.protobuf.ByteString
        getCodenameBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(codename_);
    }
    /**
     * <code>string codename = 2;</code>
     * @param value The codename to set.
     */
    private void setCodename(
        String value) {
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

    public static ItemsServiceRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ItemsServiceRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ItemsServiceRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ItemsServiceRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ItemsServiceRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ItemsServiceRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ItemsServiceRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ItemsServiceRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ItemsServiceRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ItemsServiceRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ItemsServiceRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ItemsServiceRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(ItemsServiceRequest prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code com.example.myapplication.data.generated.ItemsServiceRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ItemsServiceRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:com.example.myapplication.data.generated.ItemsServiceRequest)
        ItemsServiceRequestOrBuilder {
      // Construct using com.example.myapplication.data.generated.ItemsServiceContainer.ItemsServiceRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>string project_id = 1;</code>
       * @return The projectId.
       */
      @Override
      public String getProjectId() {
        return instance.getProjectId();
      }
      /**
       * <code>string project_id = 1;</code>
       * @return The bytes for projectId.
       */
      @Override
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
          String value) {
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
      @Override
      public String getCodename() {
        return instance.getCodename();
      }
      /**
       * <code>string codename = 2;</code>
       * @return The bytes for codename.
       */
      @Override
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
          String value) {
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

      // @@protoc_insertion_point(builder_scope:com.example.myapplication.data.generated.ItemsServiceRequest)
    }
    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ItemsServiceRequest();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            Object[] objects = new Object[] {
              "projectId_",
              "codename_",
            };
            String info =
                "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
                "";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<ItemsServiceRequest> parser = PARSER;
          if (parser == null) {
            synchronized (ItemsServiceRequest.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<ItemsServiceRequest>(
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


    // @@protoc_insertion_point(class_scope:com.example.myapplication.data.generated.ItemsServiceRequest)
    private static final ItemsServiceRequest DEFAULT_INSTANCE;
    static {
      ItemsServiceRequest defaultInstance = new ItemsServiceRequest();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        ItemsServiceRequest.class, defaultInstance);
    }

    public static ItemsServiceRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ItemsServiceRequest> PARSER;

    public static com.google.protobuf.Parser<ItemsServiceRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface PokusResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.example.myapplication.data.generated.PokusResponse)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>string project_id = 1;</code>
     * @return The projectId.
     */
    String getProjectId();
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
    String getCodename();
    /**
     * <code>string codename = 2;</code>
     * @return The bytes for codename.
     */
    com.google.protobuf.ByteString
        getCodenameBytes();
  }
  /**
   * Protobuf type {@code com.example.myapplication.data.generated.PokusResponse}
   */
  public  static final class PokusResponse extends
      com.google.protobuf.GeneratedMessageLite<
          PokusResponse, PokusResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:com.example.myapplication.data.generated.PokusResponse)
      PokusResponseOrBuilder {
    private PokusResponse() {
      projectId_ = "";
      codename_ = "";
    }
    public static final int PROJECT_ID_FIELD_NUMBER = 1;
    private String projectId_;
    /**
     * <code>string project_id = 1;</code>
     * @return The projectId.
     */
    @Override
    public String getProjectId() {
      return projectId_;
    }
    /**
     * <code>string project_id = 1;</code>
     * @return The bytes for projectId.
     */
    @Override
    public com.google.protobuf.ByteString
        getProjectIdBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(projectId_);
    }
    /**
     * <code>string project_id = 1;</code>
     * @param value The projectId to set.
     */
    private void setProjectId(
        String value) {
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
    private String codename_;
    /**
     * <code>string codename = 2;</code>
     * @return The codename.
     */
    @Override
    public String getCodename() {
      return codename_;
    }
    /**
     * <code>string codename = 2;</code>
     * @return The bytes for codename.
     */
    @Override
    public com.google.protobuf.ByteString
        getCodenameBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(codename_);
    }
    /**
     * <code>string codename = 2;</code>
     * @param value The codename to set.
     */
    private void setCodename(
        String value) {
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

    public static PokusResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static PokusResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static PokusResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static PokusResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static PokusResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static PokusResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static PokusResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static PokusResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static PokusResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static PokusResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static PokusResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static PokusResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(PokusResponse prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code com.example.myapplication.data.generated.PokusResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          PokusResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:com.example.myapplication.data.generated.PokusResponse)
        PokusResponseOrBuilder {
      // Construct using com.example.myapplication.data.generated.ItemsServiceContainer.PokusResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>string project_id = 1;</code>
       * @return The projectId.
       */
      @Override
      public String getProjectId() {
        return instance.getProjectId();
      }
      /**
       * <code>string project_id = 1;</code>
       * @return The bytes for projectId.
       */
      @Override
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
          String value) {
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
      @Override
      public String getCodename() {
        return instance.getCodename();
      }
      /**
       * <code>string codename = 2;</code>
       * @return The bytes for codename.
       */
      @Override
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
          String value) {
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

      // @@protoc_insertion_point(builder_scope:com.example.myapplication.data.generated.PokusResponse)
    }
    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new PokusResponse();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            Object[] objects = new Object[] {
              "projectId_",
              "codename_",
            };
            String info =
                "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
                "";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<PokusResponse> parser = PARSER;
          if (parser == null) {
            synchronized (PokusResponse.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<PokusResponse>(
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


    // @@protoc_insertion_point(class_scope:com.example.myapplication.data.generated.PokusResponse)
    private static final PokusResponse DEFAULT_INSTANCE;
    static {
      PokusResponse defaultInstance = new PokusResponse();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        PokusResponse.class, defaultInstance);
    }

    public static PokusResponse getDefaultInstance() {
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