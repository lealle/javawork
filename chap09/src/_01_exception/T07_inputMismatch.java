package _01_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T07_inputMismatch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력");

		int sum = 0;
		int i=0;
		int num = 0;
		for(; i<3 ; i++) {
			System.out.print(i+1 + "번째 정수 입력 : ");
			try {
					num = sc.nextInt();
					sum += num;
				}
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다");
				sc.next();
				i--;
				
			}
		}
		System.out.println(sum);
		
	}

}
