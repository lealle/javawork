package _07_polymorphism;



class A {
	int a = 1;
	
	void printInt() {
		System.out.println(a);
	}
}

class B extends A {
	int b = 2;
	void printInt() {
		System.out.println(b);
	}
}

class C extends A {
	int c = 3;
	void printInt() {
		System.out.println(c);
	}
}


class D extends B {
	int d = 4;
	void printInt() {
		System.out.println(d);
	}
}

class E extends C {
	int e = 5;
	void printInt() {
		System.out.println(e);
	}
}
public class T01_Polymorphism {

	public static void main(String[] args) {
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
	
		// 형변환 A 는 다 가능 
		A a1 = b; // B 사용 x 
		A a2 = c; // C 사용 x 
		A a3 = d; // B D 사용 x 
		A a4 = e; // C E 사용 x 
		
		System.out.println("b.a = "+ b.a);
		System.out.println("b.b = "+ b.b);

		System.out.println("a1.a = "+ a1.a);
//		System.out.println("a1.b = "+ a1.b); 사용할 수없음 A의 타입으로 B 를 형변환 했기에 
		// B 사용하지 않겠다 하고 형변환 했기에 사용 못함!
		// a3.b a3.d 둘다 안됨 
		
		// 오직 자식인 d 만 가능
//		B b1 = c;
		B b2 = d;
//		B b3 = e;
		
		// e만 가능 
//		C c1 = d;
		C c2 = e;

		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
	}

}
