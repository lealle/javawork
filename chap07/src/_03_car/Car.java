package _03_car;

public class Car {
	String model;
	String company;
	boolean power= false;
	int speed = 0;
	
	
	
	Car(String model , String company){
		this.model = model;
		this.company = company;
	}
	
	void run() {
		if(power = !power) {
			System.out.println("시동이 켜졌습니다");	
		}else {
			System.out.println("시동이 꺼졌습니다");
			
		}
//		power =true;
//		System.out.println("시동이 켜졌습니다");	
		
	}
	
	void stop() {
		power = false;
		System.out.println("시동이 꺼졌습니다");
		speed = 0;
	}
	
	void speedUp() {
		speed++;
		System.out.println("속도가 " +speed + "로 빨라집니다.");
	}
	
	void speedDown() {
		if(speed >0)
			speed--;
		System.out.println("속도가 " +speed + "로 느려집니다.");
	}
	
}
