package _08_polymorphismEx;

public class Buyer {
	int money = 500;
	int bonusPoint;
	
	/*
	 * void buy(Computer com) {
	 * 
	 * }
	 * 
	 * void buy(Tv tv) {
	 * 
	 * }
	 * 
	 * void buy(Game game) {
	 * 
	 * }
	 */
	// 위 처럼 하기 귀찮으니 자동 형변환 가능한 PRODUCT 하나로 처리한다 
	void buy(Product p) {
		if(money >= p.price) {
			money -= p.price;
			System.out.println(p.toString() + "구매 완료");
			bonusPoint += p.bonusPoint;
		}else{
			System.out.println(p.toString() + "구매 실패\n잔액이 부족합니다.");
				
		}
	}
}
