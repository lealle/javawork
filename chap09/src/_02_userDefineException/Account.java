package _02_userDefineException;

public class Account {
	private int balance;
	
	void deposit(int money) {
		balance += money;
	}
	
	int getBalcne() {
		return balance;
	}
	
	void withdraw(int money) throws UserException { // 이거에 대한 대비를 하시오 
		if(balance <= money) {
			throw new UserException("잔고부족 : "+(money-balance));
		}else {
			balance -= money;

		}
			
	}
	
	
	
}
