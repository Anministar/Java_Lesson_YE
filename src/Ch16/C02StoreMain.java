package Ch16;
class Customer {
	// 속성
	// 보유금액
	int myMoney;
	// 콜라보유개수
	int colaCnt;
	
	// 고객 객체 정보 초기화
	public Customer(int myMoney, int colaCnt) {
		this.myMoney = myMoney;
		this.colaCnt = colaCnt;
	}
	
	// 구매하기
	public void pay(Store store, int money) {
		if(myMoney >= money) {
			// 1. 내 보유금액에서 money 차감
			myMoney -= money;
			// 2. 지정된 store(GS반월)에 money을 전달받아야 함.
			colaCnt += store.returnCola(money);
		} else {
			System.out.println("잔고 부족합니다. 돈 더 벌어오세요!!");
		}
	}

	
	// 고객 정보 확인 메서드 (toString 재정의)
	@Override
	public String toString() {
		return "Customer [myMoney=" + myMoney + ", colaCnt=" + colaCnt + "]";
	}
	
}

class Store {
	// 속성
	// 보유금액
	int savedMoney;
	// 콜라재고량
	int colaCnt;	
	// 콜라가격
	int price;
	
	// 편의점 정보 초기화 메서드
	public Store(int savedMoney, int colaCnt, int price) {
		this.savedMoney = savedMoney;
		this.colaCnt = colaCnt;
		this.price = price;
	}
	
	// 콜라 개수를 구해주는 메서드
	public int returnCola(int money) {
		// 1. 보유금액에 받은 금액 추가
		savedMoney += money;
		// 2. 받은 금액만큼 콜라재고량 감소
		int cnt = money / price;
		colaCnt -= cnt;
		
		// 3. 콜라 개수 리턴
		return cnt;
	}


	// 편의점 정보 확인 메서드 (toString 재정의)
	@Override
	public String toString() {
		return "Store [savedMoney=" + savedMoney + ", colaCnt=" + colaCnt + ", price=" + price + "]";
	}
	
	
	
}

public class C02StoreMain {
	public static void main(String[] args) {
	
	// 고객 객체
	Customer dong = new Customer(10000, 0);			// 보유금액, 콜라보유량
	Customer gom = new Customer(20000, 0);
	
	System.out.println(dong);
	System.out.println(gom);
	
	
	// 편의점 객체
	Store GS반월 = new Store(100000, 100, 1000); 		// 보유금액, 콜라재고량, 콜라가격
	Store CU서울역 = new Store(200000, 10, 500);		
			
	
	// 콜라를 구매하기
	
	gom.pay(GS반월, 30000);
	dong.pay(CU서울역, 5000);
	
	// 고객과 편의점 정보를 확인

	System.out.println("곰돌이 정보 : " + gom);
	System.out.println("동하 정보 : " + dong);
	System.out.println();
	
	System.out.println("GS반월 정보 : " + GS반월);
	System.out.println("CU서울역 정보 : " + CU서울역);


		
	}
}
