package _03_casting;

import java.util.Scanner;

public class T00_problem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//01 
		System.out.print("문자를 입력하세요 : ");
		
		char ch1 = scan.next().charAt(0); // 인덱스 0부터 시작 -> 첫번째 글자 가져와라
		
		System.out.println("유니코드 : "+(int)ch1);
		
		//02 
		int a,b,c, sum;
		
		System.out.print("국어점수를 입력하세요 : ");
		a = scan.nextInt(); 
		
		System.out.print("영어점수를 입력하세요 : ");
		b = scan.nextInt(); 
		
		System.out.print("수학점수를 입력하세요 : ");
		c = scan.nextInt(); 
		
		
		sum = a + b + c;
		double average;
		average = (double)sum/3;
		
		System.out.println("총점 : "+sum );
		System.out.printf("평균 : %.2f\n", average);
		
		//03
		int iNum1 = 10;
	    int iNum2 = 4;
	    float fNum = 3.0f;
	    double dNum = 2.5;
	    char ch = 'K';
		

		
	    //	    3.1  iNum1 / iNum2의 몫 출력

	    int result = iNum1/ iNum2;
	    System.out.print("iNum1/ iNum2 = ");
	    System.out.println(result);

	    //	    3.2  iNum2 * dNum 한 결과를 변수에 넣고 출력하기
	    double result1 =  (iNum2 * dNum) ;
	    System.out.print("iNum2 * dNum = ");
	    System.out.println(result1);
	    
	    //	    3.3  iNum1의 값이 10.0으로 출력되게 하기
	    float result2 = (float)iNum1;
	    System.out.printf("iNum1 = %.1f\n",result2);
	    

	    //	    3.4  iNum1 / iNum2 한 결과 소수점까지 나오게 출력하기
	    double result3 = (double)iNum1/ iNum2;
	    System.out.print("iNum1 / iNum2 = ");
	    System.out.println(result3);
	    
	    //	    3.5  iNum1 / fNum 한 결과 3이 출력되게 하시오
	    
	    int result4 = iNum1/ (int)fNum;
	    System.out.print("iNum1 / fNum = ");
	    
	    System.out.println(result4);
	    
	    //	    3.6  iNum1 / fNum 한 결과 소수점 13자리이상까지 나오게 하시오
	    float result5 = iNum1/ fNum;
	    System.out.printf("iNum1 / fNum = %.13f\n",result5);
	    
	    //	    3.7  ch변수의 유니코드 출력하기
	    
	    System.out.println("ch변수의 유니코드 : "+(int)ch);
	    
	    //	    3.8  ch변수에 1을 더해 L 이 출력되게 하시오
		int result6 = (ch + 1);
		System.out.println("ch변수에 1을 더해 출력한 값 : "+(char)result6);
		
		
		
		
		
		
		
		
		
	}

}
