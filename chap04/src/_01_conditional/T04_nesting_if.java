package _01_conditional;

public class T04_nesting_if {
	public static void main(String[] args) {
		// if 문 안에 다른 if 문이 중첩으로 들어감 
		
		int num1 = 105;
		
		if (num1 >100) {
			if(num1 >200) {
				System.out.println("200보다 큰 수");
			}else {
				System.out.println("100보다 크고 200보다 작은 수");
			}
		}else { //100 보다 작은 수 
			
			if(num1 >0) {
				System.out.println("100보다 작은 양수");
			}else if (num1 == 0) {
				System.out.println("0입니다.");
			}
			else {
				System.out.println("음수입니다.");
				
			}
			
		}
		
		
		if (num1 >100) {//100보다 큰수
			if(num1 >200) {//200보다 큰수
				if(num1 >300) {
					
				}
			}else { //100~200
				System.out.println("100보다 크고 200보다 작은 수");
			}
		}
		
	}
}
