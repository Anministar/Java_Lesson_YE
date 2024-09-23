package Ch18;



class C01Person {
	String name;
	String age;
	String addr;
}
public class C01PersonMain {
	
	public static void main(String[] args) {
		// 클래스 배열을 선언하는 것과 객체를 만드는 일은 별개다?
		// 정수형 배열을 선언하고 그 안에 값을 넣는것처럼
		
		// C01Person 배열 ==> 클래스 배열
		// 클래스 배열을 자료형으로 가지는 employee 변수를 하나 생성
		// 크기가 3인 클래스 배열을 선언한 부분과 연결하고 있는 과정
		C01Person [] employee = new C01Person[3];
		
		
		employee[0] = new C01Person();
		employee[0].name = "홍길동";
		employee[0].age = "35";
		employee[0].addr = "대구";
		
		employee[1] = new C01Person();
		employee[1].name = "남길동";
		employee[1].age = "24";
		employee[1].addr = "울산";
		
		employee[2] = new C01Person();
		employee[2].name = "서길동";
		employee[2].age = "12";
		employee[2].addr = "서울";
		
		for (int i = 0; i < employee.length; i++) {
			System.out.println("이름 : " + employee[i].name);
			System.out.println("나이 : " + employee[i].age);
			System.out.println("주소 : " + employee[i].addr);
		}
		
		
	}

}
