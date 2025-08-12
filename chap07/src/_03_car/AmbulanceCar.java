package _03_car;

public class AmbulanceCar extends Car {
	boolean siren = false;
	
	AmbulanceCar(String model, String company){
		super(model, company);
	}
	
	
	void siren() {
		siren = !siren;
		if(siren = true)
			System.out.println("사이렌을 울립니다.");
			stop();
			
			
			
//		if(siren = !siren) {
//			System.out.println("사이렌을 울립니다.");
//		}else
//		{
//			System.out.println("사이렌을 멈춥니다.");
//		}
	}

	void firstAid() {
		System.out.println("응급처치를 시작하였습니다.");
	}

}
