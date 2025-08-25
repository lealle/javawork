package _02_ByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
	바이트 스트림
	- 바이트 스트림 : 데이터를 1바이트 단위로 전송하는 통로(좁은 통로임. 한글 깨짐)
	- 기반 스트림 : 외부매체와 직접적으로 연결되는 통호
	
	xxxInputStream : xxx매체로부터 데이터를 입력받는 통로(외부매체로부터 데이터를 읽어오겠다.)
	xxxOutputStream : xxx매체로부터 데이터를 출력하는 통로(외부매체로 데이터를 내보내겠다. 쓰겠다.)

*	순서
*	1. 스트림 생성 (통로 생성)
*	2. 스트림으로 데이터 출력, 입력 (메소드를 활용)
	3. 다 사용한 후 스트림 반납 
*/	
public class ByteStreamApi {
	
	public void fileSave() {
		// FileOutputStream : 파일과 직접 연결하여 1바이트씩 출력(쓰기) 하는 스트림  
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("a_byte.txt"); // 파일있으면 통로 연결,  없으면 만들어서 통로 만들어줌 
			// 1. 스트림 생성 
			
			// 2. 스트림으로 데이터 출력 : write 메소드 사용 
			fos.write(97); // 'a'  , IOException 필요 
			fos.write('b');
			byte[] arr = {99,100,101};
			fos.write(arr); // 하나씩 받아서
			
			// 바이트에 길이 몇개까지 넣으시오 도 가능 
			fos.write(arr, 1, 2); // 배열 인덱스 개수 
			// (배열, 시작인덱스, 갯수)
			// 인덱스 1번부터 2개 넣으시오
			
			// 한글은 깨짐 2바이트이어서 
//			fos.write('은'); 
//			fos.write('왕'); 
//			fos.write('랑'); 

		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		try {
			// 3. 다 사용한 후 스트림 반납 
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}// method end
	
	
	public void fileRead() {
		// FileInputStream : 파일로부터 데이터를 1바이트 단위로 입력받는 스트림 
		FileInputStream fis = null;
		try {
//		*	1. 스트림 생성 (통로 생성)
			fis = new FileInputStream("a_byte.txt");
			
//			2. 스트림으로 데이터 출력, 입력 (메소드를 활용)
			// 1바이트 단위로 하나씩 읽어옴 / 숫자로 읽음 
//			System.out.println(fis.read()); // 97
//			System.out.println((char)fis.read()); // 문자로 형변환  'a'

			// read() : 읽어올 데이터가 없을 때 -1 반환 
//			while(!((fis.read()) == -1))
//			{
//				System.out.println((char)fis.read()); // 문자로 형변환
//				// 퐁당퐁당 읽어옴 하나 건너서 읽어옴 while에 read 본문에 read 라 하나씩 건너서 읽음 
//			}
			// 해결방법 1.
//			while(true)
//			{
//				int value = fis.read();
//				if(value == -1)
//					break;
//				System.out.println((char)value); // 문자로 형변환
//			}

			// 해결방법 2. 권장방법 
			int value =0;
			while((value = fis.read()) != -1) // 우선순위 문제로 () 해줘야함 
			{
				System.out.println((char)value); // 문자로 형변환
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//			3. 다 사용한 후 스트림 반납 
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
		
		
	}
	
} // class end
