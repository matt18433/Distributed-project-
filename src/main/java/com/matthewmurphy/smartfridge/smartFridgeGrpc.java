package com.matthewmurphy.smartfridge;

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
    comments = "Source: fridge.proto")
public final class smartFridgeGrpc {

  private smartFridgeGrpc() {}

  public static final String SERVICE_NAME = "smartkitchen.smartFridge";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.matthewmurphy.smartfridge.Empty,
      com.matthewmurphy.smartfridge.statusOfSwitches> getSwitchOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "switchOn",
      requestType = com.matthewmurphy.smartfridge.Empty.class,
      responseType = com.matthewmurphy.smartfridge.statusOfSwitches.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.matthewmurphy.smartfridge.Empty,
      com.matthewmurphy.smartfridge.statusOfSwitches> getSwitchOnMethod() {
    io.grpc.MethodDescriptor<com.matthewmurphy.smartfridge.Empty, com.matthewmurphy.smartfridge.statusOfSwitches> getSwitchOnMethod;
    if ((getSwitchOnMethod = smartFridgeGrpc.getSwitchOnMethod) == null) {
      synchronized (smartFridgeGrpc.class) {
        if ((getSwitchOnMethod = smartFridgeGrpc.getSwitchOnMethod) == null) {
          smartFridgeGrpc.getSwitchOnMethod = getSwitchOnMethod = 
              io.grpc.MethodDescriptor.<com.matthewmurphy.smartfridge.Empty, com.matthewmurphy.smartfridge.statusOfSwitches>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartkitchen.smartFridge", "switchOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.matthewmurphy.smartfridge.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.matthewmurphy.smartfridge.statusOfSwitches.getDefaultInstance()))
                  .setSchemaDescriptor(new smartFridgeMethodDescriptorSupplier("switchOn"))
                  .build();
          }
        }
     }
     return getSwitchOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.matthewmurphy.smartfridge.Empty,
      com.matthewmurphy.smartfridge.statusOfSwitches> getSwitchOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "switchOff",
      requestType = com.matthewmurphy.smartfridge.Empty.class,
      responseType = com.matthewmurphy.smartfridge.statusOfSwitches.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.matthewmurphy.smartfridge.Empty,
      com.matthewmurphy.smartfridge.statusOfSwitches> getSwitchOffMethod() {
    io.grpc.MethodDescriptor<com.matthewmurphy.smartfridge.Empty, com.matthewmurphy.smartfridge.statusOfSwitches> getSwitchOffMethod;
    if ((getSwitchOffMethod = smartFridgeGrpc.getSwitchOffMethod) == null) {
      synchronized (smartFridgeGrpc.class) {
        if ((getSwitchOffMethod = smartFridgeGrpc.getSwitchOffMethod) == null) {
          smartFridgeGrpc.getSwitchOffMethod = getSwitchOffMethod = 
              io.grpc.MethodDescriptor.<com.matthewmurphy.smartfridge.Empty, com.matthewmurphy.smartfridge.statusOfSwitches>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartkitchen.smartFridge", "switchOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.matthewmurphy.smartfridge.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.matthewmurphy.smartfridge.statusOfSwitches.getDefaultInstance()))
                  .setSchemaDescriptor(new smartFridgeMethodDescriptorSupplier("switchOff"))
                  .build();
          }
        }
     }
     return getSwitchOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.matthewmurphy.smartfridge.statusOfDoor,
      com.matthewmurphy.smartfridge.statusOfDoor> getDoorOpenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "doorOpen",
      requestType = com.matthewmurphy.smartfridge.statusOfDoor.class,
      responseType = com.matthewmurphy.smartfridge.statusOfDoor.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.matthewmurphy.smartfridge.statusOfDoor,
      com.matthewmurphy.smartfridge.statusOfDoor> getDoorOpenMethod() {
    io.grpc.MethodDescriptor<com.matthewmurphy.smartfridge.statusOfDoor, com.matthewmurphy.smartfridge.statusOfDoor> getDoorOpenMethod;
    if ((getDoorOpenMethod = smartFridgeGrpc.getDoorOpenMethod) == null) {
      synchronized (smartFridgeGrpc.class) {
        if ((getDoorOpenMethod = smartFridgeGrpc.getDoorOpenMethod) == null) {
          smartFridgeGrpc.getDoorOpenMethod = getDoorOpenMethod = 
              io.grpc.MethodDescriptor.<com.matthewmurphy.smartfridge.statusOfDoor, com.matthewmurphy.smartfridge.statusOfDoor>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartkitchen.smartFridge", "doorOpen"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.matthewmurphy.smartfridge.statusOfDoor.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.matthewmurphy.smartfridge.statusOfDoor.getDefaultInstance()))
                  .setSchemaDescriptor(new smartFridgeMethodDescriptorSupplier("doorOpen"))
                  .build();
          }
        }
     }
     return getDoorOpenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.matthewmurphy.smartfridge.statusOfDoor,
      com.matthewmurphy.smartfridge.statusOfDoor> getDoorClosedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "doorClosed",
      requestType = com.matthewmurphy.smartfridge.statusOfDoor.class,
      responseType = com.matthewmurphy.smartfridge.statusOfDoor.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.matthewmurphy.smartfridge.statusOfDoor,
      com.matthewmurphy.smartfridge.statusOfDoor> getDoorClosedMethod() {
    io.grpc.MethodDescriptor<com.matthewmurphy.smartfridge.statusOfDoor, com.matthewmurphy.smartfridge.statusOfDoor> getDoorClosedMethod;
    if ((getDoorClosedMethod = smartFridgeGrpc.getDoorClosedMethod) == null) {
      synchronized (smartFridgeGrpc.class) {
        if ((getDoorClosedMethod = smartFridgeGrpc.getDoorClosedMethod) == null) {
          smartFridgeGrpc.getDoorClosedMethod = getDoorClosedMethod = 
              io.grpc.MethodDescriptor.<com.matthewmurphy.smartfridge.statusOfDoor, com.matthewmurphy.smartfridge.statusOfDoor>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartkitchen.smartFridge", "doorClosed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.matthewmurphy.smartfridge.statusOfDoor.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.matthewmurphy.smartfridge.statusOfDoor.getDefaultInstance()))
                  .setSchemaDescriptor(new smartFridgeMethodDescriptorSupplier("doorClosed"))
                  .build();
          }
        }
     }
     return getDoorClosedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.matthewmurphy.smartfridge.itemsInFridge,
      com.matthewmurphy.smartfridge.itemsResponse> getFridgeItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fridgeItems",
      requestType = com.matthewmurphy.smartfridge.itemsInFridge.class,
      responseType = com.matthewmurphy.smartfridge.itemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.matthewmurphy.smartfridge.itemsInFridge,
      com.matthewmurphy.smartfridge.itemsResponse> getFridgeItemsMethod() {
    io.grpc.MethodDescriptor<com.matthewmurphy.smartfridge.itemsInFridge, com.matthewmurphy.smartfridge.itemsResponse> getFridgeItemsMethod;
    if ((getFridgeItemsMethod = smartFridgeGrpc.getFridgeItemsMethod) == null) {
      synchronized (smartFridgeGrpc.class) {
        if ((getFridgeItemsMethod = smartFridgeGrpc.getFridgeItemsMethod) == null) {
          smartFridgeGrpc.getFridgeItemsMethod = getFridgeItemsMethod = 
              io.grpc.MethodDescriptor.<com.matthewmurphy.smartfridge.itemsInFridge, com.matthewmurphy.smartfridge.itemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smartkitchen.smartFridge", "fridgeItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.matthewmurphy.smartfridge.itemsInFridge.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.matthewmurphy.smartfridge.itemsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new smartFridgeMethodDescriptorSupplier("fridgeItems"))
                  .build();
          }
        }
     }
     return getFridgeItemsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static smartFridgeStub newStub(io.grpc.Channel channel) {
    return new smartFridgeStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static smartFridgeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new smartFridgeBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static smartFridgeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new smartFridgeFutureStub(channel);
  }

  /**
   */
  public static abstract class smartFridgeImplBase implements io.grpc.BindableService {

    /**
     */
    public void switchOn(com.matthewmurphy.smartfridge.Empty request,
        io.grpc.stub.StreamObserver<com.matthewmurphy.smartfridge.statusOfSwitches> responseObserver) {
      asyncUnimplementedUnaryCall(getSwitchOnMethod(), responseObserver);
    }

    /**
     */
    public void switchOff(com.matthewmurphy.smartfridge.Empty request,
        io.grpc.stub.StreamObserver<com.matthewmurphy.smartfridge.statusOfSwitches> responseObserver) {
      asyncUnimplementedUnaryCall(getSwitchOffMethod(), responseObserver);
    }

    /**
     */
    public void doorOpen(com.matthewmurphy.smartfridge.statusOfDoor request,
        io.grpc.stub.StreamObserver<com.matthewmurphy.smartfridge.statusOfDoor> responseObserver) {
      asyncUnimplementedUnaryCall(getDoorOpenMethod(), responseObserver);
    }

    /**
     */
    public void doorClosed(com.matthewmurphy.smartfridge.statusOfDoor request,
        io.grpc.stub.StreamObserver<com.matthewmurphy.smartfridge.statusOfDoor> responseObserver) {
      asyncUnimplementedUnaryCall(getDoorClosedMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.matthewmurphy.smartfridge.itemsInFridge> fridgeItems(
        io.grpc.stub.StreamObserver<com.matthewmurphy.smartfridge.itemsResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getFridgeItemsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSwitchOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.matthewmurphy.smartfridge.Empty,
                com.matthewmurphy.smartfridge.statusOfSwitches>(
                  this, METHODID_SWITCH_ON)))
          .addMethod(
            getSwitchOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.matthewmurphy.smartfridge.Empty,
                com.matthewmurphy.smartfridge.statusOfSwitches>(
                  this, METHODID_SWITCH_OFF)))
          .addMethod(
            getDoorOpenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.matthewmurphy.smartfridge.statusOfDoor,
                com.matthewmurphy.smartfridge.statusOfDoor>(
                  this, METHODID_DOOR_OPEN)))
          .addMethod(
            getDoorClosedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.matthewmurphy.smartfridge.statusOfDoor,
                com.matthewmurphy.smartfridge.statusOfDoor>(
                  this, METHODID_DOOR_CLOSED)))
          .addMethod(
            getFridgeItemsMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.matthewmurphy.smartfridge.itemsInFridge,
                com.matthewmurphy.smartfridge.itemsResponse>(
                  this, METHODID_FRIDGE_ITEMS)))
          .build();
    }
  }

  /**
   */
  public static final class smartFridgeStub extends io.grpc.stub.AbstractStub<smartFridgeStub> {
    private smartFridgeStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartFridgeStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartFridgeStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartFridgeStub(channel, callOptions);
    }

    /**
     */
    public void switchOn(com.matthewmurphy.smartfridge.Empty request,
        io.grpc.stub.StreamObserver<com.matthewmurphy.smartfridge.statusOfSwitches> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwitchOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void switchOff(com.matthewmurphy.smartfridge.Empty request,
        io.grpc.stub.StreamObserver<com.matthewmurphy.smartfridge.statusOfSwitches> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwitchOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void doorOpen(com.matthewmurphy.smartfridge.statusOfDoor request,
        io.grpc.stub.StreamObserver<com.matthewmurphy.smartfridge.statusOfDoor> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDoorOpenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void doorClosed(com.matthewmurphy.smartfridge.statusOfDoor request,
        io.grpc.stub.StreamObserver<com.matthewmurphy.smartfridge.statusOfDoor> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDoorClosedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.matthewmurphy.smartfridge.itemsInFridge> fridgeItems(
        io.grpc.stub.StreamObserver<com.matthewmurphy.smartfridge.itemsResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getFridgeItemsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class smartFridgeBlockingStub extends io.grpc.stub.AbstractStub<smartFridgeBlockingStub> {
    private smartFridgeBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartFridgeBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartFridgeBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartFridgeBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.matthewmurphy.smartfridge.statusOfSwitches switchOn(com.matthewmurphy.smartfridge.Empty request) {
      return blockingUnaryCall(
          getChannel(), getSwitchOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.matthewmurphy.smartfridge.statusOfSwitches switchOff(com.matthewmurphy.smartfridge.Empty request) {
      return blockingUnaryCall(
          getChannel(), getSwitchOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.matthewmurphy.smartfridge.statusOfDoor doorOpen(com.matthewmurphy.smartfridge.statusOfDoor request) {
      return blockingUnaryCall(
          getChannel(), getDoorOpenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.matthewmurphy.smartfridge.statusOfDoor doorClosed(com.matthewmurphy.smartfridge.statusOfDoor request) {
      return blockingUnaryCall(
          getChannel(), getDoorClosedMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class smartFridgeFutureStub extends io.grpc.stub.AbstractStub<smartFridgeFutureStub> {
    private smartFridgeFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartFridgeFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartFridgeFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartFridgeFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.matthewmurphy.smartfridge.statusOfSwitches> switchOn(
        com.matthewmurphy.smartfridge.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getSwitchOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.matthewmurphy.smartfridge.statusOfSwitches> switchOff(
        com.matthewmurphy.smartfridge.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getSwitchOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.matthewmurphy.smartfridge.statusOfDoor> doorOpen(
        com.matthewmurphy.smartfridge.statusOfDoor request) {
      return futureUnaryCall(
          getChannel().newCall(getDoorOpenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.matthewmurphy.smartfridge.statusOfDoor> doorClosed(
        com.matthewmurphy.smartfridge.statusOfDoor request) {
      return futureUnaryCall(
          getChannel().newCall(getDoorClosedMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SWITCH_ON = 0;
  private static final int METHODID_SWITCH_OFF = 1;
  private static final int METHODID_DOOR_OPEN = 2;
  private static final int METHODID_DOOR_CLOSED = 3;
  private static final int METHODID_FRIDGE_ITEMS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final smartFridgeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(smartFridgeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SWITCH_ON:
          serviceImpl.switchOn((com.matthewmurphy.smartfridge.Empty) request,
              (io.grpc.stub.StreamObserver<com.matthewmurphy.smartfridge.statusOfSwitches>) responseObserver);
          break;
        case METHODID_SWITCH_OFF:
          serviceImpl.switchOff((com.matthewmurphy.smartfridge.Empty) request,
              (io.grpc.stub.StreamObserver<com.matthewmurphy.smartfridge.statusOfSwitches>) responseObserver);
          break;
        case METHODID_DOOR_OPEN:
          serviceImpl.doorOpen((com.matthewmurphy.smartfridge.statusOfDoor) request,
              (io.grpc.stub.StreamObserver<com.matthewmurphy.smartfridge.statusOfDoor>) responseObserver);
          break;
        case METHODID_DOOR_CLOSED:
          serviceImpl.doorClosed((com.matthewmurphy.smartfridge.statusOfDoor) request,
              (io.grpc.stub.StreamObserver<com.matthewmurphy.smartfridge.statusOfDoor>) responseObserver);
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
        case METHODID_FRIDGE_ITEMS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.fridgeItems(
              (io.grpc.stub.StreamObserver<com.matthewmurphy.smartfridge.itemsResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class smartFridgeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    smartFridgeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.matthewmurphy.smartfridge.SmartKitchenFridgeImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("smartFridge");
    }
  }

  private static final class smartFridgeFileDescriptorSupplier
      extends smartFridgeBaseDescriptorSupplier {
    smartFridgeFileDescriptorSupplier() {}
  }

  private static final class smartFridgeMethodDescriptorSupplier
      extends smartFridgeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    smartFridgeMethodDescriptorSupplier(String methodName) {
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
      synchronized (smartFridgeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new smartFridgeFileDescriptorSupplier())
              .addMethod(getSwitchOnMethod())
              .addMethod(getSwitchOffMethod())
              .addMethod(getDoorOpenMethod())
              .addMethod(getDoorClosedMethod())
              .addMethod(getFridgeItemsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
