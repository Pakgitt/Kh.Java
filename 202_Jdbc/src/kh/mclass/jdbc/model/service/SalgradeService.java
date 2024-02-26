package kh.mclass.jdbc.model.service;

import java.sql.Connection;
import java.util.List;

import kh.mclass.jdbc.model.dao.SalgradeDao;
import kh.mclass.jdbc.model.vo.Salgrade;
import static kh.mclass.jdbc.model.common.JdbcTemplate.*;

public class SalgradeService {
	private SalgradeDao dao = new SalgradeDao();

	public List<Salgrade> selectList() {
		List<Salgrade> result = null;
		Connection conn = getConnection();
		result = dao.selectList(conn);
		close(conn);
		return result;
	}

	public int insert(Salgrade vo) {
		int result = -1;
		Connection conn = getConnection();
		autoCommit(conn, false);
		result = dao.insert(conn, vo);
		if (result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		return result;
	}

	public int delete(int grade) {
		int result = -1;
		Connection conn = getConnection();
		autoCommit(conn, false);
		result = dao.delete(conn, grade);
		if (result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		return result;
	}
}
