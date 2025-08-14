package _02_userDefineException;

public class AccountRun {

	public static void main(String[] args) {
		Account a = new Account();
		a.deposit(500);

		// throws 로 던져줘서 try catch 로 감싸라는 문구 나옴 
		try {
			a.withdraw(900);
		} catch (UserException e) {
			System.out.println(e.getMessage()); 
		}
		
		
		
	}

}
