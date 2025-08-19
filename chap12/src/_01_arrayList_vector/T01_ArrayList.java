package _01_arrayList_vector;

import java.util.ArrayList;
import java.util.List;

/*
	List 계월
	- 특징 : 순서가 있다, 중복 저장 가능 
	
	1. ArrayList : 싱글스레드 에서 사용 (동기화 x, 속도 빠름)
	-> 초기배열 10개를 만듬 -> 10개가 부족하면 그의 배수로 더 만들어 줌 
	-> 배열의 갯수를 지정할 수 있음 (지정 안하면 윗처럼 만듬) : new ArrayList<>(배열의 갯수)
	-> 부모자료형으로 형변환하여 많이 사용함 
	List<자료형> 변수명 = new ArrayList<자료형>();
	List > 인터페이스 // List로 객체생성 불가!
	
	
	2. Vector : ArrayList와 사용방법 동일 멀티스레드 에서 사용 (동기화 o, 속도 느림)
	
	3. LinkedList : 제네릭 (Generic) 사용/ 
	- 이전과 이후 값의 위치를 노드들이 각각 가지고 있는 리스트 
	- 중간에 삽입이 가능한 Array
	
	제네릭 -> <>
	자료형을 제네릭으로 받음
	ArrayList<자료형>    	// 자료형에 객체로 받음 -> 객체이름 
	ArrayList<T> -> 모든 자료형을 받을 수 있다. 
	- 클래스 객체가 들어올때 사용자가 임의로 이름을 짓기때문에 이름 알 수 없다.		// 아직 뭐가 올지 모르니 T로(모든 객체 들어올 수 있고) 
*/

public class T01_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<>();
		List<String> list = new ArrayList<>(); // ArrayList 10개짜리 생성 
//		List<String> list1 = new List<>(); 인터페이스 이기에 객체생성 x 
		
		list.add("Java");
		list.add("JDBC");
		list.add("servlet/JSP");
		list.add(2,"Database"); 
		// 2번걸 밀고 넣음 ex) 2번 주소 0x34 일때 이 주소를 밀고 0x45 를 먼저 반환하는 리스트로 0x45 -> 0x34 순으로 정렬
		list.add("iBatis"); 
		
		System.out.println("총 객체 수 : "+list.size());
		System.out.println(list); // toString 오버라이딩 되어있음 

		// 얻어올 때 : get(index)
		System.out.println("index 2번 : "+list.get(2));
//		System.out.println(list[2]); 이런식으로 사용 안됨! 메소드 사용하기 
		System.out.println("------------------------------------");
		
		for(int i=0;i<list.size();i++) {
			System.out.println("index "+i+"번 : "+list.get(i));
		}
		
		// 배열에서만 쓰는 for문 써도 ok
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("-----------------------------");
		
		/*
		 * 삭제
		 * Object remove(index)
		 * boolean remove(객체)	삭제 시 true 안될시 false
		   void clear() : 모두 삭제 
		*/
		System.out.println("size : "+list.size());
		System.out.println("삭제한 객체 : "+list.remove(1));
		System.out.println("size : "+list.size());
		
		list.remove("Java");
		System.out.print("Java 삭제 후 : ");
		System.out.println(list);
		
		list.clear();
		System.out.println("list.clear() 실행 ");
		System.out.println("size : "+list.size());
		
		System.out.println();
		
		
		
		
	}

}
