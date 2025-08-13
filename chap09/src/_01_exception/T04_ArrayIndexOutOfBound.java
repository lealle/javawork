package _01_exception;

import java.util.Arrays;

public class T04_ArrayIndexOutOfBound {

	public static void main(String[] args) {
		
		try 
		{
			String[] str= {"spring boot", "java","oracle"};
			str[3] = "kim";
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열은 index2까지만 사용 가능");
			
		}
	}

}
