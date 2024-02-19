package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
//	이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
//	ex.
//	이름을 입력하세요 : 아무개
//	성별을 입력하세요(남/여) : 남
//	나이를 입력하세요 : 20
//	키를 입력하세요(cm) : 180.5
//	키 180.5cm인 20살 남자 아무개님 반갑습니다^^

	public void method1() {
		System.out.println("변수 실습문제 1 시작합니다.");
		System.out.println("이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.");

		Scanner sc = new Scanner(System.in); // 한번만 생성

		System.out.print("이름을 입력하세요 :");
		String name = sc.nextLine();

		System.out.print("성별을 입력하세요(남/여) :");
		String gender = sc.nextLine();

		System.out.print("나이를 입력하세요 :");
		int age = sc.nextInt();

		System.out.print("키를 입력하세요(cm) :");
		double hei = sc.nextDouble();

		System.out.println("키 " + hei + "인 " + age + "살 " + gender + "자 " + name + "님 반갑습니다^^");
		System.out.printf("키 %fcm인 %살 %c자 %s님 반갑습니다 ^.^ \n", 120.22, -22, 's', "박세혁");
		System.out.printf("키 fcm인 살 c자 s님 반갑습니다 ^.^");

		System.out.println("1번 실습 종료.");
	}

//	public void method2() {
//		System.out.println("변수 실습문제 1 시작합니다.");
//		System.out.println("이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.");
//
//		Scanner sc = new Scanner(System.in); // 한번만 생성
//
//		System.out.print("이름을 입력하세요 :");
//		String name = sc.nextLine();
//		
//		System.out.print("성별을 입력하세요(남/여) :");
//		String gender = sc.nextLine();
//		
//		System.out.print("나이를 입력하세요 :");
//		int age = sc.nextInt();
//		
//		System.out.print("키를 입력하세요(cm) :");
//		double hei = sc.nextDouble();
//
//		System.out.println("키 " + hei + "인 " + age + "살 " + gender + "자 " + name + "님 반갑습니다^^");
//	}
}
