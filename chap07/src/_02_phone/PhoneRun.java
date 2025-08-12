package _02_phone;

public class PhoneRun {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("z플립","검정");
	
		System.out.println("모델명 : " + sp.model);
		System.out.println("색상 : " + sp.color);
		
		sp.bell();
		sp.hangUp();
		sp.sendVoice("여보세요 누구십니까");
		sp.receiveVoice("나는 더조은 입니다 좋은하루 되세요");
		sp.hangOut();
		
		System.out.println(sp.search("java") + "를 검색합니다.");
		
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
	}

}
