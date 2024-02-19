package kh.mclass;

public class ProducerConsumerTest {
	public static void main(String[] args) {
		Buffer buffer = new Buffer();

		Producer pd = new Producer(buffer);
		Thread cs = new Thread(new Consumer(buffer));

		pd.start();
		cs.start();

	}
}
