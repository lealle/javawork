package thread;

class Bank extends Thread{
	private int balance = 1000;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public synchronized void withdraw(int money) {
		if(balance < money) {
			
			System.out.println("잔액이 모자릅니다.");
		}else {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance -= money;
			System.out.println(money + "원 인출되었습니다.");
		}
			
	}
}

class ThreadSy implements Runnable{
	Bank bank = new Bank();
	@Override
	public void run() {
		while(bank.getBalance() >0 ){
			int money = (int)(Math.random()*3)+1; // 100 200 300
			bank.withdraw(money*100);
			System.out.println("잔액 : "+bank.getBalance());
		}
	}
}

public class T11_synchronized {

	public static void main(String[] args) {
//		Thread t3 = new Thread(new ThreadSy()); 이러면 따로따로 돌아가서 안됨 new 로 다른 객체끼리 돌아가는거라 동기화 테스트 x 
		Runnable r = new ThreadSy();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
		
		
	}

}

