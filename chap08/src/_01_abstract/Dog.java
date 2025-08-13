package _01_abstract;

public class Dog extends Pet {
	Dog(){
		this("똥개", "갈색", "똥을 잘먹음");
	}
	
	
	Dog(String kind, String color,String feature){
		super(kind, color, feature);
	}
	@Override
	void sound() {
		System.out.println("멍멍");
	}

	@Override
	void info() {
		System.out.println("특징 : "+super.getfeature() ); // 내것이 있으면 내것먼저하고 없으면 부모한테 찾아봄
		
	}

}
