package thread;

class ThreadA extends Thread{
	boolean stop = false; // 스레드 종료 
	boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.print("A 실행");
			}else {
				Thread.yield();
			}
		}
		System.out.println();
		System.out.println("ThreadA 종료");
	}
}

class ThreadB extends Thread{
	boolean stop = false; // 스레드 종료 
	boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.print("B 실행");
			}else {
				Thread.yield();
			}
		}
		System.out.println();
		System.out.println("ThreadB 종료");
	}
}

public class T09_Yield {

	public static void main(String[] args) {
		ThreadA thA = new ThreadA();
		ThreadB thB = new ThreadB();
		
		thA.start();
		thB.start();
		
		try {
			Thread.sleep(30);
			thA.work = false;
			System.out.println();
			System.out.println("=====================A작업 일시정지 ========================================");
			Thread.sleep(1);
			thA.work = true;
			thB.work = false;
			System.out.println();
			System.out.println("======================B작업 일시정지 ========================================");
			Thread.sleep(1);
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("둘다 종료");
		thA.stop = true;
		thB.stop = true;
		
	}

}
