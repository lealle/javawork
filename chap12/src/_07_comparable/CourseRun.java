package _07_comparable;

import java.util.NavigableSet;
import java.util.TreeSet;

public class CourseRun {

	public static void main(String[] args) {
		TreeSet<Course> c1 = new TreeSet<>();
		c1.add(new Course("자바",200));
		c1.add(new Course("스프링",450));
		c1.add(new Course("리액트",250));
		c1.add(new Course("자바스크립트",240));
		c1.add(new Course("HTML",280));
		System.out.println(c1);
		NavigableSet<Course> descView = c1.descendingSet();
		System.out.println(descView);
		
		TreeSet<Course> c2 = new TreeSet<>(new Descending());
		c2.add(new Course("자바",200));
		c2.add(new Course("스프링",450));
		c2.add(new Course("리액트",250));
		c2.add(new Course("자바스크립트",240));
		c2.add(new Course("HTML",280));
		System.out.println(c2);
		
		
	}

}
