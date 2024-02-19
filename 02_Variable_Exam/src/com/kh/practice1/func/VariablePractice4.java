package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

	public void method4() {

		System.out.println("영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.");

		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");
		String inputStr = sc.nextLine();

		System.out.println(inputStr);
		System.out.println("첫 번째 문자 : " + inputStr.charAt(0));
		System.out.println("두 번째 문자 : " + inputStr.charAt(1));
		System.out.println("세 번째 문자 : " + inputStr.charAt(2));

	}

}
