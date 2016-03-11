import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class MyClient {

	public static void main(String[] args) throws IOException {
		//step 1 : create socket and connect to host by passing port
		int port=2222;
		String host="localhost";
		Socket s = new Socket(host,port);		
		//step 2 : read and write
		DataInputStream in = new DataInputStream(
				s.getInputStream());
		DataOutputStream out = new DataOutputStream(
				s.getOutputStream());
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		String serverMsg="",clientResponse="";
		while(!serverMsg.equals("bye")){		
			clientResponse = br.readLine();
			//typing the message
			out.writeUTF(clientResponse);
			out.flush();
			serverMsg=in.readUTF();
			System.out.println("Server : "+serverMsg);						
		}
		s.close();
		out.close();
		in.close();
		
	}

}
