package _06_Ex1;

public class Game implements Product {
	int volumes;
	int channel;
	
	@Override
	public void turnOn() {
		System.out.println("게임이 켜졌습니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("게임이 꺼졌습니다.");
				
	}

	@Override
	public void volumeUp(int volume) {
		volumes+= volume;
		System.out.println("게임이 전환되었습니다.");
		System.out.println("현재 볼륨 : "+volumes);
		
	}

	@Override
	public void volumeDown(int volume) {
		volumes-= volume;
		System.out.println("게임이 전환되었습니다.");
		System.out.println("현재 볼륨 : "+volumes);
		
	}
	
	public void changeGame(String volume) {
		
		System.out.println("게임이 전환되었습니다.");
		System.out.println("현재 게임 : "+volume);
	}
	
	
}
