package _01_calendar;

import java.time.Duration;
import java.time.LocalDateTime;
//import java.time.LocalTime;
//import java.time.LocalDate;
// 따로따로 존재 
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class T06_LocalDateTime {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now(); // 날짜 시간 다 가져오는 함수 
		System.out.println(today);
		
		LocalDateTime startDay = LocalDateTime.of(2025,8,4,15,0,0); // 날짜 시간 다 가져오는 함수 
		LocalDateTime endDay = LocalDateTime.of(2026,3,13,22,20,0); // 날짜 시간 다 가져오는 함수 
		
		System.out.println(startDay);
		System.out.println(endDay);
		System.out.println("---------------------------------");

		// 날짜 포맷 지정 
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd a hh:mm:ss");
		
		System.out.println("시작일 : "+dtf1.format(startDay));
		System.out.println("시작일 : "+startDay.format(dtf1)); // 자리 바뀌어도 똑같이 출력됨 
		System.out.println("종료일 : "+dtf1.format(endDay));

		// isBefore(), isAfter(), isEqual()
		if(today.isBefore(endDay)) {
			System.out.println("수업 진행중 입니다.");
		}else if(today.isAfter(endDay)) {
			System.out.println("종료된 수업입니다");
		}else if(today.isEqual(endDay)) {
			System.out.println("수업 마지막날 입니다");
		}
		System.out.println("---------------------------------");

		Duration d = Duration.between(startDay, endDay);
		System.out.println(d.getSeconds());
		System.out.println(d.getNano());
		System.out.println("---------------------------------");
		
		System.out.println("종료일 까지 "+today.until(endDay, ChronoUnit.MONTHS)+"개월 남음");
		System.out.println("종료일 까지 "+today.until(endDay, ChronoUnit.DAYS)+"일 남음");
		System.out.println("종료일 까지 "+today.until(endDay, ChronoUnit.HOURS)+"시간 남음");
		System.out.println("---------------------------------");

		System.out.println(today.plusYears(3).format(dtf1)); // 3년 후
		System.out.println(today.plusMonths(5).format(dtf1)); // 5개월 후 
		System.out.println(today.plusDays(100).format(dtf1)); // 100일 후
		System.out.println("---------------------------------");
		
		System.out.println(today.minusYears(3).format(dtf1)); // 3년 전
		System.out.println(today.minusMonths(5).format(dtf1)); // 5개월 전 
		System.out.println(today.minusDays(100).format(dtf1)); // 100일 전
		System.out.println("---------------------------------");
		
		System.out.println();
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
	}

}
