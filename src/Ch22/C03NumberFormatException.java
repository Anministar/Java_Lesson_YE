package Ch22;

public class C03NumberFormatException {
	
	public static void main(String[] args) {
		
		
		try {
			String data1 = "100";
			String data2 = "a100";
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2); 		// 문자 --> 정수로 바꿔주는 메서드
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch (NumberFormatException e) {
			
			System.out.println(e.getCause()); 			// getCause() 		: 원인 가져오기
			System.out.println();
			
			System.out.println(e.toString()); 			// toString()		: 예외객체 정보
			System.out.println();
			
			System.out.println(e.getStackTrace()); 		// getStackTrace()  : 예외객체 식별주소
			System.out.println();
			
			e.printStackTrace(); 					 	// printStackTrace() : 프로그램 종료 전 예외발생정보 출력
			System.out.println();
			
			System.out.println(e.getMessage()); 		// getMessage()		: 예외 메세지 내용 출력
			
		}
		System.out.println("[SYSTEM] : 프로그램을 종료합니다!!");
	}

}
