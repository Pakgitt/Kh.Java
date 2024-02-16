package kh.mclaas;

public class TestArray3 {
	public static void main(String[] args) {
//		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
// 
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.println(arr[i][j]);
//			}
//				System.out.println();
//		}
//		int[][] arr2 = new int [5][2];
//		
//		
//		for(int i=0; i<arr2.length; i++) {
//			for(int j=0; j<arr2[i].length; j++) {
//				System.out.println(arr2[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println(arr2.length);
//		System.out.println(arr2[0].length);
//		
//		int a = 3;
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = i + 1;
//		}
		int[] arr6 = new int[5];
		// 표현 1
		for (int i = 0; i < arr6.length; i++) {
			arr6[i] = i + 1;
			System.out.print(arr6[i]);
			if (i < arr6.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();

		// 표현 2
		int[] arr62 = new int[5];
		for (int i = 0; i < arr62.length; i++) {
			arr62[i] = i + 1;
			System.out.print(arr62[i]);
			if (i == arr62.length - 1) {
				break;
			}
			System.out.print(", ");
		}
		System.out.println();

		int[][] arr = new int[5][3];
		for (int m = 0; m < arr.length; m++) {
			for (int n = 0; n < arr[m].length; n++) {
				arr[m][n] = (m + 1) * 10 + n + 1;
				System.out.print(arr[m][n] + "\t");
			}
			System.out.println();

		}
	}
}
