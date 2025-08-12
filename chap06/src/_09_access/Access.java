package _09_access;

public class Access {
	private int num = 5;
	
	// setter 메소드 : private으로 된 필드에 값을 넣을 때
	void setNum(int num) {
		this.num = num;
	}
	
	// getter 메소드 : private으로 된 필드의 값을 얻어올 때
	int getNum() {
		return num;
	}
}
