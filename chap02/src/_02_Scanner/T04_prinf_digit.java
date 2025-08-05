package _02_Scanner;

public class T04_prinf_digit {
	public static void main(String[] args) {
		System.out.printf("%7d\n", 32000);	//7자리까지 (빈자리로 쓰더라도)
		System.out.printf("%7d\n", 3200000);
		System.out.printf("%7d\n", 3200);
		
		System.out.println("------------------------");
		
	
		System.out.printf("%07d\n", 32000);
		System.out.printf("%07d\n", 320000);
		System.out.printf("%07d\n", 320);
		
		System.out.println("------------------------");
		
		System.out.printf("%10s\n", "abcdefg");
		System.out.printf("%-10s", "abcdefg"); //뒤가 비어짐 
		System.out.printf("%s\n", "123");
		
		System.out.println("------------------------");
		
		System.out.printf("%6.2f\n", 123.45); //6.2f 6 -> 전체 자리 .2 소수점 2번째까지 .도 하나의 자리 xxx.xx
		System.out.printf("%6.2f\n", 11111123.4567);
		System.out.printf("%6.2f\n", 123.4567);
		System.out.printf("%6.2f\n", 23.45);
		
		
		
		
	}
}
