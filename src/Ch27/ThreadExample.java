package Ch27;



class MyThread extends Thread {
	
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getId() + " Value " + i);
		}
		System.out.println();
	}
}


public class ThreadExample {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		thread1.start();
		
		MyThread thread2 = new MyThread();
		thread2.start();
		
		// 각 스레드는 고유한 ID를 가지며, 서로 다른 스레드가 병렬로 실행됨을 확인할 수 있음.
	}
	
	

}
