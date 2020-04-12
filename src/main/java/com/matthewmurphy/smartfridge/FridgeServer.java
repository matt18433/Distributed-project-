package com.matthewmurphy.smartfridge;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import com.matthewmurphy.smartfridge.itemsInFridge;
import com.matthewmurphy.smartfridge.numResponse;
import io.grpc.stub.StreamObserver;

import com.matthewmurphy.smartfridge.smartFridgeGrpc.smartFridgeImplBase;
import com.matthewmurphy.smartfridge.Empty;
import com.matthewmurphy.smartfridge.statusOfDoor;

public class FridgeServer extends smartFridgeImplBase {

	private static final Logger logger = Logger.getLogger(FridgeServer.class.getName());

	public static void main(String[] args) throws IOException, InterruptedException {
		FridgeServer fridgeServer = new FridgeServer();

		int port = 50051;
		Server server;
		server = ServerBuilder.forPort(port).addService(fridgeServer).build().start();

		logger.info("Server started, listening on " + port);

		server.awaitTermination();
	}

	private boolean statusOf_Door = false;
	private boolean activeFridge = false;

	public void switchOn(Empty request,
			io.grpc.stub.StreamObserver<statusOfSwitches> response) {
		activeFridge = true;
		System.out.println("The fridge is on");

		response.onNext(statusOfSwitches.newBuilder()
				.setSwitchStatus(activeFridge)
				.build());
		response.onCompleted();
	}

	public void switchOff(Empty request,
			io.grpc.stub.StreamObserver<statusOfSwitches> response) {
		activeFridge = false;
		System.out.println("The fridge off");

		response.onNext(statusOfSwitches.newBuilder()
				.setSwitchStatus(activeFridge)
				.build());
		response.onCompleted();
	}

	public void doorOpen(statusOfDoor request, 
			io.grpc.stub.StreamObserver<statusOfDoor> response) {

		statusOf_Door = true;
		String output = "The door is open take what you would like";

		statusOfDoor doorstatus = statusOfDoor.newBuilder().setStatusOfDoorMsg(output).setStatus(statusOf_Door).build();
		response.onNext(doorstatus);
		response.onCompleted();
	}

	public void doorClosed(statusOfDoor request,
			io.grpc.stub.StreamObserver<statusOfDoor> response) {

		statusOf_Door = false;
		String output = "The door is closed";

		statusOfDoor doorstatus = statusOfDoor.newBuilder().setStatusOfDoorMsg(output).setStatus(statusOf_Door).build();
		response.onNext(doorstatus);
		response.onCompleted();
	}

	public StreamObserver<itemsInFridge> fridgeItems(final StreamObserver<numResponse> responseObserver) {
		return new StreamObserver<itemsInFridge>() {
			public void onNext(itemsInFridge request) {
				StringBuilder returns = new StringBuilder();

				returns.append(request.getItems());
				System.out.println(returns);

				numResponse reply = numResponse.newBuilder().setItems(returns.toString()).build();

				responseObserver.onNext(reply);
			}

			public void onError(Throwable t) {
				System.out.println("Error, service stopped try again");
			}

			public void onCompleted() {
				responseObserver.onCompleted();
			}
		};
	}
}
