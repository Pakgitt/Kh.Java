package kh.academy;

public class ImportTest2 {

//	void method3(); //선언만 한것

	public static void method1() {
		System.out.println("하윙");
		long result = methodSum(3, 5);
		System.out.println(result);
		// return; // 대체로 작성 X
	}

	public static long methodSum(int x1, int x2) {
		// return 4L;
		return (long) x1 + x2;
//		System.out.println();
	}
	// 호출

	public static void main(String[] args) {
		System.out.println("메소드 첫걸음");
		method1();
		long result = methodSum(1, 3);
		// x1 = 1;
		// x2 = 3;
		System.out.println(result);

		result = methodSum(111111111, 333333333);
		// x1 : 11111111
		// x2 : 333333333
		System.out.println(result);
		return;

	}
}
