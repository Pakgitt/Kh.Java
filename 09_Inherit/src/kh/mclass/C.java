package kh.mclass;

public class C extends A {

	private String str;
		public void method2() {
			System.out.println("method2");
		}
	@Override
	public String toString() {
		return "C [str=" + str + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	@Override
	protected void method1() {
		System.out.println("C가 다시 재정의함 method_" + 1);
	}

}
