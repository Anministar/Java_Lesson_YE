package Ch13;

public class C03CarMain {
	// 속성(멤버 변수) 선언
	private String brand;
	String model;
	int year;
	double price;
	
	
	// 메서드 : 속성을 출력하는 메서드
	public void printCarInfo() {
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Year : " + year);
		System.out.println("Price : $" + price);
	}
	
	
	// ### 메서드의 구조 ###
	// 1. 메서드의 헤더
	// public 			void				printCarInfo			(		)		==> printCarInfo()메서드는 매개변수 X
	// 접근 제어자		반환 타입(반환 자료형)		메서드명					( 매개변수 )
	
	// 2. 메서드의 바디(몸체)
	// {}	
	
	// ### 접근 제어자 (Access Modifier) ###
	// 1. public					: 어떤 클래스에서든 접근이 가능함.
	// 2. protected					: 동일한 패키지 내의 클래스와 해당 클래스를 상속받은 외부 패키지의 클래스에서 접근 가능함.
	// 3. default (package-private) : 동일한 패키지 내의 클래스에서만 접근 가능함, 접근 제어자를 지정하지 않은 경우 기본으로 사용됨.
	// 4. private					: 동일한 클래스 내에서만 접근 가능함.
	
	// public			: 모든 클래스에서 사용 가능
	// default 			: 동일 패키지에 속한 클래스에서만 사용가능
	// private			: 현재 클래스에서만 접근 가능
	// protected		: 동일 패키지에 속한 클래스 or 상속관계에서 하위클래스에서만 접근 가능
	
	public static void main(String[] args) {
		// Car 클래스의 인스턴스 생성
		C03CarMain myCar = new C03CarMain();
		
		// 속성 설정
		myCar.brand = "현대";
		myCar.model = "아반떼 cn7";
		myCar.year = 2022;
		myCar.price = 25000.50;
		
		// 속성 출력
		// ### 함수 호출 (function call)의 로직 ###
		// 1. 먼저 클래스에 대한 객체 생성
		// 2. 객체명과 '.'(온점) 기호를 사용해 객체의 자료형(클래스)안에 있는 메서드 사용을 위해 main()함수에서 함수이름 호출
		// 3. 클래스로 올라가 정의되어 있는 메서드 몸체의 코드를 실행
		// 4. 다시 main()함수에서 호출했던 위치(함수 이름 적은 부분)로 돌아와 "결과값 전달"
		
		myCar.printCarInfo();
		
		
	}

}
