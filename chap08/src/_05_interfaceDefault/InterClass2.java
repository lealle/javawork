package _05_interfaceDefault;

public class InterClass2 implements Inter {

	
	// default static 안들어옴 
	@Override
	public int method1() {
		return 1;
	}

	@Override
	public int method2() {
		return 2;
	}

	@Override
	public int method() {
		return 0;
	}
	
	@Override
	public String deMe() {
		return "오버라이딩한 메소드";
	}
	@Override
	public String me() {
		return "오버라이딩한 메소드 me()";
	}
	// static 은 오버라이딩 할 수 없음 
//	@Override
//	static String stMe() {
//		return "오버라이딩한 메소드 stme()";
//	}
	
}
