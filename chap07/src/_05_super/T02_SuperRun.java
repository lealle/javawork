package _05_super;

class Parent2{
	int x = 10;
	void show() {
		System.out.println("부모클래스 메소드"); 
	}
}

class Child2 extends Parent2{
	
	int x = 20; // 애도 없을시 다 10 10 10 
	void show() {
		System.out.println("자식클래스 메소드"); 
	}


	void display() {
		show();
		super.show();
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}

}




public class T02_SuperRun {

	public static void main(String[] args) {
		Child2 ch1 = new Child2();
		ch1.display();
	}

}
