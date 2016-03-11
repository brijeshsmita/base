package com.cg.nw;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class OnlineServer {
	public static void main(String[] args) 
			throws UnknownHostException, IOException {
		//to read from keyboard
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int port=3333;
		ServerSocket server = new ServerSocket(port);
		System.out.println("Server started ...");
		//write to server
		Socket socket = server.accept();
		System.out.println("Server running ..."
				+ "waiting for client");
		DataOutputStream out = new DataOutputStream(
				socket.getOutputStream());
		DataInputStream in = new DataInputStream(
				socket.getInputStream());
		String input=null;
		String client=null;
		do{
			client=in.readUTF();
			System.out.println(client);
			input=br.readLine();			
			out.writeUTF("Server says :"+input);			
		}while(!client.equalsIgnoreCase("bye"));
		System.out.println("Server Disconnecting");
		br.close();
		in.close();
		out.close();
	}//end of main
}
