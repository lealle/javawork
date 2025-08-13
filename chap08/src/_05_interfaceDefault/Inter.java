package _05_interfaceDefault;

/*
	default, static 메소드
	jdk 8버전부터 추가된 메소드 
	단점을 보완하기 위해 만들어짐 
	
	interface를 만들어 implements 한 클래스가 여러개일 때 
	나중에 interface에 추상메서드를 추가하면 implements 한 모든 클래스에서 
	나중에 추가한 추상메서드를 모두 구현해야하는 단점. 
	
	-> default 메소드 : 구현부가 있다
		- 오버라이딩이 필요하면 구현을 해도 되고, 안해도됨
	-> static 메소드 : 구현부가 있다.
	 	- 오버라이딩을 할 수 없음 
*
*/
interface Inter1 {
	int method1();
	static String stMe() {
		return "static 메소드";
	}
}

interface Inter2 {
	int method2();
	default String deMe() {
		return "default 메소드2";
	}
}

public interface Inter extends Inter1 , Inter2{
	int method();
	default String me() {
		return "default 메소드 inter";
	}
}
