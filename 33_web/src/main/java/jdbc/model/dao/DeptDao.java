package jdbc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static jdbc.common.JdbcTemplate.*;
import jdbc.model.vo.Dept;
import oracle.jdbc.proxy.annotation.Pre;

public class DeptDao {
	public int selectOne(Connection conn, int deptno) {
		return deptno;
//		String sql = "select * from dept where = ?";
//		int result = 0;
//		ResultSet rset = null;
//		PreparedStatement pstmt = null;
//
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, deptno);
//			result = pstmt.executeQuery();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			close(pstmt);
//		}
//		System.out.println("dept delete result : " + result);
	}

	public List<Dept> selectList(Connection conn) {
		String sql = "select * from dept";
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		List<Dept> result = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			result = new ArrayList<Dept>();

			while (rset.next()) {
				Dept vo = new Dept();
				vo.setDeptno(rset.getInt("deptno"));
				vo.setDname(rset.getString("dname"));
				vo.setLoc(rset.getString("loc"));

				result.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return result;

	}

	public int insert(Connection conn, Dept vo) {
		int result = -1;
		String sql = "insert into dept values (?, ?, ?)";
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getDeptno());
			pstmt.setString(2, vo.getDname());
			pstmt.setString(3, vo.getLoc());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		System.out.println("dept insert result : " + result);
		return result;

	}

	public int delete(Connection conn, int deptno) {
		int result = 0;
		String sql = "delete from dept where deptno = ? ";
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		System.out.println("dept delete result : " + result);
		return result;
	}

}
