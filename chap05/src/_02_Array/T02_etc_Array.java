package _02_Array;

import java.util.Arrays;
import java.util.Scanner;

public class T02_etc_Array {
	public static void main(String[] args) {
		char chArr[]= {'a', 'b', 'c'};
		String strArr[] = {"홍길동", "basd", "%^&"};
		boolean bArr[] = {true , false, true, true};
		double dArr[]= {3.141592, 3.112431, 124512321,313.123};
		
		
		// 3개의 이름을 받아 배열에 입력 
		// 1번째 이름 입력 :
		// 2번째 이름 입력 :
		// 3번째 이름 입력 :
		
		Scanner scan = new Scanner(System.in);
		String strArr1[] = new String[3];
		for (int i=0; i<strArr1.length; i++) {
			System.out.printf("%d번째 이름 입력 : ",i+1);
			String arr = scan.next();
			strArr1[i] = arr;
		}	
		
		for (int i=0; i<strArr1.length; i++) {
			System.out.printf("%d번째 이름 : %s\n",i+1, strArr1[i]);
		}	
		
		
		// 깔끔한 출력 
		System.out.println(Arrays.toString(bArr));
		
		// char 은 값이 나옴-> String 처럼 나옴 - abc (다른건 주소 나옴)
		System.out.println(chArr);
		
		
	}
}
