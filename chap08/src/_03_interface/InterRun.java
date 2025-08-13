package _03_interface;

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
	
		InterClass in = new InterClass();
		System.out.println("add(2) : "+in.add(2));
		System.out.println("add(2,4) : "+in.add(2,4));
	
		// 같은 인터페이스끼리 상속가능 
		
	}

}
