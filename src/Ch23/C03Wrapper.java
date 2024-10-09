package Ch23;

// ### Wrapper Class ###

// Wrapper 클래스는 자바에서 기본 데이터 타입(primitive Types)을 객체로 감싸기 위한 클래스들을 말함.
// 기본 데이터 타입에 해당하는 int, char, boolean, double 등을 객체로 다루기 위해 제공되는 클래스.
// 이러한 Wrapper 클래스들은 해당 기본 데이터 타입의 값을 갖고 있고, 각종 유용한 메서드를 제공하여 객체로서의 동작을 가능하게 함.

// 1. Integer 		: int의 Wrapper 클래스
// 2. Long			: long의 Wrapper 클래스
// 3. Float			: float의 Wrapper 클래스
// 4. Double		: double의 Wrapper 클래스
// 5. Character		: char의 Wrapper 클래스
// 6. Boolean		: boolean의 Wrapper 클래스
// 7. Byte			: byte의 Wrapperr 클래스
// 8. Short			: short의 Wrapper 클래스

// Wrapper 클래스는 객체이므로 null도 가질 수 있고, 기본 데이터 타입의 값을 객체로 다룰 수 있음.
// 또한, 자동 박싱(auto boxing)과 자동 언박싱(auto Unboxing)이라는 개념 O
// ==> 기본 데이터 타입과 Wrapper 클래스 간에 자동으로 변환될 수 있음.

// 자동 박싱(Auto Boxing)
// Integer intObject = 42;			// int를 Integer로 자동으로 변환

// 자동 언박싱(Auto Unboxing)
// int intValue = intObject;		// Integer를 int로 자동으로 변환
//class Animal {
//	
//}
//
//
//Animal test = new Animal();			// 클래스 = 객체
//
//Integer any = new Integer(12);		// 클래스 = 객체
//int age = any;						// 기본 자료형 = 객체 (객체에서 12라는 정수를 알아서 꺼내줌)
//									// ==> 기본 자료형 = 기본 데이터

public class C03Wrapper {
	public static void main(String[] args) {
	
		// Boxing(자료 -> Integer정수형 객체로 변환)
		Integer obj1 = new Integer(100);
		// The constructor Integer(int) has been deprecated since version 9 and marked for removal
		// Integer 클래스의 특정 생성자인 Integer(int)가 자바 9버전 이후로 사용되지 않게 되었고 향후버전에서는 완전히 제거될거라는 마크.
		
		Integer obj2 = new Integer("200");
		// Integer(String) 생성자의 내부 로직은 Integer.parseInt(String)이 담겨있음.
		
		Integer obj3 = Integer.valueOf("300");
		Integer obj4 = Integer.valueOf(100);
		
		System.out.println(obj3);
		System.out.println(obj4);
		
		int intValue = 52;
		Integer obj5 = Integer.valueOf(intValue);
		System.out.println(obj5);
		// Integer(int) 생성자 == deprecated(쓸모없는)
		// 대신 valueOf(int) 메서드를 사용하여 새로운 방식으로 Integer 객체를 생성하라는 의미.
		
		
		// UnBoxing(Integer자료 --> 일반자료형)
		
		int value1 = obj1.intValue();			// 100
		int value2 = obj1.intValue();
		int value3 = obj1.intValue();
		
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		
		// 자동 Boxing
		Integer obj = 100;			// auto Boxing
		int n1 = obj + 10;			// auto UnBoxing
		
		System.out.println("결과 : " + n1);
		
	}
}
