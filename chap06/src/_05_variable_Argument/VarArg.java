package _05_variable_Argument;

public class VarArg {

	public static void main(String[] args) {
		// 
//		VarArg v = new VarArg();
		method("a","a","b","a","a","b","a","a","s","q","c","r");
		method("b","a","a","s","q","c","r");
		
	}

//	void method(String s1) {
//		System.out.println(s1);
//	}
//	
//	void method(String s1 , String s2) {
//		System.out.println(s1+" "+s2);
//	}
//	
//	void method(String s1 , String s2, String s3) {
//		System.out.println(s1+" "+s2+" "+s3);
//	}
	// 이런 반복된 메소드가 아닌 하나의 메소드로 정의하기 위하여 가변인자가 사용된다.
	static void method(String...str) {
		for(String str1 : str) {
			System.out.print(str1 + " ");
		}
		System.out.println();
	}
	//호출하기 위해서는 객체를 생성해줘야함 단 static 붙였을시는 호출 가능 


}


