package TwoWaySocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class StringServerSocket {
	
	public static void main(String[] args) {
		String receiveMessage;// mesaj almak
		String sendMessage; // mesa j göndersin
		System.out.println("Server Hazýr");
		
		try {
			ServerSocket serverSocket = new ServerSocket(8586);
			Socket socket = serverSocket.accept();
			
			OutputStream outputStream = socket.getOutputStream();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			
			PrintWriter printWriter = new PrintWriter(outputStream, true);
			
			InputStream inputStream = socket.getInputStream();
			BufferedReader receiveRead = new BufferedReader(new InputStreamReader(inputStream));
			
			while (true) {
				if ((receiveMessage = receiveRead.readLine()) != null) {
					System.out.println("CLIENT: " + receiveMessage);
				}
				sendMessage = bufferedReader.readLine();
				printWriter.println(sendMessage);
				printWriter.flush();
				WriteToFileWithSocket.writeToFile("Client: " + receiveMessage);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
