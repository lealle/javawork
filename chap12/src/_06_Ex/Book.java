package _06_Ex;

import java.util.Objects;

public class Book implements Comparable<Book>{
	private String title;
	private String author;
	private String category;
	private int price;
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	Book(){}
	
	Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	



	@Override
	public String toString() {
		return "제목 =" + title + "/ 저자 =" + author + "/ 범주 =" + category + "/ 가격 =" + price + "\n";
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	


	@Override
	public int compareTo(Book o) {
		return this.getTitle().compareTo(o.getTitle());
	}
	@Override
	public int hashCode() {
		return Objects.hash(price, author, title, category);
	}
	
	@Override
	public boolean equals(Object o) {
		Book b1 = (Book) o;
		if(this == o) return true;
		if(o == null) return false;
		if(price == b1.getPrice()&&author.equals(b1.getAuthor())&&category.equals(b1.getCategory())
				&&title.equals( b1.getTitle())) 
		{
			return true;
		}else {
			return false;
		}
	}
/*    속성 :
		title
		author
		publisher
     생성자 :
		빈 생성자
		매개변수가 3개인 생성자 {
			인스턴스 변수에 넣기
		}
     메소드 :
		etter / getter 메소드
     오버라이딩 : toString()
		제목 : title, 저자 : author, 출판사 : publisher*/
}
