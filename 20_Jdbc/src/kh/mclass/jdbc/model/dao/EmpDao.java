package kh.mclass.jdbc.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kh.mclass.jdbc.model.vo.Emp;

public class EmpDao {

	// 사원 목록 조회
	public List<Emp> selectList() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		List<Emp> empList = null;

		try {
			// JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 데이터베이스 연결
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "scott", "TIGER");

			if (conn != null) {
				System.out.println("연결 성공");

				// SQL 실행을 위한 Statement 객체 생성
				stmt = conn.createStatement();

				// SQL 쿼리 실행
				rset = stmt.executeQuery("select * from emp");

				// List 생성
				empList = new ArrayList<Emp>();

				// ResultSet에서 데이터 읽어와서 Emp 객체에 저장 후 List에 추가
				while (rset.next()) {
					Emp emp = new Emp();

					// Emp 객체 값 설정
					emp.setEmpno(rset.getInt("empno"));
					emp.setComm(rset.getDouble("comm"));
					emp.setDeptno(rset.getInt("deptno"));
					emp.setEname(rset.getString("ename"));
					emp.setHiredate(rset.getDate("hiredate"));
					emp.setJob(rset.getString("job"));
					emp.setMgr(rset.getInt("mgr"));
					emp.setSal(rset.getDouble("sal"));

					// List에 Emp 객체 추가
					empList.add(emp);
				}
			} else {
				System.out.println("연결 실패");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 리소스 해제
			try {
				if (rset != null)
					rset.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// 조회된 Emp 객체들을 담은 List 반환
		return empList;
	}

	// 사원 추가
	public int insertEmp(Emp emp) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = -1;

		try {
			// JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 데이터베이스 연결
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "scott", "TIGER");

			if (conn != null) {
				System.out.println("연결 성공");

				// SQL 실행을 위한 PreparedStatement 객체 생성
				String sql = "insert into emp (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) "
						+ "values (?,?,?,?,SYSDATE,?,?,?)";
//				Emp emp = new Emp(empno, ename, job, mgr, hiredate, sal, comm, deptno);
//				int result = pstmt.executeUpdate("insert into emp "
//						+ "(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO ) " + " values " + "("
//						+ emp.getEmpno() + ", '" + emp.getEname() + "', '" + emp.getJob() + "' , " + emp.getMgr() + ","
//						+ " SYSDATE, " + emp.getSal() + ", " + emp.getComm() + ", " + emp.getDeptno() + " )");
//				System.out.println("결과확인" + result);
//			}
				pstmt = conn.prepareStatement(sql);

				// SQL 쿼리에 값 채우기
				pstmt.setInt(1, emp.getEmpno());
				pstmt.setString(2, emp.getEname());
				pstmt.setString(3, emp.getJob());
				pstmt.setInt(4, emp.getMgr());
				pstmt.setDouble(5, emp.getSal());
				pstmt.setDouble(6, emp.getComm());
				pstmt.setInt(7, emp.getDeptno());

				// SQL 쿼리 실행 및 결과 저장
				result = pstmt.executeUpdate();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 리소스 해제
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// 삽입 결과 반환
		return result;
	}

	// 사원 삭제
	public void deleteEmp() {
		// 삭제 로직을 추가해야 함
	}
}
