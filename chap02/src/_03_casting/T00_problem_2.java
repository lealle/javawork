package _03_casting;

import java.util.Scanner;

public class T00_problem_2 {

	public static void main(String[] args) {
//		1. 이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
//
//		   ex.
//		   이름을 입력하세요 : 아무개
//		   성별을 입력하세요(남/여) : 남
//		   나이를 입력하세요 : 20
//		   키를 입력하세요(cm) : 180.5
//
//		   키 180.5cm인 20살 남자 아무개님 반갑습니다^^
		Scanner scan1 = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = scan1.next(); // 문자열의 단어
		// 띄어쓰기 시 첫번째 단어만 들어옴 
		
		System.out.print("성별을 입력하세요(남/여) : ");
		char genderDistinguish = scan1.next().charAt(0); // 인덱스 0부터 시작 -> 첫번째 글자 가져와라
		
		
		System.out.print("나이을 입력하세요 : ");
		int age = scan1.nextInt(); // 문자열의 단어

		System.out.print("키를 입력하세요(cm) : ");
		double key = scan1.nextDouble(); // 문자열의 단어
		System.out.println("키 "+key+"cm인 "+ age+ "살 " +genderDistinguish+"자 "+ name +"님 반갑습니다^^\n");
		
//		2. 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
		System.out.print("첫번째 정수 : ");
		int num1 = scan1.nextInt(); // 문자열의 단어
		System.out.print("두번째 정수 : ");
		int num2 = scan1.nextInt(); // 문자열의 단어
		
		
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 결과 : " + (num1 / num2));

//		3. 키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
//		   계산 공식 ) 면적 : 가로 * 세로
//			     둘레 : (가로 + 세로) * 2
		System.out.print("가로값를 입력하세요 : ");
		double num3 = scan1.nextDouble(); // 문자열의 단어
		System.out.print("세로값를 입력하세요 : ");
		double num4 = scan1.nextDouble(); // 문자열의 단어
		
		System.out.println("면적 : " + (num3 * num4));
		System.out.println("둘레 : " + (num3 + num4)*2);

	
//		4. 영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.
//
//		   ex.
//		   문자열을 입력하세요 : apple
//
//		   첫 번째 문자 : a
//		   두 번째 문자 : p
//		   세 번째 문자 : p
	
		System.out.print("문자열을 입력하세요 : ");
		String en_string = scan1.next(); // 문자열의 단어
		char en_string1 = en_string.charAt(0); // 인덱스 0부터 시작 -> 1번째 글자 가져와라
		char en_string2 = en_string.charAt(1); // 인덱스 1부터 시작 -> 2번째 글자 가져와라
		char en_string3 = en_string.charAt(2); // 인덱스 2부터 시작 -> 3번째 글자 가져와라
		
		System.out.println("첫 번째 문자 : "+en_string1);
		System.out.println("두 번째 문자 : "+en_string2);
		System.out.println("세 번째 문자 : "+en_string3);
		
		
		
		
		
	}

}
