package kh.mclass.jdbc.model.service;

import static kh.mclass.jdbc.common.JdbcTemplate.autoCommit;
import static kh.mclass.jdbc.common.JdbcTemplate.close;
import static kh.mclass.jdbc.common.JdbcTemplate.commit;
import static kh.mclass.jdbc.common.JdbcTemplate.getConnection;
import static kh.mclass.jdbc.common.JdbcTemplate.rollback;

import java.sql.Connection;
import java.util.List;

import kh.mclass.jdbc.model.dao.DeptDao;
import kh.mclass.jdbc.model.vo.Dept;
public class DeptService {
// Connection 객체 / close
// conn - commit / rollback
	private DeptDao dao = new DeptDao(); 
	
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
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
	public int delete(int deptno) {
		int result = -1;
		Connection conn = getConnection();
		autoCommit(conn, false);
		result = dao.delete(conn, deptno);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
}
