package jdbc.model.service;

import java.sql.Connection;
import java.util.List;
import static jdbc.common.JdbcTemplate.*;
import jdbc.model.dao.DeptDao;
import jdbc.model.vo.Dept;

public class DeptService {

	DeptDao dao = new DeptDao();

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
		autoCommit(conn, false);
		result = dao.insert(conn, vo);
		try {
			if (result > 0) {
				commit(conn);
			} else {
				rollback(conn);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		close(conn);
		return result;

	}

	public int delete(int deptno) {
		int result = -1;
		Connection conn = getConnection();
		autoCommit(conn, false);
		result = dao.delete(conn, deptno);
		try {
			if (result > 0) {
				commit(conn);
			} else {
				rollback(conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(conn);
		}
		return result;

	}

}
