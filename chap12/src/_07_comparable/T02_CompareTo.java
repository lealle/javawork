package _07_comparable;

import java.util.Arrays;
import java.util.Comparator;


class Descending1 implements Comparator {
	
	
	
	
	@Override
	public int compare(Object o1, Object o2) {
		if((o1 instanceof Comparable && o2 instanceof Comparable) ) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c2.compareTo(c1); // 내림차순 정렬 
		}
//		return c1.compareTo(c2); // 오름차순 정렬 
		return -1;
//		return c1.compareTo(c2)*-1 ; // 내림차순 정렬 
		
		// 관련 내용 좀 더 살펴보기  
	}
	
}

public class T02_CompareTo {

	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion","tiger"};
		
		Arrays.sort(strArr); // String 의 Comparable 구현에 의해 정렬 (유니코드 순)
		// 대소문자 가림 
		System.out.println("strArr : " + Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분하지 않는것 
		System.out.println("strArr : " + Arrays.toString(strArr));

		// 내림차순 정렬의 class api 만들어서 사용 
		Arrays.sort(strArr, new Descending1()); // 내림차순으로 정렬 하라 
		System.out.println("strArr : " + Arrays.toString(strArr));
		
	
	}

}
