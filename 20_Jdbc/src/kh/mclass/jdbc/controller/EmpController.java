package kh.mclass.jdbc.controller;

import java.util.List;

import kh.mclass.jdbc.model.dao.EmpDao;
import kh.mclass.jdbc.model.vo.Emp;
import kh.mclass.jdbc.view.EmpMenu;

public class EmpController {
	private EmpDao dao = new EmpDao();

	public List<Emp> selectList() {
		return dao.selectList();

	}

	public void insertEmp(Emp emp) {
		dao.insertEmp(emp);

	}

	public void deleteEMp() {

	}

}
