package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocketNetwork2 {

	public static void main(String[] args) {
		int port = 3005;
		Scanner sc = new Scanner(System.in);	
		try {
			try(ServerSocket server = new ServerSocket(port);){
				
				System.out.println("클라이언트의 요청을 기다리고 있음...");
				
				Socket socket = server.accept();	
				System.out.println(socket.getInetAddress().getHostAddress()+"가 연결을 요청함"); // 클라이언트의 Address
				try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					PrintWriter pw = new PrintWriter(socket.getOutputStream());)	
				{	
					
					pw.println("환영합니다.");
					pw.flush(); 
					
					while(true) {
						System.out.println("클라이언트 : " +br.readLine());
						System.out.print("서버 : ");
						pw.println(sc.nextLine());
						pw.flush();
					}
					
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
