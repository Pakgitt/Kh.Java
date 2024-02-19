package com.kh.example.practice7.run;

import java.util.Scanner;

import com.kh.example.practice7.model.vo.Employee;

public class Run {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Employee e1 = new Employee();
		System.out.println(e1);
		

		System.out.println("사원 번호를 입력하시오 : ");
		int empNo = sc.nextInt();
		e1.setEmpNo(empNo);

		System.out.println("이름를 입력하시오 : ");
		String empName = sc.next();
		e1.setEmpName(empName);

		System.out.println("부서를 입력하시오 : ");
		String dept = sc.next();
		e1.setDept(dept);

		System.out.println("직책을 입력하시오 : ");
		String job = sc.next();
		e1.setJob(job);

		System.out.println("나이를 입력하시오 : ");
		int age = sc.nextInt();
		e1.setAge(age);

		System.out.println("성별을 입력하시오 : ");
		char gender = sc.next().charAt(0);
		e1.setGender(gender);

		System.out.println("연봉을 입력하시오 : ");
		int salary = sc.nextInt();
		e1.setSalary(salary);

		System.out.println("보너스를 입력하시오 : ");
		double bonusPoint = sc.nextDouble();
		e1.setBonusPoint(bonusPoint);

		System.out.println("전화번호를 입력하시오 : ");
		String phone = sc.next();
		e1.setPhone(phone);

		System.out.println("주소를 입력하시오 : ");
		String address = sc.next();
		e1.setAddress(address);
		System.out.println("empNo empName dept job age gender salary bonusPoint phone address");
		System.out.printf("%d %s %s %s %d %c %d %f %s %s", empNo, empName, dept, job, age, gender, salary, bonusPoint,
				phone, address);

	}

}
