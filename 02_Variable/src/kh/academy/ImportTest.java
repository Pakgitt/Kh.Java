package kh.academy;

import java.util.Date;

public class ImportTest {

	static int field1;// 필드(멤버 변수)

	public static void main(String[] args) {
		System.out.println(field1);
		// 자료형 = Type = clas명 int boolean byte
		// 기본자료형 (primitive type) 8개
		// int double boolean char byte
		java.util.Date today = new Date();
		int x = 256;
		byte y = 127; // 2^8 = 256 //-128 ~ 127 // error 128
		double z = 2.888888;
		double z1 = 28888.844444444444444444444448;
		float f1 = 3.1686f;
		float f2 = 1 + 3.0f;
		double d1 = 3;
		d1 = 1 + 3.0; // 자료형이 다른 산술연산시 같은 자료형으로 변형하고 산술연산함
		f1 = (float) d1 + 100;
		System.out.println(d1);
		System.out.println(f2);
		System.out.println(f1 + 150);

		boolean a = true;
		boolean b = false;
		// int t3 = 3 + a;
		// boolean c =1;
		char ch = 60; // -60 오류
		char ch2 = 'c'; // 문자 1자 !!!
		char ch3 = ch; //
		int ch4 = 3 + 60;
		String str1 = "chdd" + "소다네"; // 문자 0자 이상 !!

		// 참조자료형 (reference type) 1개 (String)
		// java.util.Date today = 35;
		Date t = new Date();
		java.sql.Date t2 = new java.sql.Date(2002, 8, 19);
		java.util.Date t3 = new java.util.Date(2002, 8, 19);

		char c1 = '가';

		System.out.println("a+b" + 3 * 2 + "cd");

		System.out.println(t);
		System.out.println(t2);
		System.out.println(t3);
		char ch5 = 88;
		System.out.println(ch5);
		System.out.println((int) ch5);
		System.out.println(z);
		System.out.println(z1);
		System.out.println(f1);
		System.out.println(2 * 3.14 * 10);
		System.out.println((char) ch4);

		System.out.println(c1);
		System.out.println((int) c1);
		int d10 = c1; // 대입연산자 다른 자료형일 경우 형변환
		System.out.println(d10);

		System.out.println(3 + 1.52);
		System.out.println(10 / 3); // 3
		System.out.println(10 / 3.0); // 3.333..
		System.out.println((double) (10) / 3); // 3.333..

	}
}
