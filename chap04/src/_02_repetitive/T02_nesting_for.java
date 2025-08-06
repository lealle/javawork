package _02_repetitive;

public class T02_nesting_for {
	public static void main(String[] args) {
		// jvm 힙 스택 + a
		
		//스택구조로 만들어짐 
		for(int i = 1 ; i<=3; i++) {
			for(int j = 6; j<=10; j++) {
				System.out.println("i = "+i+"    j="+j);
			}
			System.out.println();
		}
		
		/*
		 * 구구단 출력 
		 * 
		 * 2*1=2
		 * 2*2=4
		 * 
		 * 2*9
		 * 3*1
		 *
		 */
//		for (int i = 2; i<10 ; i++) {
//			for (int j = 1; j<10 ; j++) {
//				System.out.printf("%d*%d=%2d\n",i,j,i*j);
//			}
//			System.out.println();
//		}
//		
		
//		2*1= 2   3*1= 3   4*1= 4   5*1= 5   6*1= 6   7*1= 7   8*1= 8   9*1= 9  형식으로 
		for (int i = 1; i<10 ; i++) {
			for (int j = 2; j<10 ; j++) {
				System.out.printf("%d*%d=%2d   ",j,i,i*j);
			}
			System.out.println();
		}
		
		
	}
}
