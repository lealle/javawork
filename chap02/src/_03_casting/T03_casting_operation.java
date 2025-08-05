package _03_casting;

public class T03_casting_operation {

	public static void main(String[] args) {
		// int 형 보다 작은 자료형의 연산은 모두 int로 자동형변환 됨
		
		byte b1 = 10;
		byte b2 = 20;
		
//		byte b3 = b1 + b2; 오류 발생
		int result = b1 + b2;
		
		char c1 = 'A';
//		char c2 = c1 + 5; 오류 발생 int로 형변환 되기 떄문에
		int c3 = c1 + 5 ;
		
		char c4 = (char)c3;
		System.out.println(c4);
		System.out.println(c3);
		
		int num1 = 100;
		int num2 = 3;
		int result3 = num1 / num2; //몫만 출력
		double result4 = (double)num1/num2; //소수점자리까지 출력
		System.out.println(result3);
		System.out.println(result4);
		
		double dou1 = 3;
		double result5 = num1 / dou1; //double 로 출력 
		System.out.println(result5);

		//int로 강제 형변환 
		int result6 = (int)(num1/dou1);
		int result7 = num1/(int)dou1; 
		System.out.println(result6);
		System.out.println(result7);
		

		
		
		
	}

}
