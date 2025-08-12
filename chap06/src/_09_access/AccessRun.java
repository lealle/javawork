package _09_access;

import _10_bank.Bank;

public class AccessRun {

	public static void main(String[] args) {
		Access ac = new Access();
		
		// ac.num = 5;  접근 불가
		ac.setNum(5);
		
		// int num = ac.num;  접근 불가
		System.out.println(ac.getNum());
		
		// 다른 패키지의 api 사용
		Bank bank = new Bank();
		bank.deposit(5000);
		bank.withdraw(3000);
		System.out.println(bank.getBalance());
	}

}
