package mclass.jdbc.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTemplate {

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "scott", "TIGER");
			if (conn != null) {
				System.out.println("연결 됨");
			} else {
				System.out.println("연결싯파이");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;

	}

	public static void autoCommit(Connection conn, boolean autocommit) {
		try {
			if (conn != null)
				conn.setAutoCommit(autocommit);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void commit(Connection con) {
		try {
			if (con != null)
				con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void rollback(Connection con) {
		try {
			if (con != null)
				con.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(Connection con) {
		try {
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void close(Statement stmt) {
		try {
			if (stmt != null)
				stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void close(ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
