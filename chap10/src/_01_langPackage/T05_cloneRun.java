package _01_langPackage;

/*
	clone() : 복제
	1. 반드시 clone 하고자하는 클래스에 implements cloneable 반드시 넣어줘야 함 
	: '이 클래스는 복제할 수 있는 클래스이다' 라는것을 알려줄 목적
	
	2. clone()을 오버라이딩하지 않아도 됨
	   Object클래스의 clone() 메소드의 접근제어자가 protected 임. 
	   같은 java.lang 패키지 혹은 상속받은 것들만 사용 가능 
	   그리하여 java.lang 패키지 안에 있어야 함 
	   	
	3. 2번과 같은 이유로 clone()을 오버라이딩 해야함. (패키지가 다르기떄문에)
	   
	
*/

class Point implements Cloneable {
	int x;
	int y;
	Point(){};
	Point(int x, int y){
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
		return obj;
	}
	// Object 타입이라 쓸때 형변환 혹은 반환형을 Point로 해야함 
	
	
//	public Point clone(){
//		Object obj = null;
//		try {
//			obj = super.clone();
//		} catch (CloneNotSupportedException e) {
//			e.printStackTrace();
//		}
//		return (Point)obj;
//	}
//	
	public String toString() {
		return "x = "+x+", y= "+y;
	}
	
}


public class T05_cloneRun {

	public static void main(String[] args) {
		Point original = new Point(3,4);
		Point copy = (Point)original.clone();
		
		System.out.println("원본 객체 : "+original);
		System.out.println("복제 객체 : "+copy);
		// 일반 자료형은 문제 x 참조자료형일때는 문제 발생
		original.x = 10;
		
		System.out.println("원본 객체 : "+original);
		System.out.println("복제 객체 : "+copy);
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
	}

}
