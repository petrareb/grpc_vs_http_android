// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: models/type_model.proto

package grpcDelivery.models;

public final class TypeModelContainer {
  private TypeModelContainer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface TypeModelOrBuilder extends
      // @@protoc_insertion_point(interface_extends:grpcDelivery.models.TypeModel)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>.google.protobuf.Any system = 1;</code>
     * @return Whether the system field is set.
     */
    boolean hasSystem();
    /**
     * <code>.google.protobuf.Any system = 1;</code>
     * @return The system.
     */
    com.google.protobuf.Any getSystem();

    /**
     * <code>repeated .google.protobuf.Any elements = 2;</code>
     */
    java.util.List<com.google.protobuf.Any> 
        getElementsList();
    /**
     * <code>repeated .google.protobuf.Any elements = 2;</code>
     */
    com.google.protobuf.Any getElements(int index);
    /**
     * <code>repeated .google.protobuf.Any elements = 2;</code>
     */
    int getElementsCount();
  }
  /**
   * Protobuf type {@code grpcDelivery.models.TypeModel}
   */
  public  static final class TypeModel extends
      com.google.protobuf.GeneratedMessageLite<
          TypeModel, TypeModel.Builder> implements
      // @@protoc_insertion_point(message_implements:grpcDelivery.models.TypeModel)
      TypeModelOrBuilder {
    private TypeModel() {
      elements_ = emptyProtobufList();
    }
    public static final int SYSTEM_FIELD_NUMBER = 1;
    private com.google.protobuf.Any system_;
    /**
     * <code>.google.protobuf.Any system = 1;</code>
     */
    @java.lang.Override
    public boolean hasSystem() {
      return system_ != null;
    }
    /**
     * <code>.google.protobuf.Any system = 1;</code>
     */
    @java.lang.Override
    public com.google.protobuf.Any getSystem() {
      return system_ == null ? com.google.protobuf.Any.getDefaultInstance() : system_;
    }
    /**
     * <code>.google.protobuf.Any system = 1;</code>
     */
    private void setSystem(com.google.protobuf.Any value) {
      value.getClass();
  system_ = value;
      
      }
    /**
     * <code>.google.protobuf.Any system = 1;</code>
     */
    @java.lang.SuppressWarnings({"ReferenceEquality"})
    private void mergeSystem(com.google.protobuf.Any value) {
      value.getClass();
  if (system_ != null &&
          system_ != com.google.protobuf.Any.getDefaultInstance()) {
        system_ =
          com.google.protobuf.Any.newBuilder(system_).mergeFrom(value).buildPartial();
      } else {
        system_ = value;
      }
      
    }
    /**
     * <code>.google.protobuf.Any system = 1;</code>
     */
    private void clearSystem() {  system_ = null;
      
    }

    public static final int ELEMENTS_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Any> elements_;
    /**
     * <code>repeated .google.protobuf.Any elements = 2;</code>
     */
    @java.lang.Override
    public java.util.List<com.google.protobuf.Any> getElementsList() {
      return elements_;
    }
    /**
     * <code>repeated .google.protobuf.Any elements = 2;</code>
     */
    public java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
        getElementsOrBuilderList() {
      return elements_;
    }
    /**
     * <code>repeated .google.protobuf.Any elements = 2;</code>
     */
    @java.lang.Override
    public int getElementsCount() {
      return elements_.size();
    }
    /**
     * <code>repeated .google.protobuf.Any elements = 2;</code>
     */
    @java.lang.Override
    public com.google.protobuf.Any getElements(int index) {
      return elements_.get(index);
    }
    /**
     * <code>repeated .google.protobuf.Any elements = 2;</code>
     */
    public com.google.protobuf.AnyOrBuilder getElementsOrBuilder(
        int index) {
      return elements_.get(index);
    }
    private void ensureElementsIsMutable() {
      com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Any> tmp = elements_;
      if (!tmp.isModifiable()) {
        elements_ =
            com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
       }
    }

    /**
     * <code>repeated .google.protobuf.Any elements = 2;</code>
     */
    private void setElements(
        int index, com.google.protobuf.Any value) {
      value.getClass();
  ensureElementsIsMutable();
      elements_.set(index, value);
    }
    /**
     * <code>repeated .google.protobuf.Any elements = 2;</code>
     */
    private void addElements(com.google.protobuf.Any value) {
      value.getClass();
  ensureElementsIsMutable();
      elements_.add(value);
    }
    /**
     * <code>repeated .google.protobuf.Any elements = 2;</code>
     */
    private void addElements(
        int index, com.google.protobuf.Any value) {
      value.getClass();
  ensureElementsIsMutable();
      elements_.add(index, value);
    }
    /**
     * <code>repeated .google.protobuf.Any elements = 2;</code>
     */
    private void addAllElements(
        java.lang.Iterable<? extends com.google.protobuf.Any> values) {
      ensureElementsIsMutable();
      com.google.protobuf.AbstractMessageLite.addAll(
          values, elements_);
    }
    /**
     * <code>repeated .google.protobuf.Any elements = 2;</code>
     */
    private void clearElements() {
      elements_ = emptyProtobufList();
    }
    /**
     * <code>repeated .google.protobuf.Any elements = 2;</code>
     */
    private void removeElements(int index) {
      ensureElementsIsMutable();
      elements_.remove(index);
    }

    public static grpcDelivery.models.TypeModelContainer.TypeModel parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static grpcDelivery.models.TypeModelContainer.TypeModel parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static grpcDelivery.models.TypeModelContainer.TypeModel parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static grpcDelivery.models.TypeModelContainer.TypeModel parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static grpcDelivery.models.TypeModelContainer.TypeModel parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static grpcDelivery.models.TypeModelContainer.TypeModel parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static grpcDelivery.models.TypeModelContainer.TypeModel parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static grpcDelivery.models.TypeModelContainer.TypeModel parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static grpcDelivery.models.TypeModelContainer.TypeModel parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static grpcDelivery.models.TypeModelContainer.TypeModel parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static grpcDelivery.models.TypeModelContainer.TypeModel parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static grpcDelivery.models.TypeModelContainer.TypeModel parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(grpcDelivery.models.TypeModelContainer.TypeModel prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code grpcDelivery.models.TypeModel}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          grpcDelivery.models.TypeModelContainer.TypeModel, Builder> implements
        // @@protoc_insertion_point(builder_implements:grpcDelivery.models.TypeModel)
        grpcDelivery.models.TypeModelContainer.TypeModelOrBuilder {
      // Construct using grpcDelivery.models.TypeModelContainer.TypeModel.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>.google.protobuf.Any system = 1;</code>
       */
      @java.lang.Override
      public boolean hasSystem() {
        return instance.hasSystem();
      }
      /**
       * <code>.google.protobuf.Any system = 1;</code>
       */
      @java.lang.Override
      public com.google.protobuf.Any getSystem() {
        return instance.getSystem();
      }
      /**
       * <code>.google.protobuf.Any system = 1;</code>
       */
      public Builder setSystem(com.google.protobuf.Any value) {
        copyOnWrite();
        instance.setSystem(value);
        return this;
        }
      /**
       * <code>.google.protobuf.Any system = 1;</code>
       */
      public Builder setSystem(
          com.google.protobuf.Any.Builder builderForValue) {
        copyOnWrite();
        instance.setSystem(builderForValue.build());
        return this;
      }
      /**
       * <code>.google.protobuf.Any system = 1;</code>
       */
      public Builder mergeSystem(com.google.protobuf.Any value) {
        copyOnWrite();
        instance.mergeSystem(value);
        return this;
      }
      /**
       * <code>.google.protobuf.Any system = 1;</code>
       */
      public Builder clearSystem() {  copyOnWrite();
        instance.clearSystem();
        return this;
      }

      /**
       * <code>repeated .google.protobuf.Any elements = 2;</code>
       */
      @java.lang.Override
      public java.util.List<com.google.protobuf.Any> getElementsList() {
        return java.util.Collections.unmodifiableList(
            instance.getElementsList());
      }
      /**
       * <code>repeated .google.protobuf.Any elements = 2;</code>
       */
      @java.lang.Override
      public int getElementsCount() {
        return instance.getElementsCount();
      }/**
       * <code>repeated .google.protobuf.Any elements = 2;</code>
       */
      @java.lang.Override
      public com.google.protobuf.Any getElements(int index) {
        return instance.getElements(index);
      }
      /**
       * <code>repeated .google.protobuf.Any elements = 2;</code>
       */
      public Builder setElements(
          int index, com.google.protobuf.Any value) {
        copyOnWrite();
        instance.setElements(index, value);
        return this;
      }
      /**
       * <code>repeated .google.protobuf.Any elements = 2;</code>
       */
      public Builder setElements(
          int index, com.google.protobuf.Any.Builder builderForValue) {
        copyOnWrite();
        instance.setElements(index,
            builderForValue.build());
        return this;
      }
      /**
       * <code>repeated .google.protobuf.Any elements = 2;</code>
       */
      public Builder addElements(com.google.protobuf.Any value) {
        copyOnWrite();
        instance.addElements(value);
        return this;
      }
      /**
       * <code>repeated .google.protobuf.Any elements = 2;</code>
       */
      public Builder addElements(
          int index, com.google.protobuf.Any value) {
        copyOnWrite();
        instance.addElements(index, value);
        return this;
      }
      /**
       * <code>repeated .google.protobuf.Any elements = 2;</code>
       */
      public Builder addElements(
          com.google.protobuf.Any.Builder builderForValue) {
        copyOnWrite();
        instance.addElements(builderForValue.build());
        return this;
      }
      /**
       * <code>repeated .google.protobuf.Any elements = 2;</code>
       */
      public Builder addElements(
          int index, com.google.protobuf.Any.Builder builderForValue) {
        copyOnWrite();
        instance.addElements(index,
            builderForValue.build());
        return this;
      }
      /**
       * <code>repeated .google.protobuf.Any elements = 2;</code>
       */
      public Builder addAllElements(
          java.lang.Iterable<? extends com.google.protobuf.Any> values) {
        copyOnWrite();
        instance.addAllElements(values);
        return this;
      }
      /**
       * <code>repeated .google.protobuf.Any elements = 2;</code>
       */
      public Builder clearElements() {
        copyOnWrite();
        instance.clearElements();
        return this;
      }
      /**
       * <code>repeated .google.protobuf.Any elements = 2;</code>
       */
      public Builder removeElements(int index) {
        copyOnWrite();
        instance.removeElements(index);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:grpcDelivery.models.TypeModel)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new grpcDelivery.models.TypeModelContainer.TypeModel();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "system_",
              "elements_",
              com.google.protobuf.Any.class,
            };
            java.lang.String info =
                "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002\u001b" +
                "";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<grpcDelivery.models.TypeModelContainer.TypeModel> parser = PARSER;
          if (parser == null) {
            synchronized (grpcDelivery.models.TypeModelContainer.TypeModel.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<grpcDelivery.models.TypeModelContainer.TypeModel>(
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


    // @@protoc_insertion_point(class_scope:grpcDelivery.models.TypeModel)
    private static final grpcDelivery.models.TypeModelContainer.TypeModel DEFAULT_INSTANCE;
    static {
      TypeModel defaultInstance = new TypeModel();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        TypeModel.class, defaultInstance);
    }

    public static grpcDelivery.models.TypeModelContainer.TypeModel getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<TypeModel> PARSER;

    public static com.google.protobuf.Parser<TypeModel> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
