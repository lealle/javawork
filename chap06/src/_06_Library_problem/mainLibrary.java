package _06_Library_problem;

public class mainLibrary {

	public static void main(String[] args) {
		apiLibrary book1 = new apiLibrary();
		apiLibrary book2 = new apiLibrary();
		
		book1.set_name("실전 예제로 배우는 자바 프로그래밍");
		book1.set_author("서민구");
		book1.set_price(25000);
		book1.print_book();
		
		System.out.println("-----------------------");
		
		book2.set_name("머니(MONEY): 부의 거인들이 밝히는 7단계 비밀");
		book2.set_author("토니라빈스의 책");
		book2.set_price(23940);
		book2.print_book();
		
		
	}

}
