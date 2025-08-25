package thread;

class Thread3 implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<500 ; i++) {
			System.out.printf("%s",new String("#"));
		}
		System.out.println();
		
		System.out.println("# 소요시간 : "+(System.currentTimeMillis() - T05_MultiThreadTime.startTime));
		
	}
	
}

public class T05_MultiThreadTime {
	static long startTime;
	public static void main(String[] args) {
		Thread t1 = new Thread(new Thread3());
		t1.start(); // 만드는데 시간 걸려서 start 시키고 메인 작업 시작 
		
		startTime  = System.currentTimeMillis();
		for(int i=0; i<500 ; i++) {
			System.out.printf("%s",new String("*"));
		}
		System.out.println();
		
		System.out.println("* 소요시간 : "+(System.currentTimeMillis() - startTime));
		// 하드웨어 : cpu 코어수 16  < 스레드 수 -> 스레드 스케줄링 필요!
		
		
		
	}

}
