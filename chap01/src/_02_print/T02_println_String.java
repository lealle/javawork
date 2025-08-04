package _02_print;

public class T02_println_String {

	public static void main(String[] args) {
		// 숫자 + 문자 일 경우   (" 문자  " +  숫자 )
		
		// + 기호 숫자였을때는 연산 문자열이었을 떄는 문자들을 연결 
		System.out.println(5+7+"문자열 연결");
		System.out.println("강의실 : "+"801호");

		// String 뒤에 숫자가 있을경우 숫자를 문자열로 취급 (문자열 + 뒤 숫자 문자열로 인식 -> 문자열 연결)
		System.out.println("연산결과 : "+ 5 + 8);
		// 숫자로 인식시켜야하여 () 로 연산 시켜줘야함 
		System.out.println("연산결과 : "+ (5 + 8));
		// - 이어도 그러는데 - 는 아무의미 없음  x 및 나누기는 String 뒤에있어도 숫자로 인식되서 써도 Ok
		System.out.println("연산결과 : "+ 5 * 8);
		
		

		
	}

}
