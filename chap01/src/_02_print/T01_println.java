package _02_print;

public class T01_println {

	public static void main(String[] args) {
		
		// 출력문 println 줄바꿈 o print 줄바꿈 x 
		// 문자열 출력은 반드시 쌍따음표"string" 안에 기재 
		
		System.out.println("더조은 컴퓨터 학원");
		System.out.println("내 이름은 이정민");
		
		//숫자일 떄는 아무것도 붙이지 않는다
		System.out.println(3+7);
		System.out.println(3-7);
		System.out.println(3*7);
		System.out.println(3/7);
		
		
		// 출력후 줄바꿈 x 
		System.out.print("줄바꿈 안함");
		System.out.print("  옆에 한줄로 출력");
		

	}

}
