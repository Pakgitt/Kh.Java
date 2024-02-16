package kh.mclass;

import java.util.Scanner;

public class ControllTest {
	public static void main(String[] args) {
//		int score;
//		Scanner sc = new Scanner(System.in);
//		score = sc.nextInt();
// 조건식 : boolean 결과값, 비교연산자 , &&, || 기호가 있어야 함.

//		if( 3 == 3 ) {
//			System.out.println("3은 3입니다.");
//		}
//		if( score < 0 ) {
//			System.out.println("성적은 음수일 수 없습니다.");
//		}
//		if( score > 100 ) {
//			System.out.println("만점은 100점입니다. 100점 이하로 작성해주세요");
//		}
//		if( score < 60 ) {
//			System.out.println("재평가 대상자입니다.");
//		}
//		if( score > 90 ) {
//			System.out.println("우수성적입니다.====1");
//		}
//		if( score > 90 && score <= 100) {
//			System.out.println("우수성적입니다.===2");
//		}
//		if( score > 90 && !(score > 100)) {
//			System.out.println("우수성적입니다.===3");
//		}
//  사고의 순서가 뒤죽박죽 아래처럼 순서대로
//		String grade = "없음";
//		if (score < 0) {
//			System.out.println("성적은 음수일 수 없습니다.");
//		} else if (score < 60) {
//			System.out.println("재평가 대상자입니다.");
//		} else if (score < 90) {
//			// x
//		} else if (score <= 100) {
//			System.out.println("우수성적입니다.====1");
//		} else {
//			System.out.println("만점은 100점입니다. 100점 이하로 작성해주세요");
//		}
//		if (score > 100) {
//			System.out.println("만점은 100점입니다. 100점 이하로 작성해주세요");
//		} else if (score >= 90) {
//			System.out.println("우수성적입니다.====1");
//		} else if (score >= 60) {
//			// x
//		} else if (score >= 0) {
//			System.out.println("재평가 대상자입니다.");
//		} else {
//			System.out.println("성적은 음수일 수 없습니다.");
//		}

//		// 최종
//		if (score > 100) {
//			System.out.println("만점은 100점입니다. 100점 이하로 작성해주세요");
//		} else if (score >= 0) {
//			switch (score / 10) {
//			case 10:
//			case 9:
//				grade = "A";
//				break;
//			case 8:
//				grade = "B";
//				break;
//			case 7:
//				grade = "C";
//				break;
//			default:
//				grade = "F";
//			}
//			System.out.println(grade + "등급입니다.");
//		} else {
//			System.out.println("성적은 음수일 수 없습니다.");
//		}

// 조건식이 같은 값 == 동일함을 비교한다면 switch		
//		if( grade == "A") {
//			break;		
//		} else if( grade == "B") { // else if( score == 111) {
//			
//		} else if( grade == "C") {
//			
//		} else {
//			
//		}
// 아래처럼		
//		switch (grade) {
//		case "A":
//			System.out.println("A 등급입니다.");
//			break;
//		case "B":
//			System.out.println("B 등급입니다.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력해주세요");
		int month = sc.nextInt();
		System.out.println("기온을 입력해주세요");
		int temp = sc.nextInt();

//		String season ="";

		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			if (temp <= -15) {
			} else if (temp <= -12) {
				System.out.println(" 한파 주의보");
			}
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("달은 12월이 끝입니다");
			break;
			
		}
	}
}

