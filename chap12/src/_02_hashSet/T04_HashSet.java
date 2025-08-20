package _02_hashSet;


//import java.util.*; 이렇게 하나만 가져와도 됨
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class T04_HashSet {

	public static void main(String[] args) {
		// HashSet은 순서가 없어 이걸 정렬할려면 따로 뺴서 해야함
		Set<Integer> set = new HashSet<>();
		
		// 1~45 숫자중 6개 중복 안됨 
		int i=0;
		System.out.println(set.size());
		while(!(set.size()==6)) {
			set.add(((int)(Math.random()*45)+1)); 
			// int 형변환전 묶어서 어떤걸 형변환시킬지 확실히하자 random 만 형변환해서 0,1만 나오게하지말고
		}
		
//		for(int j=0; set.size()<6 ; j++) {
//			set.add(((int)(Math.random()*45)+1)); 
//		}
		
		System.out.println(set);
		
		// 오름차순 정렬을 하여라 -> List 로 변환
		List list = new ArrayList(set); // () 안에 컬렉션 (Collection) 들어갈 수 있음 -> 현재 Collection set 넣은것 
		// Vector, LinkedList 등등 어떤걸 써도 됨 
		Collections.sort(list); // 오름차순 정렬 
//		list.sort(null);
		System.out.println(list);
		
		System.out.println();
	}
}
