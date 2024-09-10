package Ch13;

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	//문제
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

	//1. Computer 클래스를 완성하세요
	//2. SerialNo, CPUSpec, RAMSpec, DISKSpec 네가지 속성을 정의해주세요!
	//3. powerON() 메서드를 통해 전원을 킨다는 정보를 출력하는 메서드를 만들어주세요
	//4. ShowInfo() 메서드를 통해 컴퓨터 정보를 출력하는 메서드를 만들어주세요
	//5. powerOFF() 메서드를 통해 전원을 끈다는 정보를 출력하는 메서드를 만들어주세요
class Computer {
	String SerialNo;
	String CPUSpec;
	String RAMSpec;
	String DISKSpec;
	
	// 접근제어자  		반환자료형			 메서드명 			( 매개변수 )
	public void PowerON()	{
		System.out.println(SerialNo + "컴퓨터의 전원을 켭니다");
	}
	
	public void ShowInfo() {
		System.out.println("[SYSTEM] : Computer Information");
		System.out.println("시리얼넘버 : " + SerialNo);
		System.out.println("CPU : "  + CPUSpec);
		System.out.println("RAM : "  + RAMSpec);
		System.out.println("DISK : "  + DISKSpec);
		
	}
}

public class C04PracComputer {
	
	public static void main(String[] args) {

		Computer LGGram1010 = new Computer();
		LGGram1010.SerialNo = "LG-12345";
		LGGram1010.CPUSpec = "I5";
		LGGram1010.RAMSpec = "16GB";
		LGGram1010.DISKSpec = "2TB";
		
		LGGram1010.PowerON();				// LG-12345 컴퓨터의 전원을 켭니다.
		System.out.println();
		
		LGGram1010.ShowInfo();				// [SYSTEM] : Computer Information 
											// 시리얼넘버 : LG-12345
											// CPU : I5
											// RAM : 16GB
											// DISK : 2TB
		System.out.println();
		
//		LGGram1010.PowerOFF();				// LG-12345 컴퓨터의 전원을 끕니다.

	}
}
