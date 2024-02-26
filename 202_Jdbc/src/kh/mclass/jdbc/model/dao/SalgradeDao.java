package kh.mclass.jdbc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import static kh.mclass.jdbc.model.common.JdbcTemplate.*;

import kh.mclass.jdbc.model.vo.Salgrade;

public class SalgradeDao {
	public List<Salgrade> selectList(Connection conn) {
		String sql = "select * from Salgrade";
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		List<Salgrade> result = null;

		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			result = new ArrayList<Salgrade>();
			while (rset.next()) {
				Salgrade vo = new Salgrade();
				vo.setGrade(rset.getInt("grade"));
				vo.setLosal(rset.getInt("losal"));
				vo.setHisal(rset.getInt(3));
				result.add(vo);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}

	public int insert(Connection conn, Salgrade vo) {
		int result = -1;
		String sql = "insert into salgrade values (?, ?, ?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getGrade());
			pstmt.setInt(2, vo.getLosal());
			pstmt.setInt(3, vo.getHisal());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		System.out.println("grade insert result : " + result);
		return result;

	}

	public int delete(Connection conn, int grade) {
		int result = -1;
		String sql = "delete from salgrade where grade = ?";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, grade);
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		System.out.println("salgrade delete result : " + result);
		return result;
	}
}
