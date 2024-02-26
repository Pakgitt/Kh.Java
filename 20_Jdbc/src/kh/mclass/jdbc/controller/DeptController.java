package kh.mclass.jdbc.controller;

import java.util.List;
import kh.mclass.jdbc.model.service.DeptService;
import kh.mclass.jdbc.model.vo.Dept;

public class DeptController {
	private DeptService service = new DeptService();

	// 부서 목록 조회 메서드
	public List<Dept> selectList() {
		return service.selectList();
	}

	// 부서 정보 추가 메서드
	public int insert(Dept vo) {
		return service.insert(vo);
	}

	// 부서 정보 삭제 메서드
	public int delete(int deptno) {
		return service.delete(deptno);
	}
}
