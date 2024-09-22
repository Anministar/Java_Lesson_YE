package Ch15;

public class C01StringClass {
	
	public static void main(String[] args) {
		
		// 1
		String str1 = "java";
		String str2 = "java";
		
		// 2
		String str3 = new String("java");
		String str4 = new String("java");
		
		
		// 사전적인 의미는 new String("java"); 명령어 실행하게 되면 실질적으로는 위의 str1과 str2와 다른 "java"라는
		// 객체가 만들어짐.
		
		// 이거는 자바의 메모리 구조상 JVM이 최적화를 시키기 때문에 "java"가 상수 풀(pool) 영역에 있다면 그걸 동일시하게 만드는
		// 그런 구조를 가지고 있음.
		
		// "java"가 실제 객체와 동일한 hashCode를 지니게 됨.
		
		
		// ### System.identityHashCode() ###
		// 객체의 실제 메모리 주소를 기반으로 하는 해시 코드를 반환
		// Object 클래스의 메서드로, 모든 객체에서 사용할 수 있음.
		// 객체의 내용나 내부 상태가 아니라 '객체의 물리적 위치'를 기반으로 한 고유한 식별자 역할
		// 동일한 객체라도 두 번 생성되면 다른 메모리 주소를 가지므로, 서로 다른 identityHashCode를 반환.
		
		
		//### hashCode() ###
		// 기본 구현은 객체의 내용에 기반하여 해시 코드를 생성.
		// Object 클래스에서 상속받은 메서드로, 모든 객체에서 사용할 수 있음.
		
		// 기본적으로는 메모리 주소가 아닌 객체의 내용에 따라 해시 코드를 생성하는데, 이는 equals 메서드와 함께 사용되어
		// 컬렉션(자료구조) 등에서  객체를 식별하는 데 활용.
		
		// 일반적으로 개발자는 이 메서드를 재정의하여 객체의 특정 내용을 기반한 해시 코드를 생성하도록 구현할 수 있음.
		
		
		// HashCode(); 	==> 문자열에서는 문자 자체를 해싱한 값 ==> HEAP 영역 안에 있는 Constant String Pool에 
		//												  있는 "java" 문자열의 메모리 주소값
		
		// 요약하자면,
		// System.identityHashCode는 객체의 메모리 주소를 기반으로 하는 실제 식별자를 제공
		// hashCode 메서드는 객체의 내용을 기반으로 하는 해시 코드를 생성
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println();
		
		// 서로 동일한 hashCode를 지니지만 서로 다른 객체가 될 수 있다 O
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println();
		
		
		// 1과 2의 저장 방식이 다름
		// "=="은 서로 다른 동일한 인스턴스냐, 즉 같은 메모리 주소값을 지니냐, 객체가 참조하고 있는 메모리 "값"을 비교
		System.out.println("str1 = str2 : " + (str1 == str2));
		System.out.println("str3 = str4 : " + (str3 == str4));
		System.out.println("str1 = str3 : " + (str1 == str3));
		System.out.println("str1 = str4 : " + (str1 == str4));
		
		// equals 메서드 사용하여 문자열 자체 비교하기
		// 객체가 가리키고 있는 값 자체 == 문자열 자체 비교, 객체가 참조하고 있는 메모리 '내의 값'을 비교
		System.out.println("---------------------------------");
		System.out.println("str1 = str2 : " + (str1.equals(str2)));
		System.out.println("str3 = str4 : " + (str3.equals(str4)));
		System.out.println("str1 = str3 : " + (str1.equals(str3)));
		System.out.println("str1 = str4 : " + (str1.equals(str4)));
		
		
		
		
	}
	

}
