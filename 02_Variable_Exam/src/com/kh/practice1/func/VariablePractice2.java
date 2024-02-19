package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	
	public void method2() {
//		키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력해 주세여 : ");
		int x = sc.nextInt();
		System.out.println("두 번째 정수를 입력해 주세여 : ");
		int y = sc.nextInt();
		
		System.out.println("더하기 결과 " +  (x+y));
		System.out.println("빼기 결과 " +  (x-y));
		System.out.println("곱하기 결과 " +  (x*y));
		System.out.println("나누기 몫 결과 " + (x/y));
	}
	

}
