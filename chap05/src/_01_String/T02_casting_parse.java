package _01_String;

public class T02_casting_parse {

	public static void main(String[] args) {
		// 문자 -> 숫자로 형변환 
		//숫자 변환할때 다 숫자여야변환 가능 특수기호나 다른형 들어가면 오류 발생
		String str1 = "100";
		int num1 = Integer.parseInt(str1);
		
		System.out.println(num1 + 100);
		System.out.println(str1 + 100);
		
		double dou1 = Double.parseDouble(str1);
		System.out.println(dou1 + 100);
		
		String str2 ="true";
		boolean bool1 = Boolean.parseBoolean(str2);
		System.out.println(bool1);

		
		// 숫자 -> 문자 
		int num2 = 50;
		String str3 = String.valueOf(num2);
		
		System.out.println(str3 + 90);
		
		double dou2 = 50;
		String str4 = String.valueOf(dou2);
		System.out.println(str4 + 90);
		
		
		
		
		
		
		System.out.println();
		System.out.println();
		
	}

}
