package kh.mclaas;

import java.util.Iterator;
import java.util.Scanner;

public class TestArray {
	public static void main(String[] args) {

		// 배열 Array : 같은 자료형으로 여러개의 변수를 선언할때 사용.
		// *** 중요 *** 배열의 크기를 할당 받아야 사용할 수 있음
		// 배열 선언 + 배열 할당 + 배열 사용
		
		String[] arr; // 선언 - arr 변수에 값 대입할 수 없음
		arr = new String[4]; // 자료형[할당 받을 크기]
		arr[0] = "1번 방값";
		arr[1] = "2번 방값";
		arr[2] = "3번 방값";
		arr[3] = "4번 방값";
		System.out.println(arr[1+2]);
		Scanner sc = new Scanner(System.in);
		System.out.println("계절을 입력하시오 : ");
		String arrSeason[] = { "봄", "여름", "가을", "겨울" };
		String season = sc.next();
		
		switch (season) {
		case "봄":
			System.out.println(arrSeason[0]);
			break;
		case "여름":
			System.out.println(arrSeason[1]);
			break;
		case "가을":
			System.out.println(arrSeason[2]);
			break;
		case "겨울":
			System.out.println(arrSeason[3]);
			break;

		default:
			break;
		}
		
	}

}
