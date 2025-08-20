package _02_hashSet;

import java.util.HashSet;
import java.util.Set;

public class T02_HashSet {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(10);
		set1.add(num[1]); // 자동으로 Integer 형변환 
		System.out.println(set1); // Integer는 toString 오버라이딩 되어있어서 나옴 
		
		
		
		Object[] objArr = {"1",Integer.valueOf(1),"2","2","3","3","4","4","4"}; 
		HashSet<Object> set2 = new HashSet();
		for(Object obj : objArr) {
			set2.add(obj);
		}
		System.out.println(set2); // 중복 없앤 모습 그리고 String 1 과 Integer 1 를 구별하여 넣은 모습 
		
		Set<String> set3 = new HashSet<>();
		set3.add("java");
		set3.add("JDBC");
		set3.add("servlet");
		set3.add("oracle");
		set3.add("java");
		set3.add("JAVA");
		
		System.out.println("총 객체 수 : "+set3.size());
		System.out.println(set3);
		
		set3.remove("JDBC");
		set3.remove("oracle");
		System.out.println("총 객체 수 : "+set3.size());
		System.out.println(set3);
		
		set3.clear();
		if(set3.isEmpty()) {
			System.out.println("비어 있음");
		}else {
			System.out.println("객체가 들어있음");
		}
			
		System.out.println();
		
	}

}
