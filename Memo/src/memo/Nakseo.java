package memo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Nakseo {
	public static void main(String[] args) {
//		int[] arr = new int[5];
//
//		try {
//			for (int i = 0; i < 5; i++) {
//				arr[i] = i;
//				System.out.println(arr[i]);
//			}
//		} catch (IndexOutOfBoundsException e) {
//			System.out.println(e);
//			System.out.println("예외 처리 부분");
//			// TODO: handle exception
//		}
//		System.out.println("프로그램 종료");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return;
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}

			}
			System.out.println("항상 수행");
		}
		System.out.println("여기도 수행");

	}
}
