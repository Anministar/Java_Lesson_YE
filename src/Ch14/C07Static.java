package Ch14;


class C02Simple {
	int n1;
	static int n2;
	
	void Func1() {
		n1 = 10;
		n2 = 20;
	}
	
	static void Func2() {
		
//		n1 = 10; 			// Error 발생, Why???? ==> 객체를 만들고 접근가능한 변수가 n1임.
							// static은 객체가 없어도 부를 수 있어야 O.
							// 만약에 Func2()에서 n1 = 10; 코드가 유효하다면, 어떤 객체에 대한 n1의 값을 바꾸는지 우리는 모름.
		
		n2 = 20;   			// 모든 객체의 n2의 정보가 ==> 20으로 바뀜.
		
		int num = 10;		// 사용가능, Why? ==> num은 지역변수니깐.
	}
}
public class C07Static {
	public static void main(String[] args) {
		C02Simple instance = new C02Simple();
		
		instance.Func1();				// n1 = 10, n2 = 20
		System.out.println(instance.n1);
		System.out.println(instance.n2);
		
		
		
		C02Simple instance2 = new C02Simple();
		System.out.println(instance2.n1);	// n1 = 0
		System.out.println(instance2.n2);   // n2 = 20
		
		instance2.n2 = 120;
		
		
		System.out.println(instance.n2); 	// 120
		
		
		instance2.n1 = 1000;
		
		System.out.println(instance.n1); 	// 10
		System.out.println(instance2.n1); 	// 1000
	}

}
