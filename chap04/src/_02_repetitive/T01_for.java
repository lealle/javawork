package _02_repetitive;

public class T01_for {


	public static void main(String[] args) {
		//반복문 : 원하는 개수만큼 반복 실행
		/*
		 * for (초기시; 조건식; 증감식){
		 * 		실행문
		 * }
		 */
		
		
		
		for(int i = 0; i <10; i++) {
			System.out.println("hi" + i);
			System.out.println("반갑습니다");
		}
		
		System.out.println("-----------------");
		
		for(int i = 1; i <=10; i += 3) {
			System.out.println(i+". 안녕하세요");
			System.out.println("반갑습니다");
		}
	
		
		System.out.println("-----------------");
		
		for(int i = 10; i >=1; i--) {
			System.out.println(i+".1씩 감소");
		}
	
		System.out.println("-----------------");
		
		int sum = 0;
		for(int i = 1; i <=10000; i++) {
			sum += i;
		}
	
		System.out.println("합계 : "+sum);
	
		
	
	
	
	
	
	}
}
