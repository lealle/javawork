package _01_langPackage;
/*
	toString()
	참조변수를 출력하면 toString()이 호출되고
	패키지명.클래스명@hashCode (hashCode는 16진수로) 출력됨
*/

class Card1{
	String kind;
	int num;
	Card1(){
		this("HEART",7);
	}
	
	Card1(String kind, int num){
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


public class T03_toString {

	public static void main(String[] args) {
		Card1 c1 = new Card1();
		Card1 c2 = new Card1("SPADE",10);
		Card1 c3 = null; // 값 없을시 toString 호출 x 
		
		
		System.out.println(c1);
		System.out.println(c1.toString());
		System.out.println("---------------------");
		
		System.out.println(c2);
		System.out.println(c2.toString());
		System.out.println("---------------------");
		
		// 참조변수의 값이 null 인 경우 null 출력하고 toString 호출하지 않음 
		System.out.println(c3);
//		System.out.println(c3.toString()); // null 시 toString 하면 주소가 없어 오류가 발생함 
		
	}

}
