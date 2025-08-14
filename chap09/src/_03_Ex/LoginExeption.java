package _03_Ex;

public class LoginExeption extends Exception {
	public LoginExeption() {};
	public LoginExeption(String msg) {
		super(msg);
	}
}
