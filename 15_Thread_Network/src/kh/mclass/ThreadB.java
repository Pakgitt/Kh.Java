package kh.mclass;

public class ThreadB implements Runnable {

	@Override
	public void run() {
		System.out.println("TreadB 시작");
		for (int i = 0; i < 30; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println();
		}
	}
}
