package _06_Library_problem;

public class apiLibrary {
	String name;
	String author;
	int price;
	
	void set_name(String str) {
		name = str;
	}
	
	void set_author(String str) {
		author = str;
	}
	
	void set_price(int str) {
		price = str;
	}
	
	void print_book() {
		System.out.println("제목 : "+name+"\n작가 : "+ author +"\n가격 : "+price);
	}
	
}
