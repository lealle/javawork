package thread;

class AutoSaveThread extends Thread {
	@Override 
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("작업파일이 자동저장 됨");
		}
	}
}

public class T08_DaemonThread {

	public static void main(String[] args) {
		AutoSaveThread daemon = new AutoSaveThread();
		
		daemon.setDaemon(true); // 데몬스레드로 변경 
		daemon.start();

		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
		System.out.println("프로그램 종료"); // 프로그램 종료시 데몬스레드도 자동으로 종료 
		// 일반 스레드로 하면 무한히 반복함 
		
	}

}
