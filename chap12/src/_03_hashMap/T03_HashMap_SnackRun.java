package _03_hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class T03_HashMap_SnackRun {

	public static void main(String[] args) {
		
		// 키 = String,   값 =  Snack 객체 
		HashMap<String, Snack> hm = new HashMap<>();
		
		hm.put("새우깡", new Snack("짠맛",450));
		hm.put("포카칩", new Snack("짠맛",500));
		hm.put("칸초", new Snack("단맛",750));
		hm.put("다이제스트", new Snack("초코맛",1500));
		System.out.println(hm); // 오버라이딩 안되있으면 주소 출력 
		
		// 1. put() : 키가 없으면 추가, 키가 있으면 값을 변경(update) 
		hm.put("새우깡", new Snack("매운맛",700));
		System.out.println(hm); // 새로운걸로 update
		
		// 2. get(Object key) : 키에 해당하는 값 반환 
		Snack sn = hm.get("다이제스트");
		System.out.println(sn);
		
		// 3. size() : 객체의 갯수 반환 
		System.out.println(hm.size());

		// 4. replace(K key, V value) : 해당 키를 찾아서 전달한 값으로 변경 (키가 없으면 아무것도 변경 x )
		// put 으로 할 수 있어 별로 안씀 // 대신 실수를 막을 수 있음 
		hm.replace("포테이토칩", new Snack("짠맛",300));
		hm.replace("포카칩", new Snack("짠맛",300));
		
		
		Set keySet = hm.keySet();
		Iterator key = keySet.iterator();
		
		while(key.hasNext()) {
			String k = (String)key.next(); // 키
			Snack s = hm.get(k);  // 값 
			System.out.println(k+" : "+s);
		}
		
		
		System.out.println(hm);
		System.out.println();
		
	}

}
