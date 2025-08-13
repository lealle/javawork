package _01_exception;

public class T02_nullPointer {
	public static void main(String[] args) {
		String data =null;
		System.out.println(data); // toString() 호출 -> 패키지이름.클래스명@주소
		/*
			참조변수를 출려갛면 
			- toString()호출 -> 패키지이름, 클래스명@주소
			- 참조변수에 null 들어있으면 toString()으로 호출하지않음 그냥 null 나옴
*/
//		System.out.println(data.toString()); // toString() 호출 -> 패키지이름.클래스명@주소 아무것도 없음
		// nullpointException 발생 
				
		try {
			System.out.println(data.toString()); // toString() 호출 -> 패키지이름.클래스명@주소 아무것도 없음
			
		}catch(Exception e) {
			System.out.println("오류 발생");	
			System.out.println("예외: "+e);	
			
		}
		
		
		
//		String data1;
//		System.out.println(data1);
//		
		
		
	}
}
