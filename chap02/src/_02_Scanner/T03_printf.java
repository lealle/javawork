package _02_Scanner;

public class T03_printf {

	public static void main(String[] args) {
		//십진수 출력
		System.out.printf("%d\n", 3);
		System.out.printf("%d, %d\n", 10, 20);
		
		int num1 = 100;
		int num2 = 200;
		
		System.out.printf("%d, %d\n", num1, num2);
		
		//8진수 출력 %o
		System.out.printf("%o\n", 8);	
		System.out.printf("%o, %o\n", num1, num2);
		
		//16진수 출력 %x
		System.out.printf("%x\n", 16);	
		System.out.printf("%x, %x\n", num1, num2);
		//대문자면 대문자로 출력
		System.out.printf("%X\n", 10);	
		
		//실수형 출력
		System.out.printf("%f\n", 16.66666666666666);	//6자리까지만 출력
		System.out.printf("%.3f\n", 16.66666666666666);	//3자리까지 반올림
		
		//문자 하나 출력 
		System.out.printf("%c\n", 'a');	
		
		//문자열 출력
		System.out.printf("%s\n", "abcdefg");	
		
		//boolean 타입 (true false) > < printf 는 1 0 true false 
		System.out.printf("%b\n", 1);	
		
		//현재는 2025년 8월 이고, 우리나라의 평균 온도는 34.5도 입니다.
		System.out.printf("현재는 %d년 %d월 이고, 우리나라의 평균 온도는 %.1f도 입니다.\n", 2025,8,34.5);	
		
		//이 과정의 정원은 25명이고, 전체 19명이 수강중 입니다. 95% 달성하였습니다.
		System.out.printf("이 과정의 정원은 %d명이고, 전체 %d명이 수강중 입니다. %d%% 달성하였습니다.\n", 25,19,76);	
		System.out.format("이 과정의 정원은 %d명이고, 전체 %d명이 수강중 입니다. %d%% 달성하였습니다.\n", 25,19,76);	
		// -> 똑같다.
		
		
		
		
		
		
	}

}
