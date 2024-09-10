package Ch13;

//### 'Return' Keyward ###
//자바에서 메소드가 값을 반환하는 데 사용되는 키워드
//반환되는 값의 자료형은 메소드의 선언에서 지정한 반환 자료형과 일치해야 함

//메소드의 실행을 중지하는 데에도 사용됨.
//메소드 내에서 어느 위치에서든 return을 만나면 해당 위치에서 메소드의 실행이 종료됨.


//문제 1: 사각형 클래스 만들기


//1. Rectangle 클래스를 작성하세요.
//2. width와 height라는 두 개의 속성(멤버 변수)을 가지도록 클래스를 구성하세요.
//3. 생성자를 통해 width와 height를 초기화하세요.
//4. getArea() 메소드를 구현하여 사각형의 넓이를 반환하세요.
//5. getPerimeter() 메소드를 구현하여 사각형의 둘레를 반환하세요.


public class C04PracRectangle {
 private double width;
 private double height;

 // 생성자
 public C04PracRectangle(double width, double height) {
     this.width = width;
     this.height = height;
 }

 // 넓이 반환
 public double getArea() {
//	 if(width == 0.0) {
//		 return;
//	 }
//	 System.out.println("안녕안녕");
     return width * height;
 }

 // 둘레 반환
 public double getPerimeter() {
     return 2 * (width + height);
 }

 public static void main(String[] args) {
     // 테스트
	 C04PracRectangle myRectangle = new C04PracRectangle(5.0, 3.0);
     System.out.println("넓이: " + myRectangle.getArea());
     System.out.println("둘레: " + myRectangle.getPerimeter());
 }
}