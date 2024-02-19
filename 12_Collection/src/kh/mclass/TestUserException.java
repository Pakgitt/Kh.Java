package kh.mclass;

import java.util.Scanner;

public class TestUserException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int inputInt = sc.nextInt();

		CheckEven ce = new CheckEven();
		try {
			int result = ce.printEvent(inputInt);
			System.out.println(result + " 정상수 df");
		} catch (EvenException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
