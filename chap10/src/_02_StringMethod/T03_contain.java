package _02_StringMethod;

public class T03_contain {

	public static void main(String[] args) {
		String str = "HTML 프로그래밍";
		
		
		boolean bool1 = str.contains("HTML");
		System.out.println(bool1);

		boolean bool2 = str.contains("JAVA");
		System.out.println(bool2);
		
		
		
		if( str.contains("HTML")) {
			System.out.println("웹 페이지를 만드는 프로그램");
		}else {
			System.out.println("기타 프로그램");
		}
	
	}
}
