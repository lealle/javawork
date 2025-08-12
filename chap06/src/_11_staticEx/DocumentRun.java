package _11_staticEx;

class Document {
	String name;
	static int count;
	
	Document() {
		this("제목없음" + ++count);
	}
	
	Document(String name) {
		this.name = name;
		System.out.println("문서 " + this.name + " 생성됨");
	}
}

public class DocumentRun {
	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document();
		Document d3 = new Document("java");
		Document d4 = new Document();

	}
}
