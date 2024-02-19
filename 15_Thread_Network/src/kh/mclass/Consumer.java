package kh.mclass;

public class Consumer implements Runnable {
	private Buffer buffer;

	public Consumer(Buffer drop) {
		this.buffer = drop;
	}

	public void run() {

		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			int data = buffer.get();
			System.out.println("소비자 : " + i + "번 케익을 구구");
			try {
				Thread.sleep((int) Math.random() * 100);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}

		}

	}

}
