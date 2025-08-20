package _02_hashSet;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;



class Member{
	String name;
	int age;
	
	Member(){}
	Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	// equals -> 주소가 같은가? 에서 ==> 값이 같은가? 로 오버라이딩 해야 함 
	// hashCode => 값이 같으면 같은 해시코드가 나오게 오버라이딩  해야함 
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Member) {
			return Objects.equals(name, ((Member)o).name) && age == ((Member)o).age;
			// name.equals((Member)o).name) 로 해도 됨
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
//		return Objects.hash(name)+age;
		
	}
	
	@Override
	public String toString() {
		return "["+name +" / "+ age+"]";
	}
	
	
	// 관련해서 복습 하기 
	
	
//	@Override
//	public boolean equals(Object anObject) {
//        if (this == anObject) {
//            return true;
//        }
//        return (anObject instanceof String aString)
//                && (!COMPACT_STRINGS || this.coder == aString.coder)
//                && StringLatin1.equals(value, aString.value);
//    }
	
}


public class T03_HashSet {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		Member mem1 = new Member("이",24);
		
		set.add(new Member("홍길동",20));
		set.add(new Member("홍길동",20));
		set.add(new Member("더조은",20));
		set.add(new Member("홍길동",30));
		set.add(new Member("더조은",25));
		set.add(new Member("홍길동",30));
		set.add(new Member("더조은",25));
		
		// 1개만 나오게 하고 싶은데 2개 출력  똑같은 값이면 동일한 객체로 취급하여 1개만 받고싶음 
		System.out.println("총 객체의 수 : " +set.size());
		System.out.println(set);
		
		
	}

}
