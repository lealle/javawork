package _01_exception;

import java.util.Scanner;

public class T10_exception {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력");

		try {
			int sum = 0;
			int[] num1=new int[3];
			
			int num = 0;
			for(int i=0; i<3 ; i++) {
				System.out.print(i+1 + "번째 정수 입력 : ");
						num1[i] = sc.nextInt();
						sum += num1[i];
						
			}
			num1[3] = 5;
			System.out.println("합계 : " +sum);
		}
		catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println("배열 인덱스 오류 발생");
			e.printStackTrace();
			
		}
		catch(Exception e) { //Exception 모든 예외 클래스의 최상위 클래스 
			// 모든 예외 다 받음 
			System.out.println("오류 발생");
			e.printStackTrace();
		}
		
		//여러개의 catch 구문일때는 Exception 은 가장 마지막에 써야함 
	}

}
