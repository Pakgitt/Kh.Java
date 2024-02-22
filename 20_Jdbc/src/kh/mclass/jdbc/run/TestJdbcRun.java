package kh.mclass.jdbc.run;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// port : 1521

public class TestJdbcRun {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // driver jar 있는지 확인
			
			// DriverManager
			conn = DriverManager.getConnection
					("jdbc:oracle:thin:@127.0.0.1:1521:XE", "system", "oracle"); // 계정 이름은 대소문자 상관 X, PW는 대소문자 판별
																						
			if (conn != null) {
				System.out.println("연결 성공");
			} else {
				System.out.println("연결 실패");
			}

			stmt = conn.createStatement();
			stmt.executeQuery("select id, last_name from emp"); // 대문자 자동변환
			int result = stmt.executeUpdate("UPDATE EMP SET LAST_NAME = ‘KIM’ WHERE ID = ‘10000’");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null)conn.close();
			} catch (SQLException e) {
			}
		}
	}

}
