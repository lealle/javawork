package _01_calendar;

import java.text.DecimalFormat;

public class T08_DecimalFormat {

	public static void main(String[] args) {
		double num1 = 1234567.89;
		double num2 = 3.0;
		
		DecimalFormat df = new DecimalFormat("#,###"); 
		// # 또는 0, #은 값이 있으면 값 출력, 0은 해당자리수는 무조건 나와야함
		// 0 : 무조건 자리 차지
		// # : 값이 있으면 출력 , 값이 없으면 자리차지 안함 
		System.out.println(new DecimalFormat("0").format(num1)); // 첫번째 자리까지는 반드시 출력 
		System.out.println(new DecimalFormat("#").format(num1)); // 
		
		System.out.println(new DecimalFormat("0.0").format(num2)); // 소수점 첫번째 자리까지는 반드시 출력 
		System.out.println(new DecimalFormat("#.#").format(num2)); // 소수점 출력 x 굳이 할필요없어서 
		
		System.out.println(new DecimalFormat("0000000000.0000").format(num1)); // 소수점 세번째 자리까지는 반드시 출력 
		System.out.println(new DecimalFormat("##########.####").format(num1)); // 
		
		System.out.println(df.format(num1));
		System.out.println(df.format(num2));
		System.out.println("----------------------------------------------------");
		
		
		System.out.println(new DecimalFormat("#,###.##").format(num1)); // printf 와 이것중 자기가 편한것을 사용하면 됨 
		System.out.println();
		
	}

}
