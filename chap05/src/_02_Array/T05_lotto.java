package _02_Array;

import java.util.Arrays;

public class T05_lotto {

	public static void main(String[] args) {
		// 1~45 다 넣은 후 random으로 6개 추출 
		
		// 45개 배열에 값을 넣기
		
		int lotto[]= new int[45];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = i+1;
		}
		System.out.println(Arrays.toString(lotto));
			
		for(int j=0; j<6; j++) {
			int c = 0;
			int a = (int)(Math.random()*45);
			if(a == j) {
				j--;
				continue;
			}
			c = lotto[a];
			lotto[a] = lotto[j];
			lotto[j] = c;
		}
		
		for(int j=0; j<6; j++) {
			System.out.print(lotto[j] +" ");
		}
		System.out.println();
		
		
		System.out.println(Arrays.toString(lotto));
	}

}
