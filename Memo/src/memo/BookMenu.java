package memo;

public class BookMenu {
	public static void main(String[] args) {

		int[][] arr = new int[8][8];
		int count = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count++;
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}

	}
}
