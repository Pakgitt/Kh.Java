package kh.mclass;

public class TestStringApi {
	public static void main(String[] args) {
		// String 미리 만들어둔 메소드 활용 -
		// 1. 기능에 맞는 이름 찾기
		// 2. 매개인자 parameter argument 맞게 작성하기
		// 3. return 자료형 확인해서 변수에 담기
//		String str1 = "hello world";
//		String str2 = "hello World";
//		String str3 = "world xello";
//		char ch = str1.charAt(6); // 'w'
//		System.out.println(ch);
//		int compareInt = str1.compareTo(str2);
//		int compareInt2 = str2.compareTo(str1);
//		System.out.println(compareInt);
//		System.out.println(compareInt2);
//
//		int compareInt3 = str2.compareTo(str3);
//		System.out.println(compareInt3);
//
//		System.out.println("hello world".compareTo("hello zorld"));
//		System.out.println("a b c".concat("ABC " + "\n줄도\t바꿔지나"));
//		System.out.println(str1.equalsIgnoreCase(str2)); // true
//		System.out.println(str1.equals(str2)); // false
//
//		String result = str1.replace('l', 'm');
//		String result2 = str1.replaceFirst("l", "m");
//		System.out.println(result);
//		System.out.println(result2);
//		
//		String[] arrStr = str1.split(" ");
//		//for
//		System.out.println(arrStr[0]);
//		System.out.println(arrStr[1]);
//		System.out.println(arrStr[0].length());
//		System.out.println(arrStr[1]);

//		StringBuffer sb1 = "스트링버퍼값";
		StringBuffer sb1 = new StringBuffer("스트링버퍼값");
		String str10 = new String("스트링객체 만들어서 비교 == 안됨. equals");
		String immutable1 = "aaa";
		immutable1 = "bbb";
		System.out.println(immutable1);
		StringBuffer sb2 = new StringBuffer("mutable");
		sb1.append("기존 문자를 가변적으로 바꿀수 있기 때문에 추가하는 append 메소드가 제공됨");
		System.out.println(sb1);
	}

}
