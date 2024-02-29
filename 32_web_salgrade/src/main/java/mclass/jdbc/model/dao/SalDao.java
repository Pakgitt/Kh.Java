package mclass.jdbc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import mclass.jdbc.model.vo.Sal;

public class SalDao {

	public void SelectOne() {

	}

	public List<Sal> selectList(Connection conn) {
		List<Sal> result = null;
		String sql = "select * from Salgrade";
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			result = new ArrayList<Sal>();
			while (rset.next()) {
				Sal vo = new Sal();
				vo.setGrade(rset.getInt("grade"));
				vo.setLosal(rset.getInt("losal"));
				vo.setHisal(rset.getInt("hisal"));
				result.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public void insert() {

	}

	public void delete() {

	}

}
