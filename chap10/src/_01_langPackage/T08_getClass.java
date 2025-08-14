package _01_langPackage;
/*
	toString()
	참조변수를 출력하면 toString()이 호출되고
	패키지명.클래스명@hashCode (hashCode는 16진수로) 출력됨
*/

class Card{
	String kind;
	int num;
	Card(){
		this("HEART",7);
	}
	
	Card(String kind, int num){
		this.kind = kind;
		this.num = num;
	}
	//to toString 오버라이드
	@Override
	public String toString() {
		return kind+", "+num;
	}
	// 이전엔 주소 출력 
	// 지금은 return 문 반환
}


public class T08_getClass {

	public static void main(String[] args) {
		Card c1 = new Card("SPADE",3);
		
		System.out.println(c1);
		System.out.println("c1.getClass() : "+c1.getClass());
		System.out.println("c1.getClass().getName() : "+c1.getClass().getName()); // 앞의 class 만 빠지는 것 
		System.out.println("---------------------");
		
	
		
	}

}
