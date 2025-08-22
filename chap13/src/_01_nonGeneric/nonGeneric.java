package _01_nonGeneric;

class Box{
	private Object obj;
	
	Box(){}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
}

class Apple{ }
class Banana{ }



public class nonGeneric {

	public static void main(String[] args) {
		Box box = new Box();
		box.setObj("더조은");
//		String name = box.getObj(); // String - Object //형 달라서 안됨 
		String name = (String)box.getObj(); // String - String 
		
		box.setObj(new Apple());
		String apple = (String)box.getObj();
		// 다 이름이 같아서 이름이 햇갈리면 해도 되지만 Casting 오류 발생 
		// 이렇게 하면 실수할 가능성이 있음 
		
		// 예외가 발생할 확률이 높다. 모든 객체를 받아 형변환시 다른 객체로 변환할 수 있음 
	}

}
