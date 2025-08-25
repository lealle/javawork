package _01_FileStream;

import java.io.File;
import java.io.IOException;

public class T01_File {

	public static void main(String[] args) {
		
		try {
			File f1 = new File("test.txt");
			// 1. 경로를 지정하지 않고 파일 생성. 프로젝트 아래 생성 
			f1.createNewFile();
			System.out.println("절대 경로 : "+f1.getAbsolutePath());
			
			// 2. 존재하는 폴더에 파일 생성 -> 경로 설정 가능 
			File f2 = new File("C:\\jml\\javawork\\test.txt");
//			File f2 = new File("C:/jml/javawork","test.txt"); \\ 대신 / 써도 경로구나 인식하고 함 
			f2.createNewFile();
			
			/*
			 * // 3. 없는 폴더에서 생성시 오류 발생 
			 * File f3 = new File("C:\\jml\\javawork\\work\\test.txt");
			 * f3.createNewFile();
			 */
			
			// 4. 폴더 먼저 만들고 파일 만들기
			File workFolder = new File("C:\\jml\\javawork\\work");
			workFolder.mkdir(); // 폴더 생성 
			File f4 = new File("C:\\jml\\javawork\\work\\test.txt");
			f4.createNewFile();
			
			System.out.println(f1.exists());
			System.out.println(new File("file.txt").exists()); // createNewFile 안해서 false 
			System.out.println(f1.isFile());
			
			System.out.println(workFolder.isFile()); // 폴더 -> 파일 아님 
			System.out.println("-----------------------------------------------------");
			
			File parentFolder = new File("parent");
			parentFolder.mkdir(); // 폴더 생성 
			File f5 = new File("parent/person.txt");
			f5.createNewFile();
			
			System.out.println("파일명 : "+f5.getName());
			System.out.println("절대경로 : "+f5.getAbsolutePath());
			System.out.println("파일용랼 : "+f5.length());
			System.out.println("상위폴더 : "+f5.getParent());
			
			
			System.out.println();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} // 이 메소드까지 호출해야 파일이 생성됨
		
		
		
		
	}

}
