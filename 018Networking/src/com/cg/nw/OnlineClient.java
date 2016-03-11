package com.cg.nw;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class OnlineClient {
	public static void main(String[] args) 
			throws UnknownHostException, IOException {
		//to read from keyboard
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String ip="192.168.1.183";
		int port=3333;
		//write to server
		Socket socket = new Socket(ip, port);
		DataOutputStream out = new DataOutputStream(
				socket.getOutputStream());
		DataInputStream in = new DataInputStream(
				socket.getInputStream());
		String input=null;
		do{
			input=br.readLine();
			out.writeUTF("Client says :"+input);
			System.out.println(in.readUTF());
		}while(!input.equalsIgnoreCase("bye"));
		System.out.println("Client Disconnecting");
		br.close();
		in.close();
		out.close();
	}//end of main
}//end of class
