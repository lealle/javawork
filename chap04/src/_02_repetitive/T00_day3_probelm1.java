package _02_repetitive;

import java.util.Scanner;

public class T00_day3_probelm1 {
	public static void main(String[] args) {
//		https://e1jong.tistory.com/25
//			1. 사용자로부터 국어, 영어, 수학 점수를 입력받아 
//			   세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
//			   (if문으로) 
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요 : ");
		int num1= scan.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		int num11 = scan.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		int num111 = scan.nextInt();

		if(num1+num11+num111>180 && num1 >= 40 && num11 >= 40 && num111 >= 40) {
			System.out.println("합격");
			
		}else {
			System.out.println("불합격");
			
		}
		
//			2. id와 비밀번호를 변수에 저장하고
//			   사용자로부터 아이디와 비밀번호를 입력 받아
//			   아이디와 비밀번호가 모두 맞으면 "로그인 성공"출력
//			   아이디가 틀렸으면 "아이디가 틀렸습니다"출력
//			   비밀번호가 틀렸으면 "비밀번호가 틀렸습니다"출력
//
		String id2 = "lealle";
		String password2 = "1234";
		
		System.out.print("ID를 입력하세요 : ");
		String id22= scan.next();
		System.out.print("비밀번호를 입력하세요 : ");
		String password22= scan.next();
		
		if(id2.equals(id22) && password2.equals(password22)) {
			System.out.println("로그인 성공");
			
		}else {
			if(!id2.equals(id22)) {
				System.out.println("아이디가 틀렸습니다");
				
			}
			if(!password2.equals(password22)) {
				System.out.println("비밀번호가 틀렸습니다");
				
			}
			
		}
		
		
		
		
		
//			3. 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 
//			   계산 결과에 따라 저체중/정상체중/과체중/비만을 출력하세요.
//
//				- BMI = 몸무게 / (키(m) * 키(m))
//
//				BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
//				BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
//				BMI가 30이상일 경우 고도 비만
//
		
		  System.out.print("키 몸무개를 공백 포함하여 입력하세요 : "); double tall3= scan.nextDouble();
		  double weight3= scan.nextDouble();
		  
		  double sum = 0; sum = weight3 / ((tall3 * tall3)/10000.0);
		  
		  if(sum >= 30) { System.out.println("고도 비만"); } else if(sum >= 25) {
		  System.out.println("비만"); } else if(sum >= 23) { System.out.println("과체중");
		  }else if(sum >= 18.5) { System.out.println("정상제충"); }else {
		  System.out.println("저체중"); }
		  
		  
		 
		
//			4. 중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력
//			   평가 비율은 중간고사 20%, 
//			                  기말고사 30%, 
//			                  과제 30%, 
//			                  출석 20%로 이루어져 있고 
//			   이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산.
//			   70점 이상일 경우 Pass, 
//			   70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력
//

//			   
		System.out.print("중간고사 점수 : ");
		int middle4= scan.nextInt();
		System.out.print("기말고사 점수 : ");
		int final4 = scan.nextInt();
		System.out.print("과제 점수 : ");
		int sub4 = scan.nextInt();
		System.out.print("출석 회수 : ");
		int check4 = scan.nextInt();
		
		System.out.println("============= 결과 ============");
		
		if((middle4 *0.2+ final4*0.3+ sub4*0.3+check4*1.0)<70.0 ) {
			System.out.printf("중간 고사 점수(20) : %.1f\n기말 고사 점수(30) : %.1f\n과제 점수(30) : %.1f\n"
					+ "출석 점수(20) : %.1f\n총점 : %.1f\n",middle4 *0.2, final4*0.3, sub4*0.3,check4*1.0
					,(middle4 *0.2+ final4*0.3+ sub4*0.3+check4*1.0));
			System.out.println("Fail [점수 미달]");
		} else if(check4*5.0 <70) {
			System.out.printf("Fail [출석 횟수 부족(%d/20)]",check4);
			
		}else {
			System.out.printf("중간 고사 점수(20) : %.1f\n기말 고사 점수(30) : %.1f\n과제 점수(30) : %.1f\n"
					+ "출석 점수(20) : %.1f\n총점 : %.1f\n",middle4 *0.2, final4*0.3, sub4*0.3,check4*1.0
					,(middle4 *0.2+ final4*0.3+ sub4*0.3+check4*1.0));
			System.out.println("Pass");
		}
		
	}
}
