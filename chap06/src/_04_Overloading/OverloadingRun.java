package _04_Overloading;

public class OverloadingRun {

	public static void main(String[] args) {
		Overloading over = new Overloading();

		
		System.out.println(over.add());
		System.out.println(over.add(1));
		System.out.println(over.add(1,2));
		System.out.println(over.add(1.0, 2.5));
		System.out.println(over.add("정민"));
		
		
		OverOp over1 = new OverOp();
		System.out.println("minus");
		System.out.println(over1.minus());
		System.out.println(over1.minus(40));
		System.out.println(over1.minus(40,7));
		
		System.out.println("multiply");
		System.out.println(over1.multiply());
		System.out.println(over1.multiply(40));
		System.out.println(over1.multiply(40,7));
		
		System.out.println("divide");
		System.out.println(over1.divide());
		System.out.println(over1.divide(40));
		System.out.println(over1.divide(40,7));
		
	}

}
