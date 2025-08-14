package _03_Ex;


public class UserAccount {
	String id="asd";
	String pass="1234";
	
	void login(String id1, String pass1) throws LoginExeption { // 이거에 대한 대비를 하시오 
		if(!id.equals(id1)) {
			throw new LoginExeption("해당 아이디는 존재하지 않습니다.");
		}else if(!pass.equals(pass1)){
			throw new LoginExeption("비밀번호가 틀립니다.");
		}else {
			System.out.println("로그인 성공!");
		}
			
	}
	
}
