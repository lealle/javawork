package _01_operation;

public class T01_operation {

	public static void main(String[] args) {
		// 
		int num1 = 10;
		int num2 = 20;
		
//		num1 = num1 + 10;
		num1 += 10;
		System.out.println(num1);
		
		num1 = 10;
		num1 -=5;
		System.out.println(num1);
		
		num1 = 10;
		num1 *=3;
		System.out.println(num1);
		
		num1 = 10;
		num1 /=2;
		System.out.println(num1);
		
		num1 = 10;
		num1 %=3;
		System.out.println(num1);
		
		num2 = 30_000_000; // _ 넣어도 오류 x 눈에 딱 띄게 표현 가능 
		
		int num3 = num2 *2;
		System.out.println(num3);
		
		
	}

}
