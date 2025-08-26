package socket;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientProgram {
	public static void main(String[] args) {
		// 1. 서버의 포토번호, IP주소를 알아야함 
		int port = 3005;

		BufferedReader br = null; 	// 입력용 보조스트림
		PrintWriter pw =null;		// 출력용 보조스트림 
		Scanner sc = new Scanner(System.in);	
		Socket socket = null;
		
		try {
			String ip = InetAddress.getLocalHost().getHostAddress();
			socket = new Socket(ip,port);
			
			System.out.println("서버와 연결 성공!");
			
			// 5. 기반 스트림 생성 (바이트 스트림 밖에 안됨)
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
					
			// 6. 보조 스트림 생성하여 성능 개선 
			// 입력용 보조 스트림 
			br = new BufferedReader(new InputStreamReader(is));
			pw = new PrintWriter(os);
						
			System.out.println("서버 : "+br.readLine());
			
			while(true) {
				System.out.print("클라이언트 : ");
				pw.println(sc.nextLine());
				// nextLine 으로 읽을시 반대편에서 println 을 해줘야함 
				pw.flush(); // 이거 안하면 쌓아만 둠 
				
				System.out.println("서버 : "+br.readLine());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			br.close();
			pw.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
