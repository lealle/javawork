package _03_casting;

public class T01_promotion {

	public static void main(String[] args) {
		byte b1 = 20; 
		
		//자동 형변환
		short s1 = b1;
		int int1 = b1;
		int1 = s1;
		
		
		char ch1 = 'l';
		int int2 = ch1;
		System.out.println(ch1);
		System.out.println(int2);		
		
		
		double d1 = int1;
		System.out.println(d1);
		
		int int3 = s1++; // 사칙연산 int 형
		int int4 = ch1 + 1;
		
//		short s2 = s1 + b1; //byte + short -> int 형 따라서 오류
		int s2 = s1 + b1 ;
		
		
		
		float f1;
		
		System.out.println();
		System.out.println();
		
		
		
	}
}
