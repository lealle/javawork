package _02_Array;

import java.util.Arrays;

public class T06_ArrayFor {

	public static void main(String[] args) {
		// 배열에서만 사용가능
		// 전체배열만 가져올 수 있음 
		int[] num1= {1,2,3,4,5,6,7,8,9};
		int sum = 0;
		
		for (int num : num1 ) { 
			sum+= num;
			System.out.println(num);
		}
		System.out.println(sum);
		
		String name[] = {"홍길도","아무개","강감참"};
		for (String result : name) {
			System.out.println(result);
		}
		// name2 -> name 의 역순으로 저장하고 싶음 이럴때 이런 형식으로는 불가 
			
		String name2[] = new String[3];
		int index =0;
		for (String result : name) {
			name2[index] = result;
			index++;
			System.out.println(name2[index-1]);
		}
		
		System.out.println(Arrays.toString(name2));
		
		
		
		
	}

}
