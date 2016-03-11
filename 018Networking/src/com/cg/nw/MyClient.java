package com.cg.nw;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {

	public static void main(String[] args)
			throws UnknownHostException, IOException {
		//String ip="192.168.1.51";
		String ip="localhost";
		int port = 2222;
		Socket client = new Socket(ip, port);
		System.out.println("Client created...."
				+ "trying to connect to server");
		//send request to the server
		DataOutputStream out = new DataOutputStream(
				client.getOutputStream());
		out.writeUTF("Hello from Smita");
		
		DataInputStream in = new DataInputStream(
				client.getInputStream());
		System.out.println(in.readUTF());
		
		System.out.println("Client Disconnecting....");

	}

}
