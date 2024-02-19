package kh.mclass;

import java.util.Scanner;

public class ScannerTest2 {
	public static void main(String[] args) {

		// 별찍기
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j >= i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두개를 띄워쑤기와 함께 입력");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a);
		System.out.println(b);

	}
}