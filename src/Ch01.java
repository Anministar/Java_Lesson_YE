
// ### 프로그래밍이란 ###
// 1. 프로그램 (Program) : 프로그램 언어로 이루어진 명령들의 집합
// ==> 컴퓨터의 프로그램을 작성하는 일 == 프로그래밍
// 즉, 컴퓨터에게 수행할 작업을 지시하는 과정으로, 특정 프로그래밍 언어를 사용하여 인간의 의도를 컴퓨터가 이해하고 실행할 수 있는 코드로 표현하는 것을 말함.

// 2. 프로그램 언어 : 컴퓨터 시스템을 구동시키는 소프트웨어를 작성하기 위한 형식언어임.
// ==> 컴퓨터와의 대화에 사용되는 대화 수단


// ### JAVA의 실행과정 ###
// 1. 한글, 영어 등등 Source Code 작성

// 2. Compiler에 의한 Byte Code 변환 ( 기계어로 변환 X, .java File --> .class File )
// 	++) 컴파일(Compile)이란?
//		: 저 / 고급 언어로 작성된 프로그램을 기계어로 번역하는 것

//	++) 저급언어(low-level language) 
//		: 기계어(바이너리 데이터), 어셈블리어(기호, 신호처럼 기호화해서 만들어진 언어)
// 		: 사람이 처리하기(이해하기) 어려운 언어가 저급언어에 속함.

//	++) 고급언어(high-level language)
//		: C, C++, C#, Python, Java, Dart etc..
//		: 사람의 용어, 사람 친화적인 언어(영어, 한국어 등등)
//		: 사람이 봤을 때 보기 편한 형태로 되어있는 프로그래밍 언어를 말함.

// 3. JVM(Java Virtual Machine, 인터프리터)을 통해 바이트 코드를 실행
//		: JVM은 자바 프로그램이 어떤 운영체제에서든 동일하게 실행될 수 있도록 해주는 인터프리터 역할을 함
//		: JVM의 역할은 메모리 관리, 가비지 컬렉션 등 프로그램이 안정적으로 실행되도록 도와줌.

// 4. RUN(실행)


// 추가사항)
// 대부분의 프로그램 언어의 실행과정은
// 1. Source Code 작성

// 2. Compiler(해석기) Or Interpreter(인터프리터 == 해석기)에 의한 즉시 실행
//	++) Interpreter (인터프리터) : 소스 코드를 한 줄씩 읽고, 그 즉시 실행하는 프로그램, 프로세스
//							  : 별도의 컴파일 과정 X, 플랫폼 의존성 ↓, 디버깅에 유리

// 3. Debugger(오류검사기)를 사용한 오류 검사 및 수정
//	++) 디버거(Debugger)이란?
//	    : 버그 == 벌레, 시스템에서의 버그의 의미 == 오류
//		: 디버그 == 벌레를 잡는 행위, 시스템에서의 디버그의 의미 == 오류를 잡는 행위
//		: 즉, 프로그램의 오류나 비정상적인 연산 등의 오류를 발견하고 그 원인을 밝혀서 개발자에게 알려주는 행위
// 4. Run(실행)


// ### JDK와 JRE의 차이점 ###
// 1. JRE(Java Runtime Environment) : 자바 프로그램을 실행하기 위한 라이브러리, JVM, 기타 컴포넌트 제공, 프로그램 실행만 하고 개발은 하지 않는 환경

// 2. JDK(Java Development Kit) : JRE + 자바 개발에 필요한 컴파일러, 디버거와 같은 도구를 추가


// ## 기본적인 Eclipse 단축키 ##
// ctrl + space 	: 자동완성
// ctrl + F11   	: 실행
// ctrl + (+ or -)  : 글자 크기 조정
// ctrl + n     	: 파일 생성 시 선택창
// ctrl + /			: 주석 단축키




// 01 JAVA 주석

// 주석 : 프로그램 코드 내에 삽입된 사용자의 메모를 의미.
// ==> 코드 실행 결과에는 아무런 영향을 끼치지 않음.

// 쓰는 이유 : 1. 개발을 하다보면 코드 섹션(함수의 몸체)에 대한 설명이 필요함.
//			2. 협업할 때, 다른 개발자와의 의사소통에 필요.

// # 주석 사용법 #
// //	   : 주석
// /* */   : 여러 줄 주석
// 단축키    : ctrl + /



// 02 JAVA의 기본구조
public class Ch01 {						// 클래스 영역 - 객체 지향 코드 구현 단위
	// public class Ch01 : 1. 하나의 public 클래스로 시작.
	//					 : 2. 클래스는 파일 이름과 동일해야 함.
	//					 : 3. 그 내부에 main 메서드가 포함될 수 있음. Main 메서드는 클래스안에 있어야만 함.


