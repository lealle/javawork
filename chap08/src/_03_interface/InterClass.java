package _03_interface;

public class InterClass implements Inter, Inter2{
	// Inter 2 만 상속받아도 문제 없는 걸 확인할 수 있음
	
	// 기존 Inter Inter2 둘다 받음
	
	
	
	
	@Override
	public void print(int a) {
		System.out.println("받은 값 : "+a);
	}

	@Override
	public void method() {
		System.out.println("매개변수 없는 메소드 호출");
			
	}

	@Override
	public String str(String name) {

		return "이름 : " +name;
	}

	@Override
	public int add(int x) {
		return x;
	}

	@Override
	public int add(int x, int y) {
		return x+y;
	}
	
	
}
