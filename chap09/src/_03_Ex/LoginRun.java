package _03_Ex;

import java.util.Scanner;

public class LoginRun {

	public static void main(String[] args) {
		UserAccount a = new UserAccount();
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("비밀번호 : ");
			String pass = sc.next();
			a.login(id, pass);
		} catch (LoginExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			a.login("lelle", "1234");
//		} catch (LoginExeption e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			a.login("lealle", "124");
//		} catch (LoginExeption e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			a.login("lelle", "134");
//		} catch (LoginExeption e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		
	}

}
