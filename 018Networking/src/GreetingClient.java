import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;


public class GreetingClient {

	public static void main(String[] args) {
		String serverName="";
		int port =2222;
		
		try {
			System.out.println("Trying to Connect to ..."
					+serverName+ " on prt no. "+port);
	//need client to connect to server on port
			Socket client = new Socket(serverName, port);
			System.out.println("Got connected to server...");
			//read and write
			DataOutputStream dos = new DataOutputStream(
					client.getOutputStream());
			dos.writeUTF("Hello from : "
					+client.getLocalSocketAddress());
			DataInputStream dis = new DataInputStream(
					client.getInputStream());
			System.out.println(dis.readUTF()); 
			
			client.close();
		} catch (Exception e) {
			e.printStackTrace();
		}//end of try

	}//enf main

}
