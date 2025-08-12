package _10_polymorphismEx2;

public class Dog extends Pet {
	String kind;
	String color;
	String feature;
	Dog(){
		super("강아지","흰색","산책좋아하는");
	}
	
	Dog( String kind , String color, String feature){
		super(kind, color, feature);
	}
	@Override
	void sound() {
		System.out.println("왈왈");
	}
	
	
	
}
