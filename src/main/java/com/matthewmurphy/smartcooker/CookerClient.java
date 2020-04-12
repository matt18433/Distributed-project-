package com.matthewmurphy.smartcooker;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.matthewmurphy.smartcooker.CookerServer;
import com.matthewmurphy.smartcooker.smartCookerGrpc;
import com.matthewmurphy.smartcooker.Empty;
import com.matthewmurphy.smartcooker.statusOfSwitches;
import com.matthewmurphy.smartcooker.heatingStatus;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class CookerClient {
	
	private static Logger logger = Logger.getLogger(CookerServer.class.getName());
	private static smartCookerGrpc.smartCookerBlockingStub blockingStub;
	private static smartCookerGrpc.smartCookerStub asyncStub;
	private static smartCookerGrpc.smartCookerFutureStub futureStub;
	
	public static void main(String[] args) throws Exception {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();

		//stubs -- generate from proto
		blockingStub = smartCookerGrpc.newBlockingStub(channel);
		asyncStub = smartCookerGrpc.newStub(channel);
		futureStub =  smartCookerGrpc.newFutureStub(channel);
		
		switchOn();
		switchOff();
		heatingOn();
		heatingOff();
	}
	
	public static void switchOn() {
		//This is turning the power on
		System.out.println("The Cooker is on");
        
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
		System.out.println("The cooker is Off");
        
        try {
            Empty request = Empty.newBuilder().build();
            statusOfSwitches Status_Off = blockingStub.switchOff(request);
        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "RPC failed", e);
            return;
        }
			
	}
	
	
public static void heatingOn() {
		
		System.out.println("The heating on the cooker is turned on");
        
        try {
        	Empty request = Empty.newBuilder().build();
            heatingStatus heating_Status = blockingStub.heatingOn(request);
        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "RPC failed", e);
            return;
        }
			
	}
	
	public static void heatingOff() {
	
		System.out.println("The heating is off on the cooker");
        
        try {
        	Empty request = Empty.newBuilder().build();
        	heatingStatus heating_Status = blockingStub.heatingOff(request);
        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "RPC failed", e);
            return;
        }
	}

}
