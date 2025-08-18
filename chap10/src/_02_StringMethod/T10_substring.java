package _02_StringMethod;

public class T10_substring {

	/* substring : 문자열에서 원하는 문자열만 추출할 때 사용
	 * substring(index) : 문자열에서 index 번호부터 끝까지 얻어옴 
	 * substring(index, lastIndex) : 문자열에서 index 번호부터 lastIndex까지 얻어옴 
	*/
	public static void main(String[] args) {
		// substring 다 소문자임 ! 대문자 안쓰게 주의 
		String str = "spring aws start";
		String sub1 = str.substring(7);
		String sub2 = str.substring(7,10);
		
		System.out.println(sub1);
		System.out.println(sub2);
		
		String str3 = "960818-3123354";
		String sub3 = str3.substring(0,6); // 생년월일  
		
		System.out.println(sub3);
		if(Integer.parseInt(sub3.substring(0,2)) <25 ) {
			System.out.println("20"+sub3.substring(0,2)+"년 "+sub3.substring(2,4)+"월 "+sub3.substring(4,6)+"일");

		}else {
			System.out.println("19"+sub3.substring(0,2)+"년 "+sub3.substring(2,4)+"월 "+sub3.substring(4,6)+"일");

		}
		
		
		
		int age = 0;
		if(Integer.parseInt(sub3.substring(0,2)) <=25 ) {
			age = 25 - Integer.parseInt(sub3.substring(0,2));
		}else {
			age = 125 - Integer.parseInt(sub3.substring(0,2));
		}
		
		System.out.println("나이 : "+age);
	}

}
