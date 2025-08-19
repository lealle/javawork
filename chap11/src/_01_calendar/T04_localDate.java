package _01_calendar;

import java.time.LocalDate;

public class T04_localDate {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now(); // 년 월 일 요일 만 들어감 윤년도 메소드로 정의 되있음 
		System.out.println(today);
		
		// getter() 메소드 사용 
		System.out.println(today.getYear()+"년");
		System.out.println(today.getMonth()+"월"); // enum 형태
		System.out.println(today.getMonthValue()+"월"); // int 형 
		
		System.out.println(today.getDayOfMonth()+"일"); // 현재 월의 
		System.out.println(today.getDayOfYear()+"일"); // 1년 중 
		
		System.out.println(today.getDayOfWeek()+" : 요일");
		System.out.println(today.getDayOfWeek().getValue()+" : 요일"); // 1이면 월요일 

		System.out.println("이 달은 총 "+today.lengthOfMonth()+"일까지 있다."); // 이달은 총 몇일 
		System.out.println("올 해는 총 "+today.lengthOfYear()+"일까지 있다."); // 이달은 총 몇일 
	
		System.out.println("올 해는 윤년인가? "+today.isLeapYear());
		System.out.println("---------------------------------------------");
		
		LocalDate day = LocalDate.of(2025,4,10);
		System.out.println(day);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		
	}
}
