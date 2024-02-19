package kh.mclass;

public class GenericEx<T> {

	private T a1;

	public T getA1() {
		return a1;
	}

	public void setA1(T a1) {
		this.a1 = a1;
	}

	public <K> K methodGeneric(K a2) {
		return a2;

	}

//	public <S> S method2Generic(S a3, int index) {
//		return (S)a3[index];
//	}

	public static void main(String[] args) {
		GenericEx<String> ex1 = new GenericEx<String>();
		ex1.setA1("ex1d----");

		GenericEx<Integer> ex2 = new GenericEx<Integer>();
		ex2.setA1(986532);

		String r1 = ex1.methodGeneric("asdf");
		Integer r2 = ex1.methodGeneric(1323);
		Student r3 = ex1.methodGeneric(new Student());
		Object obj = ex1.methodGeneric(new Integer[] { 2, 3, 4 });
		System.out.println(ex1.a1 + ex2.a1);
		System.out.println(r1 + r2 + r3);

	}
}
