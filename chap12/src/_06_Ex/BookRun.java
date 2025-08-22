package _06_Ex;

import java.util.Scanner;

public class BookRun {

	public static void main(String[] args) {
		LibraryController lib = new LibraryController() ;
		//lib.insertBook(new Book("HTML5 & CSS3", "Choi", "웹", 18000));
		//lib.insertBook(new Book("Data Structures", "Jung", "컴퓨터과학", 27000));
		//lib.insertBook(new Book("Database Systems", "Han", "데이터베이스", 32000));
		//lib.insertBook(new Book("Algorithms", "Yoon", "컴퓨터과학", 35000));
		
		Scanner sc = new Scanner(System.in);
		
		int i =1;
		while(!(i==0)) {
			System.out.println("*************** 메뉴 *************");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 전체 도서 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서명 오름차순 정렬");
			System.out.println("0. 종료");
			System.out.print("어떤 작업을 하시겠습니까? : ");
			i = sc.nextInt();
			
			switch(i) {
			case 1:
				System.out.print("추가할 도서를 입력해주세요(공백포함) : ");
				String case1 = sc.next();
				String case11 = sc.next();
				String case111 = sc.next();
				int case1111 = sc.nextInt();
				
				lib.insertBook(new Book(case1,case11,case111,case1111));

				break;
			case 2:
				System.out.println("전체 도서를 조회하겠습니다.");
				System.out.println(lib.selectAll());
				break;
			
			case 3:
				System.out.print("검색하실 도서의 도서명을 입력해주세요 : ");
				String case3 = sc.next();
				if(lib.searchBook(case3) == null) {
					System.out.println("찾는 책은 존재하지 않습니다.");
				}else {
					System.out.println("찾았습니다 찾으신 책은 아래와 같습니다.");
					System.out.println(lib.searchBook(case3));	
				}
				
				break;
				
			
			case 4:
				System.out.print("삭제하실 도서의 제목과 저자를 입력해주세요(공백포함) : ");
				String case4 = sc.next();
				String case44 = sc.next();				
				System.out.println("삭제 : "+ lib.deleteBook(case4, case44));
				
				break;
			
			case 5:
				System.out.println("도서명 기준 오름차순 정렬");
				lib.ascBook();
				// 이걸 인트로 받고 1일시 성공 출력 아닐시 실패 출력 하도록 하여 더 세세하게 설정 가능 
				System.out.println(lib.selectAll());
				break;
			
			case 0:
				System.out.println("시스템을 종료합니다.");
				i = 0;
				break;
			default:
				System.out.println("잘못된 번호 입력");
			}
		}
	}

}
