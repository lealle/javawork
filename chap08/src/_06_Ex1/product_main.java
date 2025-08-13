package _06_Ex1;

public class product_main {

	public static void main(String[] args) {

		Game g = new Game();
		Tv t = new Tv();
		
		g.turnOn();
		g.turnOff();
		g.volumeUp(3);
		g.volumeDown(3);
		g.changeGame("왕좌의게임");
		
		t.turnOn();
		t.turnOff();
		t.volumeUp(6);
		t.volumeDown(5);
		t.channelUp(2);
		t.channelDown(3);
		
		Product.conversation_AI("LEE");
		t.search("SBS");
	}

}
