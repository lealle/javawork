package _04_Overloading;

public class OverOp {
	// -, *, /
	int num = 1;
	// 매개변수 없는거 1 2 
	
	int minus() {
		return num;
	}

	int minus(int num1) {
		return num1 -num;
	}
	int minus(int num1 , int num2) {
		return num1 - num2;
	}
	
	int multiply() {
		return num;
	}

	int multiply(int num1) {
		return num1 * num;
	}
	int multiply(int num1 , int num2) {
		return num1 * num2;
	}
	
	double divide() {
		return num;
	}

	double divide(double num1) {
		return num1 / num;
	}
	double divide(double num1 , double num2) {
		return num1 / num2;
	}
	
	
}
