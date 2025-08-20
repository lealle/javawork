package _02_hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Set 
 * - 순서가 없다.
 * - 데이터가 중복 될 수 없다.
 * 1. HashSet
 * 
 * 2. TreeSet
 * 
 * 3. LinkedHashSet
*/
class Hash1{
	String str;
	Hash1(String str){
		this.str = str;
	}
	
	public String getHash1() {
		return this.str;
	}

	@Override
	public String toString() {
		return str;
	}
}


public class T01_HashSet {

	public static void main(String[] args) {
		HashSet set1 = new HashSet(); // 부모로 형변환 가능 
		Set set2 = new HashSet(); // 부모로 형변환 가능 
		
		Hash1 h10 = new Hash1("A");
		set2.add(h10);
		set2.add(new Hash1("B"));
		set2.add(new Hash1("C"));
		set2.add(new Hash1("D"));
		set2.add(new Hash1("E"));
		System.out.println("총 객체 수 : "+set2.size());

		Iterator<Hash1> iterator= set2.iterator();
		// hasNext() -> 남아있는 객체가 있는가> true
		// hasNext() -> 남아있는 객체가 없으면 false
		// next() 순회하면서 값 얻어오기 

		System.out.print("Set2 : ");
		while(iterator.hasNext()) {
			Hash1 h = iterator.next();
			System.out.print(h.getHash1());			
		}
		System.out.println();
		// 삭제를 시킬때도 while 로 돌아서 원하는걸 삭제 시킴 
		set2.remove(h10); // 주소를 알아서 삭제 가능
		
		System.out.print("h1(A) 삭제 후 : ");
		iteratorPrint(set2.iterator());

		Iterator<Hash1> iterator1= set2.iterator(); // 이전꺼는 이미다 써서 새롭게 만들어서 해야함 
		while(iterator1.hasNext()) {
			Hash1 h1 = iterator1.next();
			System.out.print(h1.str);
			if(h1.str.equals("C")) {
				set2.remove(h1);		
//				iterator.remove(); 이렇게 삭제해도 됨 
				System.out.println(" ->  C가 들어간 Hash1 삭제");
				break;
			}
		}
		System.out.println();
		
		System.out.print("(C) 삭제 후 : ");
		iteratorPrint(set2.iterator());
		System.out.println();
		
	}
	
	static void iteratorPrint(Iterator<Hash1> i) {
		while(i.hasNext()) {
			Hash1 h = i.next();
			System.out.print(h.str + " ");
		}
		System.out.println();
	}
	

}
