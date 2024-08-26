
public class Ch08 {
	public static void main(String[] args) {
		// 00 Swithc문 (다중 분기)
		// 조건문 중 하나
				// 조건이 여러개일 때 각 조건에 따른 코드를 실행할 수 있음.
				
				
				// 01 Switch문 구조

				//switch (변수) {
				//case 값1:					// case는 여러개일 수 있다.
//											// case == if문이면서 else if문이기도 함.
//					실행할 코드1;
//					break;					// 위 코드를 실행 후 break;를 만나면 Stop역할
				// 
				//case 값2:					// 얘는 else if니깐 :)
//					실행할 코드2;
//					break;
				// 
				//default:					// else문(case의 조건에 부합하지 않을 시 나머지 처리)
//					break;
				//}
				
				System.out.println("--------------- switch문 예제 01 ---------------");
				Scanner scanner = new Scanner(System.in);
				System.out.print("한개의 정수를 입력해주세요 >>> ");
		        int num = scanner.nextInt();

		        switch (num) {
		            case 1:
		                System.out.println("[SYSTEM] : num이 1인 경우에 실행되는 코드입니다.");
		                break;
		            case 2:
		                System.out.println("[SYSTEM] : num이 2인 경우에 실행되는 코드입니다.");
		                break;
		            case 3:
		                System.out.println("[SYSTEM] : num이 3인 경우에 실행되는 코드입니다.");
		                break;
		            default:
		                System.out.println("[SYSTEM] : 1, 2, 3 이외의 모든 경우에 실행되는 코드입니다.");
		                break;
		        }

		        System.out.println("Switch문, 즉 다중분기문을 종료하겠습니다.");
		        System.out.println();
//		        scanner.close();
	}

}
