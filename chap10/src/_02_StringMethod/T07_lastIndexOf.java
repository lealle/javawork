package _02_StringMethod;

public class T07_lastIndexOf {

	/*
	 * lastIndexOf 오버로딩이 되어있음 찾는 문자가 없으면 -1 반환 있으면 index 번호 반환 
	 * lastIndexOf() : 뒤에서부터 살펴봄
	 * lastIndexOf(char) : 뒤에서부터 찾아서 char의 문자의 index번호 반환 
	 * lastIndexOf(char, fromIndex) : fromIndex 번호에서부터  char의 문자를 찾아서 index번호 반환 
	 * lastIndexOf(String) : 뒤에서부터 문자열의 시작  index번호 반환 
	 * lastIndexOf(String, fromIndex) : fromIndex 번호에서부터 찾아서 문자열의 index번호 반환 
	 * 
	*/
	public static void main(String[] args) {
		String str = "abcabcabca";		
		// fromIndex는 index 앞을 보고 문자열이 걸쳐서 있으면 그 문자열도 찾음 5번부터 0번으로 뒤로 읽음 
		System.out.println(str.lastIndexOf('a'));
		System.out.println(str.lastIndexOf("abc"));
		System.out.println(str.lastIndexOf("abc",5)); 
		

		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}

}
