package kh.mclass.jdbc.model.dao;

import static kh.mclass.jdbc.common.JdbcTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kh.mclass.jdbc.model.vo.Salgrade;

public class SalgradeDao {
	public Salgrade selectOne(Connection conn, int grade) {
		Salgrade result = null;
		String sql = "";
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			if (rset.next()) {
				result = new Salgrade();
				// TODO
				result.setGrade(rset.getInt("grade"));
				result.setLosal(rset.getInt("losal"));
				result.setHisal(rset.getInt("hisal"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return result;

	}

	// 부서 정보 조회 메서드
	public List<Salgrade> selectList(Connection conn) {
		List<Salgrade> result = null;
		String sql = "select * from Salgrade";
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(sql); // SQL 쿼리를 실행할 PreparedStatement 생성
			rs = pstmt.executeQuery(); // 쿼리 실행 결과를 ResultSet에 저장
			result = new ArrayList<Salgrade>();
			while (rs.next()) {
				Salgrade vo = new Salgrade();
				vo.setGrade(rs.getInt("grade"));
				vo.setLosal(rs.getInt("losal"));
				vo.setHisal(rs.getInt("hisal"));
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
	public int insert(Connection conn, Salgrade vo) {
		int result = -1;
		String sql = "insert into Salgrade values (?, ?, ?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql); // SQL 쿼리를 실행할 PreparedStatement 생성
			pstmt.setInt(1, vo.getGrade()); // 첫 번째 매개변수 바인딩
			pstmt.setInt(2, vo.getLosal()); // 두 번째 매개변수 바인딩
			pstmt.setInt(3, vo.getHisal()); // 세 번째 매개변수 바인딩
			result = pstmt.executeUpdate(); // 쿼리 실행 및 결과 반환
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt); // PreparedStatement 닫기
		}
		System.out.println("Salgrade insert result : " + result);
		return result; // 삽입 결과 반환
	}

	// 부서 정보 삭제 메서드
	public int delete(Connection conn, int grade) {
		int result = -1;
		String sql = "delete from Salgrade where grade = ?";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql); // SQL 쿼리를 실행할 PreparedStatement 생성
			pstmt.setInt(1, grade); // 첫 번째 매개변수 바인딩
			result = pstmt.executeUpdate(); // 쿼리 실행 및 결과 반환
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt); // PreparedStatement 닫기
		}
		System.out.println("Salgrade delete result : " + result);
		return result; // 삭제 결과 반환
	}

	public int update(Connection conn, Salgrade vo) {
		int result = 0;
		String sql = "TODO";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeUpdate();
			// TODO
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		System.out.println("Salgrade update result : " + result);
		return result;
	}
}
