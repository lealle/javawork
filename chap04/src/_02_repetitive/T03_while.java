package _02_repetitive;

import java.util.Scanner;

public class T03_while {
	public static void main(String[] args) {
		// for문을 while로 바꾸기
		for(int i = 1; i<=5; i++) {
			System.out.println(i);
		}
		
		System.out.println("-----while문-----");
		int i = 0;
		while (i<5) {
			System.out.println(i);
			i++;
		}
		
		int sum= 0;
		i = 1;
		while(i<=100){
//			sum +=i; 
//			i++;
			sum = sum + i++; ////이렇게도 쓸수 있움 
//			sum += i++; //더 줄이면 이렇게도 가능
		}
		System.out.println("합계 : "+sum);
		
		//break 반복문 빠져나온다 - for, while, do-while
		int count =  0;
		while(true) {
			System.out.println(++count);
			
			if(count ==3) {
				System.out.println("카운트가 3이 되었습니다.");
				break;
			}
		}
		
		Scanner scan = new Scanner(System.in);
//		while(true) {
//			System.out.print("1문자 입력(끝내려면 'q' 입력) : ");
//			char ch = scan.next().charAt(0);
//			
//			System.out.println(ch);
//			if(ch == 'q') {
//				break;				
//			}
//		}
//		System.out.println("프로그램 종료");
		
		//사용자로부터 2개의 숫자를 입력받아 더한 숫자출력 
		// 끝내려면 0
		
		while(true) {
			System.out.println("끝내려면 첫번째 숫자 0 입력");
			System.out.print("2개의 숫자 입력(공백사용하여) : ");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			if(num1 == 0 ) {
				break;				
			}
			System.out.println(num1+ " + "+num2+" = "+(num1+num2) );
			
		}
		System.out.println("프로그램 종료");
		
		
		
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
