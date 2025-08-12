package _03_car;

public class CarRun {

	public static void main(String[] args) {
		AmbulanceCar am = new AmbulanceCar("앰뷸", "현대");
		
		System.out.println("모델명 : " + am.model);
		System.out.println("회사 : " + am.company);
		
		am.run();
		am.stop();
		am.speedUp();
		am.speedDown();

		am.siren();
		am.firstAid();
	}

}
