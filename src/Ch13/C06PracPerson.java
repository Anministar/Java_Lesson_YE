package Ch13;


//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//문제
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

//1. C01Person 클래스를 완성하세요
//2. name, addr, age 세가지 속성을 정의해주세요!

//3. name 속성 1개에 대한 매개변수 생성자를 만들어주세요

//4. name, age 속성 2개에 대한 매개변수 생성자를 만들어주세요

//5. name, age, addr 속성 3개에 대한 매개변수 생성자를 만들어주세요

//6. ShowInfo() 메서드를 만들어주세요


public class C06PracPerson {

	public static void main(String[] args) {
		

		C10Person obj = new C10Person();					// 빈 객체 생성
		
		C10Person obj1 = new C10Person("홍길동"); 			//멤버변수 name에 "홍길동" 저장 
			
		C10Person obj2 = new C10Person("서길동", 10);  		//멤버변수 name, age에 각각 저장
		
		C10Person obj3 = new C10Person("강호동", 55, "서울");	//멤버변수 name, age, addr에 각각 저장
		
		
		
		
	}
}
