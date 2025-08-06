package _01_operation;

import java.util.Scanner;

public class T00_problem {
	public static void main(String[] args) {
//		1. 사용자로부터 정수를 입력받아 양수인지 양수가 아닌지 판별하는 결과 출력
//
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num1 = scan.nextInt();
		String result = num1 > 0 ? "양수이다." : "양수가 아니다.";
		System.out.println(num1 + "은 "+ result);
		
//		2. 사용자로부터 정수를 입력받아 양수, 0, 음수 판별하는 결과 출력
		
		System.out.print("정수를 입력하세요 : ");
		int num2 = scan.nextInt();
		String result1 = num2 > 0 ? "양수이다." : 
			num2 == 0 ? "0이다" : "음수이다.";
		System.out.println(num2 + "은 "+ result1);
		
//		3. 사용자로부터 정수를 입력받아 짝수인지 홀수인지 판별하는 결과 출력
		System.out.print("정수를 입력하세요 : ");
		int num3 = scan.nextInt();
		String result3 = num3 % 2 == 0 ? "짝수이다." : "홀수 이다.";
		System.out.println(num3 + "은 "+ result3);

//		4. 각 인원수에 따라 사탕을 동일하게 나눠 주려고 한다
//		   사용자로부터 인원수와 사탕의 갯수를 입력받아
//		   1인당 동일하게 나눠가진 사탕 개수와
//		   나눠주고 남은 사탕 갯수를 출력하기
//
		System.out.print("사탕 개수를 입력하세요 : ");
		int candy4 = scan.nextInt();
		System.out.print("인원수를 입력하세요 : ");
		int num44 = scan.nextInt();
		System.out.println("나눠가진 사탕개수 : "+ candy4/num44);
		System.out.println("나머지 사탕개수 : "+ candy4%num44);
		//gender char 했으면 더 좋았을듯 
		
//
//		5. 키보드로 입력 받은 값들을 변수에 저장하고 저장된 변수의 값을 다음과 같이 출력하기
//		   이 때, 성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력.
//				
//			ex.
//			이름 : 이준기
//			학년(숫자만) : 2
//			반(숫자만) : 7
//			번호(숫자만) : 3
//			성별(M/F) : M
//			성적(소수점 둘째 짜리까지) : 97.35
//				
//			2학년 7반 3번 이준기 남학생의 성적은 97.35이다.
//
		
		System.out.print("이름 : ");
		String name5= scan.next();
		System.out.print("학년(숫자만) : ");
		int grade5= scan.nextInt();
		System.out.print("반(숫자만) : ");
		int class5 = scan.nextInt();
		System.out.print("번호(숫자만) : ");
		int num5 = scan.nextInt();
		System.out.print("성별(M/F) : ");
		String gender5= scan.next();
		System.out.print("성적(소수점 둘째 짜리까지) : ");
		double score5= scan.nextDouble();
		String gender55 = gender5.charAt(0) == 'M' ? "남": "여";
		System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2f이다.\n",grade5,class5,num5,name5,gender55,score5);
		
		
//
//		6. 사용자로부터 나이를 입력받아 13세이하이면 어린이
//		    14세~19세 이하이면 청소년
//		    20세 이상이면 성인으로 출력
//
		System.out.print("나이를 입력하세요 : ");
		int num6= scan.nextInt();
		String age = num6 > 20 ? "성인" : 
			num6 >= 14 ? "청소년" : 
				num6 > 0 ? "어린이" : "잘못된 값";
		System.out.println("사용자는 "+ age + "입니다.");
		
//		7. 사용자로부터 국어, 영어, 수학 점수를 입력받아 
//		   세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력.
// 
		//한번에 전부 물어볼 수도 있음 
		// 점수 입력 공백으로 분리해주세요 하면 공백이 들어갔을때 3개 동시에 받을 수 있음. -> 공백으로 분리 
		System.out.print("국어 점수를 입력하세요 : ");
		int num7= scan.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		int num77 = scan.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		int num777 = scan.nextInt();

		String sum = num7 + num77 + num777 >= 180 && num7 >= 40 && num77 >= 40 && num777 >= 40 ? "합격" : "불합격"; 
		System.out.println(sum);

//		8. 주민번호를 입력받아 남자인지 여자인지 출력하기
//		
//	ex.
//	주민번호를 입력하세요(- 포함) : 123456-3123456
//
		System.out.print("주민번호를 입력하세요 : ");
		String num8= scan.next();
		String gender_Distin = (int)num8.charAt(7)%2 == 0 ? "여자" : "남자";
		System.out.println(gender_Distin+ "입니다.");
		
//		9.  사용자로부터 두 개를 입력 받아 num1, num2에 저장하고
//		    또 다른 정수를 입력 받아 그 수가 num1 미만거나 num2 초과이면 true를 출력하고
//		    아니면 false를 출력. (단, num1은 num2보다 작아야 함)
//
		System.out.print("정수를 입력하세요 : ");
		int num9= scan.nextInt();
		System.out.print("정수를 입력하세요 : ");
		int num99 = scan.nextInt();
		System.out.print("정수를 입력하세요 : ");
		int num999 = scan.nextInt();

		boolean bool9 = num999 < num9 || num999 > num99 ? true : false ;
		boolean bool99 = num9 >= num99 ? false :  bool9;
		System.out.println(bool99);
		
//
//		10. 사용자로부터 3개의 수를 키보드로 입력 받아 
//		    입력 받은 수가 모두 같으면 true, 아니면 false를 출력
		
		System.out.print("정수를 입력하세요 : ");
		int num0= scan.nextInt();
		System.out.print("정수를 입력하세요 : ");
		int num00 = scan.nextInt();
		System.out.print("정수를 입력하세요 : ");
		int num000 = scan.nextInt();

		//num0 == num00 && num0 == num000 로도 처리 가능
		boolean bool0 = num0 == num00 ? 
				num0 == num000 ? true : false
				: false ;
		System.out.println(bool0);
		
		
	}
}
