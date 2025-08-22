package _07_comparable;

import java.util.Comparator;

class Descending implements Comparator<Course> {
	@Override
	public int compare(Course o1, Course o2) {		
		if(o1.getFee() > o2.getFee()) {
			return -1;
		} else if(o1.getFee() < o2.getFee()) {
			return 1;
		}else {
			return 0; 
		}
	}
	
}
