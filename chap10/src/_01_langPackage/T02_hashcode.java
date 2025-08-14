package _01_langPackage;

import java.util.Objects;

/*
	원래 Object 클래스에 있는 hashcode()는 객체의 주소로 해시코드를 만든다 
	
	equals()를 오버라이딩하여 값으로 비교하도록 만들면
	hashcode()도 오버라이딩하여 논리적으로 두 객체가 같도록 만들어 준다.
	
*/
class Equals{
	int value;
	
	Equals(int value){
		this.value = value;
	}
	
	@Override
	public boolean equals(Object o) {
		return value == ((Equals)o).value;// value -> Equals,  o.value -> Object 그래서 강제 형변환
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(value);
	}
	//원래는 주소로 만들었는데 이제는 value 값을 해시코드로 만듬 
	// 값으로 만들기에 원래는 다른 주소를 출력하던 함수 값으로 해시코드 만들어 같게 만들어짐 
	
}



public class T02_hashcode {
	public static void main(String[] args) {
		Equals e1 = new Equals(10);
		Equals e2 = new Equals(10);
		
		System.out.println(e1.equals(e2)); // true 오버라이딩하여서
		System.out.println("e1의 hashcode : "+e1.hashCode());
		System.out.println("e2의 hashcode : "+e2.hashCode());
		//다르다. 주소가 다르기 떄문에 
		//오버라이딩하고 나면 같아짐 값으로 만들기에
		System.out.println(e1 == e2);
	
		System.out.println("e1의 고유한 hashcode : "+System.identityHashCode(e1));
		System.out.println("e2의 고유한 hashcode : "+System.identityHashCode(e2));
		// 어떤 함수르 써도 다름
		
		String s1 = new String("tjoeun");
		String s2 = new String("tjoeun");
		System.out.println(s1.equals(s2)); // true 오버라이딩하여서
		System.out.println("s1의 hashcode : "+s1.hashCode());
		System.out.println("s2의 hashcode : "+s2.hashCode());
		//다르다. 주소가 다르기 떄문에 
		//오버라이딩하고 나면 같아짐 값으로 만들기에
		System.out.println(s1 == s2);
	
		System.out.println("s1의 고유한 hashcode : "+System.identityHashCode(s1));
		System.out.println("s2의 고유한 hashcode : "+System.identityHashCode(s2));
		// 어떤 함수르 써도 달라짐 
			
		
		
		
		
	}
}
