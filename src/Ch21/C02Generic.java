package Ch21;
abstract class 주재료 {
	String 재료;
	
	주재료(String 재료) {
		this.재료 = 재료;
	}

	@Override
	public String toString() {
		return "주재료 [재료=" + 재료 + "]";
	}
	
}

class 커피 extends 주재료 {
	public 커피(String 재료) {
		super(재료);
	}
}

class 차 extends 주재료 {
	public 차(String 재료) {
		super(재료);
	}
}

class 주스 extends 주재료 {
	public 주스(String 재료) {
		super(재료);
	}
}

class 음료<T extends 주재료> {				// 재네릭 타입 T는 주재료 클래스 또는 주재료 하위 클래스(상속받은)만을 받아올 수 있다는 의미.
										// 제네릭 타입의 상속은 해당 클래스 또는 하위(상속받은) 클래스만 올 수 있도록 범위를 제한하는 상속
										// ==> 제네릭 타입으로 주재료, 차, 커피, 주스 클래스만 올 수 있도록 범위제한
	private T 재료;
	
	음료(T 재료) {
		this.재료 = 재료;
	}
	
	void ShowInfo() {
		System.out.println(재료.toString() + "으로 만든 음료!");
	}
}
public class C02Generic {
	public static void main(String[] args) {
		커피 obj = new 커피("커피 원두");					// 커피 원두를 속성 '재료'의 속성값으로 가지는 커피 객체 obj 생성
		음료 <커피> 커피음료 = new 음료<>(obj);
		음료 <커피> 커피음료1 = new 음료<>(new 커피("커피 원두")); // 커피 객체를 만들면서 주재료 클래스의 매개변수 생성자를 호출
														// ==> 커피원두로 재료라는 멤버변수를 초기화
														// 그러고나서 속성값이 초기화된 커피 객체를 다시 음료 클래스의 매개변수 생성자에게
														// 전달함과 동시에 호출
		
														// 음료 클래스가 가지고 있는 재료라는 참조변수로 커피 객체를 연결 및 참조
														// 참조변수 재료가 가지고 있는 객체 정보를 toString() 메서드를 이용해서 정보 출력
														// 커피원두로 만든 음료 결과값 출력
		
		커피음료.ShowInfo();
		
		음료 <차> 차음료 = new 음료<>(new 차("녹차 잎"));
		차음료.ShowInfo();
		
		음료<주스> 주스음료 = new 음료<> (new 주스("오렌지"));
		주스음료.ShowInfo();
	}

}