	public static void main(String[] args) {			// 메서드 영역 - 절차 지향 구현 단위, main 메서드의 선언부
		
		
		// ## 메서드의 정의와 종류 ##
		// 0. 메서드(기능) 			: 특정 기능  수행, C언어의 함수 개념과 유사
		// 1. 메인 메서드			: 최초 실행되는 함수
		// 2. 라이브러리 메서드		: 개발편의를 위해서 미리 만들어져 제공되는 함수
		// 3. 사용자 정의 메서드		: 개발자가 정의한 (만든) 함수
	
		System.out.println("Hello, World !"); 		// 출력 함수(메서드) 실행, function call이라고 함.
													// ';' : 코드의 마침표 역할
													// 모니터에 우리가 작성한 텍스트를 console창에 출력하는 역할(기능)
		
		
		// 03 ESCAPE 문자
		
		// '정보 표시' 목적으로 사용된 기존 그래픽 문자 (영소문자, 숫자, 특수문자)와는 다르게
		// '제어' 목적으로 사용되는 특수문자
		
		// \(역슬래쉬)를 앞에 붙여 사용
		
		// 1. \n : 개행(줄바꿈)
		// 2. \t : Tap Key의 약어
		// 			--> 탭키만큼 칸 이동 ( 8칸 )       
		
		// 3. \' : '(작은 따옴표) 출력
		// 4. \" : "(큰 따옴표) 출력
		// 5. \\ : \ 출력 ( 폴더 경로 구분 시 잘 사용됨 )
		
		System.out.print("여기여기\n");
		System.out.println("Hello, World!");
		System.out.println("This is a new line.\n Second line\twith a tab");
		System.out.println("Single quote : \'\tDouble quote : \"");
		System.out.println("Backslash \\");
		
		// ----- 결과 예상 -----
//		여기여기
//		Hello, World!
//		This is a new line.
//		 Second line	with a tab
//		Single quote : '	Double quote : "
//		Backslash \
		// -------------------
		
		
		// ## 표준 출력 함수 ##
		// System.out			: 표준 출력 스트림
		// System.out.print()	: 줄바꿈 X
		// System.out.println() : 줄바꿈 O (포함, ln = \n)
		// System.out.printf()	: 서식문자를 사용할 수 있는 출력 메서드, printf의 의미(format : 형식, 서식)
		
		System.out.println("---------------------------------------- 표준 출력 함수 예제 ----------------------------------------");
		System.out.print("Hello world\n");
		System.out.print("He\tllo world\n");
		System.out.println("Hello world\n");
		System.out.println();					// console창에 빈 줄 (줄바꿈) 추가
		
		// 서식이란?	: 서류를 꾸미는 일정한 양식
		// 서식문자란? : 서식공간에 자료를 대입하여 화면에 출력하거나 입력받기 위한 용도의 문자
		//			: ==> 자리를 지정해주는 문자
		// %d : decimal의 약자			10진수(정수) 서식문자
		// %f : float의 약자				10진수(실수) 서식문자
		// %c : character의 약자			한문자 서식문자
		// %s : String의 약자				문자열 서식문자
		// %o : Octal의 약자				8진수(정수) 서식문자
		// %x : Hexadecimal의 약자		16진수(정수) 서식문자
		
		System.out.println("-------------- 서식문자 예제 ----------------");
		System.out.println("--- 정수 ---");
		System.out.printf("%d \n" , 100);
		System.out.printf("%d \n", 100 + 200);
		System.out.printf("%d %d %d \n", 1, 2, 3);
		
		System.out.println("--- 실수 ---");
		System.out.printf("%f \n", 123.5);
		System.out.printf("%f %f %f \n", 1.1, 2.1, 3.1);
		// 소수점 제한 : %.2f : 소수점 둘째 자리까지 출력
		System.out.printf("%.2f\n", 3.141591123);
		
		
		// '' 안에는 하나의 문자만 컴파일러가 해석하는거라 한 문자 이상이면 에러
		System.out.println("--- 한문자 ---");
		System.out.printf("%c %c %c \n", 'A', 'B', 'C');
		
		// 단어, 문장
		System.out.println("--- 문자열 ---");
		System.out.printf("%s %s %s \n", "This is", "JAVA", "Class");
		System.out.printf("%d.%s : %d\n", 1, "국어", 100);
		System.out.println();
		
		
//		 문제 01)
//		다음과 같이 출력 합니다.
//		NO	이름			나이		성별		주소
//		1	이동하		26		M		대구
//		2	코리아		12		W		대구
//		3	IT			32		M		대구
	
		

		// 문제 02
		// 서식문자를 사용하여 다음과 같은 결과값을 출력해보세요 !!
		// 
		// [결과값]
		// 이름 : 이동하
		// 나이 : 12
		// 성별 : M
		// 키   : 192.200000
		// 주소 : "대구광역시 중구 중앙대로 366 9층"
	
	

	}

}
