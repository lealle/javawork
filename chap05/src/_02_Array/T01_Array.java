package _02_Array;

public class T01_Array {
	public static void main(String[] args) {
		// 
		/*
		 * 배열
		 * 1. 같은 자료형을 연속된 저장공간에 저장함 
		 * 2. 배열의 객수는 나중에 변경 불가 
		 */
		
		// 저장공간만 확보하고 값은 나중에
		int[] arrayInt = new int[10];
		//int arrayInt2[] = new int[10]; 도 가능! 편한걸로
		
		// 배열을 만들면서 값을 바로 넣을 때 
		int[] arrayInt3 = {1,2,3,4,5};
		
		// 주소값 출력 (4byte)
//		System.out.println(arrayInt3);
		// 인덱스로 원하는 위치의 값 출력
		System.out.println(arrayInt3[0]);
		System.out.println(arrayInt3[3]);
		
		arrayInt3[4] = 10;
//		System.out.println(arrayInt3[0]);
//		System.out.println(arrayInt3[1]);
//		System.out.println(arrayInt3[2]);
//		System.out.println(arrayInt3[3]);
//		System.out.println(arrayInt3[4]);

		// 반복문과 배열을 활용한 출력
		for(int i = 0; i<5 ; i++) {
			System.out.println(arrayInt3[i]);
		}
		System.out.println("----------------------");
		
//		arrayInt3[0] = 0;
//		arrayInt3[1] = 2;
//		arrayInt3[2] = 4;
//		arrayInt3[3] = 6;
//		arrayInt3[4] = 8;

		for(int i = 0; i<5 ; i++) {
			arrayInt3[i] = 2*i;
//			System.out.println(arrayInt3[i]);
		}
		
		// 이런형식으로도 출력 가능 
		for(int num : arrayInt3) {
			System.out.println(num);
		}
		
		int int1[] = {3,4,4,5,6,1,23,4};
		int int2[] = new int[10];
		System.out.println("int1의 길이 : " + int1.length);
		System.out.println("int1의 길이 : " + int2.length);
		
		for(int i = 0; i< int1.length; i++) {
			System.out.println(int1[i]);
		}

		// 문
		// 길이가 5인 배열에 for 문으로 값을 0 3 6 9 12 넣어라
		// 안의 값을 합계를 구하여 출력하기
		int int3[] = new int[5];
		int sum = 0;
		
		for(int i = 0; i<int3.length ; i++) {
			int3[i] = 3*i;
			sum += int3[i];
//			System.out.println(int3[i]);
		}
		System.out.println("합계는 : " + sum);

		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
	}
}
