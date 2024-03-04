package jdbc.model.service;

import java.sql.Connection;
import java.util.List;
import static jdbc.common.JdbcTemplate.*;
import jdbc.model.dao.DeptDao;
import jdbc.model.vo.Dept;

public class DeptService {

	private DeptDao dao = new DeptDao();
	
	public List<Dept> selectOne(int deptno) {
//		List<Dept> result = null;
//		Connection conn = getConnection();
//		result = dao.selectOne(conn, deptno);
//		close(conn);
//		return result;
		
		int result = -1;
		Connection conn = getConnection();
		result = dao.selectOne(conn, deptno);
		return null;
	}

	public List<Dept> selectList() {
		List<Dept> result = null;
		Connection conn = getConnection();
		result = dao.selectList(conn);
		close(conn);
		return result;
	}

	public int insert(Dept vo) {
		int result = -1;
		Connection conn = getConnection();
		autocommit(conn, false);
		result = dao.insert(conn, vo);
		if (result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public int delete(int deptno) {
		int result = -1;
		Connection conn = getConnection();
		autocommit(conn, false);
		result = dao.delete(conn, deptno);
		if (result > 0) {
			commit(conn);
		} else {
			rollback(conn);

		}
		close(conn);
		return result;

	}

}
