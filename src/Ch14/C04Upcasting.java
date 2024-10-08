package Ch14;


// ### 업캐스팅과 다운캐스팅 ###

// 1. 업캐스팅 : 하위 클래스의 객체를 상위 클래스 타입으로 변환하는 것을 의미.

//class Animal {}
//class Dog extends Aniaml {}
//
//Dog myDog = new Dog();
//Animal myAnimal = new Dog();		// 업캐스팅



// 2. 다운캐스팅 : 상위 클래스 타입으로 캐스팅된 객체를 다시 원래의 하위 클래스 타입으로 변환하는 것을 의미 ==> 업캐스팅이 전제되어야 함.
// 명시적인 형 변환 연산자가 필요하며, ==> 강제 형변환이 필요하다.
// 이를 통해 객체를 다시 원래 타입으로 사용할 수 있음.


// ### 다운캐스팅은 주의점 ###
// 실제로 해당 객체가 원하는 하위 타입의 인스턴스인지를 확인하는 작업이 필요함.


//class Animal{}
//class Dog extends Animal {}
//
//Animal myAnimal = new Dog();
//Dog myDog = (Dog) myAnimal;		// 다운캐스팅


 
// 다운캐스팅 전에 instanceof 연산자를 사용하여 객체의 타입을 확인하는 것이 안전 ==> boolean 타입으로 결과값을 변환
//if (myAnimal instanceof Dog) {
//	Dog anotherDog = (Dog) myAnimal;			// myAnimal이 Dog 클래스의 인스턴스라면 다운캐스팅을 진행해라.
//}



// ### 객체와 인스턴스의 차이점 ###
// Dog mydog = new Dog();						// mydog는 Dog 클래스의 인스턴스이자, 실제 객체이기도 함.
												// mydog는 Animal 클래스의 인스턴스이지만, 실제 객체는 아님.
// ==> Dog 클래스는 Animal 클래스로 부터 상속을 받았기 때문에 (파생되었기 때문에) Animal의 인스턴스가 될 수 있지만 객체는 꼭 아님.

class Super {
	int num1;
}
class Sub extends Super {
	int num2;				// 확장
}
public class C04Upcasting {
	public static void main(String[] args) {
		Super ob1 = new Super();			// NoCasting
		Sub ob2 = new Sub();				// NoCasting
		
		Super ob3 = new Sub();				// UpCasting
		ob3.num1 = 1;
//		ob3.num2 = 2;						// Error
											// 참조변수 ob3의 범위가 부모 클래스 타입까지이므로
											// 자식의 확장 멤버 변수에 접근이 불가함.
		if (ob3 instanceof Sub) {
			Sub down = (Sub) ob3;			// DownCasting
			down.num2 = 2;					// 참조하고 있는 Sub 객체를 부모 타입으로 ob3가 참조하고 있음 = 업캐스팅
											// 업스캐팅된 객체 ob3를 다시 Sub 클래스 타입을 자료형으로 가지는 down 참조변수에
											// 다운캐스팅을 통해서 객체 연결
											// 그로 인해 down 참조변수는 b 속성에 접근이 가능함.
			
		}
	}

}
