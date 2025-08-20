package _03_hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map Collection 계열 x 
 * Map
 * - 키와 값의 쌍으로 이루어져 있음 , 키는 중복불가, 값은 중복 가능 
 * - 값을 얻어올때는 키값으로 얻어옴
 * - Map계열은 Collection을 구현한 클래스가 아님
 *  : 넣을 때는 put() 사용 
 *  
 * 1. hashMap
 * 2. TreeMap
*/
public class T01_HashMap {

	public static void main(String[] args) {
		Map<String ,Integer> map = new HashMap<>();
		
		// 객체 넣기 
		map.put("아무개", 97);
		map.put("더조은", 100);
		map.put("홍길동", 86);
		map.put("아더워", 78); // 이런 값 entry 라 부름  
		
		// Entry 개수 
		System.out.println("총 Entry 수 : "+map.size());
		
		// 객체 찾기 
		System.out.println("홍길동 : "+map.get("홍길동"));
		System.out.println(map);
		
		// 객체 삭제
		System.out.println(map.remove("홍길동"));
		System.out.println("총 Entry 수 : "+map.size());
		System.out.println("-------------------------------");
		
		Set<String> keySet = map.keySet(); // 키값만 얻어온 Set
		System.out.println(keySet);
		
		Iterator<String> keyIter = keySet.iterator();
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			int grade = map.get(key);
			System.out.println(key +" : "+ map.get(key));
			
		}
		System.out.println("-------------------------------");
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();// 키와 값  얻어온 Set
		System.out.println(entrySet);
		
		Iterator<Map.Entry<String, Integer>> entryIter = entrySet.iterator();
		while(entryIter.hasNext()) {
			Map.Entry<String, Integer> entrys = entryIter.next();
			String key = entrys.getKey(); // 키 가져오기 
			Integer value =  entrys.getValue(); // 값 가져오기
			System.out.println(entrys.getKey()+" : "+entrys.getValue());
		}
		// 둘중에 편한걸로 하면 됨 
		
		System.out.println();
		System.out.println();
		
	}

}
