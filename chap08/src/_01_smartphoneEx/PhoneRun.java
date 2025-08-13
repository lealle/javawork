package _01_smartphoneEx;

public class PhoneRun {

	public static void main(String[] args) {
		Phone p = new FolderPhone("Lee");
		p.hangUp();
		p.hangOut();
		
		p = new SmartPhone("Kim");
		p.hangUp();
		p.hangOut();
		
	}

}
