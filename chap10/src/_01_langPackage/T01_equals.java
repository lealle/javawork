package _01_langPackage;


class Value extends Object{ // 명시 안해도 자동 
	int value;
	Value(int value){
		this.value = value;
	}

	@Override
	public boolean equals(Object o) {
		return value == ((Value)o).value;// value -> Value,  o.value -> Object 그래서 강제 형변환
		// 형변환 해줘야 value 값 생기기 떄문에 value 라는 값 만들기 위해 강제 형변환 
	}
	// override 시 2개 다 모두 같다 라고 나옴 
	// 아닐시 다름 같음 이 나옴 
	
}


public class T01_equals {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) { // object  v 주소가 같은가 물어보는것이라 틀림 
			System.out.println("v1과 v2는 같다");
		}else {
			System.out.println("v1과 v2는 다르다");
		}
		
		Value v3 = v1; // 주소 공유 
		if(v1.equals(v3)) { // object  v 주소가 같은가 물어보는것이라 맞음
			System.out.println("v1과 v3는 같다");
		}else {
			System.out.println("v1과 v3는 다르다");
		}
		
		
	}

}
