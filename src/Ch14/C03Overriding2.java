package Ch14;
class Animal01 {
	void makeSound() {
		System.out.println("동물이 소리를 낸다");
	}
}


class Dog01 extends Animal01 {
	// 오버라이딩
	void makeSound() {
		System.out.println("개가 짖는다.");
	}
	
	
	// 추가적인 메서드
	void bark() {
		System.out.println("왈왈!!");
	}
}
public class C03Overriding2 {
	public static void main(String[] args) {
		Animal01 animal = new Dog01();			// 다형성을 통한 객체 생성
		animal.makeSound();						// 오버라이딩된 Dog 클래스의 makeSound 메서드 호출
		// animal은 부모 클래스 타입의 자료형을 가지고 있지만 자식 객체를 참조하고 있다.
		// 만약에 오버라이딩된 메서드가 자식 객체에 있다면 부모클래스 타입을 자료형으로 가지는 참조변수는 오버라이딩된 메서드를
		// 사용함.
		
		// ==> 요약하자면, 부모 타입이지만 자식 객체의 오버라이드 된 메서드가 있다면 그 메서드를 사용.
//		 animal.bark();			// ERROR
		
		Dog01 dog = new Dog01();
		dog.makeSound();		// Dog 클래스의 makeSound 메서드 호출
		dog.bark();				// Dog 클래스의 bark 메서드 호출
		
	}
}
