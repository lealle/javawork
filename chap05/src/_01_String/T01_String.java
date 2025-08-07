package _01_String;

public class T01_String {
	public static void main(String[] args) {
		
		String name ="홍길동";
		String hobby ="게임";
		
		//false 다른 주소
		System.out.println("name==hobby : "+ (name == hobby));
		
		String str1 = "자바";
		String str2 = "자바";
		// 주소가 같으므로 true 
		// () 없으면 == 특수기호로 인식 
		System.out.println("str1==str2 : "+ (str1 == str2));
		
		
		// new 힙에 저장공간 다르게 저장! 주소 다르게 나옴 (스택에서도 서로 다른 주소 가르키기에) 
		String str3 = new String ("program");
		String str4 = new String ("program");
		
		System.out.println("str3==str4 : "+ (str3 == str4));
		System.out.println("str3.equals(str4) : "+ (str3.equals(str4)));

		// String(객체) 에서 == 는 주소가 같은가 를 묻는것
		
		//true 주소가 같으므로 
		String str5 ="홍길동";
		System.out.println("name==str5 : "+ (str5 == name));
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
	}
}
