package _01_exception;

import java.util.Arrays;

public class T06_numberFormat {

	public static void main(String[] args) {
		String[] str= {"23", "17","3.41592"}; // a 3.14123 도 다 오류 발생 
		int i=0;
		try 
		{
			for(i=0; i<str.length; i++) {
				int num = Integer.parseInt(str[i]);
				System.out.println(num);
			}
		}
		catch(NumberFormatException e) {
			System.out.println(str[i]+"는 정수로 변환 불가");
		}
	}

}
