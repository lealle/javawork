package _01_variable;

public class T04_String {

	public static void main(String[] args) {
		
		String Str1 = "801호";
		System.out.println(Str1);
		
		String Str2 = "java 풀스택";
		System.out.println(Str1 + " "+ Str2);
		
		// escape sequence(이스케이프 문자)
		/*
		 *  \문자 : 조합으로 특수 기능 수행
		 *  
		 *  \n : 줄바꿈
		 *  \t : 탭만큼 띄우기
		 *  \"" 쌍따음표 출력
		 *  
		 */
		
		String Str3 = "강의실 : 801호\n강좌명 : \"java\t풀스택 웹&앱 개발자\""; // 따음표 앞 역슬래쉬(*이스케이프 문자 넣어줘야함)
		System.out.println(Str3);
		
		
		/*
		 *	강의실 : 801호
		 *  강좌명 : java
		 * 
		 */

	}	

}
