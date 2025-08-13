package _01_abstract;

public class Frog extends Pet {
	Frog(){
		this("청개구리", "초록색", "말을 안들음");
	}
	
	
	Frog(String kind, String color,String feature){
		super(kind, color, feature);
	}
	@Override
	void sound() {
		System.out.println("개굴개굴");
	}

	@Override
	void info() {
		System.out.println("특징 : "+getfeature() ); // 내것이 있으면 내것먼저하고 없으면 부모한테 찾아봄
		
	}

}
