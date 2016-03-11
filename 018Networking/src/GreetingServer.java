import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class GreetingServer extends Thread {
//step 1 : create server
	private ServerSocket server;
	
	public GreetingServer(int port) throws IOException{
		server = new ServerSocket(port);
//setting server timeout
		//server.setSoTimeout(10000);		
	}
	
	@Override
	public void run() {
		while(true){
			System.out.println("server started .... waiting for client"
					+ "on port no. "+server.getLocalPort());
	//now make server eligible to connect and accept client req
			try {
				Socket socket=server.accept();//server is now connected
				System.out.println("Just got connected to "
				+socket.getRemoteSocketAddress());
		//read the client message
				DataInputStream dis = new DataInputStream(
						socket.getInputStream());
				System.out.println(dis.readUTF());
		//giving response to the client
				DataOutputStream dos = new DataOutputStream(
						socket.getOutputStream());
				dos.writeUTF("Thank your so much for connecting ..."
						+ "to "+socket.getLocalSocketAddress()
						+"\n Goodbye Have a nice Day!!!");
				socket.close();
				
			} catch (IOException e) {
				e.printStackTrace();
				break;
			}
		}//end of while
	}//end of run

	public static void main(String[] args) {
		int port = 2222;
		Thread t1;
		try {
			t1 = new GreetingServer(port);
			t1.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
