package _02_Array;

import java.util.Arrays;

public class T04_two_dimentionalArray {

	public static void main(String[] args) {
		int[][] score = {
				{1, 2, 3, 4, 5 },    		// 0번행 [0] 
				{6, 7, 8, 9, 10},			// 1번행 [1]
				{11,12,13,14,15}		// 2번행 [2]
			// [0] [1] [2] [3] [4]
		};
		System.out.println(score[1][2]); // 8
		System.out.println(score[2][1]); // 12
		
		System.out.println("score의 길이 (행 길이) : "+score.length); //행의 길이
		System.out.println("score[0]의 길이 (열 길이) : "+score[0].length); // 열의 길이
		System.out.println("score의 길이 (전체 길이) : "+score.length * score[0].length); //전체 길이 
		
		// 2차 배열 -> 2중 반복문 사용 
		
		for(int i = 0; i< score.length; i++) {
			for(int j=0; j < score[0].length; j++) {
				System.out.print(score[i][j]+" "); //행의 길이
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		
		// 4행 3열 배열에 값을 3의 배수로 넣기 
		
		int a = 1;
		int arr[][] = new int[4][3]; 
		for(int i = 0; i< arr.length; i++) {
			for(int j=0; j < arr[0].length; j++) {
				arr[i][j] = 3*a; 
				a++;
			}
		}
		for(int i = 0; i< arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		
		System.out.println("-----------------------");
		
		// 열 수 이렇게 다를 수도 있음 
		int[][] iArr2= {
				{1, 2, 3 },    		// 0번행 [0] 
				{4,5},			// 1번행 [1]
				{6,7,8,9}		// 2번행 [2]
			// [0] [1] [2] [3] [4]
		};
		
		for(int i = 0; i< iArr2.length; i++) {
			for(int j=0; j < iArr2[i].length; j++) {
				System.out.print(score[i][j]+" "); //행의 길이
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		
		
		System.out.println();
		
		
		
	}

}
