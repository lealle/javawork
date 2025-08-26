package _05_ObjectStream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
	보조스트림
	ObjectInputStream / ObjectOutputStream : 객체 단위로 입출력할 수 있도록 도움을 주는 스트림 
	- 메소드 : writeObject() / readObject() 를 사용 
	- 객체에 toString()을 오버라이딩하지 않으면 readObject()로 읽으면 객체의 주소가 들어옴 
	
	기반스트림 
	FileOutputStream / FileInputStream : 파일과 연결하여 1바이트 단위로 입출력하는 스트림 
	
*/
public class ObjectAPI {
	public void fileSave() {
		Phone ph1 = new Phone("아이폰",2100000);
		Phone ph2 = new Phone("갤럭시 폴드",2200000);
		Phone ph3 = new Phone("갤럭시 노트",1900000);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phone.txt"))){
			oos.writeObject(ph1);
			oos.writeObject(ph2);
			oos.writeObject(ph3);
			// 이상하게 저장이 되어도 막상 받아오면 잘 받아옴 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void fileRead() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone.txt")))
		{
			Object oa = null;
			while(((oa = ois.readObject()) != null)) {
					System.out.println(oa);
			}
			
//			while(true) {
//				System.out.println(ois.readObject());
//				// 하고 예외처리에 파일끝까지 읽었다는 메세지 출력하게 해도 됨
//			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) { // 순서는 반드시 IOException보다 앞에 있어야 함 
			System.out.println("파일 끝까지 읽음.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
