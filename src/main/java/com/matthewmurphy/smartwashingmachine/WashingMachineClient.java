package com.matthewmurphy.smartwashingmachine;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.matthewmurphy.smartwashingmachine.Empty;
import com.matthewmurphy.smartwashingmachine.statusOfDoor;
import com.matthewmurphy.smartwashingmachine.WashingMachineServer;
import com.matthewmurphy.smartwashingmachine.washingMachineGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;



public class WashingMachineClient {

	
	private static Logger logger = Logger.getLogger(WashingMachineServer.class.getName());
	private static washingMachineGrpc.washingMachineBlockingStub blockingStub;
	private static washingMachineGrpc.washingMachineStub asyncStub;
	private static washingMachineGrpc.washingMachineFutureStub futureStub;
	
	public static void main(String[] args) throws Exception {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();

		//stubs -- generate from proto
		blockingStub = washingMachineGrpc.newBlockingStub(channel);
		asyncStub = washingMachineGrpc.newStub(channel);
		futureStub = washingMachineGrpc.newFutureStub(channel);
		
		switchOn();
		switchOff();
		doorOpen();
		doorClosed();
		changeWashType();
		
	}
	
	public static void switchOn() {
		//This is turning the power on
		System.out.println("The washing machine is on");
        
        try {
            Empty request = Empty.newBuilder().build();
            statusOfSwitches Status_On = blockingStub.switchOn(request);
        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "RPC failed", e);
            return;
        }
			
	}
	
	public static void switchOff() {
		//This is turning the power off
		System.out.println("The washing machine is off");
        
        try {
            Empty request = Empty.newBuilder().build();
            statusOfSwitches Status_Off = blockingStub.switchOff(request);
        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "RPC failed", e);
            return;
        }
			
	}
	
	
	public static void doorOpen() {

		System.out.println("The door is open waiting for clothes to be inserted");

		try {
			statusOfDoor status = statusOfDoor.newBuilder().build();
			statusOfDoor door_Status = blockingStub.doorOpen(status);
		} catch (RuntimeException e) {
			logger.log(Level.WARNING, "RPC failed", e);
			return;
		}

	}

	public static void doorClosed() {

		System.out.println("The door is closed waiting for user to select what type of wash they want");

		try {
			statusOfDoor status = statusOfDoor.newBuilder().build();
			statusOfDoor door_Status = blockingStub.doorClosed(status);
		} catch (RuntimeException e) {
			logger.log(Level.WARNING, "RPC failed", e);
			return;
		}
	}	
	

	
	
	public static void changeWashType()  {
		
		washRequest wash_request = washRequest.newBuilder().setWash(30).build();
		System.out.println("Change duration of wash...." +   "the wash duration is now " + wash_request + "minutes" );
		
	}
}
