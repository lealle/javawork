package _02_StringMethod;

public class T08_replace {

	public static void main(String[] args) {
		// replace : 글자 치환 
		String str = "javaprogram java aws java dajva";
		String newStr = str.replace('j','i');
		System.out.println(newStr);
		
		
		// 결과는 같지만 정규식 지원 여부의 차이가 있다. 
//		str = "javaprogram java aws java dajva";
//		newStr = str.replace("java","자바"); // 정규식 지원하냐 안하냐에 따라 시간이 달라짐  현재 이거는 지원 x 
//		System.out.println(newStr);
//		
		
		// replaceAll : 결과는 위와 동일하지만 단지 정규표현식 지원 함 (정규표현식 기반으로 치환함)
		str = "javaprogram java aws java dajva";
		newStr = str.replaceAll("java","자바"); // 정규식 지원하냐 안하냐에 따라 시간이 달라짐  현재 이거는 지원 o 좀 더 느림  
		System.out.println(newStr);
		
		
		// replaceFirts
		
		str = "javaprogram java aws java dajva";
		newStr = str.replaceFirst("java","자바");
		System.out.println(newStr);
		
		
	}

}
