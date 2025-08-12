package _06_anonymous;

class Parent {
	String method() {
		return "부모의 재산";
	}
	
}

class Child extends Parent{
	
	@Override // 오버라이드 안될시 함수에 문제있다고 알림 -> 실수를 막을 수 있는 코딩 
	String method() {
		return "자식의 재산";
	}
}






public class AnonymousRun {
	public static void main(String[] args) {
		Parent pa = new Parent();
		System.out.println(pa.method());
		
		// 익명 클래스 재사용할 필요가 없음 
		// 한번만 정의하여 사용 
		Parent p2 = new Child() {
			int age =24;
			@Override
			String method() {
				System.out.println(age);
				return "익명클래스";
			}
		};
		
		p2.method();
		System.out.println(p2.method());
		
		
	}
}
