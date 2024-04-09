package jdbc.common;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcTemplate {

	private JdbcTemplate() {

	}

	public static Connection getSemiConnection(boolean isLocalhost) {
		Connection conn = null;
		Properties prop = new Properties();

		try {
			String currenPath = JdbcTemplate.class.getResource("./").getPath();
			prop.load(new FileReader(currenPath + "driver.properties"));

			Class.forName(prop.getProperty("jdbc.driver"));
				conn = DriverManager.getConnection(prop.getProperty("jdbc.url"), 
												   prop.getProperty("jdbc.id"),
												   prop.getProperty("jdbc.pwd"));
			if (conn != null)
				System.out.println("연결 성공 세미보드드");
			else
				System.out.println("연결 실패 세미보드드");

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;

	}

	public static void main(String[] args) {
		getSemiConnection(true);
	}

	public static void autoCommit(Connection conn, boolean autocommit) {

	}

	public static void commit(Connection conn) {

	}

	public static void rollback(Connection conn) {

	}

	public static void close(Connection conn) {

	}

	public static void close(PreparedStatement pstmt) {

	}

	public static void close(ResultSet rset) {

	}

}
