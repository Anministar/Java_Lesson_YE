package Ch14;

class AnimalTest {

	public void move() {
		System.out.println("동물이 이동한다.");
	}

}

class DogTest extends AnimalTest {
	@Override
	public void move() {
		System.out.println("멈뭄미가 이동한다.");
	}
	
	
	public void cry() {
		System.out.println("왈왈!");
	}

}

class CatTest extends AnimalTest {
	@Override
	public void move() {
		System.out.println("고냠미가 이동한다.");
	}

	public void cry() {
		System.out.println("냐옹!");
	}
}

class RabbitTest extends AnimalTest {
	@Override
	public void move() {
		System.out.println("토뭄미가 이동한다.");
	}
	public void cry() {
		System.out.println("끼잉!");
	}

}



public class test {
	public static void moveinfo(AnimalTest obj) {
//		obj.move();
//		obj.cry();		// ERROR
		
		if (obj instanceof DogTest) {
			DogTest mydog = (DogTest) obj;
			mydog.move();
			mydog.cry();
		}
		if (obj instanceof CatTest) {
			CatTest mycat = (CatTest) obj;
			mycat.move();
			mycat.cry();
		}
		
		if (obj instanceof RabbitTest) {
			RabbitTest myrabbit = (RabbitTest) obj;
			myrabbit.move();
			myrabbit.cry();
		}
		
		
		
	}
//
//	public static void moveinfo(DogTest obj) {
//		obj.move();
//	}
//
//	public static void moveinfo(CatTest obj) {
//		obj.move();
//	}
//
//	public static void moveinfo(RabbitTest obj) {
//		obj.move();
//	}

	public static void main(String[] args) {
		DogTest test1 = new DogTest();
		CatTest test2 = new CatTest();
		RabbitTest test3 = new RabbitTest();

		moveinfo(test1); // 강아지 객체
		moveinfo(test2); // 고양이 객체
		moveinfo(test3); // 토끼 객체
		


	}

}
