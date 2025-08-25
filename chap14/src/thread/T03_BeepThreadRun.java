package thread;

import java.awt.Toolkit;

class BeepTest extends Thread {
	
	
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
}



public class T03_BeepThreadRun {

	public static void main(String[] args) { // main Thread 하나 
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 하나를 가져와 쓰는것 
		BeepTest beep = new BeepTest();
		
		// 2개 동시에 돌아감 
		beep.start();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
		
		System.out.println();
		System.out.println();
		System.out.println();
		
	}

}
