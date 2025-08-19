package _01_arrayList_vector;

public class Account {
	private String id;
	private String pw;
	private String name;
	private String phone;
	
	Account(){}
	Account( String id,String pw,String name,String phone){
		this.id=id;
		this.pw=pw;
		this.name=name;
		this.phone=phone;
	}
	
	
	public String getId() {
		return this.id;
	}

	public String getPw() {
		return this.pw;
	}

	public String getName() {
		return this.name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
