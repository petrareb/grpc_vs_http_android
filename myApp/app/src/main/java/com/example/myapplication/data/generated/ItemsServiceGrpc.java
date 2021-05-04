package com.example.myapplication.data.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: models/items_service.proto")
public final class ItemsServiceGrpc {

  private ItemsServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.myapplication.data.generated.ItemsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ItemsServiceContainer.ItemsServiceRequest,
      ResponseModelContainer.ResponseModel> getGetItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetItem",
      requestType = ItemsServiceContainer.ItemsServiceRequest.class,
      responseType = ResponseModelContainer.ResponseModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ItemsServiceContainer.ItemsServiceRequest,
      ResponseModelContainer.ResponseModel> getGetItemMethod() {
    io.grpc.MethodDescriptor<ItemsServiceContainer.ItemsServiceRequest, ResponseModelContainer.ResponseModel> getGetItemMethod;
    if ((getGetItemMethod = ItemsServiceGrpc.getGetItemMethod) == null) {
      synchronized (ItemsServiceGrpc.class) {
        if ((getGetItemMethod = ItemsServiceGrpc.getGetItemMethod) == null) {
          ItemsServiceGrpc.getGetItemMethod = getGetItemMethod =
              io.grpc.MethodDescriptor.<ItemsServiceContainer.ItemsServiceRequest, ResponseModelContainer.ResponseModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ItemsServiceContainer.ItemsServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ResponseModelContainer.ResponseModel.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ItemsServiceContainer.ItemsServiceRequest,
      ResponseModelContainer.ResponseModel> getGetItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetItems",
      requestType = ItemsServiceContainer.ItemsServiceRequest.class,
      responseType = ResponseModelContainer.ResponseModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ItemsServiceContainer.ItemsServiceRequest,
      ResponseModelContainer.ResponseModel> getGetItemsMethod() {
    io.grpc.MethodDescriptor<ItemsServiceContainer.ItemsServiceRequest, ResponseModelContainer.ResponseModel> getGetItemsMethod;
    if ((getGetItemsMethod = ItemsServiceGrpc.getGetItemsMethod) == null) {
      synchronized (ItemsServiceGrpc.class) {
        if ((getGetItemsMethod = ItemsServiceGrpc.getGetItemsMethod) == null) {
          ItemsServiceGrpc.getGetItemsMethod = getGetItemsMethod =
              io.grpc.MethodDescriptor.<ItemsServiceContainer.ItemsServiceRequest, ResponseModelContainer.ResponseModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ItemsServiceContainer.ItemsServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ResponseModelContainer.ResponseModel.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ItemsServiceContainer.ItemsServiceRequest,
      ResponseModelContainer.ResponseModel> getGetItemsFeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetItemsFeed",
      requestType = ItemsServiceContainer.ItemsServiceRequest.class,
      responseType = ResponseModelContainer.ResponseModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ItemsServiceContainer.ItemsServiceRequest,
      ResponseModelContainer.ResponseModel> getGetItemsFeedMethod() {
    io.grpc.MethodDescriptor<ItemsServiceContainer.ItemsServiceRequest, ResponseModelContainer.ResponseModel> getGetItemsFeedMethod;
    if ((getGetItemsFeedMethod = ItemsServiceGrpc.getGetItemsFeedMethod) == null) {
      synchronized (ItemsServiceGrpc.class) {
        if ((getGetItemsFeedMethod = ItemsServiceGrpc.getGetItemsFeedMethod) == null) {
          ItemsServiceGrpc.getGetItemsFeedMethod = getGetItemsFeedMethod =
              io.grpc.MethodDescriptor.<ItemsServiceContainer.ItemsServiceRequest, ResponseModelContainer.ResponseModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetItemsFeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ItemsServiceContainer.ItemsServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ResponseModelContainer.ResponseModel.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetItemsFeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ItemsServiceContainer.ItemsServiceRequest,
      ItemsServiceContainer.PokusResponse> getPokusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pokus",
      requestType = ItemsServiceContainer.ItemsServiceRequest.class,
      responseType = ItemsServiceContainer.PokusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ItemsServiceContainer.ItemsServiceRequest,
      ItemsServiceContainer.PokusResponse> getPokusMethod() {
    io.grpc.MethodDescriptor<ItemsServiceContainer.ItemsServiceRequest, ItemsServiceContainer.PokusResponse> getPokusMethod;
    if ((getPokusMethod = ItemsServiceGrpc.getPokusMethod) == null) {
      synchronized (ItemsServiceGrpc.class) {
        if ((getPokusMethod = ItemsServiceGrpc.getPokusMethod) == null) {
          ItemsServiceGrpc.getPokusMethod = getPokusMethod =
              io.grpc.MethodDescriptor.<ItemsServiceContainer.ItemsServiceRequest, ItemsServiceContainer.PokusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pokus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ItemsServiceContainer.ItemsServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ItemsServiceContainer.PokusResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getPokusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ItemsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ItemsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ItemsServiceStub>() {
        @Override
        public ItemsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ItemsServiceStub(channel, callOptions);
        }
      };
    return ItemsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ItemsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ItemsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ItemsServiceBlockingStub>() {
        @Override
        public ItemsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ItemsServiceBlockingStub(channel, callOptions);
        }
      };
    return ItemsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ItemsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ItemsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ItemsServiceFutureStub>() {
        @Override
        public ItemsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ItemsServiceFutureStub(channel, callOptions);
        }
      };
    return ItemsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ItemsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getItem(ItemsServiceContainer.ItemsServiceRequest request,
                        io.grpc.stub.StreamObserver<ResponseModelContainer.ResponseModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetItemMethod(), responseObserver);
    }

    /**
     */
    public void getItems(ItemsServiceContainer.ItemsServiceRequest request,
                         io.grpc.stub.StreamObserver<ResponseModelContainer.ResponseModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetItemsMethod(), responseObserver);
    }

    /**
     */
    public void getItemsFeed(ItemsServiceContainer.ItemsServiceRequest request,
                             io.grpc.stub.StreamObserver<ResponseModelContainer.ResponseModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetItemsFeedMethod(), responseObserver);
    }

    /**
     */
    public void pokus(ItemsServiceContainer.ItemsServiceRequest request,
                      io.grpc.stub.StreamObserver<ItemsServiceContainer.PokusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPokusMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetItemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ItemsServiceContainer.ItemsServiceRequest,
                ResponseModelContainer.ResponseModel>(
                  this, METHODID_GET_ITEM)))
          .addMethod(
            getGetItemsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ItemsServiceContainer.ItemsServiceRequest,
                ResponseModelContainer.ResponseModel>(
                  this, METHODID_GET_ITEMS)))
          .addMethod(
            getGetItemsFeedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ItemsServiceContainer.ItemsServiceRequest,
                ResponseModelContainer.ResponseModel>(
                  this, METHODID_GET_ITEMS_FEED)))
          .addMethod(
            getPokusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ItemsServiceContainer.ItemsServiceRequest,
                ItemsServiceContainer.PokusResponse>(
                  this, METHODID_POKUS)))
          .build();
    }
  }

  /**
   */
  public static final class ItemsServiceStub extends io.grpc.stub.AbstractAsyncStub<ItemsServiceStub> {
    private ItemsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ItemsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ItemsServiceStub(channel, callOptions);
    }

    /**
     */
    public void getItem(ItemsServiceContainer.ItemsServiceRequest request,
                        io.grpc.stub.StreamObserver<ResponseModelContainer.ResponseModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getItems(ItemsServiceContainer.ItemsServiceRequest request,
                         io.grpc.stub.StreamObserver<ResponseModelContainer.ResponseModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getItemsFeed(ItemsServiceContainer.ItemsServiceRequest request,
                             io.grpc.stub.StreamObserver<ResponseModelContainer.ResponseModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetItemsFeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pokus(ItemsServiceContainer.ItemsServiceRequest request,
                      io.grpc.stub.StreamObserver<ItemsServiceContainer.PokusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPokusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ItemsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ItemsServiceBlockingStub> {
    private ItemsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ItemsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ItemsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ResponseModelContainer.ResponseModel getItem(ItemsServiceContainer.ItemsServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public ResponseModelContainer.ResponseModel getItems(ItemsServiceContainer.ItemsServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetItemsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ResponseModelContainer.ResponseModel getItemsFeed(ItemsServiceContainer.ItemsServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetItemsFeedMethod(), getCallOptions(), request);
    }

    /**
     */
    public ItemsServiceContainer.PokusResponse pokus(ItemsServiceContainer.ItemsServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPokusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ItemsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ItemsServiceFutureStub> {
    private ItemsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ItemsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ItemsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ResponseModelContainer.ResponseModel> getItem(
        ItemsServiceContainer.ItemsServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ResponseModelContainer.ResponseModel> getItems(
        ItemsServiceContainer.ItemsServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetItemsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ResponseModelContainer.ResponseModel> getItemsFeed(
        ItemsServiceContainer.ItemsServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetItemsFeedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ItemsServiceContainer.PokusResponse> pokus(
        ItemsServiceContainer.ItemsServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPokusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ITEM = 0;
  private static final int METHODID_GET_ITEMS = 1;
  private static final int METHODID_GET_ITEMS_FEED = 2;
  private static final int METHODID_POKUS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ItemsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ItemsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ITEM:
          serviceImpl.getItem((ItemsServiceContainer.ItemsServiceRequest) request,
              (io.grpc.stub.StreamObserver<ResponseModelContainer.ResponseModel>) responseObserver);
          break;
        case METHODID_GET_ITEMS:
          serviceImpl.getItems((ItemsServiceContainer.ItemsServiceRequest) request,
              (io.grpc.stub.StreamObserver<ResponseModelContainer.ResponseModel>) responseObserver);
          break;
        case METHODID_GET_ITEMS_FEED:
          serviceImpl.getItemsFeed((ItemsServiceContainer.ItemsServiceRequest) request,
              (io.grpc.stub.StreamObserver<ResponseModelContainer.ResponseModel>) responseObserver);
          break;
        case METHODID_POKUS:
          serviceImpl.pokus((ItemsServiceContainer.ItemsServiceRequest) request,
              (io.grpc.stub.StreamObserver<ItemsServiceContainer.PokusResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ItemsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetItemMethod())
              .addMethod(getGetItemsMethod())
              .addMethod(getGetItemsFeedMethod())
              .addMethod(getPokusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
