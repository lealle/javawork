package _01_abstract;

public class Cat extends Pet {
	Cat(){
		this("고양이", "흰색", "개냥이");
	}
	
	
	Cat(String kind, String color,String feature){
		super(kind, color, feature);
	}
	@Override
	void sound() {
		System.out.println("야옹");
	}

	@Override
	void info() {
		
		
	}

}
