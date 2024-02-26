package kh.mclass.jdbc.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTemplate {
	// 인스턴스화 방지를 위한 private 생성자
	private JdbcTemplate() {
	}

	// 데이터베이스 연결을 얻기 위한 정적 메서드
	public static Connection getConnection() {
		Connection conn = null;
		try {
			// Oracle JDBC 드라이버 클래스 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 데이터베이스 연결
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "scott", "TIGER");
			if (conn != null) {
				System.out.println("연결 성공");
			} else {
				System.out.println("다시 해봐");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

	// 자동 커밋 설정 메서드
	public static void autoCommit(Connection con, boolean autocommit) {
		try {
			if (con != null)
				con.setAutoCommit(autocommit);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 커밋 수행 메서드
	public static void Commit(Connection con) {
		try {
			if (con != null)
				con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 롤백 수행 메서드
	public static void rollback(Connection con) {
		try {
			if (con != null)
				con.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Connection 닫기 메서드
	public static void close(Connection con) {
		try {
			if (con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Statement 닫기 메서드
	public static void close(Statement stmt) {
		try {
			if (stmt != null)
				stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// ResultSet 닫기 메서드
	public static void close(ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
