package com.matthewmurphy.smartwashingmachine;

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
    comments = "Source: washingmachine.proto")
public final class washingMachineGrpc {

  private washingMachineGrpc() {}

  public static final String SERVICE_NAME = "smartkitchen.washingMachine";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.matthewmurphy.smartwashingmachine.Empty,
      com.matthewmurphy.smartwashingmachine.statusOfSwitches> getSwitchOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "switchOn",
      requestType = com.matthewmurphy.smartwashingmachine.Empty.class,
      responseType = com.matthewmurphy.smartwashingmachine.statusOfSwitches.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.matthewmurphy.smartwashingmachine.Empty,
      com.matthewmurphy.smartwashingmachine.statusOfSwitches> getSwitchOnMethod() {
    io.grpc.MethodDescriptor<com.matthewmurphy.smartwashingmachine.Empty, com.matthewmurphy.smartwashingmachine.statusOfSwitches> getSwitchOnMethod;
    if ((getSwitchOnMethod = washingMachineGrpc.getSwitchOnMethod) == null) {
      synchronized (washingMachineGrpc.class) {
        if ((getSwitchOnMethod = washingMachineGrpc.getSwitchOnMethod) == null) {
          washingMachineGrpc.getSwitchOnMethod = getSwitchOnMethod = 
              io.grpc.MethodDescriptor.<com.matthewmurphy.smartwashingmachine.Empty, com.matthewmurphy.smartwashingmachine.statusOfSwitches>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartkitchen.washingMachine", "switchOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.matthewmurphy.smartwashingmachine.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.matthewmurphy.smartwashingmachine.statusOfSwitches.getDefaultInstance()))
                  .setSchemaDescriptor(new washingMachineMethodDescriptorSupplier("switchOn"))
                  .build();
          }
        }
     }
     return getSwitchOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.matthewmurphy.smartwashingmachine.Empty,
      com.matthewmurphy.smartwashingmachine.statusOfSwitches> getSwitchOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "switchOff",
      requestType = com.matthewmurphy.smartwashingmachine.Empty.class,
      responseType = com.matthewmurphy.smartwashingmachine.statusOfSwitches.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.matthewmurphy.smartwashingmachine.Empty,
      com.matthewmurphy.smartwashingmachine.statusOfSwitches> getSwitchOffMethod() {
    io.grpc.MethodDescriptor<com.matthewmurphy.smartwashingmachine.Empty, com.matthewmurphy.smartwashingmachine.statusOfSwitches> getSwitchOffMethod;
    if ((getSwitchOffMethod = washingMachineGrpc.getSwitchOffMethod) == null) {
      synchronized (washingMachineGrpc.class) {
        if ((getSwitchOffMethod = washingMachineGrpc.getSwitchOffMethod) == null) {
          washingMachineGrpc.getSwitchOffMethod = getSwitchOffMethod = 
              io.grpc.MethodDescriptor.<com.matthewmurphy.smartwashingmachine.Empty, com.matthewmurphy.smartwashingmachine.statusOfSwitches>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartkitchen.washingMachine", "switchOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.matthewmurphy.smartwashingmachine.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.matthewmurphy.smartwashingmachine.statusOfSwitches.getDefaultInstance()))
                  .setSchemaDescriptor(new washingMachineMethodDescriptorSupplier("switchOff"))
                  .build();
          }
        }
     }
     return getSwitchOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.matthewmurphy.smartwashingmachine.statusOfDoor,
      com.matthewmurphy.smartwashingmachine.statusOfDoor> getDoorOpenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "doorOpen",
      requestType = com.matthewmurphy.smartwashingmachine.statusOfDoor.class,
      responseType = com.matthewmurphy.smartwashingmachine.statusOfDoor.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.matthewmurphy.smartwashingmachine.statusOfDoor,
      com.matthewmurphy.smartwashingmachine.statusOfDoor> getDoorOpenMethod() {
    io.grpc.MethodDescriptor<com.matthewmurphy.smartwashingmachine.statusOfDoor, com.matthewmurphy.smartwashingmachine.statusOfDoor> getDoorOpenMethod;
    if ((getDoorOpenMethod = washingMachineGrpc.getDoorOpenMethod) == null) {
      synchronized (washingMachineGrpc.class) {
        if ((getDoorOpenMethod = washingMachineGrpc.getDoorOpenMethod) == null) {
          washingMachineGrpc.getDoorOpenMethod = getDoorOpenMethod = 
              io.grpc.MethodDescriptor.<com.matthewmurphy.smartwashingmachine.statusOfDoor, com.matthewmurphy.smartwashingmachine.statusOfDoor>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartkitchen.washingMachine", "doorOpen"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.matthewmurphy.smartwashingmachine.statusOfDoor.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.matthewmurphy.smartwashingmachine.statusOfDoor.getDefaultInstance()))
                  .setSchemaDescriptor(new washingMachineMethodDescriptorSupplier("doorOpen"))
                  .build();
          }
        }
     }
     return getDoorOpenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.matthewmurphy.smartwashingmachine.statusOfDoor,
      com.matthewmurphy.smartwashingmachine.statusOfDoor> getDoorClosedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "doorClosed",
      requestType = com.matthewmurphy.smartwashingmachine.statusOfDoor.class,
      responseType = com.matthewmurphy.smartwashingmachine.statusOfDoor.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.matthewmurphy.smartwashingmachine.statusOfDoor,
      com.matthewmurphy.smartwashingmachine.statusOfDoor> getDoorClosedMethod() {
    io.grpc.MethodDescriptor<com.matthewmurphy.smartwashingmachine.statusOfDoor, com.matthewmurphy.smartwashingmachine.statusOfDoor> getDoorClosedMethod;
    if ((getDoorClosedMethod = washingMachineGrpc.getDoorClosedMethod) == null) {
      synchronized (washingMachineGrpc.class) {
        if ((getDoorClosedMethod = washingMachineGrpc.getDoorClosedMethod) == null) {
          washingMachineGrpc.getDoorClosedMethod = getDoorClosedMethod = 
              io.grpc.MethodDescriptor.<com.matthewmurphy.smartwashingmachine.statusOfDoor, com.matthewmurphy.smartwashingmachine.statusOfDoor>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartkitchen.washingMachine", "doorClosed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.matthewmurphy.smartwashingmachine.statusOfDoor.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.matthewmurphy.smartwashingmachine.statusOfDoor.getDefaultInstance()))
                  .setSchemaDescriptor(new washingMachineMethodDescriptorSupplier("doorClosed"))
                  .build();
          }
        }
     }
     return getDoorClosedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.matthewmurphy.smartwashingmachine.washRequest,
      com.matthewmurphy.smartwashingmachine.washResponse> getChangeWashTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeWashType",
      requestType = com.matthewmurphy.smartwashingmachine.washRequest.class,
      responseType = com.matthewmurphy.smartwashingmachine.washResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.matthewmurphy.smartwashingmachine.washRequest,
      com.matthewmurphy.smartwashingmachine.washResponse> getChangeWashTypeMethod() {
    io.grpc.MethodDescriptor<com.matthewmurphy.smartwashingmachine.washRequest, com.matthewmurphy.smartwashingmachine.washResponse> getChangeWashTypeMethod;
    if ((getChangeWashTypeMethod = washingMachineGrpc.getChangeWashTypeMethod) == null) {
      synchronized (washingMachineGrpc.class) {
        if ((getChangeWashTypeMethod = washingMachineGrpc.getChangeWashTypeMethod) == null) {
          washingMachineGrpc.getChangeWashTypeMethod = getChangeWashTypeMethod = 
              io.grpc.MethodDescriptor.<com.matthewmurphy.smartwashingmachine.washRequest, com.matthewmurphy.smartwashingmachine.washResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smartkitchen.washingMachine", "changeWashType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.matthewmurphy.smartwashingmachine.washRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.matthewmurphy.smartwashingmachine.washResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new washingMachineMethodDescriptorSupplier("changeWashType"))
                  .build();
          }
        }
     }
     return getChangeWashTypeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static washingMachineStub newStub(io.grpc.Channel channel) {
    return new washingMachineStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static washingMachineBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new washingMachineBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static washingMachineFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new washingMachineFutureStub(channel);
  }

  /**
   */
  public static abstract class washingMachineImplBase implements io.grpc.BindableService {

    /**
     */
    public void switchOn(com.matthewmurphy.smartwashingmachine.Empty request,
        io.grpc.stub.StreamObserver<com.matthewmurphy.smartwashingmachine.statusOfSwitches> responseObserver) {
      asyncUnimplementedUnaryCall(getSwitchOnMethod(), responseObserver);
    }

    /**
     */
    public void switchOff(com.matthewmurphy.smartwashingmachine.Empty request,
        io.grpc.stub.StreamObserver<com.matthewmurphy.smartwashingmachine.statusOfSwitches> responseObserver) {
      asyncUnimplementedUnaryCall(getSwitchOffMethod(), responseObserver);
    }

    /**
     */
    public void doorOpen(com.matthewmurphy.smartwashingmachine.statusOfDoor request,
        io.grpc.stub.StreamObserver<com.matthewmurphy.smartwashingmachine.statusOfDoor> responseObserver) {
      asyncUnimplementedUnaryCall(getDoorOpenMethod(), responseObserver);
    }

    /**
     */
    public void doorClosed(com.matthewmurphy.smartwashingmachine.statusOfDoor request,
        io.grpc.stub.StreamObserver<com.matthewmurphy.smartwashingmachine.statusOfDoor> responseObserver) {
      asyncUnimplementedUnaryCall(getDoorClosedMethod(), responseObserver);
    }

    /**
     */
    public void changeWashType(com.matthewmurphy.smartwashingmachine.washRequest request,
        io.grpc.stub.StreamObserver<com.matthewmurphy.smartwashingmachine.washResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeWashTypeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSwitchOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.matthewmurphy.smartwashingmachine.Empty,
                com.matthewmurphy.smartwashingmachine.statusOfSwitches>(
                  this, METHODID_SWITCH_ON)))
          .addMethod(
            getSwitchOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.matthewmurphy.smartwashingmachine.Empty,
                com.matthewmurphy.smartwashingmachine.statusOfSwitches>(
                  this, METHODID_SWITCH_OFF)))
          .addMethod(
            getDoorOpenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.matthewmurphy.smartwashingmachine.statusOfDoor,
                com.matthewmurphy.smartwashingmachine.statusOfDoor>(
                  this, METHODID_DOOR_OPEN)))
          .addMethod(
            getDoorClosedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.matthewmurphy.smartwashingmachine.statusOfDoor,
                com.matthewmurphy.smartwashingmachine.statusOfDoor>(
                  this, METHODID_DOOR_CLOSED)))
          .addMethod(
            getChangeWashTypeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.matthewmurphy.smartwashingmachine.washRequest,
                com.matthewmurphy.smartwashingmachine.washResponse>(
                  this, METHODID_CHANGE_WASH_TYPE)))
          .build();
    }
  }

  /**
   */
  public static final class washingMachineStub extends io.grpc.stub.AbstractStub<washingMachineStub> {
    private washingMachineStub(io.grpc.Channel channel) {
      super(channel);
    }

    private washingMachineStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected washingMachineStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new washingMachineStub(channel, callOptions);
    }

    /**
     */
    public void switchOn(com.matthewmurphy.smartwashingmachine.Empty request,
        io.grpc.stub.StreamObserver<com.matthewmurphy.smartwashingmachine.statusOfSwitches> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwitchOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void switchOff(com.matthewmurphy.smartwashingmachine.Empty request,
        io.grpc.stub.StreamObserver<com.matthewmurphy.smartwashingmachine.statusOfSwitches> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwitchOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void doorOpen(com.matthewmurphy.smartwashingmachine.statusOfDoor request,
        io.grpc.stub.StreamObserver<com.matthewmurphy.smartwashingmachine.statusOfDoor> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDoorOpenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void doorClosed(com.matthewmurphy.smartwashingmachine.statusOfDoor request,
        io.grpc.stub.StreamObserver<com.matthewmurphy.smartwashingmachine.statusOfDoor> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDoorClosedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeWashType(com.matthewmurphy.smartwashingmachine.washRequest request,
        io.grpc.stub.StreamObserver<com.matthewmurphy.smartwashingmachine.washResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getChangeWashTypeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class washingMachineBlockingStub extends io.grpc.stub.AbstractStub<washingMachineBlockingStub> {
    private washingMachineBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private washingMachineBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected washingMachineBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new washingMachineBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.matthewmurphy.smartwashingmachine.statusOfSwitches switchOn(com.matthewmurphy.smartwashingmachine.Empty request) {
      return blockingUnaryCall(
          getChannel(), getSwitchOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.matthewmurphy.smartwashingmachine.statusOfSwitches switchOff(com.matthewmurphy.smartwashingmachine.Empty request) {
      return blockingUnaryCall(
          getChannel(), getSwitchOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.matthewmurphy.smartwashingmachine.statusOfDoor doorOpen(com.matthewmurphy.smartwashingmachine.statusOfDoor request) {
      return blockingUnaryCall(
          getChannel(), getDoorOpenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.matthewmurphy.smartwashingmachine.statusOfDoor doorClosed(com.matthewmurphy.smartwashingmachine.statusOfDoor request) {
      return blockingUnaryCall(
          getChannel(), getDoorClosedMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.matthewmurphy.smartwashingmachine.washResponse> changeWashType(
        com.matthewmurphy.smartwashingmachine.washRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getChangeWashTypeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class washingMachineFutureStub extends io.grpc.stub.AbstractStub<washingMachineFutureStub> {
    private washingMachineFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private washingMachineFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected washingMachineFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new washingMachineFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.matthewmurphy.smartwashingmachine.statusOfSwitches> switchOn(
        com.matthewmurphy.smartwashingmachine.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getSwitchOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.matthewmurphy.smartwashingmachine.statusOfSwitches> switchOff(
        com.matthewmurphy.smartwashingmachine.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getSwitchOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.matthewmurphy.smartwashingmachine.statusOfDoor> doorOpen(
        com.matthewmurphy.smartwashingmachine.statusOfDoor request) {
      return futureUnaryCall(
          getChannel().newCall(getDoorOpenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.matthewmurphy.smartwashingmachine.statusOfDoor> doorClosed(
        com.matthewmurphy.smartwashingmachine.statusOfDoor request) {
      return futureUnaryCall(
          getChannel().newCall(getDoorClosedMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SWITCH_ON = 0;
  private static final int METHODID_SWITCH_OFF = 1;
  private static final int METHODID_DOOR_OPEN = 2;
  private static final int METHODID_DOOR_CLOSED = 3;
  private static final int METHODID_CHANGE_WASH_TYPE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final washingMachineImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(washingMachineImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SWITCH_ON:
          serviceImpl.switchOn((com.matthewmurphy.smartwashingmachine.Empty) request,
              (io.grpc.stub.StreamObserver<com.matthewmurphy.smartwashingmachine.statusOfSwitches>) responseObserver);
          break;
        case METHODID_SWITCH_OFF:
          serviceImpl.switchOff((com.matthewmurphy.smartwashingmachine.Empty) request,
              (io.grpc.stub.StreamObserver<com.matthewmurphy.smartwashingmachine.statusOfSwitches>) responseObserver);
          break;
        case METHODID_DOOR_OPEN:
          serviceImpl.doorOpen((com.matthewmurphy.smartwashingmachine.statusOfDoor) request,
              (io.grpc.stub.StreamObserver<com.matthewmurphy.smartwashingmachine.statusOfDoor>) responseObserver);
          break;
        case METHODID_DOOR_CLOSED:
          serviceImpl.doorClosed((com.matthewmurphy.smartwashingmachine.statusOfDoor) request,
              (io.grpc.stub.StreamObserver<com.matthewmurphy.smartwashingmachine.statusOfDoor>) responseObserver);
          break;
        case METHODID_CHANGE_WASH_TYPE:
          serviceImpl.changeWashType((com.matthewmurphy.smartwashingmachine.washRequest) request,
              (io.grpc.stub.StreamObserver<com.matthewmurphy.smartwashingmachine.washResponse>) responseObserver);
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

  private static abstract class washingMachineBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    washingMachineBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.matthewmurphy.smartwashingmachine.SmartKitchenWashingmachineImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("washingMachine");
    }
  }

  private static final class washingMachineFileDescriptorSupplier
      extends washingMachineBaseDescriptorSupplier {
    washingMachineFileDescriptorSupplier() {}
  }

  private static final class washingMachineMethodDescriptorSupplier
      extends washingMachineBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    washingMachineMethodDescriptorSupplier(String methodName) {
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
      synchronized (washingMachineGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new washingMachineFileDescriptorSupplier())
              .addMethod(getSwitchOnMethod())
              .addMethod(getSwitchOffMethod())
              .addMethod(getDoorOpenMethod())
              .addMethod(getDoorClosedMethod())
              .addMethod(getChangeWashTypeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
