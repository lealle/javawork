package _06_Ex;

public class BookRun {

	public static void main(String[] args) {
		LibraryController lib = new LibraryController(new Member("이정민", 24, "남성")) ;
		lib.insertBook();
		System.out.println(lib.selectAll());

		lib.insertBook(new Book("Effective Java", "Joshua Bloch", "인사이트"));
		lib.insertBook(new Book("Head First Java", "Kathy Sierra, Bert Bates", "O'Reilly"));
		lib.info();
		System.out.println(lib.selectAll());
		System.out.println(lib.searchBook("자바의 정석"));
		
		if(lib.searchBook("자바의 정석") == null) {
			System.out.println("찾는 책은 존재하지 않습니다.");
		}else {
			System.out.print("찾았습니다 찾으신 책은: ");
			System.out.println(lib.searchBook("자바의 정석"));	
		}
	}

}
