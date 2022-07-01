package com.DBex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/*
 * ����Ŭ�� ���۵� SQL���� Parsing - > execute plan - > fetch(cache�ȿ��� �����͸� ������ �۾�)�� �۾��� �� ���Ŀ�
 * SQL���� �������� Data Buffer Cache�� �����Ѵ�.
 * parsing: �����͸� ���� �м��Ͽ� ���ϴ� ���·� �����ϰ� �ٽ� ������ ���α׷��� ���մϴ�.
 * ���󿡼� �־��� ������ ���� ���ϴ� ���·� �����Ͽ� �������� �ҷ����̴� ���Դϴ�.
 *
 * �Ȱ��� SQL�� ���۵Ǹ� Library cache�� ����� SQL�� Parsing ����� execute plan�� �״�� ����ϰ� ������ �ӵ� ��� ������ �ش�.
 * PreparedStatement�� SQL�� ���´� Statement�� �����ϳ� �����̳� �������� �ٸ� ������ ���ε� ������ ����ؼ� ����ó�������ν�
 * �׻� ������ SQL���� �����ϰ� ó���ϰ� �� �� �ִ�.
 *
 * -- PreparedStatement ��ü�� ������ ���ε� ������ ���
 * 		���ε� ����: ���������� ��ü�� �κп� ����Ѵ�.
 * 																	deptno, dname, college, loc��
 * 		String sql = "insert into department values(?,?,?,?)"; << department column�� 4���� ����ǥ 4��, ����ǥ�� ���ε� ������
 * 																				 	 << index���� 1���� �����Ѵ�.
 * 		PreparedStatement pstmt = con.preparedStatement(sql);
 * 		���ε� ������ ������ŭ ������� �ش� ������ ��ü�� ���� �������ش�.
 * 		pstmt.setInt(1, 203);
 * 		pstmt.setString(2,"��ǻ�Ͱ���");
 * 		pstmt.setInt(3, 200);
 * 		pstmt.setInt(4, "7ȣ��");
 *
 * 		�ءءءءء� ���ε� ������ ���� �÷����� ����� �� ����.
 *
 */

public class jdbcEx05 {
	public static void main(String[] args) {

		StringBuffer sql = new StringBuffer();

		sql.append(""); // ���ٷ� �� �ᵵ �ȴ�, �˻� �ȵ�
		sql.append("");
		sql.append("");

		Connection con = null;
		PreparedStatement pstmt = null; //

		try {
			// ����̹� �˻�
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "scott";
			String password = "tiger";

			// DB����
			con = DriverManager.getConnection(url, id, password);

		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
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
