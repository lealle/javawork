package _01_calendar;

import java.util.Calendar;

public class T02_calendar_set {

	public static void main(String[] args) {
		Calendar date1 = Calendar.getInstance();
	
		date1.set(2025, 8-1, 4);
		int month = date1.get(Calendar.MONTH);
		System.out.println(month+1+"월");
		
		date1.set(2025, 8-1, 4, 15, 0);
		int hour = date1.get(Calendar.HOUR);
		System.out.println(hour+"시");
		
		// add(): 기존날짜에 다른 날이나 달, 년을 추가
		date1.add(Calendar.DATE, 100);
		System.out.println("개강일로부터 100일 후 : "+(date1.get(Calendar.MONTH)+1) +"월 "+date1.get(Calendar.DATE)+"일");
		
		date1.add(Calendar.DATE, -100);
		date1.add(Calendar.MONTH, 2);
		System.out.println("개강일로부터 2달 후 : "+(date1.get(Calendar.MONTH)+1) +"월 "+date1.get(Calendar.DATE)+"일");
		
		
		System.out.println();
		System.out.println();
		
	}

}
