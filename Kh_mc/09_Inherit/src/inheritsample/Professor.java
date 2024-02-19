package inheritsample;

public class Professor extends Person {
	private String major;

	public Professor() {

	}

	public Professor(String major) {
		super();
		this.major = major;
	}

	public Professor(String name, String major) {
		super(name);
		this.major = major;
	}

	@Override
	public String toString() {
		return "Professor [major=" + major + "]";
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

//	@Override
	public void out(int a) { // overloading
		System.out.println("나는" + getName() + "교수이다");
		System.out.println("나는" + major + "를 수강중이다");
	}

	@Override
	public void out() { // overriding
		System.out.println("나는" + getName() + "교수이다");
		System.out.println("나는" + major + "를 수강중이다");
	}

}
