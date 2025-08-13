package _01_abstract;


public class Petrun {

	public static void main(String[] args) {		
//		Pet pet = new Pet(); 추상클래스 객체 생성할 수 없음
		
//		Cat pet1 = new Cat();
//		Dog pet2 = new Dog();
//		Frog pet3 = new Frog();
//		pet1.sound();
//		pet2.sound();
//		pet3.sound();
//		
//		pet1.info();
//		pet2.info();
//		pet3.info();
//		
//		System.out.println(pet1);
//		System.out.println(pet2);
//		System.out.println(pet3);
//		
		// 다형성
		// 상속받은것은 가능하다 ( 형변환 가능 )
		Pet pet4 = new Cat("스코티시폴드", "회색", "억울하게 생김");
		
		// 도 가능
		System.out.print("울음소리 : ");
		pet4.sound();
		pet4.info(); //cat은 정의 안함

		System.out.println("종류 : "+pet4.getkind());
		System.out.println("종류 : "+pet4.getcolor());
		System.out.println("종류 : "+pet4.getfeature());
		System.out.println("----------------------------------");
		
		pet4 = new Dog();
		System.out.print("울음소리 : ");
		pet4.sound();
		pet4.info(); 

		System.out.println("종류 : "+pet4.getkind());
		System.out.println("종류 : "+pet4.getcolor());
		System.out.println("종류 : "+pet4.getfeature());
		System.out.println("----------------------------------");
		
//		Pet pet5 = new Dog();
//		Pet pet6 = new Frog("황소개구리","갈색","엄청잘먹음");
		
		pet4 = new Frog("황소개구리","갈색","엄청잘먹음");
		System.out.print("울음소리 : ");
		pet4.sound();
		pet4.info(); 

		System.out.println("종류 : "+pet4.getkind());
		System.out.println("종류 : "+pet4.getcolor());
		System.out.println("종류 : "+pet4.getfeature());
		System.out.println("----------------------------------");
		
		
	}

}
