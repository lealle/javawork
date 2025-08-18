package _03_StringBuffer;

public class T01_StringBuffer {

	/*
		String(불변성) : 한번 객체가 생성되면 덮어쓰기 안됨(무조건 새로 생성)
						변하지 않는 문자열을 사용할 때 
		StringBuffer : 추가, 수정, 삭제 가능 동기화 지원 o 
						자주 변경되는 문자열을 사용할 때 
						멀티스레드 환경에서 사용 
		StringBuilder :추가, 수정, 삭제 가능 동기화 지원 x
						자주 변경되는 문자열을 사용할 때 
						단일스레드 환경에서 사용 
						StringBuffer보다 빠름 
						
	*/
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer(); // 16문자를 담을 수 있는 객체 생성
		StringBuffer sb2 = new StringBuffer(30); // 30문자를 담을 수  있는 객체 생성 
		StringBuffer sb3 = new StringBuffer("abc"); // abc 의 값이 들어있는 객체 생성 
		StringBuffer sb4 = new StringBuffer("abc"); // abc 의 값이 들어있는 객체 생성 
		
		// 문자가 하나도 없어 아직 길이가 0 
		System.out.println("sb1에 담겨있는 문자열의 길이 : "+sb1.length());
		System.out.println("sb2에 담겨있는 문자열의 길이 : "+sb2.length());
		System.out.println("sb3에 담겨있는 문자열의 길이 : "+sb3.length());

		// equlas 는 오버라이딩 하지 않음 
		System.out.println("sb3 == sb4 : "+ (sb3==sb4));   // 객체 따로 생성 주소 다름! 
		System.out.println("sb3.equals(sb4) : 주소가 같은가? "+sb3.equals(sb4)); // 오버라이딩 되어있지않음!(String과 다르게)
		// 오버라이딩되지않아 주소가 같은가? 여부로 판단! 
		
		// toString()은 오버라이딩이 되어있음 (값으로 들어있는 문자열 반환)
		System.out.println("sb3 : "+sb3);
		sb3.append("def");
		System.out.println("sb3.toString() : "+sb3.toString());
		sb3.append("123");
		System.out.println("sb3 : "+sb3);
		sb3.append(true);
		System.out.println("sb3 : "+sb3);
		
		// delete()
		sb3.deleteCharAt(8); // 하나 삭제
		System.out.println("sb3 : "+sb3);
		sb3.delete(3, 6);
		System.out.println("sb3 : "+sb3);
		sb3.delete(3, sb3.length());
		System.out.println("sb3 : "+sb3);
		System.out.println("------------------------");
		
		// insert(index, 문자열)
		sb3.insert(1, "123");
		System.out.println("sb3 : "+sb3);
		sb3.insert(4, "김");
		System.out.println("sb3 : "+sb3);
				
		//replace(start, end, 문자열) 
		sb3.replace(1, 4, "b"); //뺴는 글자보다 적거나 많아도 상관없음 
//		sb3.replace(1, 4, "program");
		System.out.println("sb3 : "+sb3);
		
		// reverse() : 뒤에부터 거꾸로
		System.out.println("거꾸로 출력 : "+sb3.reverse());
		
		//capacity() : StringBuffer의 객체가 생성될 때 버퍼의 크기
		// 			   기본 버퍼크기 16문자 + 문자크기
		System.out.println("sb1.capacity() : "+sb1.capacity());
		System.out.println("sb2.capacity() : "+sb2.capacity());
		System.out.println("sb3.capacity() : "+sb3.capacity());
		System.out.println("sb4.capacity() : "+sb4.capacity());
		// 각각의 버퍼 크기를 출력 
		System.out.println("------------------------");
		
		System.out.println();
		
		System.out.println("------------------------");
		
		
		// 빌더도 이거랑 똑같다 동기화만 다른것 ! 
		
	}

}
