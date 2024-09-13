package Ch14;

// Employee 직원 클래스를 완성하세요!!
// 이름, 나이, 주소

// Parttimer 비정규직 클래스를 완성하세요!!
// 시급(hourpay)

// Regular 정규직 클래스를 완성하세요!!
// 연봉(salary)


public class C04Prac {

	public static void ShowInfo(Employee emp) {
		// 다운캐스팅을 통해서 parttimer or regular를 선별해서
		// 모든 정보를 출력해보세요

	}

	public static void main(String[] args) {
		Parttimer emp1 = new Parttimer("홍길동", "25", "대구", 20000);
		Regular emp2 = new Regular("서길동", "45", "울산", 50000000);
		ShowInfo(emp1);
		System.out.println("------------");
		ShowInfo(emp2);

	}
}
