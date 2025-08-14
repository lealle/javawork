package _01_exception;

public class T11_finally {

	public static void main(String[] args) {
//		try {
//			// 예외가 발생할 프로그램
//		}catch(Exception e) {
//			// 예외가 발생했을때 실행될 프로그램
//		}finally {
//			// 예외와 상관없이 무조건 실행 
//			// try 와 catch에 return문이 있어도 실행됨 (중요)
//		}
//		// 여기에 써도 예외와 상관없이 무조건 실행 
//		// try와 catch에 return 문이 있으면 실행 안됨 
//		
//		
		// 둘의 차이는 
		// return 문에 대한 차이 
	
	
		try {
			int[] a= {1,2,3};
			System.out.println(a[0]);
			System.out.println(a[6]);
			return;
		}catch(Exception e) {
			System.out.println("인덱스 범위 넘어섬");
		}finally {
			
			System.out.println("프로그램 종료");
			
		}
		System.out.println("try 바깥 종료");
		System.out.println("");
		System.out.println("");
		
	
	
	}

}
