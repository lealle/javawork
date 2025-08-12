package _07_static;

public class StaticField {
	// 인스턴스 필드
	int num = 3;
	String name = "인스턴스 필드";
	
	// 정적 필드
	static int stNum = 10;
	static String stName = "정적 필드";
	
	// 인스턴스 메소드
	/*
	 * 인스턴스 필드와 정적 필드 상관없이 모두 사용가능
	 */
	void method() {
		System.out.println("인스턴스 메소드 method()");
		System.out.println(num);		// 인스턴스 필드 호출 가능
		System.out.println(stNum);		// 정적 필드 호출 가능
	}
	
	String method2() {
		System.out.println("인스턴스 메소드 method2()");
		return name;
	}
	
	// 정적 메소드
	/*
	 * 정적 필드(메소드)만 사용가능
	    - 정적 필드(메소드)는 객체를 생성하지 않아도 사용가능하지만
	      인스턴스 필드(메소드)는 반드시 객체가 생성되어야한 사용할수 있다
	    ** 정적메소드에서 인스턴스필드(메소드)를 사용할 때는 반드시 객체가 생성되어 있다는것을 담보할 수 없기 때문
	 */
	static void stMethod() {
		System.out.println("정적메소드 stMethod()");
		System.out.println(stNum);
		// System.out.println(num);  //사용하려면 반드시 객체를 생성해야 됨
	}
	
	static String stMethod2() {
		System.out.println("정적 메소드 stMethod2()");
		return stName;
	}
}







