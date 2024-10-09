package Ch21;
// ### 제네릭(Generic) ###
// 타입(Type)을 일반화하여 코드의 재사용성과 안정성을 향상시키는 기술
// 코드를 특정한 데이터 타입에 의존하지 않고 일반적으로 작성할 수 있음.
//
//
//class Box<T> {
//	private T content;
//	
//	public Box(T content) {
//		this.content = content;
//	}
//	
//	public T getContent() {
//		return content;
//	}
//}
//
//public class GenericSimpleExample {
//	public static void main(String[] args) {
//		// 문자열을 담은 Box 생성
//		Box<String> stringBox = new Box<>("Hello, Generic!");
//		String content = stringBox.getContent();
//		System.out.println("String Box Content : " + content);
//		
//		// 정수를 담은 Box 생성
//		Box<Integer> intBox = new Box<>(42);
//		int intValue = intBox.getContent();
//		System.out.println("Integer Box Content  : " + intValue);
//		
//		// 불린 값을 담은 Box 생성
//		Box<Boolean> booleanBox = new Box<>(true);
//		boolean boolValue = booleanBox.getContent();
//		System.out.println("Boolean Box Content : " + boolValue);
//	}
//}



class StringBox {
	private String content;
	
	public StringBox(String content) {
		this.content = content;
	}
	public String getContent() {
		return content;
	}
}
class intBox {
	private int content;
	
	public intBox(int content) {
		this.content = content;
	}
	public int getContent() {
		return content;
	}
}
class booleanBox {
	private boolean content;
	
	public booleanBox(boolean content) {
		this.content = content;
	}
	
	public boolean getContent() {
		return content;
	}
}
public class C01Generic {
	public static void main(String[] args) {
		// 문자열을 담은 Box 생성
		StringBox stringBox = new StringBox("Hello, Generic");
		String content = stringBox.getContent();
		System.out.println("String Box content : " + content);
		
		// 정수를 담은 Box 생성
		intBox intBox = new intBox(30);
		int intValue = intBox.getContent();
		System.out.println("Integer Box Content : " + intValue);
		
		// 불린 값을 담은 Box 생성
		booleanBox booleanBox = new booleanBox(true);
		boolean boolValue = booleanBox.getContent();
		System.out.println("Boolean Box Content : " + boolValue);
		
	}

}
