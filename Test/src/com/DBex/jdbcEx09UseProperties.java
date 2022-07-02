package com.DBex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class jdbcEx09UseProperties {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Properties pro = new Properties();
		pro.load(new FileInputStream("src/department.properties"));

		Connection con = null;
		PreparedStatement pstmt = null; // 동적 객체 선언

		try {

			con = ConnUtil.getConnection();

			// department.properties에 정의된 sql을 가져와서
			// preparedStatement를 만든다.

			pstmt = con.prepareStatement(pro.getProperty("department_insert"));

			pstmt.setInt(1, 100);
			pstmt.setString(2, "산업공학과");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "5호관");

			int i = pstmt.executeUpdate();

			System.out.println(i + "개 행이 추가 되었습니다.");

		} catch (SQLException ss) {
			ss.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException s) {
				s.printStackTrace();
			}
			try {
				if (con != null)
					con.close();
			} catch (SQLException s) {
				s.printStackTrace();
			}
		}

	}

}
