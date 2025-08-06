package _02_repetitive;

public class T07_for_lots_varialble_use {

	public static void main(String[] args) {
		int num1,num2, num3;
		
		//
		num1 = num2 = num3 =10;
		
		// 같은 자료형이면 이렇게 선언 가능 
		int num4= 5 ,num5 = 20, num6 =30;
		
		//여러개의 변수 있을 수 있지만 조건식에는 변수가 무조건 하나! 
		for(int i=0, j=20; i <10; i++ ,j--) {
			System.out.println("i = "+i+", j = "+j);
			
		}
		
		// 오류 발생! 조건식에 변수 2개라 어디서 멈춰야할지 모르기 때문에
		// i 든 j 든 하나만! 들어가야함(조건식)
//		for(int i=0, j=20; i <10, ㅓ<11; i++ ,j--) {
//			System.out.println("i = "+i+", j = "+j);
//		}
		
		for(int i=0, j=20 ,z=100; i <10; i++ ,j--, z+=5) {
			System.out.println("i = "+i+", j = "+j+"z = "+z);
		}
		
		// for 를 while 처럼 쓰기 
		// while(true) 문과 동일! 
		for(;;) {
			System.out.println(num1++);
			if(num1 == 15)
				break;
		}
		
		
		
		System.out.println();
		System.out.println();
		
	}

}
