package _02_phone;


//SmartPhone sp = new SmartPhone("폴드z","흰색");
public class SmartPhone extends Phone {
	SmartPhone(String model, String color) {
		super(model, color);  // super() 부모의 생성자
	}

//	SmartPhone(String model, String color) {
//		super("폴드z","흰색");  // super() 부모의 생성자
//	}

	
	String search;
	
	String search(String search) {
		this.search = search;
		return this.search;
	}
}
