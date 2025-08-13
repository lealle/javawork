package _06_Ex1;

public interface Product {
	void turnOn();
	void turnOff();
	void volumeUp(int volume);
	void volumeDown(int volume);
	static void conversation_AI(String name) {
		System.out.println("AI입니다 무엇을 도와드릴까요 " +name +"님");
	}
	
	default void search(String str) {
		System.out.println("검색 : " + str);
	}
	
	// 이런형식으로 해도 good
//	default void power() {
//		boolean flag= false;
//		if(flag) {
//			
//		}else
//		{
//			
//		}
//	}

	
}
