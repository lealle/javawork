package _01_smartphoneEx;

abstract public class Phone {
	private String owner;

	Phone(String owner){
		this.owner = owner;
	}
	
	
	abstract void hangUp();
	abstract void hangOut();
	
	

}
