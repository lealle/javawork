package _01_Ex;

import java.util.Objects;

public class Set {
	String name;
	int age;
	
	
	Set(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object o) { // Set으로 받아도됨 Set 만 쓸거면 그러면 굳이 형변환 하지않아도 됨
		return name == ((Set)o).name&&age == ((Set)o).age;// 변수 -> Set,  o.변수 -> Object 그래서 강제 형변환
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
	// 원래는 주소로 만들었는데 이제는 value 값을 해시코드로 만듬 
	// 값으로 만들기에 원래는 다른 주소를 출력하던 함수 값으로 해시코드 만들어 같게 만들어짐 
	
	@Override
	public String toString() {
		return "이름 : "+name+", 나이 : "+age;
	}
}
