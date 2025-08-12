package _10_polymorphismEx2;

public class PetRun {

	public static void main(String[] args) {
		Pet p = new Pet();
		
		p.info(new Cat());
		p.info(new Frog());
		p.info(new Dog());

		p.info(new Cat("러시안 블루" ,"회색", "조용함"));
		p.info(new Frog("청개구리","초록색","나뭇잎 위에 잘 숨음"));
		p.info(new Dog("포메라니안" ,"흰색" ,"활발함"));

		p.toString(new Cat("러시안 블루" ,"회색", "조용함"));
		p.toString(new Frog("청개구리","초록색","나뭇잎 위에 잘 숨음"));
		p.toString(new Dog("포메라니안" ,"흰색" ,"활발함"));

		
		
		Pet pet1 = new Cat();
		Pet pet2 = new Dog();
		Pet pet3 = new Frog();
		pet1.sound();
		pet2.sound();
		pet3.sound();
		
		pet1.info();
		pet2.info();
		pet3.info();
		
		System.out.println(pet1.toString());
		System.out.println(pet2.toString());
		System.out.println(pet3.toString());
				
		
	}

}
