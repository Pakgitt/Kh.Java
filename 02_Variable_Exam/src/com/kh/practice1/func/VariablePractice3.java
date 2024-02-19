package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {

	public void method3() {

//	키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
		System.out.println("키보드로 가로,  세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.\r\n");
//	계산 공식 ) 면적 : 가로 * 세로 
//			  둘레 : (가로 + 세로) * 2
		Scanner sc = new Scanner(System.in);

		System.out.println("가로 길이를 입력해주세요 : ");
		double x = sc.nextDouble();
		System.out.println("세로 길이를 입력해주세요 : ");
		double y = sc.nextDouble();

		System.out.println("가로 : " + x);
		System.out.println("세로 : " + y);
		System.out.println("면적 : " + (x * y));
		System.out.println("세로 : " + (x + y) * 2);
	}

}
