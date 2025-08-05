package _01_operation;

public class T02_increase_decrease {

	public static void main(String[] args) {
		
		int num1 = 10;
		num1++; // 11
		num1--; //10
		num1--; //9
		System.out.println(num1);
		
		//단항 일 때는 연산자가 앞에 붙으나 뒤에 붙으나 동일한 결과가 나온다.
		num1 = 10;
		++num1;
		
		int num2 = 10;
		int num3 = 10;
		
		int result = ++num2 + num3++; // 21 = 11 + 10
		System.out.println(result);
		System.out.println(num2);
		System.out.println(num3);
		// 앞에 붙으면 먼저 증가시키고 연산을 하고
		// 뒤에 붙으면 연산 먼저 하고 다음에 나 자신을 증가시킨다.
		
		num2 = num3 = 10; //이렇게 하여도 됨
		
		result = num2-- + ++num3; // 10 + 11 = 21
		
		
		System.out.println();
		
	}

}
