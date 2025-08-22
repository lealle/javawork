package _07_comparable;



public class Course implements Comparable<Course>{

	String courseName;
	int fee;
	public Course() {}
	
	
	public Course(String courseName, int fee) {
		this.courseName = courseName;
		this.fee = fee;
	}
	
	@Override
	public String toString() {
		return "강좌 = " + courseName + ", 금액 = " + fee + "\n";
	}



	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public int getFee() {
		return fee;
	}


	public void setFee(int fee) {
		this.fee = fee;
	}


	@Override
	public int compareTo(Course o) {
		if(fee < o.fee) {
			return -1; // 작으면 -1 
		}else if(fee > o.fee) {
			return 1; // 크면 1
		}else {
			return 0; // 같다			
		}
		
	}
}
