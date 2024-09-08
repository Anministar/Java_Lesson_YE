package Ch13;


//문제 2: 학생 클래스 만들기

//1. Student 클래스를 작성하세요.
//2. name과 age라는 두 개의 속성을 가지도록 클래스를 구성하세요.
//3. 생성자를 통해 name과 age를 초기화하세요.
//4. displayInfo() 메소드를 구현하여 학생의 정보를 출력하세요.
public class C04PracStudent {
	String name;
	int age;
	
	// 매개변수 생성자
	public C04PracStudent(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	// displayInfo() 메서드생성
	// 접근제어자 반환자료형 메서드명(매개변수) {
	
	//}
	
	public void displayInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	
	public static void main(String[] args) {
		C04PracStudent myStudent = new C04PracStudent();
		
		C04PracStudent myStudent = new C04PracStudent("홍길동",20);
		myStudent.displayInfo();
		
		C04PracStudent dong = new C04PracStudent("이동하",30);
		
		dong.displayInfo();
	}

}
