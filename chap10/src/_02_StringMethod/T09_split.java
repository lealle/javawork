package _02_StringMethod;

import java.util.Arrays;

public class T09_split {

	public static void main(String[] args) {
		String str = "더조은-홍길동-이순신-아무개";
		String name[] = str.split("-");
		System.out.println(name.length);
		System.out.println(Arrays.toString(name));
		
		str = "더조은-홍길동/이순신,아무개@서민구";
		// 둘다 잘 나눠짐 선택! |로 나누던지 [] 로 묶던지 선택하기 
		String name1[] = str.split("[-/,@]");
		String name2[] = str.split("-|/|,|@");

		System.out.println(name1.length);
		System.out.println(Arrays.toString(name1));

		String str3 = "더조은-홍길동-이순신-아무개";
		String name3[] = str.split("-",2); // 배열 개수 지정 split(분리문자열, 배열의 개수)
		System.out.println(name3.length);
		System.out.println(Arrays.toString(name3));

		
		
		
//		
//		for(String st : name1) {
//			System.out.println(st);
//		}
//		
//		for(String st : name2) {
//			System.out.println(st);
//		}
		
		
	}

}
