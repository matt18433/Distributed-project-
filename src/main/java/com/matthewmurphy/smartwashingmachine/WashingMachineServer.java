package com.matthewmurphy.smartwashingmachine;


import java.io.IOException;
import java.util.logging.Logger;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import com.matthewmurphy.smartwashingmachine.washingMachineGrpc.washingMachineImplBase;

public class WashingMachineServer extends washingMachineImplBase {

	
	private static final Logger logger =Logger.getLogger(WashingMachineServer.class.getName());
	
	
	 public static void main(String[] args) throws IOException, InterruptedException {
		 WashingMachineServer machineServer = new WashingMachineServer();
	
		int port = 50051;
	 	Server server;	
		server = ServerBuilder.forPort(port)
				.addService(machineServer)
				.build()
				.start();
		
		logger.info("Server started, listening on " + port);
		
		server.awaitTermination();
	}
	
	 private boolean statusOf_Door = false;
	 private boolean activeMachine = false;
		public void switchOn(Empty request,
		         io.grpc.stub.StreamObserver<statusOfSwitches> response) {
				activeMachine = true;
					System.out.println("The washing machine is on");

		         response.onNext(statusOfSwitches.newBuilder()
		                 .setSwitchStatus(activeMachine)
		                 .build());
		         response.onCompleted();
		     }
		
		public void switchOff(Empty request,
		         io.grpc.stub.StreamObserver<statusOfSwitches> response) {
				activeMachine = false;
					System.out.println("The washing machine is off");

		         response.onNext(statusOfSwitches.newBuilder()
		                 .setSwitchStatus(activeMachine)
		                 .build());
		         response.onCompleted();
		     }
		
		
		public void doorOpen(statusOfDoor request,
				io.grpc.stub.StreamObserver<statusOfDoor>response) {
			
			statusOf_Door = true;
			String output = "The door is open waiting for clothes to be inserted";
			
			statusOfDoor doorstatus = statusOfDoor.newBuilder().setStatusOfDoorMsg(output).setOpenONOff(statusOf_Door).build();
			response.onNext(doorstatus);
			response.onCompleted();				
		}
		
		public void doorClosed(statusOfDoor request,
				io.grpc.stub.StreamObserver<statusOfDoor>response) {
			
			statusOf_Door = false;
			String output = "The door is closed waiting for user to select what type of wash they want";
			
			statusOfDoor doorstatus = statusOfDoor.newBuilder().setStatusOfDoorMsg(output).setOpenONOff(statusOf_Door).build();
			response.onNext(doorstatus);
			response.onCompleted();				
		}
		
		public void changeWashType(washRequest request, StreamObserver<washResponse> responseObserver) {
			
			
			int washing = request.getWash();
			System.out.println("Change duration of wash...." + "the wash duration is now " + washing +" minutes");
			System.out.println("You can now continue your day and wait for wash");
			responseObserver.onNext(washResponse.newBuilder().setWash(washing).build());
			
			responseObserver.onCompleted();
			
			
		}
	}
		

