package _04_interfaceExtends;

// 같은 interface 에서 상속 받을 때는 extends 키워드로 상속 받음
// 여러개의 interface를 상속 받을 수 있음  
// -> 다중 상속 가능
interface Inter1 {
	public abstract int method1();
	int lastMe(); // 1개 추가하고싶은데 이걸 받는 100개의 함수에서 추가해야한다 이런불상사를 막기위해 dafault 메소드를 사용함
}

//public 하나만 가능 같은곳에선
interface Inter2 {
	public abstract int method2();
}

public interface Inter extends Inter1 ,Inter2{
	public abstract int method();
}

