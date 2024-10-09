package Ch19;


abstract class Employee {
	String name;
	String age;
	String address;
	
	public Employee(String name, String age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	abstract void show();
	
	
}

class Parttimer extends Employee {
	int hourpay;

	public Parttimer(String name, String age, String address, int hourpay) {
		super(name, age, address);
		this.hourpay = hourpay;
	}
	
	public void show() {
		System.out.printf("시간제 근로자 : %s %s %s %d\n", name, age, address, hourpay);

	}
	
	
	
}

class Regular extends Employee {
	int salary;

	public Regular(String name, String age, String address, int salary) {
		super(name, age, address);
		this.salary = salary;
	}

	public void show() {
		System.out.printf("정규직 근로자 : %s %s %s %d\n", name, age, address, salary);

	}
	
	
	
}

public class C02Prac {
	
	public static void ShowInfo(Employee emp) {
		emp.show();
		
	}
	
	public static void main(String[] args) {
		
		Parttimer emp1 = new Parttimer("홍길동","25","대구",20000);
		Regular emp2 = new Regular("서길동","45","울산",50000000);
		ShowInfo(emp1);
		System.out.println("------------");
		ShowInfo(emp2);
		
	
	}

}
