package _01_Ex;

public class SetRun {

	public static void main(String[] args) {
		Set s1 = new Set("Lee",20);
		Set s2 = new Set("Lee",20);
		Set s3 = new Set("Kim",25);
		
		System.out.println("s1 과 s2가 같은가? : "+s1.equals(s2));
		System.out.println("s1 과 s3가 같은가? : "+s1.equals(s3));
		System.out.println("s2 과 s3가 같은가? : "+s2.equals(s3));
		System.out.println("----------------------------");
		
		
		System.out.println("s1의 hashCode() : "+s1.hashCode());
		System.out.println("s1의 toString() : "+s1.toString());
		System.out.println(s1);
		System.out.println("----------------------------");

		System.out.println("s2의 hashCode() : "+s2.hashCode());
		System.out.println("s2의 toString() : "+s2.toString());
		System.out.println(s2);
		System.out.println("----------------------------");

		System.out.println("s3의 hashCode() : "+s3.hashCode());
		System.out.println("s3의 toString() : "+s3.toString());
		System.out.println(s3);
		
	}

}
