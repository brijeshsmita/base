import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class MyServer {

	public static void main(String[] args) throws IOException {
		try {
			
		
		//step 1 : create server
		int port=2222;
		ServerSocket ss = new ServerSocket(port);
		System.out.println("Server On... waiting for client");
		//step 2 :connect to the client
		Socket s = ss.accept();	
		System.out.println("Connection recieved.");
		
		//step 3 : read and write
		DataInputStream in = new DataInputStream(
				s.getInputStream());
		DataOutputStream out = new DataOutputStream(
				s.getOutputStream());
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		String clientMsg="",serverResponse="";
		while(!clientMsg.equals("bye")){
			clientMsg=in.readUTF();
			System.out.println("Client : "+clientMsg);
			serverResponse = br.readLine();//typing the message
			out.writeUTF(serverResponse);	
			out.flush();
		}
		in.close();
		s.close();
		ss.close();
		out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
