package _01_variable;

public class T01_variable {

	public static void main(String[] args) {
		
		/*
		 * 기본 자료형
		 * 정수 : int (4byte) 
		 * 실수 : double (8byte), float (4byte)
		 * 참 거짓 : boolean (2byte)
		 * 문자 1개 : char (2byte)
		 * 
		 * 정수 : (1byte)
		 * short (2byte) 
		 * int (4byte)
		 * long (8byte) : 숫자 뒤 L 붙어줌 (안붙일시 정수로 취급)
		 * 
		 * 실수
		 * double (8byte) 
		 * float (4byte) : 숫자 뒤 f 붙어줌 (안붙일시 정수로 취급)
		 */
		int num1;
		int num2 = 10;
		
		num1 = 20;
		
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println(num1+num2);
		System.out.println(num1*2+num2);
		
		int result = num1 * 2 + num2;
		System.out.println(result/5);
		
		// long (8byte) : 숫자 뒤 L 붙어줌 (안붙일시 정수로 취급)
		long long01 = 5000000000000L;
		
		//double 과 float 의 차이 소수점 어디까지 표현 가능한가의 차이
		double dou01= 39.295312098;
		System.out.println(dou01);
		
		//float (4byte) : 숫자 뒤 f 붙어줌 (안붙일시 정수로 취급)
		float flo01 = 39.295312098f;
		System.out.println(flo01); // 소수점 5자리수까지밖에 안나옴 
		
		
	}

}
