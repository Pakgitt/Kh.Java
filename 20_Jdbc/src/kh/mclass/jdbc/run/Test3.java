package kh.mclass.jdbc.run;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test3 {
	public static void main(String[] args) {
		ResultSet rset = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:orcale:this:@localhost:1521:EX", "scott", "TIGER");
			if (conn != null) {
				System.out.println("연결 성공");
				Statement stmt = conn.createStatement();
				rset = stmt.executeQuery("select * from emp");
				while (rset.next()) {
					System.out.println("sal");
					System.out.println("comm");
					System.out.println("deptno");
				}
				System.out.println("다 읽었음");
			} else {
				System.out.println("연결 실패");
			}

		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
