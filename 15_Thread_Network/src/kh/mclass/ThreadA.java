package kh.mclass;

public class ThreadA extends Thread {

	@Override
	public void run() {
		System.out.println("여기 ThreadA가 독립적으로 하는 일");
		for (int i = 2; i < 10; i++) {
			System.out.println("단단단");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "X" + j + "=" + i * j);
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("=============");
		}
	}

	public void method() {
		System.out.println("ThreadA - method1()");
	}

}
