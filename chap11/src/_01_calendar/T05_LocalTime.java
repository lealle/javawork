package _01_calendar;

import java.time.LocalTime;

public class T05_LocalTime {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		System.out.println(time.getHour()+"시");
		System.out.println(time.getMinute()+"분");
		System.out.println(time.getSecond()+"초");
		System.out.println("------------------------");
		
		LocalTime time2 = LocalTime.of(17,5,40);
		System.out.println(time2);
		
		System.out.println(time2.getHour()+"시");
		System.out.println(time2.getMinute()+"분");
		System.out.println(time2.getSecond()+"초");
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		
	}

}
