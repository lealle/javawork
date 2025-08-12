package _11_staticEx;

class Product {
	String serialNo;
	static int count;
	
	Product() {
		serialNo = "더조은" + ++count;
	}
}
public class ProductRun {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 제품번호 : " + p1.serialNo);
		System.out.println("p2의 제품번호 : " + p2.serialNo);
		System.out.println("p3의 제품번호 : " + p3.serialNo);
		System.out.println("총 생산된 제품의 수 : " + Product.count);

	}

}



