package _01_langPackage;

class A {
	int num = 3;
	
}


class Point2 implements Cloneable {
	int x;
	int y;
	A a = new A();
	
	Point2(){};
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	@Override
	public Object clone(){
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		//참조변수도 새롭게 만들어서 객체의 주소가 다른주소가 들어가야 한다. #1
		A b = a; 
		a = new A();
		a.num = b.num;
		
		
		return obj;
	}

	public String toString() {
		return "x = "+x+", y = "+y +", a.num = "+a.num;
	}
	
}


public class T06_cloneObject {
	public static void main(String[] args) {
		Point2 original = new Point2(3,4);
		Point2 copy = (Point2)original.clone();
		
		System.out.println("원본 객체 : "+original);
		System.out.println("복제 객체 : "+copy);

		copy.a.num = 100;
		System.out.println("원본 객체 : "+original);
		System.out.println("복제 객체 : "+copy);
		// copy 만 바꿔도 둘다 100으로 바뀜 참조형이라 그렇다.
		// 기본형은 새로운 주소에 다시 만들지만 
		// 참조형은 같은 주소를 공유하기떄문에 
		// #1처럼 변경시 따로 변경가능 
		
		System.out.println();
		System.out.println();
		
		
	}
}
