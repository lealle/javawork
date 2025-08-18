package _02_StringMethod;

import java.util.Scanner;

public class T01_charArray {

	public static void main(String[] args) {
		String str1 =new String("java program");
		String str11 =new String("java program");
		
		String str2 = "tjoeun";
		String str22 = "tjoeun";
		
		char[] chArr= {'컴', '퓨', '터'};
		String str3 = new String(chArr);
		System.out.println(str3);
		
		char ch = str3.charAt(1);
		System.out.println(ch);
		
		// 주민번호를 넣은 변수
		// 123456-7 => 1,3 아면 남자
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
//		String ab ="123456-7";
		
		char ch1 = s.charAt(7);
		if(ch1 == '1' || ch1 == '3') { // 혹은 스위치 구문 
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
		
		str1.concat(str2); // 이어지게 하는것
		str1.contains(str2); // 포함되있는지
		str1.endsWith(str2); // 끝에 이걸로 끝나는지
		str1.indexOf(0); // index n번째 글짜 출력
	}

}
