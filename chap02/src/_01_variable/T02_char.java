package _01_variable;

public class T02_char {

	public static void main(String[] args) {
		char ch1 ='a';
		char ch2 ='감';
		char ch3 ='&';
//		char ch4 ='김지원'; -> 오류 문자 하나만 넣을 수 있음 
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		char ch5 ='A' + 1; // literal 값 (바로넣는값), // 유니코드 + 숫자 = 65 + 1
		System.out.println(ch5);
		
//		char ch6 = ch5 + 1) ; // literal 값 x (바로넣는값)
		
		char ch7 = 'A'+'1'; // 유니코드 + 유니코드 = 65 + 49 = 114 ->  r
		System.out.println(ch7);
		
		
		
		
		
	}

}
