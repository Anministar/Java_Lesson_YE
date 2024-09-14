package Ch14;

// Employee 직원 클래스를 완성하세요!!
// 이름, 나이, 주소

// Parttimer 비정규직 클래스를 완성하세요!!
// 시급(hourpay)

// Regular 정규직 클래스를 완성하세요!!
// 연봉(salary)

class Employee {
	String name;
	String age;
	String address;
	
	public Employee(String name, String age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
}

class Parttimer extends Employee {
	int hourpay;
	
	// 매개변수 생성자
	public Parttimer (String name, String age, String address, int hourpay) {
		super(name, age, address);
		this.hourpay = hourpay;
		
	}
	
	
	
}

class Regular extends Employee {
	int salary;
	
	// 매개변수 생성자
		public Regular (String name, String age, String address, int salary) {
			super(name, age, address);
			this.salary = salary;
			
		}
	
	
}


public class C04Prac {

	public static void ShowInfo(Employee emp) {
		// 다운캐스팅을 통해서 parttimer or regular를 선별해서
		// 모든 정보를 출력해보세요
		
//		emp가 어떤 객체를 받을까??? ==> Employee 객체, Parttimer 객체, Regular 객체와 같이 세가지 경우가 있는데 우리는 어떤걸 받을지 알 수 없음.
		if(emp instanceof Parttimer) {		// instanceof 연산자 : 어떤 객체가 어떤 클래스의 인스턴스인지의 여부 확인 
											// 				   : 인스턴스라면 True
											//				   : 인스턴스가 아니라면 False
			// emp를 Parttimer로 다운캐스팅
			Parttimer down = (Parttimer) emp;
			System.out.println(down.name);
			System.out.println(down.age);
			System.out.println(down.address);
			System.out.println(down.hourpay);
			
		}
		else if (emp instanceof Regular) {
			// emp를 Regular로 다룬캐스팅
			Regular down = (Regular) emp;
			System.out.println(down.name);
			System.out.println(down.age);
			System.out.println(down.address);
			System.out.println(down.salary);
		}

	}

	public static void main(String[] args) {
		Parttimer emp1 = new Parttimer("홍길동", "25", "대구", 20000);
		Regular emp2 = new Regular("서길동", "45", "울산", 50000000);
		ShowInfo(emp1);
		System.out.println("------------");
		ShowInfo(emp2);

	}
}
