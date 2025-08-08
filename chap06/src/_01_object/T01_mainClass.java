package _01_object;

import java.util.Scanner;

public class T01_mainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//라이브러리 (=API) 사용하기
		// 클래스이름 변수명 = new 클래스이름();
		
		
		T01_apiClass ob1 = new T01_apiClass();// 객체 생성 
		System.out.println(ob1.name);
		System.out.println(ob1.num);
		System.out.println(ob1.bool);
		System.out.println(ob1.dou);
		
		ob1.name = "더빛나";
		System.out.println("첫번째 객체의 이름 : "+ob1.name);
		
		T01_apiClass ob2 = new T01_apiClass();// 객체 생성 
		System.out.println("두번째 객체의 이름 : "+ob2.name);
		
		System.out.println("--------------------------------------");
		
		T02_apiClass ob3 = new T02_apiClass();// 객체 생성 
		System.out.println("나이는 : "+ob3.age );
		System.out.println("주소는 : "+ob3.address);
		
		
		
		System.out.println();
		
		
	
		
		
	}
}
