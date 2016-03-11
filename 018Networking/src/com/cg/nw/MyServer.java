package com.cg.nw;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	public static void main(String[] args) 
			throws IOException {
		ServerSocket server = new ServerSocket(2222);
		System.out.println("Server created on port 2222");
		Socket socket= server.accept();//ready to accept client req
		System.out.println("Server is running, "
				+ "ready to server the client");
		//read from the client(accept request)
		DataInputStream dis = new DataInputStream( 
				socket.getInputStream());
		System.out.println(dis.readUTF());
		//write on the client(give response)
		DataOutputStream dos =new DataOutputStream(
				socket.getOutputStream());
		dos.writeUTF("Hello From Server");
		System.out.println("Server is shutting down");
		dis.close();
		dos.close();
		
	}
}
