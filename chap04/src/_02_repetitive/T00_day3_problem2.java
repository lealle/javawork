package _02_repetitive;

import java.util.Scanner;

public class T00_day3_problem2 {

	public static void main(String[] args) {
//
//		1.  주사위의 숫자 맞추기 게임
//	    랜덤으로 주사위숫자(1~6숫자 중 1개) 만들기
//	    사용자로 부터 숫자 입력받아서
//	    숫자를 맞추면 '축하합니다. 맞췄습니다' 하고 끝내기
//	    못맞췄으면 계속 물어보기
		Scanner scan = new Scanner(System.in);
		int num11 = 0;
		do {
			int dice = (int) (Math.random()*6)+1;
			System.out.print("주사위 숫자를 입력하세요 : ");
			int num1= scan.nextInt();
			if(dice == num1) {
				num11 = 1;
				System.out.println("축하합니다. 맞췄습니다.");
			}
		}while(num11!=1);
		
		System.out.println("======1번문제==========");
		
		//book #1
		int sum1 = 0;
		
		for(int i=1; i<=100 ; i++) {
			if(i%5==0) {
				sum1 +=i;
			}
		}
		System.out.println("5의 배수의 합계는 "+sum1);
		
		System.out.println("======2번문제==========");
		
		//book #2
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i=1; i<=100 ; i++) {
			if(i%2==0) {
				evenSum +=i;
			}
			if(i%2==1) {
				oddSum +=i;
			}
		}
		
		System.out.println("짝수의 합계는 : "+evenSum);
		System.out.println("홀수의 합계는 : "+oddSum);
		
		System.out.println("======3번문제==========");
		
		//book #3
		for(int i=1; i<=6 ; i++) {
			for(int j=1; j<=6 ; j++) {
				if(i+j ==6) {
					System.out.printf("(%d,%d)\n",i,j);
					
				}
			}
		}
		
		System.out.println("======4문제==========");
		
		// book #4
		for(int i=1; i<=5 ; i++) {
			for(int j=1; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("======5번문제==========");
		
		// book #5
		
		for(int i=1; i<=5 ; i++) {
			for(int j=5; j>=i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("======6번문제==========");
		
		
		//book #6
		
		for(int i=1; i<=5 ; i++) {
			for(int k=5; k>i;k--) {
				System.out.print(" ");
			}
			for(int z=i-1; z>=1;z--) {
				System.out.print("*");
			}
			
			for(int j=1; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("======7번문제==========");
		

		//book #7
		int rollnum = 0;
		int num77 =0;
		do {
			int dice = (int) (Math.random()*6)+1;
			System.out.println("("+ dice+")");
			
			if(dice == 6) {
				num77 = 1;
			}
			rollnum++;
			
		}while(num77==1);
		System.out.println("총 주사위 굴린 횟수는 : "+rollnum+"회");
		
		
		
		System.out.println();
		//7번만 수정하면 끝
	}

}
