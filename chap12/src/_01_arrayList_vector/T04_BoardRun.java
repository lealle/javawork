package _01_arrayList_vector;

import java.util.ArrayList;
import java.util.List;

public class T04_BoardRun {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();
		
		Board b1 = new Board("제목1","내용1","글쓴이1");
		list.add(b1);
		list.add(new Board("제목2","내용2","글쓴이2"));
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));
		list.add(new Board("제목5","내용5","글쓴이5"));
//		list.add(new Board("제목6","내용6","글쓴이6"));
		System.out.println(list);
		System.out.println("총 객체 수 : "+list.size());
		Board board1 = list.get(1);
		System.out.println();

		System.out.println(board1.getTitle());
		System.out.println(board1.getContent());
		System.out.println(board1.getWriter());
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(i+"번 객체 : ");
			Board board = list.get(i);
			System.out.print(board.getTitle()+" ");
			System.out.print(board.getContent()+" ");
			System.out.println(board.getWriter());
		}
		System.out.println("------------------------------");
//		for(Board b : list) {
//			
//		}  이런식으로 해도 됨 더 짧아지긴함
		
		list.remove(2);
		list.remove(2);
		for(int i=0; i<list.size(); i++) {
			System.out.print(i+"번 객체 : ");
			Board board = list.get(i);
			System.out.print(board.getTitle()+" ");
			System.out.print(board.getContent()+" ");
			System.out.println(board.getWriter());
		}
		System.out.println("------------------------------");

		System.out.println();
	}
}
