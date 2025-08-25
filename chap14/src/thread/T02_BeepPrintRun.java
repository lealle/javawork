package thread;

import java.awt.Toolkit;

public class T02_BeepPrintRun {

	public static void main(String[] args) { // main Thread 하나 
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 하나를 가져와 쓰는것 
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
	}

}
