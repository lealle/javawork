package _01_exception;

class Animal{}

class Dog extends Animal{}
class Cat extends Animal{}




public class T05_classCast {

	
	public static void main(String[] args) {
		try {
			Animal ani = new Animal();
			Dog dog = new Dog();
			Cat cat = new Cat();
			
			// 형변환 자동
			Animal aniDog = dog;
			Animal anicat = cat;
			
			
			System.out.println("aniDog를 dog로 형변환"); 
			dog = (Dog)aniDog;
						
			System.out.println("ani를 dog로 형변환"); 
			dog = (Dog)ani;
			
			System.out.println("끝");
			
		}catch(ClassCastException e) {
				System.out.println("부모타입을 만든 객체는 자식 타입으로 형변환 불가");
		}
		
		
		
	}

}
