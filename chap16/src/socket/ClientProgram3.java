package socket;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientProgram3 {
	public static void main(String[] args) {
		int port = 3005;
		Scanner sc = new Scanner(System.in);	

		try{
			String ip = InetAddress.getLocalHost().getHostAddress();
			System.out.println("서버와 연결 성공!");
			
			try(Socket socket = new Socket(ip,port);){
				try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					PrintWriter pw = new PrintWriter(socket.getOutputStream());)
				{
					String message =null;
					while((message = br.readLine()) != null) {
						if(message.equals("exit")) {
							System.out.println("채팅 종료");
							break;
						}
						System.out.println("서버 : "+message);
						
						System.out.print("클라이언트 : ");
						String sendMsg = sc.nextLine(); 
						pw.println(sendMsg);
						pw.flush(); 
						if(sendMsg.equals("exit"))
							break;
					}
					System.out.println("서버와 연결 종료");
				}
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
