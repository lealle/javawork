package _05_super;

class Parent3{
	int x;
	int z;
	
	Parent3(){
		System.out.println("부모 생성자 호출");
		x = 10;
		z= 10;
		
	}
	
}

class Child3 extends Parent3{
	int x;
	int y;
	Child3(){
		System.out.println("자식 생성자 호출");
		x = 10*10;
		y=  10*10;
		
	}
}

class GrandChild3 extends Child3{
	int x;
	
	GrandChild3(){
		System.out.println("자손 생성자 호출");
		x = 10*10*10;
		
	}
	
	void xPrint() {
		System.out.println(super.x);
	}
	
}



public class T03_SuperRun {

	public static void main(String[] args) {
		Child3 ch1 = new Child3();
		GrandChild3 ch2 = new GrandChild3(); // 부모 자식 자손 순서대로 생성자 생성
		System.out.println(ch2.x);
//		System.out.println(ch2.super.x); 여기서는 super 호출 불가 class 내부에서 해야함
		System.out.println(ch2.y); // y없을시 부모한테 가서 있으면 출력 
		System.out.println(ch2.z); // 위와 동일
	
	}
}
