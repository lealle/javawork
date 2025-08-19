package _01_arrayList_vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class T03_ArrayListMethod {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3)); // 로 만들거나
		List<Integer> list2 = List.of(1,2,3);// 로 만들거나
		// listof 로 만들기 하지만 이건 삭제 불가하여 권장되지 않음
		
		List<Integer> list3 = new ArrayList<>(); 
		for(int i=10; i>=1; i--) {
			list3.add(i);
		}
		System.out.println(list3);
		
		List<Integer> list4 = new ArrayList<>(list3.subList(1,4)); // 인덱스 1~3 까지 추출해서 가져옴 맨뒤 포함 x 
		System.out.println(list4);
		System.out.println("------------------------------------------");
		
		// sort-> 반환  void() 형 
		Collections.sort(list3); // 많이 사용함 버블정렬 이런거 사용안해도 ok
//		System.out.println(Collections.sort(list3)); void 형이라 이렇게 하면 출력이 되지 않음  출력도 안되고 저장도 할수없다.
		System.out.println(list3);
		
		Collections.reverse(list3);
		System.out.println(list3);
		System.out.println("------------------------------------------");
		
		System.out.println("list는 list1의 요소를 모두갖고 있는가? "+list3.containsAll(list4));
		

		List<String> slist = new ArrayList<>(); 
		slist.add("B");
		slist.add("C");
//		slist.add(3, "A"); //오류
		slist.add("A"); 
		
//		System.out.println(slist);   오류 
		slist.add(2,"AA");
//		System.out.println(slist);
		
		List<String> slist2 = new ArrayList<>(); 
		slist2.add("A");
		slist2.add("B");
		slist2.add("F");
		slist2.add("Z");
		
		// 겹치는 부분만 남기고 나머지 삭제
		System.out.println("slist에서 slist2와 겹치는 부분만 남기고 삭제 : "+slist.retainAll(slist2));
		System.out.println("slist : "+slist);
		System.out.println("slist2 : "+slist2);
		
		
		
		System.out.println();
		System.out.println();
		
	}

}
