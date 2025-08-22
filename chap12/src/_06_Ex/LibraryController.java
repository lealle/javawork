package _06_Ex;

import java.util.ArrayList;

public class LibraryController {
	Member m = new Member();
	ArrayList<Book> aList = new ArrayList();
	
	public LibraryController(Member m) {
		this.m = m;
	}
	
	public LibraryController(ArrayList<Book> arrBook) {
		this.aList = arrBook;
	}

	public LibraryController() {
		aList.add(new Book("Java", "Lee", "프로그래밍", 20000));
		aList.add(new Book("Spring Framework", "Kim", "프로그래밍", 30000));
		aList.add(new Book("React Guide", "Park", "웹", 25000));
	}
	void info() {
		System.out.println(m);
	}

	void insertBook() {
		aList.add(new Book("Java", "Lee", "프로그래밍", 20000));
		aList.add(new Book("Spring Framework", "Kim", "프로그래밍", 30000));
		aList.add(new Book("React Guide", "Park", "웹", 25000));
	}
	void insertBook(Book book) {
		aList.add(book);
		
	}
	ArrayList<Book> selectAll(){
		return aList;
	}
	
	ArrayList<Book> searchBook(String bookTitle) {
		ArrayList<Book> aList1 = new ArrayList();
		for(int i=0; i<aList.size(); i++) {
			if(aList.isEmpty()) {
				System.out.println("책이 없습니다.");
				break;
			}
			if(aList.get(i).getTitle().contains(bookTitle)) {
				aList1.add(aList.get(i));
			}
		}
		return aList1;
	}
	
	Book deleteBook(String title, String author) {
		Book book = null;
		for(int i=0; i<aList.size(); i++) {
			if(aList.isEmpty()) {
				System.out.println("책이 없습니다.");
				break;
			}
			if(title.equals(aList.get(i).getTitle()) && author.equals(aList.get(i).getAuthor())) {
				book = aList.remove(i);
			}
		}
		return book;
	}
	
	int ascBook() {
		aList.sort(null);
		return 1;
	}


}
