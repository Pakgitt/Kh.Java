package kh.mclass.jdbc.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTemplate {
//	private JdbcTemplate() {
//	}

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "scott", "TIGER");
			if (conn != null)
				System.out.println("연결 성공");
			else
				System.out.println("연결 실패");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void autoCommit(Connection conn, boolean autocommit) {
		try {
			if (conn != null)
				conn.setAutoCommit(autocommit);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void commit(Connection conn) {
		try {
			if (conn != null)
				;
			conn.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void rollback(Connection conn) {
		try {
			if (conn != null)
				conn.rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void close(Statement stmt) {
		try {
			if (stmt != null)
				stmt.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void close(ResultSet rset) {
		try {
			rset.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void close(Connection conn) {
		try {
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
