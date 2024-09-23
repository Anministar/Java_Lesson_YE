package Ch14;


// 디자인 패턴

// 반복적으로  발생하는 설계 문제에 대한 해결책을 재사용 가능한 형태로 정리한 것

// 상품 제작시 사전에 발견되었던 문제들을 해결하고 정형화 시켜놓은 작업패턴
// 디자인 패턴은 제작자들간의 의사소통 수단의 일종이다.

// ex) 의류를 디자인을 할 떄 일반적으로 알려진 패턴대로 재단을 한다(~소재는 미싱은 어떻게 어떻게 해야 ~ 잘 뜯어지지 않는다)
// ex) 그렇게 하지 않을 때 품질에 이상발생 가능성 높다.

// 프로그래밍 언어의 디자인 패턴
// 프로그램 제작 시 사전에 발견되었던 문제들을 해결하고 정형화 시켜놓은 작업패턴


// 싱글톤 패턴
// 하나의 객체를 생성하여 다수의 클라이언트가 접속하여 사용하는 형태
// 하나의 인스턴스를 공유하며 사용할 수 있음.

// ex) DB Connection Pool 생성시 사용

// 어떤 클래스가 최대 한 번만 인스턴스화되어야 하는 경우에 사용되는 디자인 패턴 중 하나

class C03Company {
	private static C03Company instance = null;
	
	private C03Company() {
		
	}
	
	public static C03Company getInstance() {
		if (instance == null) {
			instance = new C03Company();
		}
		return instance;
	}
}
public class C08SingleTonMain {
	public static void main(String[] args) {
		
		C03Company myCom = C03Company.getInstance();
		C03Company myCom1 = C03Company.getInstance();
		
		System.out.println(myCom == myCom1);
	}
	
}
