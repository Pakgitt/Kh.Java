package kh.mclass;

public class B {
	private int num1;
	private String str;

	public void method1() {
		System.out.println("method1");
	}

	public void method2() {
		System.out.println("method1");
	}
	public String toString(int a) {
		return "";
	}
	@Override
	public String toString() {
		return "B [num1=" + num1 + ", str=" + str + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
