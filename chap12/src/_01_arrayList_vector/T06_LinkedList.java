package _01_arrayList_vector;

import java.util.LinkedList;
import java.util.List;

/*
 * LinkedList
 * - 배열의 단점을 보완하여 나옴 
 * - 연속적으로 붙어있지 않음, 다음 데이터를 연결하는 참조주소를 가지고 있음 중간 삽입 가능 밀지않고  주소위치에 영향을 받지않음 
 * 
 *이중연결 리스트는 다음주소 뿐만 아니라 이전주소도 가지고 있음
 *원형연결 리스트 시작과 끝이 연결되어있는 것
 *
*/
public class T06_LinkedList {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		
		list.add(10); // 맨끝에 추가
		list.add(0,1); // index 0 번에 추가
		list.addFirst(2); // 맨 앞에 추가
		list.addLast(20); // 맨 끝에 추가
		list.add(50); // 맨 끝에 추가
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		
		list.add(10); // 맨끝에 추가
		list.add(0,1); // index 0 번에 추가
		list.addFirst(2); // 맨 앞에 추가
		list.addLast(20); // 맨 끝에 추가
		list.add(50); // 맨 끝에 추가
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {
			list.get(i); 
			// 찾을때는 array가 더 빠름 0->1 ->2 ->3 ->4 ->5 순서 대로 다 찾아야 5번 찾을 수 있음 검색이 느리다.
			//for 문 효율적이지않음 , 검색시 비효율적
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
	}

}
