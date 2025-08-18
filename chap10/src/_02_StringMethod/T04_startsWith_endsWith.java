package _02_StringMethod;

public class T04_startsWith_endsWith {

	public static void main(String[] args) {
//		startsWith : 맨앞에 지정하는 문자로 시작하는지 
		String str = "springjavahtmlsql";
	
		boolean bool1 = str.startsWith("spring");
		boolean bool2 = str.startsWith("java");
		boolean bool3 = str.startsWith("java",6);
			
		
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println(bool3);
		
		// endsWith : 맨 끝에 지정하는 문자로 끝나는지
		String[] strArr = {"aa.jpg","bb.class","cc.text","dd.png"};
		for(int i = 0; i<strArr.length; i++) {
			if(strArr[i].endsWith("jpg")||strArr[i].endsWith("png")) {
				System.out.println(strArr[i]+"는 그림 파일입니다.");
			}else {
				System.out.println(strArr[i]+"는 그림 파일dl 아닙니다.");
			}
		}
		
		
	}

}
