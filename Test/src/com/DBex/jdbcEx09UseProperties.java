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
		PreparedStatement pstmt = null; // ���� ��ü ����

		try {

			con = ConnUtil.getConnection();

			// department.properties�� ���ǵ� sql�� �����ͼ�
			// preparedStatement�� �����.

			pstmt = con.prepareStatement(pro.getProperty("department_insert"));

			pstmt.setInt(1, 100);
			pstmt.setString(2, "������а�");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "5ȣ��");

			int i = pstmt.executeUpdate();

			System.out.println(i + "�� ���� �߰� �Ǿ����ϴ�.");

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
