package kh.mclass.jdbc.model.view;

import java.util.List;
import java.util.Scanner;

import kh.mclass.jdbc.model.controller.SalgradeController;
import kh.mclass.jdbc.model.vo.Salgrade;

public class SalgradeMenu {
	private Scanner sc = new Scanner(System.in);
	private SalgradeController controller = new SalgradeController();

	public void mainMenu() {
		while (true) {
			boolean exit = false;
			System.out.println("메뉴를 고르세요");
			System.out.println("1: 조회");
			System.out.println("2. 추가");
			System.out.println("3. 삭제");
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
		System.out.println("프로그램을 종료합니다.");
	}

	public void selectList() {
		List<Salgrade> list = controller.selectList();
		if (list == null) {
			System.out.println("오류 발발생");
		} else {
			System.out.println("사원수 : " + list.size());
			if (list.size() > 0) {
				for (Salgrade vo : list) {
					System.out.println(vo);
				}
			}
		}
	}

	public void insert() {
		try {
			System.out.println("losal");
			int losal = sc.nextInt();
			System.out.println("hisal");
			int hisal = sc.nextInt();

			System.out.println("grade : ");
			int grade = sc.nextInt();

			Salgrade vo = new Salgrade(grade, losal, hisal);
			System.out.println("==== 지금까지 입력한 데이터를 cotroller에게 전달");
			int result = controller.insert(vo);
			if (result > 0) {
				System.out.println("추가 완료");
			} else {
				System.out.println("오루발샹");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete() {
		try {
			System.out.println("삭제할 grade : ");
			int grade = sc.nextInt();
			int result = controller.delete(grade);
			if (result > 0) {
				System.out.println("삭제 완료");
			} else {
				System.out.println("비상 비상");
			}
		} catch (Exception e) {
		}

	}

}
