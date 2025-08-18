package _02_StringMethod;

public class T05_equals {

	public static void main(String[] args) {
		// equals : String 클래스에서 오버라이딩 되어 있어 값이 값은지 를 반환함 
		String str ="hello";
		
		
		//equals 는 대소문자 가림
		System.out.println(str.equals("Hello"));
		// equalsIgnoreCase : 대소문자 가리지 않음
		System.out.println(str.equalsIgnoreCase("HELLO")); // 양쪽 모두 소문자로 바꿔서 같은지 여부 확인
	}

}
