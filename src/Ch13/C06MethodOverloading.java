package Ch13;

// ### 메서드 오버로딩 ###

// 동일한 이름을 가졌지만 매개변수가 다른 여러 메서드를 가질 수 있는 기능
// 유사한 작업을 수행하지만 다양한 유형이나 수의 입력을 처리할 수 있는 메서드를 생성


// 메서드 오버로딩은 컴파일 시 다형성 또는 정적 다형성의 한 형태임.


// ## 숙지사항 ##
// 메서드는 매개변수의 개수, 유형, 순서를 다르게 함으로써 오버로드될 수 있음. 			==> 매개변수 수, 자료형, 순서에 의해 구분 O

// 오버로드된 메서드는 반환 유형이 같을 수도 있고 다를 수도 있음. 					==> 반환형으로 구분 X

// 오버로드된 메서드는 서로 다른 접근 제어자, 
// 다른 예외를 던질 수 있으며, 정적 또는 비정적일 수 있음.						==> Private, public 등의 접근 제어자로 구분 X
//																	==> static, non-static로 구분 X

// ## 오버로딩 규칙사항 ##
// 오버로드된 메서드는 동일한 이름이지만 다른 매개변수 목록을 가져야 함.
// 컴파일러는 제공된 인수를 사용하여 호출할 적절한 메서드를 결정함.
// ==> 모호성을 피하기 위해 컴파일러는 제공된 인수를 기반으로 메서드를 구별할 수 있어야 함.

// public int add(int a, int b) {
// 		return a + b;
// }

// 매개변수 유형 변경에 의한 메서드 오버로딩
// public double add(double a, double b) {
//		return a + b;
// }

// 매개변수 개수 변경에 의한 메서드 오버로딩
// public int add(int a, int b, int c) {
//		return a + b + c;
// }

// 매개변수 순서 변경에 의한 메서드 오버로딩
// public int add(int a, int c, int b) {
// 		return a + c + b;
// }

class C06Simple {
	String name;
	
	int sum(int x, int y) {
		System.out.println("sum(int, int) 호출!");
		return x + y;
	}
	
	int sum(double x, double y) {
		System.out.println("sum(double, double) 호출!");
		return (int) (x + y);
	}
	
	int sum(int x, int y, int z) {
		System.out.println("sum(int, int, int) 호출!");
		return x + y + z;
	}
	int sum(String str, int x, int y) {
		System.out.println("sum(String, int, int) 호출!");
		name = str;
		return x + y;
	}
	
	
	
	// ++) 추가사항)
	
	// ### 가변인자 (Varargs) ###
	// 동일한 타입의 인수를 여러 개 받을 수 있도록 설계
	void sum(int...n)	{			// int...n은 가변인자
									// 정수형 변수들의 배열로 간주
									// 0개 이상의 정수를 전달받을 수 있음.
		// 개량 for문, 개선된 for문
		// int x : 지역변수
		// n     : 정수형 배열
		for(int x : n) {
			System.out.print(x + " ");
		}
		// 위 코드로 인해서 각각의 n은 배열로 간주되어 메서드 내부에서는 반복문을 통해 배열의 요소를 하나씩 출력
		
		// 가변인자를 사용하면 메서드를 호출할 때 전달하는 인수의 개수가 가변적일 때 유용함.
		// 이렇게 하면 여러 개의 인수를 배열로 묶어서 메서드에 전달할 수 있음.
		
	}
}



														
public class C06MethodOverloading {
	public static void main(String[] args) {
		C06Simple obj = new C06Simple();
		obj.sum(10, 20);
		obj.sum(10.1, 10.2);
		obj.sum(10, 20, 30);
		obj.sum("Hello World", 10, 20);
		
		
		obj.sum(1, 2, 3, 4, 5, 6);
	}

}
