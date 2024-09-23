package Ch17;

import java.util.Scanner;

// 00 배열(Array)
// 배열이란? : 연관된 데이터를 각각의 인덱스 번호를 할당하여 나열한 자료 구조 형태.
//  인덱스 	0    1    2     3     4    5    6 
//  자료 	  [12,  123,  231,  153,  76,  48,  126]
// 이때 배열의 인덱스 번호로 배열 안의 자료(데이터)에 접근할 수 있다.


// Index는 '색인' 이라는 뜻을 지니는데
// 이때 색인이란 필요한 정보를 쉽게 찾을 수 있도록 하는 것
// 예로 들자면 책의 인덱스, 즉 목차를 말함.


// 01 배열의 필요성
// 예를 들어 병원에 환자의 번호를 매겨야할 때를 가정해보자.
// int patient01;
// int patient02;
// int patient03;
// ...

// int patient9999;

// 이런식으로 여러번 같은 작업을 반복해야하는데
// 배열을 사용한다면

// int[] patient = new int[9999];			// 크기가 9999이고 자료형이 int 자료형인 정수 배열 patient 선언
											// 인덱스 0부터 9998까지의 정수를 담을 수 있음.
// 이런식으로 간단하게 정리할 수 있기에 배열은 꼭 필요한 자료구조이다.

// 즉, 배열은 인덱스(index)를 사용하면 각 요소에 대한 접근이 용이하다.

// patient[0] = 10;				// patient 배열의 첫번째 요소에 10을 저장
// patient[12] = 100; 			// patient 배열의 열세번째 요소에 100을 저장

// 인덱스는 0부터 시작이기 때문에 0이 첫번째 요소임.


public class C01ArrayBasic {
	public static void main(String[] args) {
		// 길이가 5인 int형 1차원 배열의 생성
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr1 = new int[5];
		
		arr1[0] = sc.nextInt();
		arr1[1] = sc.nextInt();
		arr1[2] = sc.nextInt();
		arr1[3] = sc.nextInt();
		arr1[4] = sc.nextInt();
		
		// 기존
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		
		
		// 추가(컬렉션에도 적용가능)
		// 배열 순회 (forEach 루프 사용)
		for(int val : arr1) {
			System.out.print(val + " ");
		}
		System.out.println();
		
		
		
		// 길이가 7인 double형 1차원 배열의 생성
		double[] arr2 = new double[7];
		
		// 배열의 참조변수와 인스턴스 생성 분리
		float[] arr3;
		arr3 = new float[9];
		
		// 배열의 인스턴스 변수 접근
		System.out.println("배열 arr1 길이 : " + arr1.length);
		System.out.println("배열 arr2 길이 : " + arr2.length);
		System.out.println("배열 arr3 길이 : " + arr3.length);
	}

}
