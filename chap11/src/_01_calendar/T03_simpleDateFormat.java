package _01_calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class T03_simpleDateFormat {

	public static void main(String[] args) {
		Date today = new Date(); // date 사용하지말라 권장되지만 simple dataformat 에 예시로 쓰기 좋아 사용 
		System.out.println(today);
		/*
			SimpleDateFormat 클래스 : 날짜에 대한 포맷을 제공
			- yyyy : 년도 4자리 , yy 년도 2자리 
			- MM : 월 2자리, M : 월 1자리 
			- dd : 일 2자리, d : 일 1자리
			- hh : 시 2자리, h : 시 1자리 (0~11)
			- HH : 시 2자리, H : 시 1자리 (0~23)
			- mm : 분 2자리, m : 분 1자리
			- ss : 초 2자리, s : 초 1자리
		*/
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(today));
	
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf2.format(today));
	
		Date today1 = new Date(125, 03, 07); 
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-M-d");
		System.out.println(sdf3.format(today1));
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf4.format(today));

		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		System.out.println(sdf5.format(today));
		
		String str = "20250819";
		SimpleDateFormat sdf6 = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat sdf7 = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date strNow = sdf6.parse(str); // 문자를 날짜의 혀앹로 변경 
//			Date strNow1 = sdf7.parse(str); // 형태가 달라 바꾸지 못함 오류 발생 
			System.out.println(sdf7.format(strNow)); // 날짜포맷 적용  
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(sdf6);
		System.out.println();
	}

}
