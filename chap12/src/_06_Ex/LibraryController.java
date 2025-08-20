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

	void info() {
		System.out.println(m);
	}

	void insertBook() {
		aList.add(new Book("자바의 정석", "남궁성", "도우출판"));
		aList.add(new Book("이것이 자바다", "신용권", "한빛미디어"));
		aList.add(new Book("모던 자바 인 액션", "Raoul-Gabriel Urma", "한빛미디어"));
	}
	void insertBook(Book book) {
		aList.add(book);
		
	}
	ArrayList<Book> selectAll(){
		return aList;
	}
	
	Book searchBook(String bookTitle) {
		Book book = null;
		for(int i=0; i<aList.size(); i++) {
			if(bookTitle.equals(aList.get(i).getTitle())) {
				book = aList.get(i);
			}
		}
		return book;
	}
}
