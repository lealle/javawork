package _02_Array;

import java.util.Arrays;
import java.util.Scanner;

public class T03_ex1 {

	public static void main(String[] args) {
		// 1. 총점, 평균 구하기
		int score[] = {10,5,32,12,53};
		
		int sum = 0;
		for(int numnum : score) {
			sum+= numnum;
			
		}
		
		System.out.printf("총점 : %d\n평균 : %.1f\n", sum, (double)sum/score.length);
		
		// 2. 최대값 최소값 구하기
		int num[]= {27,89,92,16,9,109,29,3,32,45 };
		int min = 2555;
		int max = -2555;
		for(int numnum : num) {
			if(numnum > max) {
				max = numnum;
			}
			if(numnum < min) {
				min = numnum;
			}
		}
		System.out.printf("최대값 : %d\n최소값 : %d\n", max, min);
		
		
		// 3. 정수형 배열 10개를 만들어 랜덤함수를 이용하여 값 넣기
		
		
		int intarr[] = new int[10];
		for(int i=0; i<intarr.length; i++) {
			int rand = (int)(Math.random()*100+1);
			intarr[i] = rand;
		}
		for(int i=0; i<intarr.length; i++) {
			System.out.println(i+1 + "번째 숫자 : " + intarr[i]);
		}
//		System.out.println(Arrays.toString(intarr)); 이렇게도 출력문 가능 ! 
		
		// index 번호로도 연산 가능 
		int k = 3;
		System.out.println("4번째 값 "+intarr[0+k]);
		System.out.println("7번째 값 "+intarr[1+5]);
		System.out.println("7번째 값 "+intarr[2*3]);
		
		
		
		
		
	}

}
