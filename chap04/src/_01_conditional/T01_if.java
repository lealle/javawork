package _01_conditional;

public class T01_if {
	public static void main(String[] args) {
		
		//if(조건식)
		/* 대체적으로 햇갈릴것같다 하면 중괄호 넣어준다 1개일때도 중괄호 넣는 사람도 많은편
		 * 수행할 문장이 1개일 때는 중괄호 생략 가능
		if(조건식)
			조건식이 참일 때 수행
		
		수행할 문장이 1개 이상일 때는 반드시 중관호를 넣어준다.
		
		if(조건식){
			조건식이 참일 때 수행;
			조건식이 참일 때 수행;
		}
		*/
		int num1 = 100;
		if(num1==100) 
			System.out.println("100점입니다");
			
		//거짓일때는 수행 x 
		if(num1!=100) 
			System.out.println("100점");
			
		//2개 일때는 중괄호가 없을시 1개만 조건에 영향 받음 
		if(num1>200) {
			System.out.println("축하합니다.");
			System.out.println("합격입니다.");
		}
		
		System.out.println("if문과 상관없이 실행");
		
		
		
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
	}
}
