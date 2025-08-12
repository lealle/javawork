package _10_polymorphismEx2;

public class Cat extends Pet {
	String kind;
	String color;
	String feature;
	Cat(){
		super("고양이","회색","애교쟁이");
	}
	
	Cat( String kind , String color, String feature){
		super(kind, color, feature);
	}
	@Override
	void sound() {
		System.out.println("냥냥");
	}
	

}
