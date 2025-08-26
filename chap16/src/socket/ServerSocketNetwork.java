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

/*
	Socket
	- 프로세스간의 통신 담당
	- Input / Output Stream 가지고있고 (이 스트림으로 통신, 이 스트림을 통해 입출력이 이루어짐 1바이트 스트림만 가능)
	- 소켓 프로그램(TCP / UDP)
	> TCP 방식 : 데이터 전송속도가 느림, 정확하고 안정적으로 전달 가능 
	(신뢰성이 요구되는 프로그램에 사용 : http, email, ...)
		- 서버와 클라이언트 간의 1:1 소켓 통신
		- 데이터를 교환하기에 앞서 서버, 클라이언트는 연결되어 있어야 함. (서버가 먼저 실행되고, 클라이언트 요청을 기다리고 있음) 
	> UDP 방식 : 데이터 전송속도가 빠름, 신뢰성이 없는 데이터 전달 (실시간동영상 서비스, P2P) 
		- 서버와 클라이언트 간의 1:N 소켓 통신
	ServerSocket
		- 포트와 연결(Bind)되어 외부의 연결 요청을 기다리다 요청이 들어오면 수락해줄 용도
		수락 => 통신할 수 있는 Socket 생성 
	
*/
public class ServerSocketNetwork {

	public static void main(String[] args) {
		// 1) 포트번호 지정 
		int port = 3005;

		BufferedReader br = null; 	// 입력용 보조스트림
		PrintWriter pw =null;		// 출력용 보조스트림 
		Scanner sc = new Scanner(System.in);	
		ServerSocket server = null;
		
		try {
			// 2. ServerSocket 객체 생성시 포트 결합(Bind) : 클라이언트의 연결 요청이 들어오면 수락해줄 용도 
			server = new ServerSocket(port);
			
			// 3. 클라이언트의 연결요청이 올 때까지 대기 상태 
			System.out.println("클라이언트의 요청을 기다리고 있음...");
			
			// 4. 연결 요청이 오면 수락 후 클라이언트와 통신할 수 있는 소켓 객체 생성 
			Socket socket = server.accept();	
			System.out.println(socket.getInetAddress().getHostAddress()+"가 연결을 요청함"); // 클라이언트의 Address
			
			// 5. 기반 스트림 생성 (바이트 스트림 밖에 안됨)
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
		
			// 6. 보조 스트림 생성하여 성능 개선 
			// 입력용 보조 스트림 
			br = new BufferedReader(new InputStreamReader(is));
			pw = new PrintWriter(os);
			// 데이터 출력시 print(), println() 메소드 가지고 있음 
			
			pw.println("환영합니다.");
			pw.flush(); // 현재 스트림의 데이터를 강제로 내보내고 비움 
			
			while(true) {
				System.out.println("클라이언트 : " +br.readLine());
				System.out.print("서버 : ");
				pw.println(sc.nextLine());
				pw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 통신 종료
		try {
			br.close();
			pw.close();
			server.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
