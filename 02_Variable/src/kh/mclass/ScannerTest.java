package kh.mclass;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {

		// 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		// 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화해라
		// 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int sum;
		int arrayInt = sc.nextInt();

		int[] num = new int[arrayInt];
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + "번째 인덱스에 넣을 값 : ");
			int inputInt = sc.nextInt();
			num[i] = inputInt;

		}
		System.out.println(Arrays.toString(num));

	}
}
