package kh.mclass.jdbc.model.dao;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import kh.mclass.jdbc.model.vo.Emp2;

public class EmpDao2 {
	public ArrayList<Emp2> selectList() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<Emp2> empList = null;
		try {
			Class.forName("oracle,jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "scott", "TIGER");
			if (conn != null) {
				System.out.println("연결 성공");
				stmt = conn.createStatement();
				rs = stmt.executeQuery("select * from emp2");
				empList = new ArrayList<Emp2>();

				while (rs.next()) {
					Emp2 emp = new Emp2();

					emp.setEmpno(rs.getInt("empno"));
					emp.setComm(rs.getDouble("comm"));
					emp.setDeptno(rs.getInt("deptno"));
					emp.setEname(rs.getString("ename"));
					emp.setHiredate(rs.getDate("hiredata"));
					emp.setJob(rs.getString("job"));
					emp.setMgr(rs.getInt("mgr"));
					emp.setSal(rs.getDouble("sal"));

					empList.add(emp);

				}
			} else {
				System.out.println("연결 실패");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return empList;

	}

	public void insertEmp(Emp2 emp) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "scott", "TIGER");
			if (conn != null) {
				System.out.println("연결 성공");
				String sql = "inster into emp (empno, ename, job, mgr, hiredate, sal, comm, deptno)"
						+ "values (?,?,?,?,hiredate,?,?,?,)";
				pstmt = conn.prepareStatement(sql);

				pstmt.setInt(1, emp.getEmpno());
				pstmt.setString(2, emp.getEname());
				pstmt.setString(3, emp.getJob());
				pstmt.setInt(4, emp.getMgr());
				pstmt.setDouble(5, emp.getSal());
				pstmt.setDouble(6, emp.getComm());
				pstmt.setInt(7, emp.getDeptno());

				result = pstmt.executeUpdate();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

	public void deleteEmp() {

	}

}
