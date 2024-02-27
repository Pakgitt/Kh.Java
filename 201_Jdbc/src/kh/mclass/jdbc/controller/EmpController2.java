package kh.mclass.jdbc.controller;

import java.util.List;

import kh.mclass.jdbc.model.service.EmpService2;
import kh.mclass.jdbc.model.vo.Emp;

public class EmpController2 {
	private EmpService2 service = new EmpService2();

	public List<Emp> selectList() {
		return service.selectList();
	}

	public int insertEmp(Emp vo) {
		return service.insert(vo);
	}

	public int deleteEmp(int empno) {
		return service.delete(empno);
	}

}
