package Ch22;

// ### NullPointerException ###
// 참조변수가 null 값을 가진 상태에서 해당 변수를 사용하려고 할 때 발생
// null은 아무런 객체를 참조하지 않음을 나타냄.
// ==> 해당 객체의 메서드를 호출하거나 인스턴스 변수에 접근하려고 하면 NullPointerException이 발생


public class C01NullPointerException {
	public static void main(String[] args) {
		
	
		
		try {	
			String str = null;
			System.out.println(str.toString());	// 없는 문자열을 toString()으로 보려고 하니깐 예외 발생.
				
		} catch (NullPointerException e) {
			// e는 참조변수, 예외 객체가 생성되고 주소번지가 100이라면 try에서 예외가 발생한 후 catch의 참조변수 e가 그 주소번지를 받아냄.
			
			System.out.println("예외발생함!!!!");
			e.printStackTrace();
		
		}
		System.out.println("나 예외 처리하고 실행되는 구문 ㅎㅎ..");
		
		
		
	}

}
