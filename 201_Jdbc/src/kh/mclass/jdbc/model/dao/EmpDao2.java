package kh.mclass.jdbc.model.dao;

import static kh.mclass.jdbc.common.JdbcTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kh.mclass.jdbc.model.vo.Emp;

public class EmpDao2 {

	public List<Emp> selectList(Connection conn) {
		String sql = "select * from emp";
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		List<Emp> result = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			result = new ArrayList<Emp>();
			while (rset.next()) {
				Emp vo = new Emp();
				vo.setEmpno(rset.getInt("empno"));
				vo.setEname(rset.getString(2));
				vo.setJob(rset.getString(3));
				vo.setMgr(rset.getInt("mgr"));
				vo.setHiredate(rset.getDate(5));
				vo.setSal(rset.getDouble("sal"));
				vo.setComm(rset.getDouble("comm"));
				vo.setDeptno(rset.getInt("deptno"));

				result.add(vo);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return result;

	}

	public int insert(Connection conn, Emp vo) {
		int result = -1;
		String sql = "insert into emp values(?,?,?,?,SYSDATE,?,?,?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getEmpno());
			pstmt.setString(2, vo.getEname());
			pstmt.setString(3, vo.getJob());
			pstmt.setInt(4, vo.getMgr());
			pstmt.setDouble(5, vo.getSal());
			pstmt.setDouble(6, vo.getComm());
			pstmt.setInt(7, vo.getDeptno());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);

		}
		System.out.println("emp insert result : " + result);
		return result;
	}

	public int delete(Connection conn, int empno) {
		int result = -1;
		String sql = "delete from emp where empno ? =";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empno);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		System.out.println("emp delete result : " + result);
		return result;

	}

}
