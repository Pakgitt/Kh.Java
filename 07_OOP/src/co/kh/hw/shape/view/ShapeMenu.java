package co.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;
import com.kh.hw.shape.model.vo.Shape;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();

	public void inputMenu() {
		int faultInputCount = 0;
//		===== 도형 프로그램 =====
//				3. 삼각형
//				4. 사각형
//				9. 프로그램 종료
//				메뉴 번호 : 1
//				잘못된 번호입니다. 다시 입력하세요.
		while (true) { // break; 필수
			boolean exit = false;
			System.out.println("===== 도형 프로그램 =====");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴 번호 : ");
//		System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			String menuNum = sc.nextLine();

			switch (menuNum) {
			case "3":
				triangleMenu();
				faultInputCount = 0;
				System.out.println("3");
				break;
			case "4":
				squareMenu();
				faultInputCount = 0;
				System.out.println("4");
				break;
			case "9":
				faultInputCount = 0;
				exit = true;
//				System.out.println("프로그램 종료");
				break;
			default:
				faultInputCount++;
				System.out.println("잘못된 번호입니다 다시 입력하세요.");
				if (faultInputCount > 5) {
					System.out.println("메뉴얼 숙지하고 실행해주세여.");
					break;
				}
			}
			if (exit) {

				System.out.println("프로그램 종료");

				break; // 반복문 while 끝냄
			}

		}
	}

	public void triangleMenu() {
//		===== 삼각형 =====
//				1. 삼각형 면적
//				2. 삼각형 색칠
//				3. 삼각형 정보
//				9. 메인으로

		System.out.println("===== 삼각형 =====");
		System.out.println("1. 삼각형 면적");
		System.out.println("2. 삼각형 색칠");
		System.out.println("3. 삼각형 정보");
		System.out.println("9. 메인으로");

		int faultInputCount = 0;
		while (true) { // break; 필수
			boolean exit = false;
//		System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			String menuNum = sc.nextLine();

			switch (menuNum) {
			case "1":
				inputSize(3, Integer.parseInt(menuNum)); // int 형태로 바꿔
				break;
			case "2":
				break;
			case "3":
				break;
			case "9":
				exit = true;
				break;
			default:
				faultInputCount++;
				System.out.println("잘못된 번호입니다 다시 입력하세요.");
				if (faultInputCount > 5) {
					System.out.println("메뉴얼 숙지하고 실행해주세여.");
					break;
				}

			}
			if (exit) {

				System.out.println("프로그램 종료");

				break; // 반복문 while 끝냄
			}

		}
	}

	public void squareMenu() {
		System.out.println("===== 사각형 =====");
		System.out.println("1. 사각형 면적");
		System.out.println("2. 사각형 색칠");
		System.out.println("3. 사각형 정보");
		System.out.println("9. 메인으로");

		int faultInputCount = 0;
		while (true) { // break; 필수
			boolean exit = false;
//		System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			String menuNum = sc.nextLine();

			switch (menuNum) {
			case "1":
				inputSize(4, Integer.parseInt(menuNum)); // int 형태로 바꿔
				System.out.println("1");
				break;
			case "2":
				inputSize(4, Integer.parseInt(menuNum)); // int 형태로 바꿔
				break;
			case "3":
				printlnformation(3);
				break;
			case "4":
				printlnformation(4);
				break;
			case "9":
				faultInputCount = 0;
				exit = true;
				System.out.println("프로그램 종료");
				break;
			default:
				faultInputCount++;
				System.out.println("잘못된 번호입니다 다시 입력하세요.");
				if (faultInputCount > 5) {
					System.out.println("메뉴얼 숙지하고 실행해주세여.");
					break;
				}

			}
			if (exit) {

				System.out.println("프로그램 종료");

				break; // 반복문 while 끝냄
			}

		}
	}

	public void inputSize(int type, int menuNum) {
		// 높이 10
		// 넓이 3
		// 삼각형 면적 15.0
		System.out.println("높이");
		String heightStr = sc.nextLine();
		System.out.println("넓이");
		String widthStr = sc.nextLine();
		System.out.println("삼각형 면적 : " + 15);

		double height = Double.parseDouble(heightStr);
		double width = Double.parseDouble(widthStr);
		if (type == 3) {
			System.out.println("삼각형 면적 : " + tc.calcArea(height, width));

		} else if (type == 4) {
			System.out.println("사각형 면적 : " + scr.calcArea(height, width));
		}
		if (menuNum == 1) {
			System.out.println("사각형 둘레 : " + scr.calcArea(height, width));

		}
	}

	public void printlnformation(int type) {
		if (type == 3) {
			System.out.println(tc.print());
		} else if (type == 4) {
			System.out.println(scr.print());
		}

	}
}
