package _04_TreeSet;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class T02_TreeSet {

	public static void main(String[] args) {
		Integer[] arr = {1,4,5,6,3,2,8,9,5,4,1,6,7,9};
		TreeSet<Integer> arr1 = new TreeSet<>(); // Integer Object ... 
		for(int i=0; i<arr.length; i++) {
			arr1.add(arr[i]);
		}
		System.out.println(arr1); // 중복값 없어지고 오름차순 정렬 
		// TreeSet 오름차순 정렬밖에 안됨 
		/*
		 NavigableSet은 내림차순 정렬도 가능 
		 * java의 set 인터페이스를 확장한 컬렉션 인터페이스 
		 * 정렬된 순서로 저장
		 * 그 요소에 다양한 탐색작업을 지원하는 메소드 지원
		 * SortedSet 인터페이스도 확장하고 있기 때문에 정렬된 순서로 데이터를 다룰 수 있다. 
			
		* lower
		* floor
		* ceiling
		* higher
		* pollFirst() : 첫번째 요소를 제거하고 그 요소를 반환
		* pollLast() : 마지막 요소를 제거하고 그 요소를 반환
		* descendingSet() : 내림차순으로 정렬한 요소를 반환 
		* headSet(기준 ,true) : true 이면 기준값 포함, false 이면 기준값 미포함 
		*/
		
//		NavigableSet<Integer> desending = ((TreeSet)arr1).descendingSet(); // 인터페이스 Set 일시 
		NavigableSet<Integer> desending = arr1.descendingSet(); // 인터페이스 Set 일시 
		
		System.out.println(desending);
		
		Integer[] score = {100,12,64,97,88,45};
		TreeSet<Integer> setScore = new TreeSet<>();
		
		for(Integer i : score) {
			setScore.add(i);
		}
		System.out.println(setScore);
		
//		NavigableSet<Integer> result1 = setScore.headSet(88);
		// ture 를 넣지 않으면 false 가 기본값 
		System.out.println("88점 미만인 점수 검색 : "+ setScore.headSet(88)); // ture 넣으면 88도 포함 false 는 미포함 
		System.out.println("88점 이상인 점수 검색 : "+ setScore.tailSet(88, true)); // ture 넣으면 88도 포함 false 는 미포함 
		System.out.println("45점 이상 100점 미만 사이의 점수 검색 : "+ setScore.subSet(45, true, 100, false)); // ture 넣으면 88도 포함 false 는 미포함 
		
	
	}

}
