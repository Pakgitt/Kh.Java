package kh.mclass;

public class CheckEven {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int printEvent(int number) throws EvenException {
		this.number = number;
		if (number > 10000) {
			throw new NullPointerException();
		} else if (number % 2 != 0) {
			System.out.println("다시 입력 : ");
			throw new EvenException(number);
		} else {
			return number;

		}
	}

}
