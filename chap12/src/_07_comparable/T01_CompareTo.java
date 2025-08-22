package _07_comparable;

import java.util.Arrays;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	String name;
	int age;
	
	Person(){}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person o) {
		if(age < o.age) {
			return -1; // 작으면 -1 
		}else if(age > o.age) {
			return 1; // 크면 1
		}else {
			return 0; // 같다			
		}
	}
	
}


public class T01_CompareTo {

	public static void main(String[] args) {
		TreeSet<Person> p1 = new TreeSet<>();
		p1.add(new Person("홍길동",45)); // Person TreeSet 에 넣을때 값 판단을 못하여 들어갈 수 없음
		// name 이든 age 든 기준이 없어서 오류 발생 
		// 기준 정해줘야 함 (알려줘야 함 ) 
		// 이럴때 사용하는 것 compareTo 인터페이스 상속받고 비교해줘야함  
		
		p1.add(new Person("나자바",24));
		p1.add(new Person("더조은",32));
		System.out.println(p1); // Comparable 하고 나서는 오류 안나는 모습 
//		Arrays.sort(p1, new Descending1()); // 내림차순으로 정렬 하라 

		
	}

}
