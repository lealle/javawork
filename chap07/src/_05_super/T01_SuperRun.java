package _05_super;

class Parent1{
	int x = 10;
	
}

class Child1 extends Parent1{
	
	// 우선순위 : 지역변수 -> 인스턴스 변수 -> 부모 변수
	int x = 20; // 애도 없을시 다 10 10 10 
	void show() {
		int x = 30; // 없을시 20 20 10
		System.out.println("x = "+x); // 우선순위 : 지역변수 -> 인스턴스 변수 -> 부모 변수
		System.out.println("this.x = "+this.x); // 인스턴스 변수 -> 부모 변수(지역변수 보지않음)
		System.out.println("super.x = "+super.x); // 부모 변수 (인스턴스 변수, 지역변수 보지않음)
		
	}
}



public class T01_SuperRun {

	public static void main(String[] args) {
		Child1 ch = new Child1();
		ch.show();
	}

}
