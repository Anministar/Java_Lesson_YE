package Ch17;

import java.util.Arrays;

public class C02ArrayCopy {
	public static void main(String[] args) {
		
		int [] arr1 = {10, 20, 30};		// 직접 배열의 요소값을 초기화하면서
										// 3칸짜리 배열 초기화
		
		
		System.out.println(arr1);
		System.out.println(arr1.hashCode());
		System.out.println(System.identityHashCode(arr1));
		System.out.println(System.identityHashCode(arr1[0]));
		System.out.println(System.identityHashCode(arr1[1]));
		System.out.println(System.identityHashCode(arr1[2]));
		
		
		// 얕은 복사 (위치값 복사)
		int [] arr2 = arr1;			// 하나의 객체에다가 여러개의 참조변수르 연결할게 아니라면 실수하지 말라!
								
									// 얕은 복사 같은 경우는 위치값을 복사하는 것이다보니깐, arr1의 각 요소값을 변경하면
									// arr2의 요소값도 변경
									// 그렇기 때문에 만약에 하나의 객체 {10, 20, 30}이 저장된 배열을 말하는 거고		
									// 여기에 여러개의 참조변수를 연결하는 경우가 아니라면 얕은 복사를 사용하지 말라.
		
		int [] arr3 = new int[3];
		for(int i = 0; i < arr3.length; i++) {
			arr3[i] = arr1[i];		// 깊은 복사 (데이터값 복사)
		}
		
		// 깊은 복사
		int [] arr4 = Arrays.copyOf(arr1, arr1.length);		// 복사원본, 얼만큼 복사할지 길이
		
		
		System.out.println("arr1 : " + arr1);
		System.out.println("arr2 : " + arr2);
		System.out.println("arr3 : " + arr3);
		System.out.println("arr4 : " + arr4);
		
		
		arr2[0] = 100;
		arr2[1] = 200;
		arr2[2] = 300;
		
		
		for (int n : arr1) {
			System.out.println(n);
		}
		
		
		for(int n : arr4) {
			System.out.println(n);
		}
	}

}
