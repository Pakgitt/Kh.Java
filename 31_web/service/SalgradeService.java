package jdbc.common.model.service;

import java.sql.Connection;
import java.util.List;

import jdbc.common.model.dao.SalgradeDao;
import jdbc.common.model.vo.Salgrade;
import static jdbc.common.JdbcTemplate.*;

public class SalgradeService {

	SalgradeDao dao = new SalgradeDao();

	public List<Salgrade> selectList() {
		List<Salgrade> result = null;
		Connection conn = getConnection();
		result = dao.seletList(conn);

		close(conn);

		return result;

	}

	public void insert(Salgrade vo) {
		int result = -1;
		Connection conn = getConnection();
		autoCommit(conn, false);
		try {
			if (result > 0) {
				commit(conn);
			} else {
				rollback(conn);
			}
		} catch (Exception e) {
		}

	}

	public void delete() {

	}

}
