package Ch17;

public class prac {

    public static void main(String[] args) {
        // 문제 01
        // 5개의 정수를 저장할 수 있는 배열을 선언하고 모든 요소를 0으로 초기화하고 배열을 출력합니다.
        int[] array1 = new int[5];
        printArray(array1);

        // 문제 02
        // 5개의 정수를 저장할 수 있는 배열을 선언하고 사용자로부터 5개의 정수를 입력받아 배열에 저장하고 배열을 출력합니다.
        int[] array2 = new int[5];
        inputArrayValues(array2);
        printArray(array2);

        // 문제 03
        // 10개의 정수를 저장할 수 있는 배열을 선언하고 배열을 역순으로 초기화하고(사용자로 부터 값을 입력받는 것 X, 9876543210 이 값을 차례로 넣으면 됨, 직접 대입 X) 배열을 출력합니다.
        int[] array3 = new int[10];
        initializeReverseArray(array3);
        printArray(array3);

        // 문제 04
        // 3명의 학생의 시험 점수를 저장하는 배열을 선언하고, 사용자로부터 점수를 입력받아 배열에 저장하고 평균 점수를 출력합니다.
        int[] studentScores = new int[3];
        inputStudentScores(studentScores);
        double averageScore = calculateAverage(studentScores);
        System.out.println("평균 점수: " + averageScore);

        // 문제 05
        // 정수로 이루어진 배열을 선언하고, 배열에 저장된 모든 정수의 합을 계산하여 출력합니다.
        int[] numbersArray = {3, 7, 2, 8, 5};
        int sum = calculateSum(numbersArray);
        System.out.println("배열의 합: " + sum);
    }
    
    

    // 배열 출력 메서드
    public static void printArray(int[] arr) {
        System.out.print("배열 출력: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // 배열에 사용자로부터 값을 입력받는 메서드
    public static void inputArrayValues(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    // 배열을 역순으로 초기화하는 메서드
    public static void initializeReverseArray(int[] arr) {
    	Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = arr.length - 1 - i;
//        }
        
    	System.out.println("10개의 정수를 입력하세요:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    	
        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            // 배열의 앞과 뒤에서부터 값을 교환
            int temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }
        
        
    }

    // 학생 점수 배열에 값을 입력받는 메서드
    public static void inputStudentScores(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("3명의 학생의 시험 점수를 입력하세요:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("학생 " + (i + 1) + "의 점수: ");
            arr[i] = scanner.nextInt();
        }
    }

    // 배열의 평균을 계산하는 메서드
    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return (double) sum / arr.length;
    }

    // 배열의 합을 계산하는 메서드
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }
}
