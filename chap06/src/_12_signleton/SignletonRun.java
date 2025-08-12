package _12_signleton;

/*
 * 싱글톤 : 전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 기법
    - 사용하는 이유 : 최초로 만들어진 객체를 재활용하는 패턴
    				생성자를 통해 여러 번 호출이 되더라도 객체는 새로 생성하지 않음
    - 장점 : 메모리 낭비 방지
    - 단점 : 
       1. 의존성이 높아진다.
       2. private 생성자를 이용하기 때문에 상속이 어렵다
       3. 테스트하기 힘들다
 */

class Signleton {
	// private으로 외부에서 접근하지 못하도록 막음
	private static Signleton signleton = new Signleton();
	
	// 객체를 생성하지 못하도록 막아 놓음
	private Signleton() {
		System.out.println("객체 생성");
	}
	
	// getter 메소드. static이 안붙은 인스턴스 메소드 사용못함(객체를 생성할 수 없기 때문)
	static Signleton getSignleton() { 
		return signleton;
	}
}

public class SignletonRun {
	public static void main(String[] args) {
		Signleton s1 = Signleton.getSignleton();
		System.out.println(s1);
		
		Signleton s2 = Signleton.getSignleton();
		System.out.println(s2);

	}
}
