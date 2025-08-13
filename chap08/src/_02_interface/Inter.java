package _02_interface;

/*
	interface : 일종의 추상클래스인데 추상클래스보다 추상화가 더 높다
				추상메소드만 포함(일반 메소드 없음)
				추상 메소드 메소드와 상수만 가질 수 있음(변수 사용 못함)
				객체생성 할 수 없음
				상속받는곳에서는 implements 키워드 사용 (extends 사용안함)
				implement 다중 상속 가능
				
				
				
		사용 : 표준 인터페이스를 만들어 어떠한 객체가 들어오더라도 호출시 이름 동일하게 호출 
*/
public interface Inter {
	// 상수만 사용
	public static final double PI = 3.14;
	int MAX = 100; // 컴파일시 public static final 을 자동으로 붙여줌 

	// 추상메서드만 사용가능
	public abstract void print(int a);
	public abstract void method(); // public abstract 도 컴파일시 자동으로 붙음
	String str(String name);
	
	
	
	
}
