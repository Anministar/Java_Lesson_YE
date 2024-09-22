package Ch14;
//class Test {
//	String name;
//	int age;
//	String address;
//	
//	public Test(String name, int age, String address) {
//		this.name = name;
//		this.age = age;
//		this.address = address;
//	}
//
//	@Override
//	public String toString() {
//		return "Test [name=" + name + ", age=" + age + ", address=" + address + "]";
//	}
//}

// Employee1 클래스 완성
// name, age ,addr
// show()

// Parttimer1 클래스 완성
// hourpay
// show()

// Regular1 클래스 완성
// salary
// show()



public class C07Prac {
	public static void main(String[] args) {
//		Test test = new Test("곰돌이", 3, "대구");
//		System.out.println(test);
//		System.out.println(test.toString());
		
		Parttimer1 emp1 = new Parttimer1("홍길동","25","대구",20000);
		Regular1 emp2 = new Regular1("서길동","45","울산",50000000);
		ShowInfo(emp1);			// 시간제근로자 : 홍길동, 25, 대구, 20000
		System.out.println("------------");
		ShowInfo(emp2);			// 정규제근로자 : 서길동, 45, 울산, 50000000
	}
}
