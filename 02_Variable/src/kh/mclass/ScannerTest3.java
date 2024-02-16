package kh.mclass;

import java.util.Iterator;
import java.util.Scanner;

public class ScannerTest3 {
	public static void main(String[] args) {
		// swap 코드
		int a = 10;
		int b = 20;

		int t = a; // t : 10
		a = b; // a : 20, b : 20
		b = t; // b:10

		int[] arrInt = new int[] { 3, 2, 5, 8, 1 };
		int temp = arrInt[0];
		arrInt[0] = arrInt[1];
		arrInt[1] = temp;
		for(int i = 0 ; i<arrInt.length; i ++) {
			System.out.print(arrInt[i] + ",");
		}

		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
			}
			System.out.println();
		}

	}
}
