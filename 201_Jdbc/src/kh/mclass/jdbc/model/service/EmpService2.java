package kh.mclass.jdbc.model.service;

import static kh.mclass.jdbc.common.JdbcTemplate.autoCommit;
import static kh.mclass.jdbc.common.JdbcTemplate.close;
import static kh.mclass.jdbc.common.JdbcTemplate.commit;
import static kh.mclass.jdbc.common.JdbcTemplate.getConnection;
import static kh.mclass.jdbc.common.JdbcTemplate.rollback;

import java.sql.Connection;
import java.util.List;

import kh.mclass.jdbc.model.dao.EmpDao2;
import kh.mclass.jdbc.model.vo.Emp;

public class EmpService2 {
	private EmpDao2 dao = new EmpDao2();

	public List<Emp> selectList() {
		List<Emp> result = null;
		Connection conn = getConnection();
		result = dao.selectList(conn);
		close(conn);
		return result;
	}

	public int insert(Emp vo) {
		int result = -1;
		Connection conn = getConnection();
		autoCommit(conn, false);
		result = dao.insert(conn, vo);
		if (result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		close(conn);
		return result;

	}

	public int delete(int empno) {
		int result = -1;
		Connection conn = getConnection();
		result = dao.delete(conn, empno);
		if (result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

}
