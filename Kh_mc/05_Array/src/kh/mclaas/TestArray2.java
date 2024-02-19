package kh.mclaas;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class TestArray2 {
	public static void main(String[] args) {

//		int a = 10;
//		int b;
//		b = 20;
//
//		int[] arr1 = new int[] { 10, 20, 30, 40 };
//		int[] arr2 = new int[] { 1, 2, 3, 4, 5, 6 };
//		// 개인 실습 for()
//		System.arraycopy(arr1, 2, arr2, 1, 2);
//		System.out.println(arr2);
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]);
//
//		}
//		int v1 = 100;
//		double v2 = 5.3;
//		String v3 = "자료형에 따라 접근 가능 메소드";
//		int[] v4 = new int[] { 10, 20 };
//		String[] v5 = new String[] { "기호", "주의" };
//
//		System.out.println(v3.charAt(3));
//		System.out.println(v5.clone());
//		System.out.println(v3.substring(2, 6));
//
//		String str = "10";
//		int num = Integer.valueOf(str);
//		System.out.println(num + 3);
//		double d = Double.valueOf(str);
//		System.out.println(d);

		int[][] array20 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } }; // [2][4]
		int[][] array21 = { { 1, 2, 3, 4 }, { 5, 6, 7 } }; // 가변 배열[2][3] 더 많은 수 기준
//		System.out.println(array21[1][2]);
		int[][] array22 = { { 1, 2, 3 }, { 5, 6, 7 } }; // [2][3]
		int[][] array23 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		int[][] array24 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

		System.out.println(array21.length); // 행크기, m
		System.out.println(array21[0].length); // 행[0]의 열크기, n
		System.out.println(array21[1].length); // 행[1]의 열크기, n
		for (int m = 0; m < array21.length; m++) { // 행크기
			for (int n = 0; n < array21[m].length; n++) { // 행[m]의 열크기
				System.out.println(array21[m][n]);

			}

		}
		// ----- 2차원 가변 배열 -----
	}
}
