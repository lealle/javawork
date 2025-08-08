package _03_tv;

public class Tv {
	// 속성
	String company = "LG";
	String model = "울트라 FULL HD";
	int inch = 80;
	boolean power;
	int volume;
	int channel = 5;
	
	// 기능, 메소드
	void power() {
		power = !power;
		if(power) {
			System.out.println("tv를 켭니다");
		}else {
			System.out.println("tv를 끕니다");
		}
	}
	
	int channelUp() {
		channel++;
		return channel;
	}
	
	int channelDown() {
		channel--;
		return channel;
	}
	
	int volume(int volumeInput) {
		volume = volumeInput;
		return volume;
	}
	
	int volumeUp() {
		if(volume < 100)
			volume++;
		return volume;
	}
	
	int volumeDown() {
		if(volume > 0)
			volume--;
		return volume;
	}
	
	
	
}
