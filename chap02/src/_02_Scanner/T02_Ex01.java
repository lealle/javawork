package _02_Scanner;

import java.util.Scanner;

public class T02_Ex01 {
	public static void main(String[] args) {
		//국어, 컴퓨터, 수학 점수를 사용자로부터 입력받아 저장하고 
		//총점과 평균을 출력하시요
		Scanner scan = new Scanner(System.in);
		
		int a,b,c, sum;
		
		
		
		System.out.print("국어점수를 입력하세요 : ");
		a = scan.nextInt(); 
		
		System.out.print("컴퓨터점수를 입력하세요 : ");
		b = scan.nextInt(); 
		
		System.out.print("수학점수를 입력하세요 : ");
		c = scan.nextInt(); 
		
		
		sum = a + b + c;
		double average;
		average = (double)sum/3;
		
		System.out.println("총점 : "+sum );
		System.out.printf("평균 : %.1f", average);
		
		
		
		
	}
}
