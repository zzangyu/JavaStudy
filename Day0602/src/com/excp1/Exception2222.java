package com.excp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Exception2222 {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;

		try {
			Class.forName("oracle.jdbc.drive.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		} catch (ClassNotFoundException e) {
			System.out.println("데이터베이스 연결 실패 ...");
		} catch (SQLException e) {
			System.out.println("드라이브가 없습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException e2) {
			}
			try {
				if (con != null)
					con.close();
			} catch (SQLException e2) {
			}
		}
	}

}
