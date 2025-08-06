package _01_conditional;

import java.util.Scanner;

public class T05_switch {

	public static void main(String[] args) {
		// switch-case 
//		int num1 = 2;
//		
//		switch(num1) {
//		case 1:
//			System.out.println("1입니다");
//			break;
//		case 2:
//			System.out.println("2입니다");
//			break;
//		case 3:
//			System.out.println("3입니다");
//			break;
//			
//		default:
//			System.out.println("1,2,3 을 제외한 숫자입니다");		
//		}
//		
//		System.out.println("------------------------");
//		
//		char ch = 'k';
//		
//		switch(ch) {
//		case 'k':
//			System.out.println("김씨입니다");
//			break;
//		case 'l':
//			System.out.println("이씨입니다");
//			break;
//		case 'p' :
//			System.out.println("박씨입니다");
//			break;
//		default :
//			System.out.println("김, 이, 박씨가 아닙니다");
//		}
//		
//		String str = "더조은";
//		switch(str) {
//		case "더조은":
//			System.out.println();
//		}
//		System.out.println("----------------------");
//		
//		int month =3;
//		
//		switch(month) {
//		case 12:
//		case 1:
//		case 2:
//			System.out.println("겨울");
//			break;
//			
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("봄");
//			break;
//			
//		case 6:
//		case 7:
//		case 8:
//			System.out.println("여름");
//			break;
//			
//		case 9:
//		case 10:
//		case 11:
//			System.out.println("가을");
//		}
//		
		
		//사용자로부터 연산자를 받아 사칙연산을 하여라 두 숫자와 연산자를 받아서 
		
		Scanner scan = new Scanner(System.in);
		System.out.print("두 정수를 공백으로 분리하여 입력해주세요 : ");
		int score1 = scan.nextInt();
		int score2= scan.nextInt();
		
		System.out.print("연산자를 입력해주세요 : ");
		char symbol = scan.next().charAt(0);
		
		/*이렇게 하여도 ok
		 * System.out.print("사칙연산을 공백으로 분리하여 입력해주세요 : ");
		int score1 = scan.nextInt();
		String symbol = scan.next();
		int score2= scan.nextInt();
		
		System.out.print("연산자를 입력해주세요 : ");
		 
		 */
		
		
		System.out.print("연산 결과 : ");
		switch(symbol) {
		case '+':
			System.out.println(score1 + score2);
			break;
			
		case '-':
			System.out.println(score1 + score2);
			break;
			
		case '*':	
			System.out.println(score1 * score2);
			break;
			
		case '/':
			System.out.println((double)score1 / score2);
			break;
			
		case '%':
			System.out.println(score1 % score2);
			break;
		default:
			System.out.println("잘못된 연산자");
			
		}		
		
		if(symbol == '+') {
			System.out.println(score1+" + " + score2 + " = " +(score1 + score2));

		}
		else if (symbol == '-') {
			System.out.println(score1+" - "+ score2 + " = "+(score1 - score2));
		}
		else if (symbol == '*') {
			System.out.println(score1+" * "+ score2 + " = "+(score1 * score2));
		}
		else if (symbol == '/') {
			System.out.println(score1+" / "+ score2 + " = "+((double)score1 / score2));
		}
		else if (symbol == '%') {
			System.out.println(score1+" % "+ score2 + " = "+(score1 % score2));
		}
		
		
		
		
		
		
		
		
	}

}
