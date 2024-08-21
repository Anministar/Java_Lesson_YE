
public class Ch03 {
	public static void main(String[] args) {
		
		// 00 자료형과 변수
		
		// 1 byte == 8 bit
		// 자료( 데이터 ) : 선저장 후 처리 ( 공간 먼저 확보 후 저장 )
		// 자료형 : 데이터 종류에 따라 저장될 공간을 미리 규격화 시켜놓은 예약어
		
		// 변수란? : 하나의 값을 저장할 수 있는 저장공간, 필요에 의해 반복적으로 바꿀 수 있음.
		// 상수란? : 항상 같은 수, 값을 바꾸지 않음(고정)
		
		// " = "은 우리가 알던 수학적 기호의 의미 즉, "같다"는 의미를 지니는게 아니라 "대입"의 의미를 지님.
		
		// 			왼쪽			=			 오른쪽
		//			(공간)		=			(값, 수)
		//		 (Variable)		=			(Value)
		// 이때 오른쪽을 먼저 처리한다.
		
		System.out.println("-------------- 변수 선언 예제 ---------------");
		int age;				// 변수 선언
								// int 자료형 == 4byte
								// 4 byte 정수 공간에 age이름 부여
		
		age = 22;				// 변수공간에 값 "대입"
								// 이때 주의해야할 점이 age는 22과 같지 않음
								// " 대입 "의 개념
		
		System.out.println(22);
		System.out.printf("age : %d\n", age);

		age = 12;				// 값 변경 가능
		System.out.printf("age : %d\n", age);	
		
		int num1 = 10;			// 변수를 초기화한다고 함.
		int num2 = 20;
		int num3 = num1 + num2;	
		System.out.println(num3);
		
		System.out.println();
		
		// 01 자료형의 종류
		
		// 1. 정수 자료형
		// 1-1) int			 : 4 byte 정수, 기본자료형
		
		System.out.println("-------------------- 정수 자료형 - int형 예제 -----------------------");
		int n1 = 0b10101101; 		// 2진수
		int n2 = 173;				// 10진수
		int n3 = 0255;				// 8진수
		int n4 = 0xad;				// 16진수
		
		System.out.printf("%d %d %d %d \n", n1, n2, n3, n4);
		System.out.println();
		
		
		// 1-2) byte		 : 1 byte 정수, 부호 O
		
		System.out.println("------------------- 정수 자료형 - byte형 예제 ------------------------");
		byte m1 = -128;
		byte m2 = -30;
		byte m3 = 30;
		byte m4 = 127;
		byte m5 = (byte)128;	// ERROR.. why?? 
		System.out.println(m5);
		System.out.println();
		
		
		// 1-3) ## short vs char 비교 ##
		// char 			: 2byte 정수 부호 x, 단일문자 저장용으로 주로 사용
		// short			: 2byte 정수 부호 O
		
		System.out.println("----------------- 정수 자료형 - char형, short형 예제 -----------------------");
		char o1 = 65535;			// 0 - 2^16 / 0 ~ 65535
//		short o2 = 60000;			// error
		short o2 = 32767;			// -2^15 ~ (2^15 - 1) / -32768 ~ 32767
		
		char o3 = 60000;
		short o4 = (short) o3;		// error, 강제 형변환, o3은 이제 음수가 되어버림.
		System.out.println(o4);
		o3 = 65;
		System.out.println(o3);
		System.out.printf("%d", (int)o3);
		System.out.println();
		
	
		
		
		// 1-4) long		: 8byte 정수
		
		System.out.println("----------------- 정수 자료형 - long형 예제 --------------------------");
		long a1 = 20;				// 리터럴 접미사 x ==> 기본자료형(int)
									// long, int 자료형을 일치시켜주는 작업이 함(자동 형 변환 작업)
		long a2 = 20L;				// 리터럴 접미사 L, l : long 자료형
									// long, long 자료형이 같아서 직업이 필요없음.
		
		// long a3 = 10000000000; 	// ERROR.. why?
									// 4 byte는 대략 -21억 - 21억까지 저장가능한데 long, int 이기 때문에 4byte안에 100억을 넣을 순 없음.
		
		long a4 = 10000000000L;
		System.out.println(a4);
		System.out.println();
		
		
		
		
		// 2. 실수 자료형
		
		// float : 4byte 실수 (6 - 9자리)
		// double : 8byte 실수 (기본값) (15자리 - 18자리)
		
		// 실수의 범위는 무한대에 가깝기 때문에 제한된 공간을 가진 컴퓨터는
		// 모든 범위의 수를 담기란 불가능하다.
		
		// 따라서 근사값 즉, 소수점 이하 (가수부) 유효범위까지만 실수값을 저장하고
		// 나머지 부분에 있어서는 오차가 발생하여 나타난다.
		// 따라서, 반복적인 실수 연산처리는 오차가 나타날 수밖에 없다.
		
		float b1 = 3.14f; 		// 리터럴접미사 F, f : float 자료형
		double b2 = 3.14;		// 리터럴접미사x ==> 기본자료형 (double)
		
		System.out.println("----------------- 실수 자료형 예제 ------------------");
		double f;
		
		f = 5 / 4;			// 5 나누기 4 == 1인데 double f이니깐 실수형 1.0으로 나옴.
		System.out.println(f);
		
		f = (double) 5 / 4;	// 5를 먼저 double형으로 바꾸고 정수 4로 나누어도 실수가 나옴. (실수 / 정수 == 실수)
		System.out.println(f);
		
		f = (int) 5.5 + (int) 1.5;	// 뒤에꺼 계산하면 6, 이걸 double f하면 6.0이 나옴.
		System.out.println(f);
		
		

		//정밀도 확인
		System.out.println("--------------- 실수 자료형 - 정밀도 확인 예제 ---------------");
		float b3 = 0.123456789123456789F;
		double b4 = 0.1234556789123456789;
		System.out.println(b3);
		System.out.println(b4);
		System.out.println();
		
		
		// 3. 단일(한문자) 자료형
		// char : 2 byte 문자 저장 자료형
		// ASCII는 ANSI, 미국 국립 표준 협회에서 표준화 시킨 정보 교환용 7비트 부호체계
		
		// JAVA는 ASCII(아스키) 코드표와 유니코드표를 모두 사용
		// 유니코드는 전 세계의 모든 문자를 다룰 수 있는 표준 인코딩 방식(UTF-8, Unicode Transformation Format - 8bit)
		// 단일 문자 저장을 위해서 표준화된 ASCII 코드표를 참고하는데 문자 또는 숫자를 비트열로 저장된다.
		
		System.out.println("---------------- 단일 문자 자료형 예제 -------------------");
		char ch1 = 'A';
		char ch2 = '가';
		short ch3 = 'A';
		short ch4 = (short) '가';		// 범위
		System.out.println(ch1);
		System.out.printf("Ch1      : %c\n", ch1);
		System.out.printf("(int)Ch1 : %d\n", (int)ch1);
		System.out.printf("ch4      : %d\n", ch4);
		System.out.printf("(int)Ch2 : %d\n", (int)ch2); // 문자는 숫자로도 확인 가능함.
		
		
		// 4. 문자열 자료형
		// String : 클래스 자료형 --> 이후에 객체지향 파트에서 다시 설명
		
		System.out.println("------------------ 문자열 자료형 예제 ---------------------");
		
		String name = "홍길동";			// 참조변수 name에는
										// 문자열이 저장된 위치값(메모리주소)가 저장
		
										// 문자열 == 문자열 리터럴
										// 문자열 리터럴은 String Pool이라는 영역에 저장
										// String Pool은 Heap 메모리 영역 안에 위치함.
		System.out.println(name);
		
		
		
		String job = "java";
		String job2 = "java";
		
		
		
		System.out.printf("%x\n", System.identityHashCode(name));	// 자바가 이해하는 위치값 == 문자열 "홍길동"의 메모리 주소값
		System.out.println(job);
		System.out.printf("%x\n", System.identityHashCode(job));
		System.out.printf("%x\n", System.identityHashCode(job2));
										
		String s = "this is"; 		// 문자열을 쓰지 문자''형''(문자형 == 한 문자)을 쓰면 안됨.
		String s1 = "";				// 빈 문자열, 값이 있는데 빈 문자열
		String s2;
		String s3 = null;			// 값이 없음. == 아무것도 가리키고 있지 않음.
		String test = "test";	
		
		String result = s + " "  + test;	// 하나일 때는 ' '도 가능
		System.out.println(result);
		
		
		System.out.println(s1);
//		System.out.println(s2);	// ERROR
		System.out.println(s);
		
		// 5. 논리형 자료형
		
		// boolean : 1byte
		// true (참)
		// false(거짓)
		
		System.out.println("--------------------- 논리형 자료형 예제 -----------------------");
		
		boolean flag = true;
		System.out.println(flag);
		
		boolean flag2 = false;
		System.out.println(flag2);
		
		
		
		
	
		
		
		
	}
}
