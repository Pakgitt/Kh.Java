package mclass.jdbc.model.service;

import static mclass.jdbc.common.JdbcTemplate.close;
import static mclass.jdbc.common.JdbcTemplate.getConnection;

import java.sql.Connection;
import java.util.List;

import mclass.jdbc.model.dao.SalDao;
import mclass.jdbc.model.vo.Sal;

public class SalService {
	
	private SalDao dao = new SalDao();
	public void selectOne() {

	}

	public List<Sal> selectList() {
		List<Sal> result = null;
		Connection conn = getConnection();
		result = dao.selectList(conn);
		close(conn);
		
		return result;
	}

	public void insert() {

	}

	public void delete() {

	}

}
