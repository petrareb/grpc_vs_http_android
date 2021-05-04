package com.example.myapplication.data.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: models/taxonomies_service.proto")
public final class TaxonomiesServiceGrpc {

  private TaxonomiesServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.myapplication.data.generated.TaxonomiesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<TaxonomiesServiceContainer.TaxonomiesServiceRequest,
      ResponseModelContainer.ResponseModel> getGetTaxonomyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTaxonomy",
      requestType = TaxonomiesServiceContainer.TaxonomiesServiceRequest.class,
      responseType = ResponseModelContainer.ResponseModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TaxonomiesServiceContainer.TaxonomiesServiceRequest,
      ResponseModelContainer.ResponseModel> getGetTaxonomyMethod() {
    io.grpc.MethodDescriptor<TaxonomiesServiceContainer.TaxonomiesServiceRequest, ResponseModelContainer.ResponseModel> getGetTaxonomyMethod;
    if ((getGetTaxonomyMethod = TaxonomiesServiceGrpc.getGetTaxonomyMethod) == null) {
      synchronized (TaxonomiesServiceGrpc.class) {
        if ((getGetTaxonomyMethod = TaxonomiesServiceGrpc.getGetTaxonomyMethod) == null) {
          TaxonomiesServiceGrpc.getGetTaxonomyMethod = getGetTaxonomyMethod =
              io.grpc.MethodDescriptor.<TaxonomiesServiceContainer.TaxonomiesServiceRequest, ResponseModelContainer.ResponseModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTaxonomy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  TaxonomiesServiceContainer.TaxonomiesServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ResponseModelContainer.ResponseModel.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetTaxonomyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<TaxonomiesServiceContainer.TaxonomiesServiceRequest,
      ResponseModelContainer.ResponseModel> getGetTaxonomiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTaxonomies",
      requestType = TaxonomiesServiceContainer.TaxonomiesServiceRequest.class,
      responseType = ResponseModelContainer.ResponseModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TaxonomiesServiceContainer.TaxonomiesServiceRequest,
      ResponseModelContainer.ResponseModel> getGetTaxonomiesMethod() {
    io.grpc.MethodDescriptor<TaxonomiesServiceContainer.TaxonomiesServiceRequest, ResponseModelContainer.ResponseModel> getGetTaxonomiesMethod;
    if ((getGetTaxonomiesMethod = TaxonomiesServiceGrpc.getGetTaxonomiesMethod) == null) {
      synchronized (TaxonomiesServiceGrpc.class) {
        if ((getGetTaxonomiesMethod = TaxonomiesServiceGrpc.getGetTaxonomiesMethod) == null) {
          TaxonomiesServiceGrpc.getGetTaxonomiesMethod = getGetTaxonomiesMethod =
              io.grpc.MethodDescriptor.<TaxonomiesServiceContainer.TaxonomiesServiceRequest, ResponseModelContainer.ResponseModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTaxonomies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  TaxonomiesServiceContainer.TaxonomiesServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ResponseModelContainer.ResponseModel.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetTaxonomiesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TaxonomiesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TaxonomiesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TaxonomiesServiceStub>() {
        @Override
        public TaxonomiesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TaxonomiesServiceStub(channel, callOptions);
        }
      };
    return TaxonomiesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TaxonomiesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TaxonomiesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TaxonomiesServiceBlockingStub>() {
        @Override
        public TaxonomiesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TaxonomiesServiceBlockingStub(channel, callOptions);
        }
      };
    return TaxonomiesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TaxonomiesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TaxonomiesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TaxonomiesServiceFutureStub>() {
        @Override
        public TaxonomiesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TaxonomiesServiceFutureStub(channel, callOptions);
        }
      };
    return TaxonomiesServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TaxonomiesServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getTaxonomy(TaxonomiesServiceContainer.TaxonomiesServiceRequest request,
                            io.grpc.stub.StreamObserver<ResponseModelContainer.ResponseModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTaxonomyMethod(), responseObserver);
    }

    /**
     */
    public void getTaxonomies(TaxonomiesServiceContainer.TaxonomiesServiceRequest request,
                              io.grpc.stub.StreamObserver<ResponseModelContainer.ResponseModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTaxonomiesMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTaxonomyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                TaxonomiesServiceContainer.TaxonomiesServiceRequest,
                ResponseModelContainer.ResponseModel>(
                  this, METHODID_GET_TAXONOMY)))
          .addMethod(
            getGetTaxonomiesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                TaxonomiesServiceContainer.TaxonomiesServiceRequest,
                ResponseModelContainer.ResponseModel>(
                  this, METHODID_GET_TAXONOMIES)))
          .build();
    }
  }

  /**
   */
  public static final class TaxonomiesServiceStub extends io.grpc.stub.AbstractAsyncStub<TaxonomiesServiceStub> {
    private TaxonomiesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TaxonomiesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TaxonomiesServiceStub(channel, callOptions);
    }

    /**
     */
    public void getTaxonomy(TaxonomiesServiceContainer.TaxonomiesServiceRequest request,
                            io.grpc.stub.StreamObserver<ResponseModelContainer.ResponseModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTaxonomyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTaxonomies(TaxonomiesServiceContainer.TaxonomiesServiceRequest request,
                              io.grpc.stub.StreamObserver<ResponseModelContainer.ResponseModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTaxonomiesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TaxonomiesServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TaxonomiesServiceBlockingStub> {
    private TaxonomiesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TaxonomiesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TaxonomiesServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ResponseModelContainer.ResponseModel getTaxonomy(TaxonomiesServiceContainer.TaxonomiesServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTaxonomyMethod(), getCallOptions(), request);
    }

    /**
     */
    public ResponseModelContainer.ResponseModel getTaxonomies(TaxonomiesServiceContainer.TaxonomiesServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTaxonomiesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TaxonomiesServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TaxonomiesServiceFutureStub> {
    private TaxonomiesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TaxonomiesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TaxonomiesServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ResponseModelContainer.ResponseModel> getTaxonomy(
        TaxonomiesServiceContainer.TaxonomiesServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTaxonomyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ResponseModelContainer.ResponseModel> getTaxonomies(
        TaxonomiesServiceContainer.TaxonomiesServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTaxonomiesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TAXONOMY = 0;
  private static final int METHODID_GET_TAXONOMIES = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TaxonomiesServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TaxonomiesServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TAXONOMY:
          serviceImpl.getTaxonomy((TaxonomiesServiceContainer.TaxonomiesServiceRequest) request,
              (io.grpc.stub.StreamObserver<ResponseModelContainer.ResponseModel>) responseObserver);
          break;
        case METHODID_GET_TAXONOMIES:
          serviceImpl.getTaxonomies((TaxonomiesServiceContainer.TaxonomiesServiceRequest) request,
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
      synchronized (TaxonomiesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetTaxonomyMethod())
              .addMethod(getGetTaxonomiesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
