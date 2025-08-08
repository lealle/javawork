package _04_Overloading;

public class Overloading {
	// 오버로딩의 조건
	// 1. 메서드의 이름이 같아야 한다
	// 2. 매개변수의 개수가 다르던지 자료형이 달라야 한다.
	
	int num= 10;
	
	int add() {
		return num;
	}

	int add(int num1) {
		return num + num1;
	}
	int add(int num1 , int num2) {
		return num1 + num2;
	}
	double add(double num1,double num2) {
		return num1 + num2;
	}
	String add(String name) {
		return "이름 : "+name ;
	}

}
