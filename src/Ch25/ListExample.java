package Ch25;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;								// java.util 패키지 안에 ArrayList 클래스가 존재

public class ListExample {
	public static void main(String[] args) {
		// ### [ArrayList] ###
		// : 크기가 동적으로 조절되며 배열 기반의 리스트
//		
//		List<String> myList = new ArrayList<>();	// ArrayList 객체와 상위 클래스 List의 연결
//		// new List<>();	이렇게는 왜 만들어요??
//		// ==> 그 이유는 List라는 자료구조가 Interface이기 때문이예요!
//		
//		// 1. 원소 추가
//		myList.add("Apple");
//		myList.add("Banana");
//		myList.add("Cherry");
//		
//		// 2. 원소 조회
//		System.out.println("List의 두번째 원소 : " + myList.get(1));
//		
//		// 3. 원소 삭제
//		myList.remove("Banana");
//		
//		System.out.println("List의 두번째 원소 : " + myList.get(1));
//		
//		// 4. 원소 접근 및 수정
//		String firstElement = myList.get(0);			// 첫번째 원소에 접근
//		System.out.println("firstElement : " + firstElement);
//		
//		// 수정
//		myList.set(1, "Grapes");						// 두번째 원소의 값을 "Grapes"로 수정
//		System.out.println("secondElement : " + myList.get(1));
//		
//		// 5. 리스트 크기 및 순회
//		int size = myList.size();
//		System.out.println("myList의 size(크기)는 : " + size + "입니다.");
//		
//		
//		// ArrayList의 순회 : 방법 1
//		for (String element : myList) {
//			System.out.println(element);
//		}
//		
//		// ArrayList의 순회 : 방법 2
//		for (int i = 0; i < myList.size(); i++) {
//			System.out.println(myList.get(i));
//		}
//		
//		// 6. 리스트 전체 출력
//		System.out.println(myList); 			// 리스트의 전체 요소 출력
//		
//		int [] arr = {1,2,3,4,5};
//		System.out.println(arr); 				// 식별주소값
//		
//		
		
		// ### [Linked List] ###
		// : 노드들로 이루어진 선형 데이터 구조 	
		
		// LinkedList 객체 생성
		LinkedList<String> linkedList = new LinkedList<>();
		
		// 1. 원소 추가
		linkedList.add("Apple");
		linkedList.add("Banana");
		linkedList.add("Cherry");
		
		// 2. 원소 추가 (처음과 끝)
		linkedList.addFirst("Orange");
		linkedList.addLast("Grapes");
		
		
		// 3. 전체 요소 출력
		System.out.println(linkedList);
		
		// 4. 원소 삭제
		linkedList.remove("Banana");
		
		// 5. 원소 삭제 (처음과 끝)
		linkedList.removeFirst();
		linkedList.removeLast();
		
		System.out.println(linkedList);
		
		// 6. 원소 접근 수정
		String Element = linkedList.get(1);
		System.out.println(Element);
		
		// 원소 수정
		linkedList.set(1, "Mango");
		
		System.out.println(linkedList);
		
		// 7. 리스트 크기 및 순회
		int size = linkedList.size();
		System.out.println(size);
		
		// LinkedList의 순회 : 방법 1
		for (String element : linkedList) {
			System.out.println(element);
		}
		
		// LinkedList의 순회 : 방법 2
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}
		
		
		
	}

}
