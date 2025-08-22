package thread;

class Thread1 extends Thread{

	@Override
	public void run() {
		setName("첫번째 스레드"); // 스레드 이름 저장
		for(int i=1; i<=5; i++) {
			System.out.println(getName());
		}
	}
	
}

class Thread2 implements Runnable{

	@Override
	public void run() {
		Thread.currentThread().setName("두번째 스레드"); // 스레드 이름 저장
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
}
public class T01_Thread {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.start(); // start 하면 run 이 실행되면서  
//		Runnable r = new Thread2();
//		Thread t2 = new Thread(r);
		
		Thread t2 = new Thread(new Thread2()); // 한줄로 하면 
		
		t2.start(); // start 안됨 /
//		t2.ru/n(); // start 안됨 
		
		
	}

}
