package _03_casting;

public class T02_casting {
	public static void main(String[] args) {
		//강제 형변환 
		
		System.out.println("byte의 크기 : " + Byte.MIN_VALUE+ " ~ "+Byte.MAX_VALUE);
		System.out.println("short의 크기 : " + Short.MIN_VALUE+ " ~ "+Short.MAX_VALUE);
		System.out.println("int의 크기 : " + Integer.MIN_VALUE+ " ~ "+Integer.MAX_VALUE);
		System.out.println("char의 크기 : " + (int)Character.MIN_VALUE+ " ~ "+(int)Character.MAX_VALUE);
		System.out.println("----------------------------------------");
		
		int num1 = 123456;
		byte b1 = (byte)num1;
		System.out.println(b1);
		
		Long long1 =21464836471234L; // L이 없을시 int형으로 간주
		float float1 = long1;
		System.out.println(float1); //지수부 가수부 분리하여 출력
		
		// 51648 : 지
		int num2 = 51648;
		char ch1 = (char)num2;
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
	
	}
}
