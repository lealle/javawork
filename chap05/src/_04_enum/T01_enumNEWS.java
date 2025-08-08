package _04_enum;

import java.util.Calendar;
import java.util.Scanner;

public class T01_enumNEWS {
	public static void main(String[] args) {
		
		NEWS new1 = NEWS.EAST;
		System.out.println(new1);
		
		// 위와 똑같은 호출
		NEWS new2 = NEWS.valueOf("WEST");
		System.out.println(new2);
		
		NEWS new3 = NEWS.valueOf(NEWS.class, "SOUTH");
		System.out.println(new3);
		
		switch(new1) {
		case EAST:
			System.out.println("동쪽입니다");
			break;
		case SOUTH:
			System.out.println("남쪽입니다");
			break;
		case WEST:
			System.out.println("서쪽입니다");
			break;
		case NORTH:
			System.out.println("북쪽입니다");
			break;
			
		}
		Calendar cal = Calendar.getInstance();
		// 오늘의 요일 얻기 (1~7) 1 일요일 2 월요일 ...
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("요일 : " + day);
		
		char day1[] = {'일','월','화','수','목','금','토'};
		System.out.println("요일 : " + day1[day-1]);
		
		WEEK today = null;
		
		switch(day) {
		case 1:
			today = WEEK.SUNDAY;	
			break;
		case 2:
			today = WEEK.MONDAY;	
			break;
		case 3:
			today = WEEK.TUSEDAY;	
			break;
		case 4:
			today = WEEK.WEDNESDAY;	
			break;
		case 5:
			today = WEEK.THURSDAY;	
			break;
		case 6:
			today = WEEK.FRIDAY;	
			break;
		case 7:
			today = WEEK.SATURDAY;	
			break;
			
		}
		System.out.println(today);
		
		
		if(today == WEEK.SUNDAY) {
			System.out.println("일요일에는 푹 쉽니다.");
			
		}else {
			System.out.println("자바공부를 열심히 합니다.");
			
		}
		
		//오늘이 해당하는 달 얻기(0~11)
		int month = cal.get(Calendar.MONTH);
		System.out.println("현재 월 : "+(month+1));
		
		MONTH Month = null;


		switch(month+1) {
		    case 1:
		    	Month = MONTH.January;
		        break;
		    case 2:
		    	Month = MONTH.February;
		        break;
		    case 3:
		    	Month = MONTH.March;
		        break;
		    case 4:
		    	Month = MONTH.April;
		        break;
		    case 5:
		    	Month = MONTH.May;
		        break;
		    case 6:
		    	Month = MONTH.June;
		        break;
		    case 7:
		    	Month = MONTH.July;
		        break;
		    case 8:
		    	Month = MONTH.August;
		    	
		        break;
		    case 9:
		    	Month = MONTH.September;
		        break;
		    case 10:
		    	Month = MONTH.October;
		        break;
		    case 11:
		    	Month = MONTH.November;
		        break;
		    case 12:
		    	Month = MONTH.December;
		        break;
		}
		System.out.println(Month);
		
		
		System.out.println();
		
		
		
//		Scanner sc =new Scanner(System.in); 
		
		
		
	}
}
