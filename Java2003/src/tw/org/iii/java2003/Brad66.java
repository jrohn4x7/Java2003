package tw.org.iii.java2003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad66 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9999);
			Socket socket  = server.accept();
			
			System.out.println(socket.getInetAddress().getHostAddress());
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			int i; String line;
			while ( (line = reader.readLine()) != null){
				System.out.println(line);
			}
			reader.close();
			
			server.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

}
