package kh.mclass;

public class TestBubbleSort {
	public static void main(String[] args) {

//		Integer[] arr = new Integer[] { 3, 5, 2, 7, 1, 4 };
		Double[] arr = new Double[] { 3.6, 5.4, 2.6, 7.8, 1.2, 4.2 };

		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - 1 - j; i++) {
				// if( arr[i] < arr[i+1]) { // 내림차순
				if (arr[i] > arr[i + 1]) { // 오름차순
					// swap
//					int temp = arr[i];
					double temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;

				}

			}
			new TestBubbleSort().printArray(arr); // printArray메소드에 static을 사용하지 않을때
//			printArray(arr);
		}
//		System.out.print("[");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + ",");
//		}
//		System.out.println();
	}

//	public static void printArray(Object[] arr) {
	public void printArray(Object[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println("]");

	}

}
