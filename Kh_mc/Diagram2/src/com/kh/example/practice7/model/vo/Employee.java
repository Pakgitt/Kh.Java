package com.kh.example.practice7.model.vo;

public class Employee {

	private int empNo = 43;
	private String empName = "박박박";
	private String dept = "마케팅부";
	private String job = "영업부";
	private int age = 23;
	private char gender = '여';
	private int salary = 30000000;
	private double bonusPoint = 0.5;
	private String phone = "010-7979-7979";
	private String address = "로스엔젤레스";

	public Employee() {
		// 기본 생성자에서는 초기값을 이미 멤버 변수에 할당해놨기 때문에 추가적인 작업이 필요하지 않습니다.

	}
		// 사원 번호와 사원 이름을 매개변수로 받는 생성자
	public Employee(int empNo, String empName) {
		this.empNo = empNo;
		this.empName = empName;

	}

	public Employee(int empNo, String empName, String dept, String job, int age, char gender, int salary,
			double bounusPoint, String phone, String address) {

	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
