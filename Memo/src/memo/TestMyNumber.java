package memo;

import java.util.Random;
import java.util.Scanner;

public class TestMyNumber {
	public void ex4() {

//	   4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
//    	아래의 내용처럼 처리하세요.

		int[][] arr = new int[4][4];

		arr[0][0] = 6;
		arr[0][1] = 6;
		arr[0][2] = 1;

		arr[1][0] = 4;
		arr[1][1] = 10;
		arr[1][2] = 8;

		arr[2][0] = 8;
		arr[2][1] = 6;
		arr[2][2] = 5;

		for (int i = 0; i < arr.length - 1; i++) {

			arr[0][3] += arr[0][i];
			arr[1][3] += arr[1][i];
			arr[2][3] += arr[2][i];

		}
		for (int j = 0; j < arr.length - 1; j++) {
			arr[3][0] += arr[j][0];
			arr[3][1] += arr[j][1];
			arr[3][2] += arr[j][2];
		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[3][3] += arr[i][j];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();

		}
	}

	public static void ex5() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("행 : ");
		int row = sc.nextInt();
		System.out.println("열 : ");
		int clo = sc.nextInt();

		char[][] arr2 = new char[row][clo];
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = (char)(rd.nextInt(26) + 65);
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
			
		}
		
	}

	public static void main(String[] args) {
		ex5();
	}
}
