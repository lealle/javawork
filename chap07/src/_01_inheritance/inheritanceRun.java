package _01_inheritance;

class A {
	int aa = 10;
}

class B extends A {
	int bb = 20;
}

class C extends A {
	int cc = 30;
}

class D extends C {
	int dd = 40;
}





public class inheritanceRun {

	public static void main(String[] args) {
		
		A a1= new A();
		System.out.println("a1.aa : " + a1.aa);
		
		B b1= new B();
		System.out.println("b1.aa : " + b1.aa);
		System.out.println("b1.bb : " + b1.bb);
		System.out.println();
		
		C c1= new C();
		System.out.println("c1.aa : " + c1.aa);
		System.out.println("c1.cc : " + c1.cc);
		System.out.println();
		
		D d1= new D();
		System.out.println("d1.aa : " + d1.aa);
		System.out.println("d1.cc : " + d1.cc);
		System.out.println("d1.dd : " + d1.dd);
		System.out.println();
		
		b1.aa = 100;
		// b1의 값만 바꿔져 보이는 모습
		//static 이 아니기 떄문에 
		System.out.println("b1.aa : " + b1.aa);
		System.out.println("c1.aa : " + c1.aa);
		System.out.println("d1.aa : " + d1.aa);
		System.out.println();
		
	}
}
