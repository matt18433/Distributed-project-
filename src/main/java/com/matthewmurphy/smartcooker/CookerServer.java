package com.matthewmurphy.smartcooker;

import java.io.IOException;
import java.util.logging.Logger;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import com.matthewmurphy.smartcooker.smartCookerGrpc.smartCookerImplBase;

public class CookerServer extends smartCookerImplBase {

	private static final Logger logger =Logger.getLogger(CookerServer.class.getName());
	 public static void main(String[] args) throws IOException, InterruptedException {
	CookerServer cookerServer = new CookerServer();
	
		int port = 50051;
	 	Server server;	
		server = ServerBuilder.forPort(port)
				.addService(cookerServer)
				.build()
				.start();
		
		logger.info("Server started, listening on " + port);
		
		server.awaitTermination();
	}
	
	private boolean status = false;
	private boolean activeCooker = false;
	private boolean activeHeater = false;

	public void switchOn(Empty request,
	         io.grpc.stub.StreamObserver<statusOfSwitches> response) {
				activeCooker = true;
				System.out.println("The cooker is On");

	         response.onNext(statusOfSwitches.newBuilder()
	                 .setSwitchStatus(activeCooker)
	                 .build());
	         response.onCompleted();
	     }
	
	public void switchOff(Empty request,
	         io.grpc.stub.StreamObserver<statusOfSwitches> response) {
				activeCooker = false;
				System.out.println("The cooker is Off");

	         response.onNext(statusOfSwitches.newBuilder()
	                 .setSwitchStatus(activeCooker)
	                 .build());
	         response.onCompleted();
	     }
	
	public void heatingOn(Empty request,
	         io.grpc.stub.StreamObserver<heatingStatus> response) {
				activeHeater = true;
				System.out.println("The heating on the cooker is turned on");

	         response.onNext(heatingStatus.newBuilder()
	                 .setHeatingONOFF(activeHeater)
	                 .build());
	         response.onCompleted();
	     }
	
	public void heatingOff(Empty request,
	         io.grpc.stub.StreamObserver<heatingStatus> response) {
				activeHeater = false;
				System.out.println("The heating is off on the cooker");

	         response.onNext(heatingStatus.newBuilder()
	                 .setHeatingONOFF(activeHeater)
	                 .build());
	         response.onCompleted();
	     }

}