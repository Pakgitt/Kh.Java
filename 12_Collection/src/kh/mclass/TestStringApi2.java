package kh.mclass;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TestStringApi2 {
	public static void main(String[] args) {
		String str = "AA|bb|cc";

		StringTokenizer st = new StringTokenizer(str, "|");

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		StringBuffer sb1 = new StringBuffer("스트링 버퍼값");
		StringBuffer sb2 = sb1; // 얕은복사 (주소값 복사 = heap같은 공간 공유)
//		StringBuffer sb3 = (StringBuffer)sb1.clone();
//		 Car = new Sonata
		System.out.println(sb1);
		System.out.println(sb2);
		sb1.append("aaa");
		System.out.println(sb1);
		System.out.println(sb2);
		
		

//		Date td = new Date();
//		System.out.println(td);
//		SimpleDateFormat ft = new SimpleDateFormat("yy년MM월dd일hh시mm분ss초");
//		System.out.println(ft.format(td));
//
//		Date when = new Date(12345678L);
//		System.out.println(when);

//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 띄워쓰기 함께 입력 :");
//		List<Integer> intList = new ArrayList<Integer>();
//		do {
//			System.out.println("처음엔 없을 고야");
//			int a = sc.nextInt();
//			System.out.println(a + ", ");
//			intList.add(sc.nextInt());
//
//		} while (sc.hasNextInt());
//		System.out.println(intList);
//		System.out.println(intList.get(0));
		
		
	}

}
