package kh.mclass;

public class Run {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c);
		System.out.println(a.equals(c));
		System.out.println(a == c);
		System.out.println("============");
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println("============");
		String str3 = new String ("abc");
		String str4 = new String ("abc");
		System.out.println(str3 == str4);
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(!str3.equals(str4));
	}

}

