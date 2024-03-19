package memo;

import java.util.Scanner;

public class Nakseo2 {
	public static void main(String[] args) {
		System.out.println("숫자");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int leg = num / 3;
		int[] arr = new int[leg];
		for (int i = 1; i < arr.length; i++) {
			arr[i] = i * 3;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(arr.length);

	}
}
