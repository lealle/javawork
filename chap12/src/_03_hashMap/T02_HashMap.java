package _03_hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class T02_HashMap {

	public static void main(String[] args) {
		/*
		HashMap 생성하여, 3개 넣기 
		Map<String , String>   (id : pw)
		1. 사용자로부터 id pw를 입력받아서 
		id 가 없으면 : '입력한 id는 없습니다' 출력 후 다시 실행 
		pw 가 없으면 : 'pw가 맞지 않습니다' 출력 후 다시 실행 
		id 와 pw 맞으면 : '로그인 되었습니다' 출력 후 종료
		
		*/
		HashMap<String, String> account = new HashMap<>();
		account.put("id1", "pw1");
		account.put("id2", "pw2");
		account.put("id3", "pw3");
		
		Set<String> keySet = account.keySet(); 
		
		Scanner sc = new Scanner(System.in);
		boolean a = true;
		while(a) {
			
			System.out.print("id를 입력하세요 : ");
			String id = sc.next();
			if(!account.containsKey(id)) { // keySet.contains(id) 에서 지금걸로 변경 
				System.out.println("입력한 id는 없습니다");
				continue;
			}
			
			System.out.print("pw를 입력하세요 : ");	
			String pw = sc.next();
			if(!(pw.equals(account.get(id)))) {
				System.out.println("pw가 맞지 않습니다");
				continue;
			}
			
			System.out.println("로그인 성공!");
			a = false;
		}
		
		
		
	}

}
