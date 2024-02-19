package kh.mclass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class TestException {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// The local variable br may not have been initialized / 초기값 설정 X

		try (BufferedReader br = new BufferedReader(new FileReader(new File("./a.txt")))) {
			String s = null;
			while ((s = br.readLine()) != null) {
//				s = br.readLine();
//			if (s != null) {
				System.out.println(s);
//			} else {
//				break;
//			}

			}

//			BufferedReader br1 = null;
//
//			try {
//				System.out.println("===1");
////			if (1 == 1) {
////				return;
////			}
//				br1 = new BufferedReader(new FileReader(new File("a.txt")));
//				int a = 10;
//				br1.readLine();
//				System.out.println("===2");
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				System.out.println("===3");
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				System.out.println("===4");
//				e.printStackTrace();
//			} finally {
//				System.out.println("===5");
//				try {
//					if (br1 != null)
//						br1.close(); // br cannot be resolved br 선언 안됨
//				} catch (IOException e2) {
//					e2.printStackTrace();
//
//				}
//				System.out.println("===6 끝");
//				try
//
//				{
//					// 실행 코드 작성
//					// 실행 중 오류가 발생할 가능성이 있는 코드를 작성
//				} catch (NullPointerException e1/* try 구문 내 발생할 가능성이 있는 Exception 종류 선언 */) {
//					// NullPointerException 오류가 발생 했을때 실행할 코드 작성
//					e1.printStackTrace();
//					// call stack - push/pop
//				} finally {
//					// return 이 있어도 이부분은 꼭 실행
//					// 주로 큰 resource 를 사용하는 java.io 또는 java.sql의 객체들은 close()를 반드시 해줘야함
//
//					System.out.println("====제대로 마무리 됨 ====");
//				}
//
//			}
		}
	}
}
