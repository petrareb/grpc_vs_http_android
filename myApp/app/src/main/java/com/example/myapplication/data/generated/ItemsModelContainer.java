// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: models/items_model.proto

package com.example.myapplication.data.generated;

public final class ItemsModelContainer {
  private ItemsModelContainer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ItemsModelOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.example.myapplication.data.generated.ItemsModel)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>repeated .com.example.myapplication.data.generated.ItemProperties items = 1;</code>
     */
    java.util.List<ItemModelContainer.ItemProperties>
        getItemsList();
    /**
     * <code>repeated .com.example.myapplication.data.generated.ItemProperties items = 1;</code>
     */
    ItemModelContainer.ItemProperties getItems(int index);
    /**
     * <code>repeated .com.example.myapplication.data.generated.ItemProperties items = 1;</code>
     */
    int getItemsCount();

    /**
     * <code>.com.example.myapplication.data.generated.ItemSystem modular_content = 2;</code>
     * @return Whether the modularContent field is set.
     */
    boolean hasModularContent();
    /**
     * <code>.com.example.myapplication.data.generated.ItemSystem modular_content = 2;</code>
     * @return The modularContent.
     */
    ItemModelContainer.ItemSystem getModularContent();

    /**
     * <code>.com.example.myapplication.data.generated.PaginationModel pagination = 3;</code>
     * @return Whether the pagination field is set.
     */
    boolean hasPagination();
    /**
     * <code>.com.example.myapplication.data.generated.PaginationModel pagination = 3;</code>
     * @return The pagination.
     */
    PaginationModelContainer.PaginationModel getPagination();
  }
  /**
   * Protobuf type {@code com.example.myapplication.data.generated.ItemsModel}
   */
  public  static final class ItemsModel extends
      com.google.protobuf.GeneratedMessageLite<
          ItemsModel, ItemsModel.Builder> implements
      // @@protoc_insertion_point(message_implements:com.example.myapplication.data.generated.ItemsModel)
      ItemsModelOrBuilder {
    private ItemsModel() {
      items_ = emptyProtobufList();
    }
    public static final int ITEMS_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.ProtobufList<ItemModelContainer.ItemProperties> items_;
    /**
     * <code>repeated .com.example.myapplication.data.generated.ItemProperties items = 1;</code>
     */
    @Override
    public java.util.List<ItemModelContainer.ItemProperties> getItemsList() {
      return items_;
    }
    /**
     * <code>repeated .com.example.myapplication.data.generated.ItemProperties items = 1;</code>
     */
    public java.util.List<? extends ItemModelContainer.ItemPropertiesOrBuilder>
        getItemsOrBuilderList() {
      return items_;
    }
    /**
     * <code>repeated .com.example.myapplication.data.generated.ItemProperties items = 1;</code>
     */
    @Override
    public int getItemsCount() {
      return items_.size();
    }
    /**
     * <code>repeated .com.example.myapplication.data.generated.ItemProperties items = 1;</code>
     */
    @Override
    public ItemModelContainer.ItemProperties getItems(int index) {
      return items_.get(index);
    }
    /**
     * <code>repeated .com.example.myapplication.data.generated.ItemProperties items = 1;</code>
     */
    public ItemModelContainer.ItemPropertiesOrBuilder getItemsOrBuilder(
        int index) {
      return items_.get(index);
    }
    private void ensureItemsIsMutable() {
      com.google.protobuf.Internal.ProtobufList<ItemModelContainer.ItemProperties> tmp = items_;
      if (!tmp.isModifiable()) {
        items_ =
            com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
       }
    }

    /**
     * <code>repeated .com.example.myapplication.data.generated.ItemProperties items = 1;</code>
     */
    private void setItems(
        int index, ItemModelContainer.ItemProperties value) {
      value.getClass();
  ensureItemsIsMutable();
      items_.set(index, value);
    }
    /**
     * <code>repeated .com.example.myapplication.data.generated.ItemProperties items = 1;</code>
     */
    private void addItems(ItemModelContainer.ItemProperties value) {
      value.getClass();
  ensureItemsIsMutable();
      items_.add(value);
    }
    /**
     * <code>repeated .com.example.myapplication.data.generated.ItemProperties items = 1;</code>
     */
    private void addItems(
        int index, ItemModelContainer.ItemProperties value) {
      value.getClass();
  ensureItemsIsMutable();
      items_.add(index, value);
    }
    /**
     * <code>repeated .com.example.myapplication.data.generated.ItemProperties items = 1;</code>
     */
    private void addAllItems(
        Iterable<? extends ItemModelContainer.ItemProperties> values) {
      ensureItemsIsMutable();
      com.google.protobuf.AbstractMessageLite.addAll(
          values, items_);
    }
    /**
     * <code>repeated .com.example.myapplication.data.generated.ItemProperties items = 1;</code>
     */
    private void clearItems() {
      items_ = emptyProtobufList();
    }
    /**
     * <code>repeated .com.example.myapplication.data.generated.ItemProperties items = 1;</code>
     */
    private void removeItems(int index) {
      ensureItemsIsMutable();
      items_.remove(index);
    }

    public static final int MODULAR_CONTENT_FIELD_NUMBER = 2;
    private ItemModelContainer.ItemSystem modularContent_;
    /**
     * <code>.com.example.myapplication.data.generated.ItemSystem modular_content = 2;</code>
     */
    @Override
    public boolean hasModularContent() {
      return modularContent_ != null;
    }
    /**
     * <code>.com.example.myapplication.data.generated.ItemSystem modular_content = 2;</code>
     */
    @Override
    public ItemModelContainer.ItemSystem getModularContent() {
      return modularContent_ == null ? ItemModelContainer.ItemSystem.getDefaultInstance() : modularContent_;
    }
    /**
     * <code>.com.example.myapplication.data.generated.ItemSystem modular_content = 2;</code>
     */
    private void setModularContent(ItemModelContainer.ItemSystem value) {
      value.getClass();
  modularContent_ = value;
      
      }
    /**
     * <code>.com.example.myapplication.data.generated.ItemSystem modular_content = 2;</code>
     */
    @SuppressWarnings({"ReferenceEquality"})
    private void mergeModularContent(ItemModelContainer.ItemSystem value) {
      value.getClass();
  if (modularContent_ != null &&
          modularContent_ != ItemModelContainer.ItemSystem.getDefaultInstance()) {
        modularContent_ =
          ItemModelContainer.ItemSystem.newBuilder(modularContent_).mergeFrom(value).buildPartial();
      } else {
        modularContent_ = value;
      }
      
    }
    /**
     * <code>.com.example.myapplication.data.generated.ItemSystem modular_content = 2;</code>
     */
    private void clearModularContent() {  modularContent_ = null;
      
    }

    public static final int PAGINATION_FIELD_NUMBER = 3;
    private PaginationModelContainer.PaginationModel pagination_;
    /**
     * <code>.com.example.myapplication.data.generated.PaginationModel pagination = 3;</code>
     */
    @Override
    public boolean hasPagination() {
      return pagination_ != null;
    }
    /**
     * <code>.com.example.myapplication.data.generated.PaginationModel pagination = 3;</code>
     */
    @Override
    public PaginationModelContainer.PaginationModel getPagination() {
      return pagination_ == null ? PaginationModelContainer.PaginationModel.getDefaultInstance() : pagination_;
    }
    /**
     * <code>.com.example.myapplication.data.generated.PaginationModel pagination = 3;</code>
     */
    private void setPagination(PaginationModelContainer.PaginationModel value) {
      value.getClass();
  pagination_ = value;
      
      }
    /**
     * <code>.com.example.myapplication.data.generated.PaginationModel pagination = 3;</code>
     */
    @SuppressWarnings({"ReferenceEquality"})
    private void mergePagination(PaginationModelContainer.PaginationModel value) {
      value.getClass();
  if (pagination_ != null &&
          pagination_ != PaginationModelContainer.PaginationModel.getDefaultInstance()) {
        pagination_ =
          PaginationModelContainer.PaginationModel.newBuilder(pagination_).mergeFrom(value).buildPartial();
      } else {
        pagination_ = value;
      }
      
    }
    /**
     * <code>.com.example.myapplication.data.generated.PaginationModel pagination = 3;</code>
     */
    private void clearPagination() {  pagination_ = null;
      
    }

    public static ItemsModel parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ItemsModel parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ItemsModel parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ItemsModel parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ItemsModel parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ItemsModel parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ItemsModel parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ItemsModel parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ItemsModel parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ItemsModel parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ItemsModel parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ItemsModel parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(ItemsModel prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code com.example.myapplication.data.generated.ItemsModel}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ItemsModel, Builder> implements
        // @@protoc_insertion_point(builder_implements:com.example.myapplication.data.generated.ItemsModel)
        ItemsModelOrBuilder {
      // Construct using com.example.myapplication.data.generated.ItemsModelContainer.ItemsModel.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>repeated .com.example.myapplication.data.generated.ItemProperties items = 1;</code>
       */
      @Override
      public java.util.List<ItemModelContainer.ItemProperties> getItemsList() {
        return java.util.Collections.unmodifiableList(
            instance.getItemsList());
      }
      /**
       * <code>repeated .com.example.myapplication.data.generated.ItemProperties items = 1;</code>
       */
      @Override
      public int getItemsCount() {
        return instance.getItemsCount();
      }/**
       * <code>repeated .com.example.myapplication.data.generated.ItemProperties items = 1;</code>
       */
      @Override
      public ItemModelContainer.ItemProperties getItems(int index) {
        return instance.getItems(index);
      }
      /**
       * <code>repeated .com.example.myapplication.data.generated.ItemProperties items = 1;</code>
       */
      public Builder setItems(
          int index, ItemModelContainer.ItemProperties value) {
        copyOnWrite();
        instance.setItems(index, value);
        return this;
      }
      /**
       * <code>repeated .com.example.myapplication.data.generated.ItemProperties items = 1;</code>
       */
      public Builder setItems(
          int index, ItemModelContainer.ItemProperties.Builder builderForValue) {
        copyOnWrite();
        instance.setItems(index,
            builderForValue.build());
        return this;
      }
      /**
       * <code>repeated .com.example.myapplication.data.generated.ItemProperties items = 1;</code>
       */
      public Builder addItems(ItemModelContainer.ItemProperties value) {
        copyOnWrite();
        instance.addItems(value);
        return this;
      }
      /**
       * <code>repeated .com.example.myapplication.data.generated.ItemProperties items = 1;</code>
       */
      public Builder addItems(
          int index, ItemModelContainer.ItemProperties value) {
        copyOnWrite();
        instance.addItems(index, value);
        return this;
      }
      /**
       * <code>repeated .com.example.myapplication.data.generated.ItemProperties items = 1;</code>
       */
      public Builder addItems(
          ItemModelContainer.ItemProperties.Builder builderForValue) {
        copyOnWrite();
        instance.addItems(builderForValue.build());
        return this;
      }
      /**
       * <code>repeated .com.example.myapplication.data.generated.ItemProperties items = 1;</code>
       */
      public Builder addItems(
          int index, ItemModelContainer.ItemProperties.Builder builderForValue) {
        copyOnWrite();
        instance.addItems(index,
            builderForValue.build());
        return this;
      }
      /**
       * <code>repeated .com.example.myapplication.data.generated.ItemProperties items = 1;</code>
       */
      public Builder addAllItems(
          Iterable<? extends ItemModelContainer.ItemProperties> values) {
        copyOnWrite();
        instance.addAllItems(values);
        return this;
      }
      /**
       * <code>repeated .com.example.myapplication.data.generated.ItemProperties items = 1;</code>
       */
      public Builder clearItems() {
        copyOnWrite();
        instance.clearItems();
        return this;
      }
      /**
       * <code>repeated .com.example.myapplication.data.generated.ItemProperties items = 1;</code>
       */
      public Builder removeItems(int index) {
        copyOnWrite();
        instance.removeItems(index);
        return this;
      }

      /**
       * <code>.com.example.myapplication.data.generated.ItemSystem modular_content = 2;</code>
       */
      @Override
      public boolean hasModularContent() {
        return instance.hasModularContent();
      }
      /**
       * <code>.com.example.myapplication.data.generated.ItemSystem modular_content = 2;</code>
       */
      @Override
      public ItemModelContainer.ItemSystem getModularContent() {
        return instance.getModularContent();
      }
      /**
       * <code>.com.example.myapplication.data.generated.ItemSystem modular_content = 2;</code>
       */
      public Builder setModularContent(ItemModelContainer.ItemSystem value) {
        copyOnWrite();
        instance.setModularContent(value);
        return this;
        }
      /**
       * <code>.com.example.myapplication.data.generated.ItemSystem modular_content = 2;</code>
       */
      public Builder setModularContent(
          ItemModelContainer.ItemSystem.Builder builderForValue) {
        copyOnWrite();
        instance.setModularContent(builderForValue.build());
        return this;
      }
      /**
       * <code>.com.example.myapplication.data.generated.ItemSystem modular_content = 2;</code>
       */
      public Builder mergeModularContent(ItemModelContainer.ItemSystem value) {
        copyOnWrite();
        instance.mergeModularContent(value);
        return this;
      }
      /**
       * <code>.com.example.myapplication.data.generated.ItemSystem modular_content = 2;</code>
       */
      public Builder clearModularContent() {  copyOnWrite();
        instance.clearModularContent();
        return this;
      }

      /**
       * <code>.com.example.myapplication.data.generated.PaginationModel pagination = 3;</code>
       */
      @Override
      public boolean hasPagination() {
        return instance.hasPagination();
      }
      /**
       * <code>.com.example.myapplication.data.generated.PaginationModel pagination = 3;</code>
       */
      @Override
      public PaginationModelContainer.PaginationModel getPagination() {
        return instance.getPagination();
      }
      /**
       * <code>.com.example.myapplication.data.generated.PaginationModel pagination = 3;</code>
       */
      public Builder setPagination(PaginationModelContainer.PaginationModel value) {
        copyOnWrite();
        instance.setPagination(value);
        return this;
        }
      /**
       * <code>.com.example.myapplication.data.generated.PaginationModel pagination = 3;</code>
       */
      public Builder setPagination(
          PaginationModelContainer.PaginationModel.Builder builderForValue) {
        copyOnWrite();
        instance.setPagination(builderForValue.build());
        return this;
      }
      /**
       * <code>.com.example.myapplication.data.generated.PaginationModel pagination = 3;</code>
       */
      public Builder mergePagination(PaginationModelContainer.PaginationModel value) {
        copyOnWrite();
        instance.mergePagination(value);
        return this;
      }
      /**
       * <code>.com.example.myapplication.data.generated.PaginationModel pagination = 3;</code>
       */
      public Builder clearPagination() {  copyOnWrite();
        instance.clearPagination();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.example.myapplication.data.generated.ItemsModel)
    }
    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ItemsModel();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            Object[] objects = new Object[] {
              "items_",
              ItemModelContainer.ItemProperties.class,
              "modularContent_",
              "pagination_",
            };
            String info =
                "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\t" +
                "\u0003\t";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<ItemsModel> parser = PARSER;
          if (parser == null) {
            synchronized (ItemsModel.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<ItemsModel>(
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


    // @@protoc_insertion_point(class_scope:com.example.myapplication.data.generated.ItemsModel)
    private static final ItemsModel DEFAULT_INSTANCE;
    static {
      ItemsModel defaultInstance = new ItemsModel();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        ItemsModel.class, defaultInstance);
    }

    public static ItemsModel getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ItemsModel> PARSER;

    public static com.google.protobuf.Parser<ItemsModel> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}