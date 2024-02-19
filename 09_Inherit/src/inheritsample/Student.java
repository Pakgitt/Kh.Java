package inheritsample;

import inherit.sample.InterfaceSample;
import kh.mclass.B;

public class Student extends Person implements InterfaceSample {
	private String subject;

	public Student() {

	}

	public Student(String subject) {
		super();
		this.subject = subject;
	}

	public Student(String subject, String name) {
		super(name);
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Student [subject=" + subject + "]";
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void out() {
		System.out.println("나는" + getName() + "이다");
		System.out.println("나는" + subject + "를 수강중이다");
	}

	@Override
	public void method1(B b) {
		// TODO Auto-generated method stub

	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub

	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub

	}

	@Override
	public String testSum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String sumTest() {
		// TODO Auto-generated method stub
		return null;
	}

}
