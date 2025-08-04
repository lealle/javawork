package _02_Scanner;

import java.util.Scanner;

public class T01_Scanner {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = scan1.next(); // 문자열의 단어
		System.out.println("이름 : "+name);
		// 띄어쓰기 시 첫번째 단어만 들어옴 
		
		
		
		System.out.print("나이을 입력하세요 : ");
		int age = scan1.nextInt(); // 문자열의 단어
		System.out.println("나이 : "+age);

		System.out.println("(소수점 2번째 자리까지)");
		System.out.print("키를 입력하세요 : ");
		double key = scan1.nextDouble(); // 문자열의 단어
		System.out.println("키 : "+key);

		System.out.print("True or False로 대답하여주세요\n당신은 여자입니까?");
		boolean gender = scan1.nextBoolean(); // 문자열의 단어
		System.out.println(gender); //확인용

		
		
		scan1.nextLine();
		
		System.out.print("주소를 입력해주세요 : ");
		String address = scan1.nextLine(); 
		// 위에서 엔터를 쳐서 엔터가 하나 들어옴 넣지않아도 '주소 : '로 출력
		// 그런상황을 막기 위해 위에서 .nextLine 로 들어올것을 막음 개행문자 뺴고 다시 들어오게 시킨것
		System.out.println("주소 : "+ address );
		
		System.out.print("성별은 무엇입니까 : ");
		char genderDistinguish = scan1.next().charAt(0); // 인덱스 0부터 시작 -> 첫번째 글자 가져와라
		// 위에서 엔터를 쳐서 엔터가 하나 들어옴 넣지않아도 '주소 : '로 출력
		// 그런상황을 막기 위해 위에서 .nextLine 로 들어올것을 막음 개행문자 뺴고 다시 들어오게 시킨것
		System.out.println("성별 : "+ genderDistinguish);
		
		
		
		
		
		
	}

}
