package Ch14;



//### Getter와 Setter ###
// 객체 지향 프로그래밍에서 클래스의 속성(멤버 변수)에 접근하거나 값을 설정하기 위한 메서드

// Getter() 메서드( == 접근자 메서드 ) 지정
// Getter는 클래스의 private 속성 값을 읽어오는 메서드


// 일반적으로 속성 이름 앞에 "get"을 붙여서 메서드 이름을 지정함
// Getter 메서드는 주로 해당 속성의 값을 반환





//Setter() 메서드( == 설정자 메서드 ) 지정
// Setter는 클래스의 private 속성 값을 설정하는 메서드


// 일반적으로 속성 이름 앞에 "set"을 붙여서 메서드 이름을 지정함
// Setter 메서드는 주로 해당 속성에 값을 설정


// Setter()와 Getter() 예제 01)
//
//class Parent {
//	String name;
//	private String money;
//	
//	
//	
//	public String getMoney() {
//		return money;
//	}
//	
//	public void setMoney(String money) {
//		this.money = money;
//	
//	}
//
//}
//
//public class Ch14 {
//	public static void main(String[] args) {
//		Parent test = new Parent();
//		test.name = "부모";
//		
//		test.money = "2000";
//		System.out.println(test.money);
//		
//		test.setMoney("2000");
//		System.out.println(test.getMoney());
//	}
//}


	

	


// ### 상속(Inheritance) ###

// ## 상속의 기본구조 ##
//class 부모클래스 {
//	// 부모 클래스의 멤버 변수와 메서드
//}

//class 자식클래스 extends 부모클래스 {
//	// 자식 클래스의 추가적인 멤버 변수와 메서드
//}


// ## 상속의 특징 ##
// 1. 재사용성 (Reuse) : 부모 클래스에서 정의된 멤버 변수와 메서드를 자식 클래스에서 그대로 사용할 수 있음.
//					 : 이를 통해 코드 중복을 줄이고 유지보수성을 향상시킴.

// 2. 확장성 (extension) : 자식 클래스에서 부모 클래스의 기능을 확장하거나 수정할 수 있음.
//						: 새로운 멤버 변수나 메서드를 추가하거나, 부모 클래스의 메서드를 오버라이딩(Overriding)하여 재정의할 수 있음.

// 3. 다형성 (Polymorphism) : 상속 관계에서 부모 클래스 타입의 참조 변수로 자식 클래스의 객체를 참조할 수 있음.
//						  : 이를 통해 하나의 변수로 여러 타입의 객체를 다룰 수 있음.



// ## 주의사항 ##
// 1. 단일 상속 : 자바에서는 단일 상속만을 지원함.
//			  : 즉, 하나의 클래스는 하나의 부모 클래스만을 가질 수 있음.
//			  : 이로 인해 클래스 간의 강한 결합을 피하고 복잡성을 감소시키는 효과가 있음.

// 2. 접근 제어자 : 상속 관계에서 부모 클래스의 멤버 변수 및 메서드의 접근 제어자에 따라 자식 클래스에서의 접근 여부가 결정됨.
// 			   : private으로 선언된 멤버는 상속이 되지만 직접 접근할 수 없음

// 3. 생성자 호출 : 자식 클래스의 생성자가 호출될 떄, 부모 클래스의 기본 생성자가 자동으로 호출됨.
//			   : 만약 부모 클래스에 매개변수가 있는 생성자가 정의되어 있다면, 자식 클래스에서 명시적으로 super()를 사용하여 호출해야 함.

// 부모 클래스 : 차량(Vehicle)
class Vehicle {
	String brand;
	
	public Vehicle(String brand) {
		this.brand = brand;
	}
	void start() {
		System.out.println(brand + "차량 시동을 걸다.");
	}
	void stop() {
		System.out.println(brand + "차량 정지시킨다.");
	}
}

// 자식 클래스 : 자동차(Car)
class Car extends Vehicle {
	Car(String brand) {
		super(brand);				// super = Vehicle
									// super() = Vehicle()
									// super(brand) = Vehicle(brand)
		
	}
	
	void accelerate() {
		System.out.println(brand + "차량이 가속한다.");
	}
	void brake() {
		System.out.println(brand + "차량이 제동한다.");
	}
}

public class Ch14 {
	public static void main(String[] args) {
		Car myCar = new Car("Porsche");
		
		myCar.start();		// 부모 클래스의 메서드 호출
		myCar.accelerate(); // 자식 클래스의 메서드 호출
		myCar.brake();		// 자식 클래스의 메서드 호출
		myCar.stop();		// 부모 클래스의 메서드 호출

	}

}
