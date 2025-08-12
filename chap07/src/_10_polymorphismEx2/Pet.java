package _10_polymorphismEx2;

public class Pet {
	String kind;
	String color;
	String feature;
	Pet(){
		
	}
	Pet(String kind, String color, String feature){
		this.kind = kind;
		this.color = color;
		this.feature = feature;
		
	}
	
	void sound() {
		System.out.println("동물의 울음소리");
	}
	
	void info(Pet p) {
		System.out.println("종류 : "+p.getKind()+", 색상 : "+p.getColor());
	}
	
	void info() {
		System.out.println("종류 : "+kind+", 색상 : "+color);
	}
	
	String getKind() {
		return  kind;
	}
	
	String  getColor() {
		return  color;
	}
	
	String  getFeature() {
		return  feature;
	}
	
	
	
	public String toString(Pet p) {
		return "종류 : "+p.getKind()+", 색상 : "+p.getColor()+", 특징 : "+p.getFeature();
	}
	
	public String toString() {
		return "종류 : "+kind+", 색상 : "+color+", 특징 : "+feature;
	}

}
