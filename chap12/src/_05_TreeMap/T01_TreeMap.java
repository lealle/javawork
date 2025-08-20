package _05_TreeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class T01_TreeMap {

	public static void main(String[] args) {
		// Tree 오름차순 정렬  
		// 키를 기준으로 오름차순 정렬 
		TreeMap<String, Integer> tm = new TreeMap<>();
		tm.put("apple", 10);
		tm.put("forever", 60);
		tm.put("beaver", 20);
		tm.put("cup", 30);
		tm.put("dead", 40);
		tm.put("eagle", 50);
		tm.put("zoo", 150);
		tm.put("google", 250);
		tm.put("hand", 650);
		
		System.out.println("[c~f사이의 단어 검색]");
		NavigableMap<String, Integer> rangeMap = tm.subMap("c", true , "f", true);
		for (Map.Entry<String, Integer> entry : rangeMap.entrySet()) {
			System.out.println(entry);
			System.out.println(entry.getKey() +" : "+entry.getValue()+"페이지");
		}
		
		
		
	}

}
