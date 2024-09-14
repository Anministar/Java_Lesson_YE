package Ch14;

class A {
	int n1 = 10;
}

class B extends A {
	int n2 = 20;
}

class C extends A {
	int n3 = 30;
}

class D extends B {
	int n4 = 40;
}

class E extends C {}
class F extends E {}


public class C05Upcasting {
	public static void UpcastingTest(A tmp) { 
		System.out.println("A클래스 속성 : " + tmp.n1);
		// instanceof
		if (tmp instanceof B) 	{
			B down = (B)tmp;
			System.out.println("B클래스 속성 : " + down.n2);
		}
		if (tmp instanceof C) {
			C down = (C)tmp;
			System.out.println("C클래스 속성 : " + down.n3);
		}
		if(tmp instanceof D ) {
			D down = (D)tmp;
			System.out.println("D클래스 속성 : " + down.n4);
		}
	}
	public static void main(String[] args) {
		
		
		B ob1 = new B();
		C ob2 = new C();
		D ob3 = new D();
		E ob4 = new E();
		F ob5 = new F();
		
		UpcastingTest(ob1);
		System.out.println();
		
		UpcastingTest(ob2);
		System.out.println();
		
		UpcastingTest(ob3);			// A가 B에 걸리고, B가 D에 걸림 // 출력 결과 : 10, 20, 40
		System.out.println();
		
		UpcastingTest(ob4);
		System.out.println();
		
		UpcastingTest(ob5);
		System.out.println();
		
	}

}
