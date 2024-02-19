package kh.mclass;

// The serializable class EvenException does not declare a static final serialVersionUID field of type long
public class EvenException extends Exception {
	private Integer number = null;

	public EvenException(int number) {
		this.number = number;
	}

	@Override
	public String getMessage() {
		if (number == null) {
			return "숫자가 아님";
		} else {
			return number + "는 짝수가 아님";
		}
//		return super.getMessage();
	}

}
