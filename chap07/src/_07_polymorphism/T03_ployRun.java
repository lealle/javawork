package _07_polymorphism;

class Car {
	String color;
	int speed;
	void drive() {
		System.out.println("운전중");
	}
	
	void stop() {
		System.out.println("stop!!");
	}
}

class FireCar extends Car{
	void water() {
		System.out.println("물을 뿌립니다~~~~");
	}
	
	void drive() {
		System.out.println("출동중");
	}
}


public class T03_ployRun {

	public static void main(String[] args) {
		FireCar fCar = new FireCar();
		fCar.drive();
		fCar.stop();
		fCar.water();
		
		Car car = fCar ;
		car.drive();
		car.stop();
//		car.water(); 사용불가
		
		FireCar f2 = (FireCar)car; // 강제 형변환 
		// 강제 형변환에서의 주의점 
		// 반드시 부모는 최초객체생성시 자식의 타입으로 객체가 생성되어 있어야함 
		
		Car car2 = new Car();
//		FireCar f3 = (FireCar)c;
		// 이런경우는 최초생성시 자식의 타입으로 생성되지않아 강제 형변환 불가(컴파일 오류)
		// 그래서 if 구문을 사용하여 구분하여 가능하면 형변환 아니면 instanceOf 로 구분 
	
		FireCar f3 = null;
		if(car instanceof FireCar) {
			f3 = (FireCar)car;
			System.out.println("변환함");
		}else {
			System.out.println("변환할 수 없음");
		}
		if(car2 instanceof FireCar) {
			f3 = (FireCar)car2;
			System.out.println("변환함");
		}else {
			System.out.println("변환할 수 없음");
		}
	
	}

}
