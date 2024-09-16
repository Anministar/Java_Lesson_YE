package Ch14;
class Person {
	static String country = "한국";
	String name;
}



// ------------------------------ main ---------------------------------------
//
//
//// 객체를 생성하기 전에 country라는 static(class) 변수에 접근할 수 있음.
//Person.country = "일본";
//
//
//// 객체를 생성하는 코드
//Person dong = new Person();
//dong.name = "이동하";
//Person hong = new Person();
//hong.name = "홍길동";
//
//
//




// ### 자바의 메모리 구조 ###

// 1. 스택영역 : {} 내의 지역변수, 메서드 호출  및 리턴 값, 연산 중 발생하는 임시 데이터 등이 저장
// {} 내에서 생성, 벗어나면 소멸
// 메서드 호출 시마다 프레임(Frame)이라는 작은 메모리 블록이 생성되어 메서드의 지역 변수와 연산 중 발생한 중간 결과 등을 저장함.
// 메서드가 종료되면 해당 프레임이 스택에서 제거됨.

// 후입선출(LIFO, Last In, First Out) 구조
// Ex) 프링글스 과자를 생각하면 편함.



// 2. 힙영역 : 객체 저장 공간
// new 예약어 사용시 생성
// 동적으로 생성된 객체와 배열이 저장되는 영역
// 모든 스레드가 공유하는 메모리 영역, 객체의 생성 및 소멸은 여기에서 이루어짐
// 소멸은 JVM의 가비지 컬렉터(Garbage Collector)에 의해서 소멸(더 이상 참조되지 않는 객체들을 정리)




// 3. 클래스영역(== 메서드 영역) : 공유메모리, static변수, 일반메서드, 생성자 메서드, 클래스 정보, 상수
// 클래스 정보(클래스의 구조, 필드, 메서드 코드 등)가 저장되는 영역
// 프로그램 시작과 동시에 생성, 프로그램 종료 시 소멸


// 요약
// 1. 스택영역 : 지역변수, 메서드 호출 정보
// 2. 힙영역 : 객체 저장 공간, 배열 저장 공간
// 3. 클래스영역(== 메서드영역, 정적 영역, static영역) : 공유메모리, static변수, 클래스 정보

	
class Simple {
	static int Num1 = 0;		// 공유변수, 정적 멤버(Static Member)
	int Num2;					// 		  비정적 멤버(Non - Static Member)
	
	// 정적 멤버는 클래스 자체에 속하며, 객체의 생성 없이 클래스 이름을 통해 직접 접근할 수 있음.
	// 반면에 비 정적 멤버는 객체의 인스턴스에 속하며, 해당 클래스의 객체를 생성한 후에만 접근할 수 있음.
	
	// 따라서 "비 정적"이라는 용어는 "정적"이 아닌, 즉 인스턴스에 속하는 것을 나타냄.
	
	void ShowNum() {
		System.out.printf("NUM1 : %d NUM2 : %d\n", Num1, Num2);
	}
}
public class C06Static {
	
	public static void main(String[] args) {
		// Static이 붙은 변수(정적 멤버)는 클래스 자체에 속함.
		// ==> ### 클래스명.변수이름 으로 변수를 호출할 수 있음 ### --> 중요!!!
		// ==> Static변수는 클래스가 공유하고 있는 변수
		
		// 비 정적 멤버는 객체(인스턴스)에 속함.
		// ==> 객체마다 그 값이 다를 수 있음.
		
		Simple obj1 = new Simple();
		
		Simple obj2 = new Simple();
		
//		obj1 = obj2;
//		
//		System.out.println(System.identityHashCode(obj1));
//		System.out.println(System.identityHashCode(obj2));
		
		obj1.Num1 = 10;
		obj1.Num2 = 20;
		obj1.ShowNum();
		
		obj2.ShowNum(); 			// Num1 = 0 Num2 = ??
		System.out.println();
		
		Simple.Num1 = 123;
		System.out.println(Simple.Num1);
		obj1.ShowNum();
		obj2.ShowNum();
	}

}
