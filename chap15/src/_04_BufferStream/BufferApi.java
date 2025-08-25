package _04_BufferStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
	보조스트림 : 기반스트림만으로 부족했던 성능개선을 해주는 스트림 
				기반스트림에서 제공하지 않는 추가적인 메소드 제공 (전송속도 높인다거나 등등)
	>> 외부매체와 직접 연결되지 않음 
	   단독 사용 불가(반드시 기반스트림과 함께 사용)
	   
	*BufferedWriter / BufferedReader : 버퍼라는 공간을 제공해주는 보조스트림(속도 향상)
	*
*/
public class BufferApi {
	// 기반스트림 : FileWriter 사용 (2바이트 단위 전송 )
	// 보조스트림 : BufferedWriter 사용 	
	public void filesave() {
		BufferedWriter bw = null;
		try {
			// 1. 기반 스트림 생성 및 2. 보조스트림 생성 
			 bw = new BufferedWriter(new FileWriter("c_byte.txt")); 
			 
			 // 3. 쓰기
			 bw.write("안녕하세요?\n"); 
			 bw.write("반갑습니다");
			 bw.newLine(); // 한줄 내리시오 
			 bw.write("좋은 하루 되세요");
			 // 기반은 1개씩 출력 , 보조스트림은 버퍼라는 공간에 쌓아두었다가 한번에 출력 => 속도 향상 
			 
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	/*
			try~with~resource 구문 : 자원반납을 알아서 해줌 (나중에 DB작업때 편해짐)
			try(트라이 블럭내에서 사용할 스트림 객체 생성 구문){
				
			}catch(예외클래스 e ){
			
			}
	 */
	public void filesave1() {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("d_byte.txt")); 
				 ) {
			 
			 // 3. 쓰기
			 bw.write("안녕하세요?\n"); 
			 bw.write("반갑습니다");
			 bw.newLine(); // 한줄 내리시오 
			 bw.write("좋은 하루 되세요");
			 // 기반은 1개씩 출력 , 보조스트림은 버퍼라는 공간에 쌓아두었다가 한번에 출력 => 속도 향상 
			 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void fileread() {

		try(BufferedReader br = new BufferedReader(new FileReader("d_byte.txt"))) { // 이러면 자원반납 안해도 됨
			int value =0;
			while(( value = br.read() )!=-1) {
				System.out.print((char)value);
			}
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fileread1() {

		try(BufferedReader br = new BufferedReader(new FileReader("d_byte.txt"))) { // 이러면 자원반납 안해도 됨
			String read;
			while((read = br.readLine()) != null) {
				System.out.println(read);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
