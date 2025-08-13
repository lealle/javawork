package _01_smartphoneEx;

public class SmartPhone extends Phone {

	SmartPhone(String owner){
		super(owner);
	}
	
	
	@Override
	void hangUp() {
		System.out.println("폰을 올려 받는다.");
	}
	
	@Override
	void hangOut() {
		System.out.println("폰을 내려 끊는다.");
			
	}
}
