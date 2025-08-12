package _09_polymorphismExArray;

public class Buyer {
	int money = 500;
	int bonusPoint;
	Product[] cart = new Product[10];
	int index = 0;
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
//			System.out.println(p.toString() + "구매 완료"); 똑같음
			System.out.println(p+ "구매 완료");
			
			bonusPoint += p.bonusPoint;
			cart[index]=p;
			index++;
		}else{
			System.out.println(p.toString() + "구매 실패\n잔액이 부족합니다.");
				
		}
	}
	
	void info() {
		int sum = 0;
		String list = "";
		
		for(int i=0; i<cart.length; i++) {
			if(cart[i] == null){
				break;
			}
			sum += cart[i].price;
			list += cart[i]+ ", ";
		}
		System.out.println("구입한 물품의 총액 : " +sum);
		System.out.println("구입한 물품의 목록 : " +list);
		
	}
}
