import java.util.Scanner;

public class Ch09 {
	public static void main(String[] args) {
		// 00 반복문
		// 반복적인 실행이 필요할 때 반복문을 사용함
		
		
		// 01 while문의 구조
		// 조건식이 참인 경우 반복적으로 코드를 실행한다.
		
		// while (조건) {
		//    반복 실행 코드;			// 예) 조건이 참이면 코드 실행
									//    조건이 거짓이면 반복문 종료
		// }
		
//		
//		System.out.println("------------------------- while문 예제 01 ------------------------------");
//		// 탈출용 변수
//		int i = 1;
//		
//		// 탈출용 조건식
//		while(i <= 10) {
//			System.out.println("Hello World");
//			i++;		// 탈출을 위한 연산식
//		}
//		
		System.out.println("------------------------ while문 예제 02 --------------------------------");
//		// 1부터 10까지의 합 구하기
//		int i = 1;
//		int sum = 0;
//		while(i <= 10) {
//			System.out.println("i = " + i);
//			sum += i;			// sum = sum + i;
//			i++;				// 후치연산
//		}
//		
//		
//		
//		System.out.println("while 종료 후 i의 값 = " + i);
//		System.out.println("1부터 10까지의 합 = " + sum);


        System.out.println("--------------- while문 예제 03 ---------------");
//      1부터 N(입력한 수)까지의 합 구하기    
//      출력예)
//      1부터 10까지의 합 : 55
        
        
//        int i = 1;      // 탈출용 변수
//        int sum = 0;    // 누적용 변수
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("정수 입력: ");
//        int num = scanner.nextInt();
//
//        while (i <= num) {
//            System.out.println("i의 값: " + i);
//            sum += i;
//            i++;
//        }
//
//        System.out.println("1부터 " + num + "까지의 합: " + sum);
        
        

        //문제
        System.out.println("--------------- while문 문제 01 ---------------");
        //정수 두개를 입력 받아(n,m) n부터 m까지의 합을 구하세요
        //이때 받는 수는 n이 m보다 작아야 합니다(제약조건)
              
              
//      		System.out.println("정수1을 입력하세요 >>> ");
//      		int num1 = scanner.nextInt();
//      		int num11 = num1;
//      		
//      		System.out.println("정수2를 입력하세요 >>> ");
//      		int num2 = scanner.nextInt();
//      		int num21 = num2;
//      		
//      		int sum1 = 0;
//      		
//      		if (num2 > num1) {
//      			while (num11 <= num2) {
//      				sum1 += num11;
//      				num11++;
//      			}
//      			System.out.printf("%d부터 %d까지의 합은 %d입니다.", num1, num2, sum1);
//      		}
//      		else if (num1 >= num2) {
//      			while (num21 <= num1 ) {
//      				sum1 += num21;
//      				num21++;
//      			}
//      			System.out.printf("%d부터 %d까지의 합은 %d입니다.", num2, num1, sum1);
//      		}
        
        
        // 02 do-while문의 구조
        
        // while문은 조건식이 거짓이면 실행 X
        // do - while문은 무조건 한번 실행 후 조건식 판별
        
//        do {							// 일단 해라.
//        	조건식 판별 전 실행할 코드;		// 조건식 상관없이 실행
//        	반복적으로 실행될 코드;			// 조건식에 따라 실행
//        } while(조건);		
        
//        System.out.println("----------------- do-while문 예제 -------------------");
//        Scanner sc = new Scanner(System.in);
//        int number;
//        do {
//        	System.out.println("양수를 입력하세요 >>> ");
//        	number = sc.nextInt();
//        	
//        	if (number <= 0) {
//        		System.out.println("잘못된 입력입니다. 다시 시도하세요.");
//        	}
//        } while (number <= 0);
//        
//        System.out.println("입력한 양수 : " + number);
        
        // 03 while - 무한 루프 이용하기
        System.out.println("----------------- while - 무한 루프 예제 --------------------");
        // 값을 사용자로부터 입력받아 모두 더하는 프로그램을 만들어보자!!
        // 값이 -1이라면 프로그램 종료  !!	
        
//       Scanner sc = new Scanner(System.in);
//       
//       int sum = 0; 	// 값 누적용
//       int num;			// 키보드 값 받기용
//       while(true) {
//    	   System.out.println("정수 입력 (종료는 -1입니다!) : ");
//    	   num = sc.nextInt();
//    	   
//    	   if (num == -1) {
//    		   break;
//    	   }
//    	   sum = sum + num;
//       }
//       System.out.println("누적된 총합 : " + sum);
        
        //04 while - if 문 삽입
        System.out.println("--------------- while - if문 삽입 예제 ---------------");
//        int i = 1, sum = 0, num = 0;
//
//        while (i <= 10) {
//            if (i % 3 == 0) {
//                System.out.println("i 값 : " + i);
//            }
//            i++;
//        }
        

        //문제 
        System.out.println("--------------- while - if문 문제 01 ---------------");
        //입력한 1부터 입력 수중(x)에 3의 배수의 합을 출력
//          Scanner scanner = new Scanner(System.in);
//          int i = 1;
//          int num = 0;
//          int sum = 0;
//          
//          System.out.print("수 입력 : ");
//          num = scanner.nextInt();
  //
//          while (i <= num) {
//              if (i % 3 == 0) {
//                  System.out.println("i값 : " + i);
//                  sum = sum + i;
//              }
//              i++;
//          }
//          
//          System.out.println("1부터 " + num + "까지 수중 3의 배수의 합 : " + sum);
        
        
        
        
        //문제 
        System.out.println("--------------- while - if문 문제 02 ---------------");
        //-1을 입력하기전까지 계속 정수를 받습니다
        // 그리고 입력한 수중의 짝수의합과 홀수의 합을 따로 구해서 출력
          
//          Scanner scanner = new Scanner(System.in);
//          int num = 0;    // 키보드 값 받기
//          int sum1 = 0;   // 짝수 합 저장용
//          int sum2 = 0;   // 홀수 합 저장용
  //
//          while (true) {
//              System.out.print("정수 입력(종료 : -1) : ");
//              num = scanner.nextInt();
  //
//              if (num == -1) {
//                  break; // while 탈출
//              } else if (num % 2 == 0) {
//                  // 입력한 수가 짝수일때 처리
//                  sum1 += num;
//              } else {
//                  // 입력한 수가 홀수일때 처리
//                  sum2 += num;
//              }
//          }
  //
//          System.out.println("짝수의 합 : " + sum1);
//          System.out.println("홀수의 합 : " + sum2);
        
        
        
        
        //문제
        //1부터 100까지 수중에 3의 배수이면서 4의 배수를 출력합니다
        System.out.println("--------------- while - if문 문제 03 ---------------");
//          int i = 1;
  //
//          while (i <= 100) {
//              if (i % 3 == 0 && i % 4 == 0) {
//                  System.out.println("i 값: " + i);
//              }
//              i++;
//          }
          
          
          
          
        //문제
        System.out.println("--------------- while - if문 문제 04 ---------------");
       // 소수를 판별하는 코드를 만드세요
       // 소수 : 1과 자기자신으로만 나누어떨어지는 수 , % 연산자사용합니다)
          
//          Scanner scanner = new Scanner(System.in);
//          System.out.print("정수 입력: ");
//          int num = scanner.nextInt();
  //
//          int i = 1;
//          int cnt = 0; // 0으로 나누어떨어지는 횟수 저장
  //
//          while (i <= num) {
//              // 소수: 1과 자기 자신으로만 나누어떨어짐 (2번 나누어떨어짐)
//              // 17: 17 % 1 == 0, 17 % 17 == 0 // -> 2번만
//              // 4: 4 % 1 == 0, 4 % 2 == 0, 4 % 4 == 0 // -> 2번 이상
  //
//              if (num % i == 0) {
//                  // 2번만 진입해야 소수
//                  cnt++;
//              }
  //
//              i++;
//          }
  //
//          if (cnt == 2) {
//              System.out.println(num + "는 소수입니다");
//          } else {
//              System.out.println(num + "는 소수가 아닙니다");
//          }
  //
//          scanner.close();
        
        
        
        
        // 05 continue 예약어
        
        System.out.println("-------------------------- while - continue 예제 --------------------------");
        //  1부터 10까지의 수 중에 3의 배수를 제외하고 출력
        int i =1;
        while(i <= 10) {
        	if(i % 3 == 0) {
        		i++;
        		continue;		//근접한 반복문의 조건식으로 돌아감
        	}
        	System.out.println("i = " + i);
        	i++;
        }
        
       
       
       
       
        
        
        
        
        
        
        
		
	}

}
