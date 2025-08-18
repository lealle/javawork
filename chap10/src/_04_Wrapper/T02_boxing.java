package _04_Wrapper;

public class T02_boxing {

	public static void main(String[] args) {
		/*
		 * unBoxing : 참조자료형 -> 기본자료형으로 변환
		 * Boxing : 기본자료형 -> 참조자료형으로 변환 
		 * 
		 * valueOf() : Integer 객체에서  int형 값을 뽑아내는 메소드 
		 * 			Integer ->  언박싱 -> int 자료형 반환 (출력) 
		 * 
		*/
		
		// autoUnboxing
		Integer num = Integer.valueOf(100);
		int num1 = num; // valueOf 로 int 형으로 반환 했기에 
		
		Character ch = 'z';
		char c = ch;
		
		int num2 = Integer.parseInt("100"); // Integer의 String을 int 로 바꿔라  
		Integer num3 = Integer.valueOf("100");// "100" 을 인트자료형으로 뽑아오는 메소드  
		
		//Boxing 거의 valueOf() 사용
		int num4 = 10;
		Integer num5 = Integer.valueOf(num4);
		
		String str ="10";
		Integer num6 =Integer.valueOf(str);
		
		double b = 1.3;
		Double d =Double.valueOf(b);
		
		// 정규 표현식은 웹에서 다 처리해주는 편 자바는 백엔드언어라서 정규 표현식은 하지 않음 
		
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
	}

}
