package _02_repetitive;

public class T08_random {

	public static void main(String[] args) {
		//Math 클래스 (수학에 관련된 클래스)
		
		double rand1 = Math.random(); // 실수형 : 0 ~ 0.9999999999999 
		System.out.println(rand1);
		System.out.println("------------------------");
		
		//* 보통 10의 ~승 하여 정수화 시켜서 출력 
		double rand2 = 10 * Math.random(); // 실수형 : 0 ~ 0.9999999999999 
		System.out.println(rand2);
		System.out.println("------------------------");
		
		//정수화 시켜서 출력 
		int rand3 =(int) (10 * Math.random()); // 실수형 : 0 ~ 0.9999999999999 
		System.out.println(rand3);
		System.out.println("------------------------");
		
		// 1~10 까지출력 
		System.out.println(rand3+1);
		System.out.println("------------------------");
		
		//1~3 까지의 정수만 뽑고싶음
		// random 에 3을 곱하고 1 더해도 ok 
		System.out.println(rand3%3+1);
		System.out.println("------------------------");
		
		
		
		System.out.println();
		System.out.println();
	
	}
}
