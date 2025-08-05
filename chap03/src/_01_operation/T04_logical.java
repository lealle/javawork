package _01_operation;

public class T04_logical {
	public static void main(String[] args) {
		// 논리곱과 논리합 
		/* 	x  	y  논리곱 (&&) 논리합 (||) 
			0	0	0			0
			0	1	0			1
			1	0	0			1
			1	1	1			1
		*/
		int num1 = 10;
		int num2 = 20;
		
		boolean result = num1 > num2 && num1 < num2; // f && t -> f 
		System.out.println("논리곱 : "+result);
	
		boolean result1 = num1 > num2 || num1 < num2; // f || t -> t 
		System.out.println("논리합 : "+result1);
		
		System.out.println("-------------------------");
		
		boolean result2 = num1 >= num2 ; 
		System.out.println(result2);
		System.out.println(!result2);
		System.out.println(!!result2);
		
		System.out.println("-------------------------");
		
		// A : 65 a : 97 
		char ch1 = 'K';
		//대문자 65 ~ 96 사이
		//소문자 97 ~ 128
		System.out.println("ch1 : "+ch1);
		System.out.println("소문자 인가 ? "+ (ch1 >= 'a'  && ch1 <='z'));
		System.out.println("대문자 인가 ? "+ (ch1 >= 'A'  && ch1 <='Z'));
		   // 97 ~ 128
		
		
		
	}
}
