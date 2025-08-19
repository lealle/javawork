package _01_arrayList_vector;

import java.util.ArrayList;
import java.util.List;

public class Ex_AccountRun {

	public static void main(String[] args) {
		List<Account> list = new ArrayList<>();
		
//		list.add(new Account("id1","pw1","name1","phone1"));
//		list.add(new Account("id2","pw2","name1","phone2"));
//		list.add(new Account("id3","pw3","name1","phone3"));
//		list.add(new Account("id4","pw4","name1","phone4"));
//		list.add(new Account("id5","pw5","name1","phone5"));
//		
		for(int i =0; i<5; i++) {
			list.add(new Account("id"+i,"pw"+i,"name"+i,"phone"+i));
		}
		
		for(Account a: list) {
			System.out.println("ID : "+a.getId()+"  PW : "+a.getPw()+"  NAME : "+a.getName()+"  PHONE : "+a.getPhone()+"");
		}
		
		
		
		
	}

}
