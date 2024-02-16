package kh.mclass;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class TestGeneric {
	public static void main(String[] args) {
		// 다양한 타입의 객체들을 다루는 메소드나 클래스의 타입을 미리 명시
		// 컴파일 시 타입을 체크할 수 있도록 하고,
		// 형변환을 하는 번거로움 없이 사용하게 해줌
		// 배열이나 이후 배울 컬렉션 사용시 데이터 타입의 안정성을 높일 수 있다

		// 참조자료형 미리 명시!
		// overloading의 한계 극복 - 새로운 자료형에 대처하지 못함
		List<String> list = new ArrayList<String>(0);
//		List list = new ArrayList();
//		list.add(123); // 참조자료형을 String형으로 지정했기때문에 오류
		list.add("aaa");
		
		System.out.println(list);

	}
}
