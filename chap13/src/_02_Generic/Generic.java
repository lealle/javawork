package _02_Generic;

class Box<T>{
//	private int nNum;// 오류 getter getNNum 되서 오류가 남  대문자 연속  안되게 2문자 이상하기 
	private T t;
	
	Box(){}

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
}

class Apple{@Override public String toString() {return "Apple";} }
class Banana{ }



public class Generic {

	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.set("Hello"); // 오류 안남 
//		box1.set(new Apple()); // 오류 발생 
//		box1.set(3); // 오류 발생 
		// String 이라고 명시적으로 해놨기때문에 오류를 사전에 막음 
		System.out.println(box1.get());
		
		Box<Integer> box2 = new Box<>();
		
		//box2.set('a');
//		box2.set("a");
		box2.set(123);
//		box2.set(123.45);
		System.out.println(box2.get());
		
		Box<Apple> box3 = new Box<>();
		box3.set(new Apple());
		System.out.println(box3.get());
		
//		box3.set(new Banana());
		// 이처럼 제네릭 사용시 오류가 발생할 확률이 줄어든다. 
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
	}

}
