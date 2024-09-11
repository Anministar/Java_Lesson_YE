package Ch13;

public class C04PersonMain {
	// 속성(멤버 변수) 선언
	String name;
	int age;
	
	// ### 생성자 메서드(Constructor Method) ###
	// 객체가 생성될 떄 호출되는 특별한 메서드
	// 클래스를 사용하여 객체를 생성 시 new 키워드를 사용하면 해당 클래스의 생성자가 1회 호출
	
	// 생성자는 주로 객체의 초기화를 수행
	
	// 기본적으로 클래스 내에 생성자(Constructor)가 명시되어 있지 않다면 
	// 디폴트 생성자(Default Constructor == 기본 생성자)가 자동으로 주입돼 사용
	
	// ## 생성자 사용법 ##
	// 1. 생성자 함수는 클래스 이름과 반드시 동일해야함.
	// 2. 클래스와 동일하게 반환 타입(반환 자료형)이 없음.

	// 생성자(Constructor)
	public C04PersonMain() {
		System.out.println("default 생성자입니다!!");
		name = "기본 이름";
		age = 20;
	}
	
	// ### 인수(argument)와 매개변수(Parameter) ###
	
	// 1. 인수란? 		: 함수 호출 시 함수로 값을 전달해주는 변수
	//					: main --> 클래스 내 함수
	
	// 2. 매개변수란?		: 매개변수는 함수 호출 시에 전달된 인수(argument)값을 저장.
	//					: 함수 호출 시 인수로 전달된 값을 함수 내부에서 사용할 수 있도록 하는 변수
	// 					: 클래스 내 함수 --> 함수 {} 몸체 내 코드
	
	// 매개변수는 함수 내에서 지역변수로 사용됨.
	
	// 매개변수 생성자(Constructor)
	public C04PersonMain(String name, int age) {
		System.out.println("매개 변수 생성자입니다!!");
		this.name = name;
		this.age = age;
	}

	// ### 'this' Keyword ###
	// 클래스 내에서 사용되는 예약어
	// 생성되는 객체의 위치정보를 가져오는데 사용됨.
	
	// 멤버변수 vs 매개변수 구별
	// this.name = name;
	
	// ### 온점('.') 접근 연산자 ###
	// 온점(.)은 자바에서 멤버 접근 연산자(Member Access Operrator)로 사용.
	// 즉, 클래스 내부에 정의되어 있는 각 변수(속성), 메서드(기능) 등에 접근할 때 사용.
	// 온점을 사용해 클래스 멤버 변수에 값을 할당(데이터 저장) 혹은 값을 읽음(데이터 읽기)가 가능
	
	// 기능(메서드) 선언
	public void greet() {
		System.out.println("안녕하세요, 제 이름은 " + name + "이고, 나이는 " + age + "살입니다.");
	}
	
	public static void main(String[] args) {
		
		
		// Person 클래스의 인스턴스 생성
		C04PersonMain person1 = new C04PersonMain("John", 25); 	// 매개변수 생성자에 인수 두개 전달
		System.out.println("이름 : " + person1.name);
		System.out.println("나이  : " + person1.age);
		
		// 속성 값 할당 및 출력
		person1.name = "Jane";
		person1.age = 30;
		System.out.println("이름 : " + person1.name);
		System.out.println("나이  : " + person1.age);
		
		// 기능 사용 및 출력
		person1.greet();
		
	}
	
}
