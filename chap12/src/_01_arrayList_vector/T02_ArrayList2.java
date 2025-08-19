package _01_arrayList_vector;

import java.util.ArrayList;
import java.util.List;

public class T02_ArrayList2 {

	public static void main(String[] args) {
		List list = new ArrayList(); // 제네릭<> 없을 시 모든 객체 다 받을 수 있음 다만 권장되지않음 
		
		list.add(1); // Integer 로 받음 
		list.add(3.14);
		list.add("5");
//		int num = list.get(0); // 기본자료형을 넣을 수 없음 ArrayList는 
		int num = (int)list.get(0); 
		Object num1 = list.get(0); // Object 로 받아야함 (모든 객체의 부모인)
		
		System.out.println(num + 1); //가능
//		System.out.println(num1 + 1); //객체 + 1 은 불가
		
		double dou2 = (double)list.get(1);
		System.out.println(dou2 + 1); //가능
		
		String num3 = (String)list.get(2);
		int num4  = Integer.parseInt(num3);
		System.out.println(num4);
		
		System.out.println("합계 : "+(num + dou2 +num4));
		
	}

}
