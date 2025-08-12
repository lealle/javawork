package _04_overriding;

class Over{
	void show(String str) {
		System.out.println("부모클래스 메소드 : " + str);
	}
}

class Overchild extends Over{
	//오버라이딩 : 부모의 메소드와 원형은 똑같고, 내용만 다르게 재정의
	void show(String child) {
		System.out.println("자식클래스 메소드 : "+child);
	}
}


public class OverridingRun {

	public static void main(String[] args) {
		Over ov1 = new Over();
		Overchild ov2 = new Overchild();
		
		ov1.show("자바 프로그래밍");
		ov2.show("자바 프로그래밍");
		
		// 다형성 
//		ov1 = new Overchild();
		
	}

}
