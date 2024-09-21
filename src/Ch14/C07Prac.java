package Ch14;
class Test {
	String name;
	int age;
	String address;
	
	public Test(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Test [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}
public class C07Prac {
	public static void main(String[] args) {
		Test test = new Test("곰돌이", 3, "대구");
		System.out.println(test);
		System.out.println(test.toString());
		
//		Parttimer emp1 = new Parttimer("홍길동","25","대구",20000);
//		Regular emp2 = new Regular("서길동","45","울산",50000000);
//		ShowInfo(emp1);
//		System.out.println("------------");
//		ShowInfo(emp2);
	}
}
