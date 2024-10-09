package Ch22;


// ### Exception 클래스 ###

// 자바에서 예외 처리를 위한 기본 클래스 중 하나
// 모든 예외의 부모 클래스로서 다양한 예외들이 Exception을 상속하고 있음, java.lang 패키지에 속해 있음.

// ## 상속 관계 ##
// Exception 클래스는 Throwable 클래스를 상속하고 있음.
// Throwable은 자바에서 예외 처리의 기본 클래스이며, Error와 Exception 클래스의 부모 클래스임.


//## Checked Exception과 Unchecked Exception ##
//Exception 클래스의 하위 클래스 중에서 RuntimeException(런타임 예외)을 제외한 예외들은 Checked Exception(컴파일 타임 예외)으로 분류됨. 
//Checked Exception(컴파일 타임 예외)은 반드시 예외 처리를 해주어야 하는 것이 특징임.



//## 예외 종류 ##

//1. 컴파일 타임 예외 (Checked Exception)		: 발생 시점 -- 컴파일 시에 발생하는 예외로, 프로그램이 컴파일될 때 확인됨.
//										: 처리 여부 -- 반드시 예외를 처리해야 함. 예외를 처리하지 않으면 컴파일이 되지 않음.
//
//IOException				: 입출력 작업 도중 발생하는 예외.

//SQLException				: 데이터베이스와 관련된 예외.

//ClassNotFoundException	: 클래스를 찾을 수 없는 경우 발생하는 예외.

//InterruptedException		: 스레드가 중단될 때 발생하는 예외 등.



//2. 런타임 예외 (Unchecked Exception)		: 발생 시점 -- 런타임 시에 발생하는 예외로, 프로그램 실행 중에 확인됨.
//										: 처리 여부 -- 명시적인 예외 처리가 필요하지 않음. 개발자가 필요하다고 판단하면 예외를 처리할 수 있지만, 강제적으로 처리할 필요는 없음.
//
//NullPointerException					: null 객체에 접근할 때 발생하는 예외.

//ArrayIndexOutOfBoundsException		: 배열의 범위를 벗어난 인덱스에 접근할 때 발생하는 예외.

//ArithmeticException					: 산술 연산 중 발생하는 예외.

//IllegalArgumentException				: 잘못된 인수가 전달될 때 발생하는 예외.

//IllegalStateException					: 객체의 상태가 메소드 호출에 부적절한 경우 발생하는 예외 등.


//## 주의해야 할 점 ##
//런타임 예외(Unchecked Exception)은 컴파일러가 강제적으로 예외 처리를 확인 X, 따라서 개발자가 명시적으로 처리하지 않아도 됨.
//But, 예외 발생 시 프로그램이 비정상적으로 종료될 수 있음, 따라서 적절한 예외 처리를 하는 것이 좋음.

class Animal {
	
}

class Dog extends Animal {
	
}

class Cat extends Animal {
	
}
public class C04Excepti0on {
	
	public static void main(String[] args) {
		
		try {
//			String str = null;
//			System.out.println(str.toString()); 		// NullPointerException 예외
			
//			int arr[] = new int [3]; 					
//			arr[4] = 10;								// ArrayIndexOutOfBoundsException 예외
			
//			System.out.println(10 / 0); 				// 산술 연산 예외
			
			Animal cat = new Cat();
			Dog dog = (Dog) cat;						// 클래스 형 변환 예외
			
		} catch (NullPointerException e) {
			System.out.println("NULL 예외");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Idx 예외");
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
		
		System.out.println("실행코드1");
		System.out.println("실행코드2");
		System.out.println("실행코드3");
	}

}
