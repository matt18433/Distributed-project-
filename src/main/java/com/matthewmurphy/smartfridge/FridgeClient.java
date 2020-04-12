package com.matthewmurphy.smartfridge;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.matthewmurphy.smartfridge.FridgeServer;
import com.matthewmurphy.smartfridge.smartFridgeGrpc;
import com.matthewmurphy.smartfridge.Empty;
import com.matthewmurphy.smartfridge.statusOfSwitches;
import com.matthewmurphy.smartfridge.statusOfDoor;
import com.matthewmurphy.smartfridge.itemsInFridge;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class FridgeClient {
	
	private static Logger logger = Logger.getLogger(FridgeServer.class.getName());
	
	private static smartFridgeGrpc.smartFridgeBlockingStub blockingStub;
	private static smartFridgeGrpc.smartFridgeStub asyncStub;
	private static smartFridgeGrpc.smartFridgeFutureStub futureStub;
	
	public static void main(String[] args) throws Exception {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();

		//stubs -- generate from proto
		blockingStub = smartFridgeGrpc.newBlockingStub(channel);
		asyncStub = smartFridgeGrpc.newStub(channel);
		futureStub =  smartFridgeGrpc.newFutureStub(channel);
		
		switchOn();
		switchOff();
		doorOpen();
		doorClosed();
		fridgeItems();
	}
	
	
	public static void switchOn() {
		//This is turning the power on
		System.out.println("The Fridge is on");
        
        try {
            Empty request = Empty.newBuilder().build();
            statusOfSwitches Status_On = blockingStub.switchOn(request);
        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "RPC failed", e);
            return;
        }
			
	}
	
	public static void switchOff() {
		//This is turning the power on
		System.out.println("The Fridge is off");
        
        try {
            Empty request = Empty.newBuilder().build();
            statusOfSwitches Status_Off = blockingStub.switchOff(request);
        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "RPC failed", e);
            return;
        }
			
	}
	public static void doorOpen() {

		System.out.println("The door is open take what you would like");

		try {
			statusOfDoor status = statusOfDoor.newBuilder().build();
			statusOfDoor door_Status = blockingStub.doorOpen(status);
		} catch (RuntimeException e) {
			logger.log(Level.WARNING, "RPC failed", e);
			return;
		}

	}

	public static void doorClosed() {

		System.out.println("The door is closed");

		try {
			statusOfDoor status = statusOfDoor.newBuilder().build();
			statusOfDoor door_Status = blockingStub.doorClosed(status);
		} catch (RuntimeException e) {
			logger.log(Level.WARNING, "RPC failed", e);
			return;
		}
	}	
	

	
	public static void fridgeItems(){

		StreamObserver<itemsResponse> responseObserver = new StreamObserver<itemsResponse>() {

			@Override
			public void onNext(itemsResponse value) {
				System.out.println("The items in the fridge are: " + value.getItems());
			}

			@Override
			public void onError(Throwable t) {

			}

			@Override
			public void onCompleted() {

			}

		};

		StreamObserver<itemsInFridge> requestObserver = asyncStub.fridgeItems(responseObserver);
		try {

			requestObserver.onNext(itemsInFridge.newBuilder().setItems("Orange Juice").build());
			requestObserver.onNext(itemsInFridge.newBuilder().setItems("Milk").build());
			requestObserver.onNext(itemsInFridge.newBuilder().setItems("Water").build());
			requestObserver.onNext(itemsInFridge.newBuilder().setItems("Chocolate").build());
			requestObserver.onNext(itemsInFridge.newBuilder().setItems("Apple Juice").build());

			Thread.sleep(new Random().nextInt(1000) + 500);

		} catch (RuntimeException e) {
			requestObserver.onError(e);
			throw e;
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		requestObserver.onCompleted();
	}
	
}
