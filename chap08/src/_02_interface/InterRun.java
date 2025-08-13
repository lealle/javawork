package _02_interface;

public class InterRun {

	public static void main(String[] args) {
		// interface도 형변환 가능 
		Inter i = new InterClass();
		i.print(6);
		i.method();
		System.out.println(i.PI);
//		i.MAX = 50; 상수라 출력은 가능하지만 수정은 불가능
		System.out.println(i.MAX);
		System.out.println(i.str("LEE")); 
	
	
	}

}
