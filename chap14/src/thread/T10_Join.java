package thread;

class SumThread extends Thread{
	private long sum; // 0자동으로 들어감
	
	@Override
	public void run() {
		for(int i=1; i<=1000000000; i++) {
			sum +=i;
		}
		System.out.println("종료");
	}

	public long getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
	
}

public class T10_Join {

	public static void main(String[] args) {
		SumThread sumTh = new SumThread();
		sumTh.start();
		System.out.println("1~1000000000까지의 합 : "+sumTh.getSum());
		
		try {
			sumTh.join(1); // 쓰레드가 끝날때까지 기다림 시간넣으면 시간까지만 기다림 
			System.out.println("1~1000까지의 합 : "+sumTh.getSum());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
