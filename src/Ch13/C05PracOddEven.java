package Ch13;
//프로그램은 sum 메소드를 통해 주어진 숫자들에 대한 홀수와 짝수의 합을 계산하고, 그 결과를 출력하는 간단한 프로그램입니다.
public class C05PracOddEven {
	public static int sum(int x, int y, int z, int w) {
    	
    	// x, y, z, w 각각 짝수 판별 후
    	// 짝수면 짝수의 합에 더하고
    	// 홀수면 홀수의 합에 더하고
    	
    	// 최종적으로 짝수의 합과 홀수의 합을 출력하고 x+y+z+w의 값을 반환하세요!!
    	
    	
//        int oddSum = 0, evenSum = 0;
//
//        if (x % 2 == 1) {
//            oddSum += x;
//        } else {
//            evenSum += x;
//        }
//
//        if (y % 2 == 1) {
//            oddSum += y;
//        } else {
//            evenSum += y;
//        }
//
//        if (z % 2 == 1) {
//            oddSum += z;
//        } else {
//            evenSum += z;
//        }
//
//        if (w % 2 == 1) {
//            oddSum += w;
//        } else {
//            evenSum += w;
//        }
//
//        System.out.println("짝수 합: " + evenSum);
//        System.out.println("홀수 합: " + oddSum);
//
        return x + y + z + w;
    }

    public static void main(String[] args) {
    	
    	// sum 메소드를 호출하여 인수로 20, 21, 12, 111을 전달하고 반환값을 변수에 저장 후 결과를 출력
    	
    	
    	
        int result = sum(20, 21, 12, 111);

        System.out.println("result = " + result);
    }
}
