package _02_method;

import _01_object.T01_apiClass;

public class MainMethod {

	public static void main(String[] args) {
		
		T01_apiMethod obm1 = new T01_apiMethod();// 객체 생성 
		obm1.print1();
		System.out.println("---------------");
		// 주의 : 반환형이 없는(void) 메소드는 값을 저장할 수 없고 
		// 출력문 사용도 안됨 
		// ex) System.out.println(obm1.print1());
		
		
		obm1.print2();
		int result2 = obm1.print2();
		System.out.println(result2);
//		System.out.println(obm1.print2());
		
		System.out.println("---------------");
		
		obm1.print3();
		String str3 = obm1.print3();
		System.out.println(str3);
//		System.out.println(obm1.print3());
		
		System.out.println("---------------");

		
		obm1.print4(5);
		System.out.println("---------------");
	
		obm1.print5(6,7);
		int result5 = obm1.print5(6,7);
		System.out.println(result5);
		System.out.println(obm1.print5(6,7));
			
		System.out.println("---------------");
		
		String str6 = obm1.print6(26,"더조은","서울 강남구");
		System.out.println(str6);
		
		System.out.println("---------------");

		
		T02_apiOp obm2 = new T02_apiOp();// 객체 생성 
		
		int add1 = obm2.add(40, 7);
		int minus1 = obm2.minus(40, 7);
		int multiply1 = obm2.multiply(40, 7);
		int remainder1 = obm2.remainder(40, 7);
		double divide1 = obm2.divide(40, 7);
		
		System.out.println("40,7을 이용한 연산");
		System.out.println("add : "+add1);
		System.out.println("minus : "+minus1);
		System.out.println("multiply : "+multiply1);
		System.out.println("remainder : "+remainder1);
		System.out.println("divide : "+divide1);
		
		System.out.println("---------------");

		
		
		
		
		
		
		
		System.out.println();
		System.out.println();
	
	
	}

}
