package _03_Generic;

public class ProductRun {

	public static void main(String[] args) {
		Product<Tv, String> p1 = new Product<>();
		
		p1.setKind(new Tv());
		p1.setModel("스마트 TV");
		
//		p1.setKind(new Car()); 오류 발생 
		
		Tv tv = p1.getKind();
//		Car car = p1.getKind(); 
		System.out.println(p1.getModel());
		System.out.println("----------------------------------");
		
		Product<Car, String> p2 = new Product<>();
		
//		p2.setKind(new Tv());
		p2.setKind(new Car()); 
		p2.setModel("제네시스");
		
//		Tv tv = p1.getKind();
		Car car = p2.getKind(); 
		
		System.out.println(p2.getModel());
		
		
		
		
		
		
	}

}
