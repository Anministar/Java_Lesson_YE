package Ch13;
public class C01Person {
	// 속성
	String name;					
	int age;
	String address;
	
	
	// 기능(함수, 메서드)
	void hello() {
		System.out.println(name + "이/가 인사합니다.");		
	}

}

public class C01PersonMain {

	public static void main(String[] args) {
		C01Person hong = new C01Person();

		hong.name = "홍길동";
		hong.age = 35;
		hong.address = "대구광역시 반월당 센트럴타워";
		hong.hello();

		C01Person dong = new C01Person();

		dong.name = "이동하";
		dong.age = 35;
		dong.address = "대구광역시 반월당 센트럴타워";
		dong.hello();

		System.out.printf("%s님의 나이는 %d이고 주소는 %s입니다.", hong.name, hong.age, hong.address);
	}

}
