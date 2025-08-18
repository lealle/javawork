package _04_Wrapper;

public class T01_Wrapper {

	public static void main(String[] args) {
		Integer i1 = new Integer(3);
		
		Integer i2 = Integer.valueOf(3);
		
		System.out.println(i1);
		System.out.println(i2);
		
		Integer i3 = null;
		
		System.out.println(i3);
		
		System.out.println("MIN_VALUE : "+Integer.MIN_VALUE);
		System.out.println("MAX_VALUE : "+Integer.MAX_VALUE);
		System.out.println("size : "+Integer.SIZE);
		System.out.println("Bytes : "+Integer.BYTES);
		
	}
}
