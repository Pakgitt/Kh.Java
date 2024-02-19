package kh.mclass;

public class TestThread {
	public static void main(String[] args) {

		System.out.println("Main Thread 시작");
		// 새 일꾼 만들기
		ThreadA ta = new ThreadA();
		ta.start(); // 일꾼 ta가 run 부분을 독립적으로 실행함.
//		ta.setPriority(99);
		// ta.method1(); == main thread가 하는 일
		Thread tb = new Thread (new ThreadB());	// implements Runnable 사용시 
		tb.start();
//		tb.setPriority(1);

		System.out.println("Main Thread 종료");
	}

}
