package _05_interfaceDefault;

public class InterClassRun {

	public static void main(String[] args) {
		InterClass in1 = new InterClass();
		InterClass2 in2 = new InterClass2();
		
		System.out.println(in1.method());
		System.out.println(in1.method1());
		System.out.println(in1.method2());
		
		System.out.print("오버라이딩 안한 deMe() : ");
		System.out.println(in1.deMe());
		System.out.print("오버라이딩 안한 me() : ");
		System.out.println(in1.me());
		
		System.out.println("--------------------------");
		
		System.out.print("오버라이딩 한 deMe() : ");
		System.out.println(in2.deMe());
		System.out.print("오버라이딩 한 me() : ");
		System.out.println(in2.me());

		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
	
		
	
	}

}
