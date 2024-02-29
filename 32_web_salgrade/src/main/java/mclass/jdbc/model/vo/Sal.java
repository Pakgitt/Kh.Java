package mclass.jdbc.model.vo;

public class Sal {

//	SQL> desc Salgrade
//	 이름                                      널?      유형
//	 ----------------------------------------- -------- ----------------------------
//	 GRADE                                              NUMBER
//	 LOSAL                                              NUMBER
//	 HISAL                                              NUMBER

	private int grade;
	private int losal;
	private int hisal;

	public Sal() {

	}

	public Sal(int grade, int losal, int hisal) {
		super();
		this.grade = grade;
		this.losal = losal;
		this.hisal = hisal;

	}

	@Override
	public String toString() {
		return "Sal [grade=" + grade + ", losal=" + losal + ", hisal=" + hisal + "]";
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;

	}

	public int getLosal() {
		return losal;
	}

	public void setLosal(int losal) {
		this.losal = losal;
	}

	public int getHisal() {
		return hisal;
	}

	public void setHisal(int hisal) {
		this.hisal = hisal;
	}
	
	

}
