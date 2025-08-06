package _02_repetitive;

public class T06_continue {
	public static void main(String[] args) {
		// continue ~~를 제외한에서 많이 쓰임 
		//1 ~ 100 까지의 숫자 중 3의 배수를 제외한 합계 구하기
		
		int sum = 0;
		for (int i =1 ; i<=100 ; i++) {
			if(i%3 ==0) {
				continue;
			}
			sum +=i;
		}
		System.out.println("3의 배수를 제외한 1~100까지의 합계 : "+sum);
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}

}
