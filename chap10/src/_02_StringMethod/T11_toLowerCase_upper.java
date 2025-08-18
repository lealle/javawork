package _02_StringMethod;

import java.util.Scanner;

public class T11_toLowerCase_upper {

	public static void main(String[] args) {
		String str = "Java Program";
		
		String lower = str.toLowerCase();
		System.out.println(lower);
		
		System.out.println(str.toUpperCase());
		
		//사용자로부터 찾고자하는 글자를 입력받아서  str 에 그 글자가 포함되어 있는지 확인(대소문자 안가림)
		//
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("입력 : ");
			String str1 = sc.next();
			str1 = str1.toLowerCase(); //이렇게 다 소문자로 하고 해도 됨
			
			if(lower.contains(str1)) {
				System.out.println("포함되어 있음");
				break;
			}
			System.out.println("포함되어 있지 않음");
			sc.nextLine();
		}
		
	}

}
