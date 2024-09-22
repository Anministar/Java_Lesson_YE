package Ch16;

public class C03AppleMain {
	public static void main(String[] args) {
		Seller1 seller = new Seller(10000, 100, 1000);
		Buyer1 buyer = new Buyer(5000, 0);
		
		
		buyer.pay(seller, 2000);
		
		
		System.out.println(seller); //보유금액, 사과개수 출력
		System.out.println(buyer); //보유금액, 사과개수 출력
		

	}
}
