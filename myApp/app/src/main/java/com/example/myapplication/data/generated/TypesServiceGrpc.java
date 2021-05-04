package com.example.myapplication.data.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: models/types_service.proto")
public final class TypesServiceGrpc {

  private TypesServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.myapplication.data.generated.TypesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<TypesServiceContainer.TypesServiceRequest,
      ResponseModelContainer.ResponseModel> getGetElementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetElement",
      requestType = TypesServiceContainer.TypesServiceRequest.class,
      responseType = ResponseModelContainer.ResponseModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TypesServiceContainer.TypesServiceRequest,
      ResponseModelContainer.ResponseModel> getGetElementMethod() {
    io.grpc.MethodDescriptor<TypesServiceContainer.TypesServiceRequest, ResponseModelContainer.ResponseModel> getGetElementMethod;
    if ((getGetElementMethod = TypesServiceGrpc.getGetElementMethod) == null) {
      synchronized (TypesServiceGrpc.class) {
        if ((getGetElementMethod = TypesServiceGrpc.getGetElementMethod) == null) {
          TypesServiceGrpc.getGetElementMethod = getGetElementMethod =
              io.grpc.MethodDescriptor.<TypesServiceContainer.TypesServiceRequest, ResponseModelContainer.ResponseModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetElement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  TypesServiceContainer.TypesServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ResponseModelContainer.ResponseModel.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetElementMethod;
  }

  private static volatile io.grpc.MethodDescriptor<TypesServiceContainer.TypesServiceRequest,
      ResponseModelContainer.ResponseModel> getGetTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetType",
      requestType = TypesServiceContainer.TypesServiceRequest.class,
      responseType = ResponseModelContainer.ResponseModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TypesServiceContainer.TypesServiceRequest,
      ResponseModelContainer.ResponseModel> getGetTypeMethod() {
    io.grpc.MethodDescriptor<TypesServiceContainer.TypesServiceRequest, ResponseModelContainer.ResponseModel> getGetTypeMethod;
    if ((getGetTypeMethod = TypesServiceGrpc.getGetTypeMethod) == null) {
      synchronized (TypesServiceGrpc.class) {
        if ((getGetTypeMethod = TypesServiceGrpc.getGetTypeMethod) == null) {
          TypesServiceGrpc.getGetTypeMethod = getGetTypeMethod =
              io.grpc.MethodDescriptor.<TypesServiceContainer.TypesServiceRequest, ResponseModelContainer.ResponseModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  TypesServiceContainer.TypesServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ResponseModelContainer.ResponseModel.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<TypesServiceContainer.TypesServiceRequest,
      ResponseModelContainer.ResponseModel> getGetTypesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTypes",
      requestType = TypesServiceContainer.TypesServiceRequest.class,
      responseType = ResponseModelContainer.ResponseModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TypesServiceContainer.TypesServiceRequest,
      ResponseModelContainer.ResponseModel> getGetTypesMethod() {
    io.grpc.MethodDescriptor<TypesServiceContainer.TypesServiceRequest, ResponseModelContainer.ResponseModel> getGetTypesMethod;
    if ((getGetTypesMethod = TypesServiceGrpc.getGetTypesMethod) == null) {
      synchronized (TypesServiceGrpc.class) {
        if ((getGetTypesMethod = TypesServiceGrpc.getGetTypesMethod) == null) {
          TypesServiceGrpc.getGetTypesMethod = getGetTypesMethod =
              io.grpc.MethodDescriptor.<TypesServiceContainer.TypesServiceRequest, ResponseModelContainer.ResponseModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  TypesServiceContainer.TypesServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ResponseModelContainer.ResponseModel.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetTypesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TypesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TypesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TypesServiceStub>() {
        @Override
        public TypesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TypesServiceStub(channel, callOptions);
        }
      };
    return TypesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TypesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TypesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TypesServiceBlockingStub>() {
        @Override
        public TypesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TypesServiceBlockingStub(channel, callOptions);
        }
      };
    return TypesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TypesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TypesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TypesServiceFutureStub>() {
        @Override
        public TypesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TypesServiceFutureStub(channel, callOptions);
        }
      };
    return TypesServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TypesServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getElement(TypesServiceContainer.TypesServiceRequest request,
                           io.grpc.stub.StreamObserver<ResponseModelContainer.ResponseModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetElementMethod(), responseObserver);
    }

    /**
     */
    public void getType(TypesServiceContainer.TypesServiceRequest request,
                        io.grpc.stub.StreamObserver<ResponseModelContainer.ResponseModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTypeMethod(), responseObserver);
    }

    /**
     */
    public void getTypes(TypesServiceContainer.TypesServiceRequest request,
                         io.grpc.stub.StreamObserver<ResponseModelContainer.ResponseModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTypesMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetElementMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                TypesServiceContainer.TypesServiceRequest,
                ResponseModelContainer.ResponseModel>(
                  this, METHODID_GET_ELEMENT)))
          .addMethod(
            getGetTypeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                TypesServiceContainer.TypesServiceRequest,
                ResponseModelContainer.ResponseModel>(
                  this, METHODID_GET_TYPE)))
          .addMethod(
            getGetTypesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                TypesServiceContainer.TypesServiceRequest,
                ResponseModelContainer.ResponseModel>(
                  this, METHODID_GET_TYPES)))
          .build();
    }
  }

  /**
   */
  public static final class TypesServiceStub extends io.grpc.stub.AbstractAsyncStub<TypesServiceStub> {
    private TypesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TypesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TypesServiceStub(channel, callOptions);
    }

    /**
     */
    public void getElement(TypesServiceContainer.TypesServiceRequest request,
                           io.grpc.stub.StreamObserver<ResponseModelContainer.ResponseModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetElementMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getType(TypesServiceContainer.TypesServiceRequest request,
                        io.grpc.stub.StreamObserver<ResponseModelContainer.ResponseModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTypes(TypesServiceContainer.TypesServiceRequest request,
                         io.grpc.stub.StreamObserver<ResponseModelContainer.ResponseModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTypesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TypesServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TypesServiceBlockingStub> {
    private TypesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TypesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TypesServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ResponseModelContainer.ResponseModel getElement(TypesServiceContainer.TypesServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetElementMethod(), getCallOptions(), request);
    }

    /**
     */
    public ResponseModelContainer.ResponseModel getType(TypesServiceContainer.TypesServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public ResponseModelContainer.ResponseModel getTypes(TypesServiceContainer.TypesServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTypesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TypesServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TypesServiceFutureStub> {
    private TypesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TypesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TypesServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ResponseModelContainer.ResponseModel> getElement(
        TypesServiceContainer.TypesServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetElementMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ResponseModelContainer.ResponseModel> getType(
        TypesServiceContainer.TypesServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTypeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ResponseModelContainer.ResponseModel> getTypes(
        TypesServiceContainer.TypesServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTypesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ELEMENT = 0;
  private static final int METHODID_GET_TYPE = 1;
  private static final int METHODID_GET_TYPES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TypesServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TypesServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ELEMENT:
          serviceImpl.getElement((TypesServiceContainer.TypesServiceRequest) request,
              (io.grpc.stub.StreamObserver<ResponseModelContainer.ResponseModel>) responseObserver);
          break;
        case METHODID_GET_TYPE:
          serviceImpl.getType((TypesServiceContainer.TypesServiceRequest) request,
              (io.grpc.stub.StreamObserver<ResponseModelContainer.ResponseModel>) responseObserver);
          break;
        case METHODID_GET_TYPES:
          serviceImpl.getTypes((TypesServiceContainer.TypesServiceRequest) request,
              (io.grpc.stub.StreamObserver<ResponseModelContainer.ResponseModel>) responseObserver);
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
      synchronized (TypesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetElementMethod())
              .addMethod(getGetTypeMethod())
              .addMethod(getGetTypesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
