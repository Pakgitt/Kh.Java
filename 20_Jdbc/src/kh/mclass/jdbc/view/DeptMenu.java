package kh.mclass.jdbc.view;

import java.util.List;
import java.util.Scanner;
import kh.mclass.jdbc.controller.DeptController;
import kh.mclass.jdbc.model.vo.Dept;

public class DeptMenu {
	private Scanner sc = new Scanner(System.in);
	private DeptController controller = new DeptController();

	// 부서 메뉴 실행 메서드
	public void deptMenu() {
		while (true) {
			boolean exit = false;
			System.out.println("메뉴를 고르세요");
			System.out.println("1: DEPT 조회");
			System.out.println("2: DEPT 추가");
			System.out.println("3: DEPT 삭제");
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				selectList();
				break;
			case "2":
				insert();
				break;
			case "3":
				delete();
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

	// 부서 정보 조회 메서드
	public void selectList() {
		List<Dept> list = controller.selectList();
		if (list == null) {
			System.out.println("오류로 데이터 읽기 실패");
		} else {
			System.out.println("사원수 : " + list.size());
			if (list.size() > 0) {
				for (Dept vo : list) {
					System.out.println(vo);
				}
			}
		}
	}

	// 부서 정보 추가 메서드
	public void insert() {
		try {
			System.out.println("dname : ");
			String dname = sc.nextLine();
			System.out.println("loc : ");
			String loc = sc.nextLine();

			System.out.println("deptno(10,20,30,40) : ");
			int deptno = sc.nextInt();

			Dept vo = new Dept(deptno, dname, loc);
			System.out.println("==== 지금까지 입력한 데이터를 controller에게 전달함");
			int result = controller.insert(vo);
			if (result > 0) {
				System.out.println("추가함");
			} else {
				System.out.println("오류발생 오류발생");
			}

		} catch (NumberFormatException e) {
			System.out.println("자료형에 맞게 다시해라");
		}
	}

	// 부서 정보 삭제 메서드
	public void delete() {
		try {
			System.out.println("삭제할 deptno(10,20,30,..) : ");
			int deptno = sc.nextInt();

			int result = controller.delete(deptno);
			if (result > 0) {
				System.out.println("삭제 완료");
			} else {
				System.out.println("오류 발생");
			}
		} catch (NumberFormatException e) {
			System.out.println("자료형에 맞게 다시 해");
		}
	}
}
