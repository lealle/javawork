package _10_polymorphismEx2;

public class Frog extends Pet {
	Frog(){
		super("개구리","초록색","개구쟁이");
	}
	
	Frog( String kind , String color, String feature){
		super(kind, color, feature);
	}
	@Override
	void sound() {
		System.out.println("개굴개굴");
	}
	
	
	
}
