package kh.mclass.jdbc.view;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import kh.mclass.jdbc.controller.EmpController;
import kh.mclass.jdbc.model.vo.Emp;

public class EmpMenu {
	private Scanner sc = new Scanner(System.in);
	private EmpController controller = new EmpController();

	public void mainMenu() {
		while (true) {
			boolean exit = false;
			System.out.println("메뉴를 고르세요");
			System.out.println("1 : 조회");
			System.out.println("2 : 추가");
			System.out.println("3 : 삭제");
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				selectList();
				break;
			case "2":
				insertEmp();
				break;
			case "3":
				deleteEMp();
				break;
			default:
				exit = true;
				break;
			}
			if (exit) {
				break;
			}

		}
		System.out.println("프로그램 종료");
	}

	public void selectList() {
		List<Emp> empList = controller.selectList();
		if (empList == null) {
			System.out.println("오류로 데이터 읽기 실패");
		} else {
			System.out.println("사원수 : " + empList.size());
			if (empList.size() > 0) {
				for (Emp emp : empList) {
					System.out.println(emp);

				}

			}
		}
	}

	public void insertEmp() {
//		private int empno;
//		private String ename;
//		private String job;
//		private int mgr;
//		private Date hiredate;
//		private double sal;
//		private double comm;
//		private int deptno;

		try {
			System.out.println("이름 : ");
			String ename = sc.nextLine();

			System.out.println("직업 : ");
			String job = sc.nextLine();

			System.out.println("mgr(7521, 7566) : ");
			int mgr = sc.nextInt();

			System.out.println("deptno(10, 20) : ");
			int deptno = sc.nextInt();

//		System.out.println("고용 날짜 : ");

			System.out.println("사번(4자리 1001~, 중복 불가) : ");
			int empno = sc.nextInt();

			System.out.println("연봉(12345.12) : ");
			double sal = sc.nextDouble();

			System.out.println("보너스(12345.12) : ");
			double comm = sc.nextDouble();

			Date hiredate = null;
			Emp emp = new Emp(empno, ename, job, mgr, hiredate, sal, comm, deptno);
			System.out.println("확인 ==============");
			System.out.println(emp);

			controller.insertEmp(emp);
		} catch (NumberFormatException e) {
			System.out.println("자료형 형태에 맞게 입력");
		}
		// TODO: handle exception
	}

	public void deleteEMp() {
		controller.deleteEMp();
	}

}
