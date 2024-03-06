package jdbc.common.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static jdbc.common.JdbcTemplate.*;
import jdbc.common.model.vo.Salgrade;

public class SalgradeDao {

	public List<Salgrade> seletList(Connection conn) {
		List<Salgrade> result = null;
		String sql = "select * from salgrade";
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			result = new ArrayList<Salgrade>();
			while (rs.next()) {
				Salgrade vo = new Salgrade();
				vo.setGrade(rs.getInt("grade"));
				vo.setLosal(rs.getInt("losal"));
				vo.setHisal(rs.getInt(3));

				result.add(vo);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;

	}

	public int insert(Connection conn, Salgrade vo) {
		String sql = "insert into salgrade values(?, ?, ?)";
		int result = -1;
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getGrade());
			pstmt.setInt(2, vo.getLosal());
			pstmt.setInt(3, vo.getHisal());

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}
		return result;
	}

	public void delte() {

	}
}
