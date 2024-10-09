package Ch22;

// ### Throw keyword ###
// 자바에서 예외를 명시적으로 발생시키기 위한 키워드
// Throw 키워드를 사용하여 특정 예외를 강제로 발생시킬 수 있음.

// ## 기본 구문 ##
// throw 예외객체;

// "예외객체"는 특정 예외 클래스의 인스턴스임.

// 예외 처리는 주로 두 가지 방식으로 나눌 수 있음.
// 1. 예외의 직접적인 던지기		(direct throwing) 	: 메서드 내에서 예외 조건을 발견했을 때, 해당 예외를 직접 던지는 방식
// 2. 메서드에게 예외를 떠넘기기	(rethrowing)		: 메서드에서 예외를 발생하지 않고, 해당 예외를 다시 호출한 메서드로 떠넘기는 방식
//												: 이는 주로 예외를 발생한 메서드가 예외를 해결할 수 없는 경우에 사용

// 1. 직접 던지기 Example

//public class ThrowExample {
//	public static void main(String [] args) {
//		try {
//			int value = -5;
//			if (value < 0) {
//				// 여기에서 throw 문을 사용하여 IllegalArgumentException을 명시적으로 던집니다.
//				throw new IllegalArgumentException("음수는 허용되지 않습니다.");
//			}
//			System.out.println("값 : " + value);
//		} catch (Exception e) {
//			System.out.println("예외 발생 : " + e.getMessage());
//		}
//	}
//}

// 2. 메서드에게 예외를 떠넘기기
//public class Example {
//	public static void main(String [] args) {
//		try {
//			someMethod();
//		} catch (Exception e) {
//			System.out.println("Caught exception in main : " + e.getMessage());
//		}
//		
//	}
//	
//	public static void someMethod() throws CustomException {
//		try {
//			// 예외가 발생할 수 있는 코드
//			int result = 10 / 0;			// ArithmeticException 발생
//		} catch (ArithmeticException e) {
//			// ArithmeticException에 해당하는 예외가 발생했을 때 실행되는 코드
//			System.out.println("Exception caught in someMethod : " + e.getMessage());
//			
//			// 예외를 다시 던짐 (CustomException으로 변환하여)
//			throw new CustomException("Custom excpetion", e);
//		}
//	}
//}

class CustomException extends Exception {
	public CustomException(String message, Throwable cause) {
		super(message, cause);
	}
}

// 예외를 떠넘기는 메서드가 throws를 사용하여 예외를 선언했다고 해도, 해당 메서드를 호출한 곳에서 반드시 예외를 처리할 필요는 없음.
// 메서드를 호출한 곳에서 예외를 처리하지 않으면, 예외는 호출 스택을 따라 더 상위의 메서드로 전파됨.
// 최종적으로는 예외가 처리되지 않은 채로 프로그램이 종료될 수 있음.

// ## 추가 ##
// 예외를 상위로 떠넘기다 == 예외가 발생한 메서드에서 예외를 처리하지 않고, 호출한 상위 메서드로 예외를 전파시키는 것.
// 호출 스택(Call stack)을 따라서 예외가 전파되어 나가게 됨.

public class C05Throw {
	public static void main(String[] args) {
		try {
			methodA();
		} catch (Exception e) {
			System.out.println("Exception caught in main : " + e.getMessage());
		}

	}

	public static void methodA() {
		try {
			methodB();
		} catch (Exception e) {
			// 예외를 처리하지 않고 다시 떠넘김
			throw e;
		}

	}
	public static void methodB() {
		// 산술 예외 발생
		int result = 10 / 0;
	}

}

// # 로직 #

// main 메서드에서 methodA를 호출하고 있음.
// methodA에서는 methodB를 호출하고, methodB에서는 산술 예외를 발생시킴.
// methodA에서는 methodB에서 발생한 산술 예외를 처리하지 않고, 다시 main으로 떠넘기고 있음.
// 따라서 methodA를 호출한 main 메서드에서 예외를 처리하게 됨.

// ==> 이런식으로 예외는 호출 스택을 따라 올라가면서 예외를 처리할 수 있는 첫번째 catch 블록이 있는 곳에서 처리되거나,
//	   만약 어떤 곳에서도 처리되지 않았다면 예외는 프로그램이 종료되기까지 계속해서 전파됨.
//     나중에는 JVM으로 전파돼서 JVM이 처리.
