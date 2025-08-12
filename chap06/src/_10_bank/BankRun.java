package _10_bank;

public class BankRun {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.deposit(10000);

		System.out.println("잔액 : " + bank.getBalance());

		bank.withdraw(5000);
		
		System.out.println("잔액 : " + bank.getBalance());
		
		bank.withdraw(8000);
		
		System.out.println("잔액 : " + bank.getBalance());
	}

}
