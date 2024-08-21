import java.util.Scanner;
// import java.util.*;

// import : 불러오겠다.
// java라는 폴더 .(안에) util .(안에) 있는 모든것(*)을 추가하겠다.
// 모든 것 중에 하나가 Scanner 그래서 java.util.Scanner;라고 적어도 Okay;

public class Ch05 {

	public static void main(String[] args) {
		// 00 입력문(값 입력 받기, Scanner)
		
		// System.out			 : 표준 출력 스트림 생성 - 모니터
		// System.in			 : 표준 출력 스트림 생성 - 키보드
		
		// 참고)
		// new Scanner(System.in)
		// 키보드로부터 전달되는 데이터를 받을 수 있는 Scanner 장치를 생성
		
		// Scanner sc = new Scanner(System.in);
		// Scanner 장치를 main함수 내에서 제어(사용)할 수 있도록
		// 참조변수 sc 연결
		
		// 실수
		// nextDouble()
		// nextFloat()
		
		// 정수
		// nextInt()
		// nextLong()
		// nextByte()
		// nextShort()
		
		// 논리
		// nextBoolean()
		
		// 한 단어(String)
		// next()
		
		// 한 줄(String)
		// nextLine()
		
		Scanner sc = new Scanner(System.in);
		// 일단 외워주세요 :)
		// Scanner 장치를 생성해 사용할 수 있도록 참조변수 sc 생성 및 연결
//		System.out.println("-------------------- Scanner 예제 01 ---------------------------");
//		System.out.println("정수를 하나 입력하세요 >>>");
//		int s = sc.nextInt(); 			// 밑에 실행창의 오른쪽 상단에 젤 왼쪽 보면 빨간불 들어와있는데 '실행중'이라는 의미.
//										// next()     : 한 문자열(단어), 띄워쓰기 기준으로 한 문자열만 가능
//										// nextLine() : 한 줄
//										// nextInt()  : 숫자로 나옴. 대신 변수 앞에 String이 아니라 int로 바꿔야함.
//		
//		
//		System.out.println("입력한 문자열 : " + s);
//		System.out.println();
		
//		System.out.println("----------------- Scanner 예제 02 ----------------------------");
//		System.out.println("정수 세개를 입력해주세요 >>> ");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt(); // 연속적인 scanner로 인한 값입력은 SpaceBar 또는 Enter로 구분
//		
//		int sum = num1 + num2 + num3;
//		System.out.printf("%d + %d + %d = %d\n", num1, num2, num3, sum);
//		System.out.println();
		
		
//		System.out.println("--------------------- Scanner 예제 03 -------------------------");
//		System.out.print("정수 입력 >>>");
//		int number1 = sc.nextInt();
//		System.out.println("입력된 정수 값 : " + number1);
//		
//		System.out.print("실수 입력 >>> ");
//		double number2 = sc.nextDouble();
//		System.out.println("입력된 실수 값 : " + number2);
//		
//		System.out.print("문자열 입력 : ");
//		String str1 = sc.next();
//		System.out.println("입력된 문자열 : " + str1);
//		
//		System.out.println("입력 :");
//		String s1 = sc.next();
//		String s2 = sc.next();
//		String s3 = sc.next();
//		System.out.printf("문자열 : %s %s %s\n", s1, s2, s3);
//		System.out.println();

		System.out.println("------------------- Scanner 버퍼 비우기 예제 ---------------------------");
		System.out.println("수 입력 :");
		int num = sc.nextInt();
		
		sc.nextLine();		// 개행 문자를 제거 == 스트림 버퍼를 초기화(비우는 과정) 
		
		System.out.println("문자열 입력(띄워쓰기 포함 문자열) : ");
		String str2 = sc.nextLine();				// 문자열 입력받기 기능 함수, 띄워쓰기도 포함함.
		
		System.out.println("입력된 문자열 : " + str2);
		
		
		
		
//		## 입출력 실습 예제 ##
//		System.out.println("--------------- Scanner 문제 01 ---------------");
//		문제 01)
		// 직사각형의 가로와 세로 값을 사용자로부터 입력받고 
		// 직사각형의 둘레와 넓이를 구하는 프로그램을 구현해보세요
		// 직사각형의 둘레 = (가로길이 + 세로길이) * 2
		// 직사각형의 넓이 = 가로길이 * 세로길이

		
		
//		System.out.println("가로 길이를 입력하세요 >>> ");
//		int num = sc.nextInt();
//		System.out.println("세로 길이를 입력하세요 >>> ");
//		int num1 = sc.nextInt();
//		int dul = (num + num1) * 2;
//		int siz = num * num1;
//		System.out.println("직사각형의 둘레 = " + dul);
//		System.out.println("직사각형의 넓이 = " + siz);
		System.out.println();
		
//		============================== 실행 결과 ===================================
//		가로 길이를 입력하세요 >>> 
//		3
//		세로 길이를 입력하세요 >>> 
//		5
//		직사각형의 둘레 = 16
//		직사각형의 넓이 = 15		
		
		
		
//      문제 02)
//      System.out.println("--------------- Scanner 문제 02 ---------------");
      //이름을 입력하세요? 홍길동
      //홍길동 님의 나이를 입력하세요? 24
      //홍길동 님의 주소를 입력하세요? 대구광역시 중구 중앙대로 124
      // 홍길동 님의 나이는 24세 주소는 대구광역시 중구 중앙대로 124 입니다
		
	}

}
