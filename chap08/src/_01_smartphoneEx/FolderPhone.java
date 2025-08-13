package _01_smartphoneEx;

public class FolderPhone extends Phone {
	
	FolderPhone(String owner){
		super(owner);
	}
	
	@Override
	void hangUp() {
		System.out.println("폰을 열어서 받는다.");
		
	}
	
	@Override
	void hangOut() {
		System.out.println("폰을 덮어서 끊는다.");
		
	}
}
