package com.matthewmurphy.smartcooker;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: cooker.proto")
public final class smartCookerGrpc {

  private smartCookerGrpc() {}

  public static final String SERVICE_NAME = "smartkitchen.smartCooker";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.matthewmurphy.smartcooker.Empty,
      com.matthewmurphy.smartcooker.statusOfSwitches> getSwitchOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "switchOn",
      requestType = com.matthewmurphy.smartcooker.Empty.class,
      responseType = com.matthewmurphy.smartcooker.statusOfSwitches.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.matthewmurphy.smartcooker.Empty,
      com.matthewmurphy.smartcooker.statusOfSwitches> getSwitchOnMethod() {
    io.grpc.MethodDescriptor<com.matthewmurphy.smartcooker.Empty, com.matthewmurphy.smartcooker.statusOfSwitches> getSwitchOnMethod;
    if ((getSwitchOnMethod = smartCookerGrpc.getSwitchOnMethod) == null) {
      synchronized (smartCookerGrpc.class) {
        if ((getSwitchOnMethod = smartCookerGrpc.getSwitchOnMethod) == null) {
          smartCookerGrpc.getSwitchOnMethod = getSwitchOnMethod = 
              io.grpc.MethodDescriptor.<com.matthewmurphy.smartcooker.Empty, com.matthewmurphy.smartcooker.statusOfSwitches>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartkitchen.smartCooker", "switchOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.matthewmurphy.smartcooker.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.matthewmurphy.smartcooker.statusOfSwitches.getDefaultInstance()))
                  .setSchemaDescriptor(new smartCookerMethodDescriptorSupplier("switchOn"))
                  .build();
          }
        }
     }
     return getSwitchOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.matthewmurphy.smartcooker.Empty,
      com.matthewmurphy.smartcooker.statusOfSwitches> getSwitchOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "switchOff",
      requestType = com.matthewmurphy.smartcooker.Empty.class,
      responseType = com.matthewmurphy.smartcooker.statusOfSwitches.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.matthewmurphy.smartcooker.Empty,
      com.matthewmurphy.smartcooker.statusOfSwitches> getSwitchOffMethod() {
    io.grpc.MethodDescriptor<com.matthewmurphy.smartcooker.Empty, com.matthewmurphy.smartcooker.statusOfSwitches> getSwitchOffMethod;
    if ((getSwitchOffMethod = smartCookerGrpc.getSwitchOffMethod) == null) {
      synchronized (smartCookerGrpc.class) {
        if ((getSwitchOffMethod = smartCookerGrpc.getSwitchOffMethod) == null) {
          smartCookerGrpc.getSwitchOffMethod = getSwitchOffMethod = 
              io.grpc.MethodDescriptor.<com.matthewmurphy.smartcooker.Empty, com.matthewmurphy.smartcooker.statusOfSwitches>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartkitchen.smartCooker", "switchOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.matthewmurphy.smartcooker.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.matthewmurphy.smartcooker.statusOfSwitches.getDefaultInstance()))
                  .setSchemaDescriptor(new smartCookerMethodDescriptorSupplier("switchOff"))
                  .build();
          }
        }
     }
     return getSwitchOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.matthewmurphy.smartcooker.Empty,
      com.matthewmurphy.smartcooker.heatingStatus> getHeatingOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "heatingOn",
      requestType = com.matthewmurphy.smartcooker.Empty.class,
      responseType = com.matthewmurphy.smartcooker.heatingStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.matthewmurphy.smartcooker.Empty,
      com.matthewmurphy.smartcooker.heatingStatus> getHeatingOnMethod() {
    io.grpc.MethodDescriptor<com.matthewmurphy.smartcooker.Empty, com.matthewmurphy.smartcooker.heatingStatus> getHeatingOnMethod;
    if ((getHeatingOnMethod = smartCookerGrpc.getHeatingOnMethod) == null) {
      synchronized (smartCookerGrpc.class) {
        if ((getHeatingOnMethod = smartCookerGrpc.getHeatingOnMethod) == null) {
          smartCookerGrpc.getHeatingOnMethod = getHeatingOnMethod = 
              io.grpc.MethodDescriptor.<com.matthewmurphy.smartcooker.Empty, com.matthewmurphy.smartcooker.heatingStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartkitchen.smartCooker", "heatingOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.matthewmurphy.smartcooker.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.matthewmurphy.smartcooker.heatingStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new smartCookerMethodDescriptorSupplier("heatingOn"))
                  .build();
          }
        }
     }
     return getHeatingOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.matthewmurphy.smartcooker.Empty,
      com.matthewmurphy.smartcooker.heatingStatus> getHeatingOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "heatingOff",
      requestType = com.matthewmurphy.smartcooker.Empty.class,
      responseType = com.matthewmurphy.smartcooker.heatingStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.matthewmurphy.smartcooker.Empty,
      com.matthewmurphy.smartcooker.heatingStatus> getHeatingOffMethod() {
    io.grpc.MethodDescriptor<com.matthewmurphy.smartcooker.Empty, com.matthewmurphy.smartcooker.heatingStatus> getHeatingOffMethod;
    if ((getHeatingOffMethod = smartCookerGrpc.getHeatingOffMethod) == null) {
      synchronized (smartCookerGrpc.class) {
        if ((getHeatingOffMethod = smartCookerGrpc.getHeatingOffMethod) == null) {
          smartCookerGrpc.getHeatingOffMethod = getHeatingOffMethod = 
              io.grpc.MethodDescriptor.<com.matthewmurphy.smartcooker.Empty, com.matthewmurphy.smartcooker.heatingStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartkitchen.smartCooker", "heatingOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.matthewmurphy.smartcooker.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.matthewmurphy.smartcooker.heatingStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new smartCookerMethodDescriptorSupplier("heatingOff"))
                  .build();
          }
        }
     }
     return getHeatingOffMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static smartCookerStub newStub(io.grpc.Channel channel) {
    return new smartCookerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static smartCookerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new smartCookerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static smartCookerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new smartCookerFutureStub(channel);
  }

  /**
   */
  public static abstract class smartCookerImplBase implements io.grpc.BindableService {

    /**
     */
    public void switchOn(com.matthewmurphy.smartcooker.Empty request,
        io.grpc.stub.StreamObserver<com.matthewmurphy.smartcooker.statusOfSwitches> responseObserver) {
      asyncUnimplementedUnaryCall(getSwitchOnMethod(), responseObserver);
    }

    /**
     */
    public void switchOff(com.matthewmurphy.smartcooker.Empty request,
        io.grpc.stub.StreamObserver<com.matthewmurphy.smartcooker.statusOfSwitches> responseObserver) {
      asyncUnimplementedUnaryCall(getSwitchOffMethod(), responseObserver);
    }

    /**
     */
    public void heatingOn(com.matthewmurphy.smartcooker.Empty request,
        io.grpc.stub.StreamObserver<com.matthewmurphy.smartcooker.heatingStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getHeatingOnMethod(), responseObserver);
    }

    /**
     */
    public void heatingOff(com.matthewmurphy.smartcooker.Empty request,
        io.grpc.stub.StreamObserver<com.matthewmurphy.smartcooker.heatingStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getHeatingOffMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSwitchOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.matthewmurphy.smartcooker.Empty,
                com.matthewmurphy.smartcooker.statusOfSwitches>(
                  this, METHODID_SWITCH_ON)))
          .addMethod(
            getSwitchOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.matthewmurphy.smartcooker.Empty,
                com.matthewmurphy.smartcooker.statusOfSwitches>(
                  this, METHODID_SWITCH_OFF)))
          .addMethod(
            getHeatingOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.matthewmurphy.smartcooker.Empty,
                com.matthewmurphy.smartcooker.heatingStatus>(
                  this, METHODID_HEATING_ON)))
          .addMethod(
            getHeatingOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.matthewmurphy.smartcooker.Empty,
                com.matthewmurphy.smartcooker.heatingStatus>(
                  this, METHODID_HEATING_OFF)))
          .build();
    }
  }

  /**
   */
  public static final class smartCookerStub extends io.grpc.stub.AbstractStub<smartCookerStub> {
    private smartCookerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartCookerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartCookerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartCookerStub(channel, callOptions);
    }

    /**
     */
    public void switchOn(com.matthewmurphy.smartcooker.Empty request,
        io.grpc.stub.StreamObserver<com.matthewmurphy.smartcooker.statusOfSwitches> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwitchOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void switchOff(com.matthewmurphy.smartcooker.Empty request,
        io.grpc.stub.StreamObserver<com.matthewmurphy.smartcooker.statusOfSwitches> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwitchOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void heatingOn(com.matthewmurphy.smartcooker.Empty request,
        io.grpc.stub.StreamObserver<com.matthewmurphy.smartcooker.heatingStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHeatingOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void heatingOff(com.matthewmurphy.smartcooker.Empty request,
        io.grpc.stub.StreamObserver<com.matthewmurphy.smartcooker.heatingStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHeatingOffMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class smartCookerBlockingStub extends io.grpc.stub.AbstractStub<smartCookerBlockingStub> {
    private smartCookerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartCookerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartCookerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartCookerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.matthewmurphy.smartcooker.statusOfSwitches switchOn(com.matthewmurphy.smartcooker.Empty request) {
      return blockingUnaryCall(
          getChannel(), getSwitchOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.matthewmurphy.smartcooker.statusOfSwitches switchOff(com.matthewmurphy.smartcooker.Empty request) {
      return blockingUnaryCall(
          getChannel(), getSwitchOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.matthewmurphy.smartcooker.heatingStatus heatingOn(com.matthewmurphy.smartcooker.Empty request) {
      return blockingUnaryCall(
          getChannel(), getHeatingOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.matthewmurphy.smartcooker.heatingStatus heatingOff(com.matthewmurphy.smartcooker.Empty request) {
      return blockingUnaryCall(
          getChannel(), getHeatingOffMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class smartCookerFutureStub extends io.grpc.stub.AbstractStub<smartCookerFutureStub> {
    private smartCookerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartCookerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartCookerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartCookerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.matthewmurphy.smartcooker.statusOfSwitches> switchOn(
        com.matthewmurphy.smartcooker.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getSwitchOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.matthewmurphy.smartcooker.statusOfSwitches> switchOff(
        com.matthewmurphy.smartcooker.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getSwitchOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.matthewmurphy.smartcooker.heatingStatus> heatingOn(
        com.matthewmurphy.smartcooker.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getHeatingOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.matthewmurphy.smartcooker.heatingStatus> heatingOff(
        com.matthewmurphy.smartcooker.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getHeatingOffMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SWITCH_ON = 0;
  private static final int METHODID_SWITCH_OFF = 1;
  private static final int METHODID_HEATING_ON = 2;
  private static final int METHODID_HEATING_OFF = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final smartCookerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(smartCookerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SWITCH_ON:
          serviceImpl.switchOn((com.matthewmurphy.smartcooker.Empty) request,
              (io.grpc.stub.StreamObserver<com.matthewmurphy.smartcooker.statusOfSwitches>) responseObserver);
          break;
        case METHODID_SWITCH_OFF:
          serviceImpl.switchOff((com.matthewmurphy.smartcooker.Empty) request,
              (io.grpc.stub.StreamObserver<com.matthewmurphy.smartcooker.statusOfSwitches>) responseObserver);
          break;
        case METHODID_HEATING_ON:
          serviceImpl.heatingOn((com.matthewmurphy.smartcooker.Empty) request,
              (io.grpc.stub.StreamObserver<com.matthewmurphy.smartcooker.heatingStatus>) responseObserver);
          break;
        case METHODID_HEATING_OFF:
          serviceImpl.heatingOff((com.matthewmurphy.smartcooker.Empty) request,
              (io.grpc.stub.StreamObserver<com.matthewmurphy.smartcooker.heatingStatus>) responseObserver);
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

  private static abstract class smartCookerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    smartCookerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.matthewmurphy.smartcooker.SmartKitchenCookerImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("smartCooker");
    }
  }

  private static final class smartCookerFileDescriptorSupplier
      extends smartCookerBaseDescriptorSupplier {
    smartCookerFileDescriptorSupplier() {}
  }

  private static final class smartCookerMethodDescriptorSupplier
      extends smartCookerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    smartCookerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (smartCookerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new smartCookerFileDescriptorSupplier())
              .addMethod(getSwitchOnMethod())
              .addMethod(getSwitchOffMethod())
              .addMethod(getHeatingOnMethod())
              .addMethod(getHeatingOffMethod())
              .build();
        }
      }
    }
    return result;
  }
}
