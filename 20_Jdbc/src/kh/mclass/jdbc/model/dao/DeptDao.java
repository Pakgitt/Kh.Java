package kh.mclass.jdbc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import static kh.mclass.jdbc.common.JdbcTemplate.*; // JdbcTemplate 클래스의 static 메서드들을 import
import kh.mclass.jdbc.model.vo.Dept;

public class DeptDao {

	// 부서 정보 조회 메서드
	public List<Dept> selectList(Connection conn) {
		String sql = "select * from dept";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Dept> result = null;

		try {
			pstmt = conn.prepareStatement(sql); // SQL 쿼리를 실행할 PreparedStatement 생성
			rs = pstmt.executeQuery(); // 쿼리 실행 결과를 ResultSet에 저장
			result = new ArrayList<Dept>();
			while (rs.next()) {
				Dept vo = new Dept();
				vo.setDeptno(rs.getInt("deptno"));
				vo.setDname(rs.getString("Dname"));
				vo.setLoc(rs.getString("loc"));
				result.add(vo); // 조회된 부서 정보를 리스트에 추가
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs); // ResultSet 닫기
			close(pstmt); // PreparedStatement 닫기
		}
		return result; // 조회된 부서 정보 리스트 반환
	}

	// 부서 정보 삽입 메서드
	public int insert(Connection conn, Dept vo) {
		int result = -1;
		String sql = "insert into dept values (?, ?, ?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql); // SQL 쿼리를 실행할 PreparedStatement 생성
			pstmt.setInt(1, vo.getDeptno()); // 첫 번째 매개변수 바인딩
			pstmt.setString(2, vo.getDname()); // 두 번째 매개변수 바인딩
			pstmt.setString(3, vo.getLoc()); // 세 번째 매개변수 바인딩
			result = pstmt.executeUpdate(); // 쿼리 실행 및 결과 반환
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt); // PreparedStatement 닫기
		}
		System.out.println("dept insert result : " + result);
		return result; // 삽입 결과 반환
	}

	// 부서 정보 삭제 메서드
	public int delete(Connection conn, int deptno) {
		int result = -1;
		String sql = "delete from dept where deptno = ?";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql); // SQL 쿼리를 실행할 PreparedStatement 생성
			pstmt.setInt(1, deptno); // 첫 번째 매개변수 바인딩
			result = pstmt.executeUpdate(); // 쿼리 실행 및 결과 반환
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt); // PreparedStatement 닫기
		}
		System.out.println("dept delete result : " + result);
		return result; // 삭제 결과 반환
	}
}
