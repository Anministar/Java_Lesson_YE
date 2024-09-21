package Ch14;


// Moonbanggu 클래스를 완성해주세요!! ==> 부모 클래스
// 속성 : 샤프재고량(SharpenCnt), 연필재고량(PencilCnt) 
// 기능 : write()를 가짐

// Sharpen 클래스를 완성해주세요!!    ==> 자식 클래스
// Pencil 클래스를 완성해주세요!!	    ==> 자식 클래스

class Moonbanggu {
	
	public int SharpenCnt = 100;
	public int PencilCnt = 100;
	
}

class Sharpen extends Moonbanggu {
	public Sharpen() {
	
		SharpenCnt--;
	}
	
}


class Pencil extends Moonbanggu {
	public Pencil() {
		PencilCnt--;
	}
}


public class C06Prac {
	public static void main(String[] args) {
		
		Sharpen item1 = new Sharpen();				// 샤프 재고가 1씩 감소해야 함.
		Pencil item2 = new Pencil();				// 연필 재고가 1씩 감소해야 함.
													// ==> 객체 생성시 재고가 1씩 감소하는 로직을 가져야함.
		C06Prac.Writing(item1);	 					//"샤프로 씁니다" 가 출력
		C06Prac.Writing(item2); 					//"연필로 씁니다" 가 출력 
		C06Prac.ShowInfo();							// 샤프재고량 : 99, 연필재고량 : 99
	}
}
