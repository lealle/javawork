package _01_calendar;

import java.util.Calendar;

public class T01_calendar_get {
	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance(); 
		// singleton() 딴 곳에서 객체를 생성하지 못하도록 막아놓음
		// private로 만들어두고 미리 만들어둔 메소드로 만들어둔 객체를 호출하도록 함 
		// java.util.Calendar.getinstance(); 여야하는데 import 하면 지금처럼 쓰면됨
//		System.out.println(today);
		
		System.out.println("현재 년도 : "+ today.get(Calendar.YEAR));
		System.out.println("-------------------------------------------------");
		
		// 월은 0부터 시작, 항상 1을 더해줘야함
		System.out.println("현재 월 : "+ (today.get(Calendar.MONTH)+1));
		System.out.println("이달의 몇번째 주 : "+ (today.get(Calendar.WEEK_OF_MONTH)));
		System.out.println("올해의 몇번째 주 : "+ (today.get(Calendar.WEEK_OF_YEAR)));
		System.out.println("-------------------------------------------------");
		
		// 일 
		System.out.println("몇일 : "+ (today.get(Calendar.DATE)));
		System.out.println("몇일 : "+ (today.get(Calendar.DAY_OF_MONTH))); // 똑같이 나옴 
		System.out.println("365일 중 오늘이 몇일 : "+ (today.get(Calendar.DAY_OF_YEAR))); 
		System.out.println("-------------------------------------------------");
		
		// 요일 -> 숫자로 나옴  1 -> 일요일, 2 -> 월요일 ... 
		int week = today.get(Calendar.DAY_OF_WEEK);
		System.out.print(week+" : ");
		// 스위치 구문 혹은 이넘파일로 설정
		
		switch(week) {
		case 1:
			System.out.println("일요일");
			break;
		case 2:
			System.out.println("월요일");
			break;
		case 3:
			System.out.println("화요일");
			break;
		case 4:
			System.out.println("수요일");
			break;
		case 5:
			System.out.println("목요일");
			break;
		case 6:
			System.out.println("금요일");
			break;
		case 7:
			System.out.println("토요일"); // 끝에는 break 안넣어도 됨 
		}

		// 시간 
		System.out.println("시간(0~23) : "+(today.get(Calendar.HOUR_OF_DAY)));
		System.out.println("시간(0~11) : "+(today.get(Calendar.HOUR)));
		int ampm = today.get(Calendar.AM_PM);
		System.out.println("0 am ? 1 pm : "+ampm);
		
		// 시간 AM 09시 
		
		switch(ampm) {
		case 0:
			System.out.print("시간 : AM ");
			break;
		case 1:
			System.out.print("시간 : PM ");
		}
		System.out.println((today.get(Calendar.HOUR)+"시"));
		
		
		
		
		System.out.println();
		
		
		
		
		
		
		
		System.out.println();
	}
}

//		public static Calendar getInstance()
//	    {
//	        Locale aLocale = Locale.getDefault(Locale.Category.FORMAT);
//	        return createCalendar(defaultTimeZone(aLocale), aLocale);
//	    }



//private static Calendar createCalendar(TimeZone zone,
//        Locale aLocale)
//{
//CalendarProvider provider =
//LocaleProviderAdapter.getAdapter(CalendarProvider.class, aLocale)
//.getCalendarProvider();
//if (provider != null) {
//try {
//return provider.getInstance(zone, aLocale);
//} catch (IllegalArgumentException iae) {
//// fall back to the default instantiation
//}
//}
//
//Calendar cal = null;
//
//if (aLocale.hasExtensions()) {
//String caltype = aLocale.getUnicodeLocaleType("ca");
//if (caltype != null) {
//cal = switch (caltype) {
//case "buddhist" -> new BuddhistCalendar(zone, aLocale);
//case "japanese" -> new JapaneseImperialCalendar(zone, aLocale);
//case "gregory"  -> new GregorianCalendar(zone, aLocale);
//default         -> null;
//};
//}
//}
//if (cal == null) {
//// If no known calendar type is explicitly specified,
//// perform the traditional way to create a Calendar:
//// create a BuddhistCalendar for th_TH locale,
//// a JapaneseImperialCalendar for ja_JP_JP locale, or
//// a GregorianCalendar for any other locales.
//// NOTE: The language, country and variant strings are interned.
//if (aLocale.getLanguage() == "th" && aLocale.getCountry() == "TH") {
//cal = new BuddhistCalendar(zone, aLocale);
//} else if (aLocale.getVariant() == "JP" && aLocale.getLanguage() == "ja"
//&& aLocale.getCountry() == "JP") {
//cal = new JapaneseImperialCalendar(zone, aLocale);
//} else {
//cal = new GregorianCalendar(zone, aLocale);
//}
//}
//return cal;
//}
