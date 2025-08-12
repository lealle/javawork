package _07_polymorphism;

class Parent{
	void method1() {
		System.out.println("parent method1()");
	}
	void method2() {
		System.out.println("parent method2()");
			
	}

}

class Child extends Parent {
	@Override
	void method2() {
		System.out.println("child method2()");
			
	}
	void method3() {
		System.out.println("child method3()");
			
	}
	
}

public class T02_Polymorphism {

	public static void main(String[] args) {
		Parent p = new Child();
		p.method1();
		p.method2(); // child 것이 실행함 
		// 오버라이딩 된 메소드 호출
		//(중요!) 오버라이딩한 메소드는 형변환과 상관없이 무조건ㅇ 오버라이딩한 메소드 호출 
		
	}

}
