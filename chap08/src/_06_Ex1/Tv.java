package _06_Ex1;

public class Tv implements Product {
	int channel = 5;
	int volumes;
	@Override
	public void turnOn() {
		System.out.println("Tv가 켜졌습니다");
	}

	@Override
	public void turnOff() {
		System.out.println("Tv가 꺼졌습니다");
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

	public void channelUp(int volume) {
		channel = channel + volume;
		System.out.println("채널이 전환되었습니다.");

		System.out.println("채널 : "+channel);
	}

	public void channelDown(int volume) {
		if(channel < 0) {
			System.out.println("0보다 낮은 채널은 없습니다.");
		}else
		{
			channel -= volume;
			System.out.println("채널이 전환되었습니다.");

			System.out.println("채널 : "+channel);		
		}
	}
	@Override
	public void search(String name) {
		System.out.println("채널 검색 : " +name);

	}

}
