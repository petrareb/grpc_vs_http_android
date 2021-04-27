package grpcDelivery.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: services/items_service.proto")
public final class ItemsServiceGrpc {

  private ItemsServiceGrpc() {}

  public static final String SERVICE_NAME = "grpcDelivery.services.ItemsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest,
      grpcDelivery.models.ResponseModelContainer.ResponseModel> getGetItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetItem",
      requestType = grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest.class,
      responseType = grpcDelivery.models.ResponseModelContainer.ResponseModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest,
      grpcDelivery.models.ResponseModelContainer.ResponseModel> getGetItemMethod() {
    io.grpc.MethodDescriptor<grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest, grpcDelivery.models.ResponseModelContainer.ResponseModel> getGetItemMethod;
    if ((getGetItemMethod = ItemsServiceGrpc.getGetItemMethod) == null) {
      synchronized (ItemsServiceGrpc.class) {
        if ((getGetItemMethod = ItemsServiceGrpc.getGetItemMethod) == null) {
          ItemsServiceGrpc.getGetItemMethod = getGetItemMethod =
              io.grpc.MethodDescriptor.<grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest, grpcDelivery.models.ResponseModelContainer.ResponseModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  grpcDelivery.models.ResponseModelContainer.ResponseModel.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest,
      grpcDelivery.models.ResponseModelContainer.ResponseModel> getGetItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetItems",
      requestType = grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest.class,
      responseType = grpcDelivery.models.ResponseModelContainer.ResponseModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest,
      grpcDelivery.models.ResponseModelContainer.ResponseModel> getGetItemsMethod() {
    io.grpc.MethodDescriptor<grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest, grpcDelivery.models.ResponseModelContainer.ResponseModel> getGetItemsMethod;
    if ((getGetItemsMethod = ItemsServiceGrpc.getGetItemsMethod) == null) {
      synchronized (ItemsServiceGrpc.class) {
        if ((getGetItemsMethod = ItemsServiceGrpc.getGetItemsMethod) == null) {
          ItemsServiceGrpc.getGetItemsMethod = getGetItemsMethod =
              io.grpc.MethodDescriptor.<grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest, grpcDelivery.models.ResponseModelContainer.ResponseModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  grpcDelivery.models.ResponseModelContainer.ResponseModel.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest,
      grpcDelivery.models.ResponseModelContainer.ResponseModel> getGetItemsFeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetItemsFeed",
      requestType = grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest.class,
      responseType = grpcDelivery.models.ResponseModelContainer.ResponseModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest,
      grpcDelivery.models.ResponseModelContainer.ResponseModel> getGetItemsFeedMethod() {
    io.grpc.MethodDescriptor<grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest, grpcDelivery.models.ResponseModelContainer.ResponseModel> getGetItemsFeedMethod;
    if ((getGetItemsFeedMethod = ItemsServiceGrpc.getGetItemsFeedMethod) == null) {
      synchronized (ItemsServiceGrpc.class) {
        if ((getGetItemsFeedMethod = ItemsServiceGrpc.getGetItemsFeedMethod) == null) {
          ItemsServiceGrpc.getGetItemsFeedMethod = getGetItemsFeedMethod =
              io.grpc.MethodDescriptor.<grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest, grpcDelivery.models.ResponseModelContainer.ResponseModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetItemsFeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  grpcDelivery.models.ResponseModelContainer.ResponseModel.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetItemsFeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest,
      grpcDelivery.services.ItemsServiceContainer.PokusResponse> getPokusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pokus",
      requestType = grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest.class,
      responseType = grpcDelivery.services.ItemsServiceContainer.PokusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest,
      grpcDelivery.services.ItemsServiceContainer.PokusResponse> getPokusMethod() {
    io.grpc.MethodDescriptor<grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest, grpcDelivery.services.ItemsServiceContainer.PokusResponse> getPokusMethod;
    if ((getPokusMethod = ItemsServiceGrpc.getPokusMethod) == null) {
      synchronized (ItemsServiceGrpc.class) {
        if ((getPokusMethod = ItemsServiceGrpc.getPokusMethod) == null) {
          ItemsServiceGrpc.getPokusMethod = getPokusMethod =
              io.grpc.MethodDescriptor.<grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest, grpcDelivery.services.ItemsServiceContainer.PokusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pokus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  grpcDelivery.services.ItemsServiceContainer.PokusResponse.getDefaultInstance()))
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
        @java.lang.Override
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
        @java.lang.Override
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
        @java.lang.Override
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
    public void getItem(grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest request,
        io.grpc.stub.StreamObserver<grpcDelivery.models.ResponseModelContainer.ResponseModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetItemMethod(), responseObserver);
    }

    /**
     */
    public void getItems(grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest request,
        io.grpc.stub.StreamObserver<grpcDelivery.models.ResponseModelContainer.ResponseModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetItemsMethod(), responseObserver);
    }

    /**
     */
    public void getItemsFeed(grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest request,
        io.grpc.stub.StreamObserver<grpcDelivery.models.ResponseModelContainer.ResponseModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetItemsFeedMethod(), responseObserver);
    }

    /**
     */
    public void pokus(grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest request,
        io.grpc.stub.StreamObserver<grpcDelivery.services.ItemsServiceContainer.PokusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPokusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetItemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest,
                grpcDelivery.models.ResponseModelContainer.ResponseModel>(
                  this, METHODID_GET_ITEM)))
          .addMethod(
            getGetItemsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest,
                grpcDelivery.models.ResponseModelContainer.ResponseModel>(
                  this, METHODID_GET_ITEMS)))
          .addMethod(
            getGetItemsFeedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest,
                grpcDelivery.models.ResponseModelContainer.ResponseModel>(
                  this, METHODID_GET_ITEMS_FEED)))
          .addMethod(
            getPokusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest,
                grpcDelivery.services.ItemsServiceContainer.PokusResponse>(
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

    @java.lang.Override
    protected ItemsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ItemsServiceStub(channel, callOptions);
    }

    /**
     */
    public void getItem(grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest request,
        io.grpc.stub.StreamObserver<grpcDelivery.models.ResponseModelContainer.ResponseModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getItems(grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest request,
        io.grpc.stub.StreamObserver<grpcDelivery.models.ResponseModelContainer.ResponseModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getItemsFeed(grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest request,
        io.grpc.stub.StreamObserver<grpcDelivery.models.ResponseModelContainer.ResponseModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetItemsFeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pokus(grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest request,
        io.grpc.stub.StreamObserver<grpcDelivery.services.ItemsServiceContainer.PokusResponse> responseObserver) {
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

    @java.lang.Override
    protected ItemsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ItemsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpcDelivery.models.ResponseModelContainer.ResponseModel getItem(grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpcDelivery.models.ResponseModelContainer.ResponseModel getItems(grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetItemsMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpcDelivery.models.ResponseModelContainer.ResponseModel getItemsFeed(grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetItemsFeedMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpcDelivery.services.ItemsServiceContainer.PokusResponse pokus(grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest request) {
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

    @java.lang.Override
    protected ItemsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ItemsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpcDelivery.models.ResponseModelContainer.ResponseModel> getItem(
        grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpcDelivery.models.ResponseModelContainer.ResponseModel> getItems(
        grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetItemsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpcDelivery.models.ResponseModelContainer.ResponseModel> getItemsFeed(
        grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetItemsFeedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpcDelivery.services.ItemsServiceContainer.PokusResponse> pokus(
        grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest request) {
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

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ITEM:
          serviceImpl.getItem((grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest) request,
              (io.grpc.stub.StreamObserver<grpcDelivery.models.ResponseModelContainer.ResponseModel>) responseObserver);
          break;
        case METHODID_GET_ITEMS:
          serviceImpl.getItems((grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest) request,
              (io.grpc.stub.StreamObserver<grpcDelivery.models.ResponseModelContainer.ResponseModel>) responseObserver);
          break;
        case METHODID_GET_ITEMS_FEED:
          serviceImpl.getItemsFeed((grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest) request,
              (io.grpc.stub.StreamObserver<grpcDelivery.models.ResponseModelContainer.ResponseModel>) responseObserver);
          break;
        case METHODID_POKUS:
          serviceImpl.pokus((grpcDelivery.services.ItemsServiceContainer.ItemsServiceRequest) request,
              (io.grpc.stub.StreamObserver<grpcDelivery.services.ItemsServiceContainer.PokusResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
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
