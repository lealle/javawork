package _04_TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class T01_TreeSet {

	public static void main(String[] args) {
		// 
		TreeSet<Integer> tree = new TreeSet<>(); // Set 으로 하면 TreeSet 에 있는 메소드 못씀 
		tree.add(87);
		tree.add(98);
		tree.add(75);
		tree.add(95);
		tree.add(80);
		System.out.println(tree);
		
		// TreeSet 자동 정렬 가장 앞 -> 가장 낮은 점수, 맨 뒤 -> 가장 높은 점수 
		System.out.println("가장 낮은 점수 : "+tree.first());
		System.out.println("가장 높은 점수 : "+tree.last());
		System.out.println("95점 보다 바로 아래점수 : "+tree.lower(95));
		System.out.println("95점 보다 바로 위의점수 : "+tree.higher(95));
		System.out.println("95점이거나 바로 아래 점수 : "+tree.floor(95));
		System.out.println("85점이거나 바로 위의 점수 : "+tree.ceiling(85));
		
		Set<Integer> lotto = new TreeSet<>();
		while(lotto.size()<6) {
			lotto.add((int)((Math.random()*45)+1));
		}
		System.out.println(lotto);
		
		
		
		
		System.out.println();
		System.out.println();
		
	}

}
