package com.DBex;

import java.sql.Connection;
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
 * 		PreparedStatement�� PreparedStatement�� ���ε� ������ ���� �������ִ� setXXX() method�� �����Ѵ�.
 *
 */

public class jdbcEx05 {
	public static void main(String[] args) {

		// PreparedStatement�� ����ϴ� ��� �ݵ��
		// SQL�������� ���� ������ ��ü�� �κ��� ?�� ó���Ѵ�. �ڡڡڡڡڡڡڡڡڡ�
		// ?�� DataBase���� SQL���� �ÿ� ���� ������ ��ü�ȴ�.

		StringBuffer sql = new StringBuffer();

		sql.append("insert into professor "); // ���ٷ� �� �ᵵ �ȴ�, �˻� �ȵ�
		sql.append("values(?,?,?,?,?,sysdate,?,?)");

		Connection con = null;
		PreparedStatement pstmt = null; // ���� ��ü ����

		try {
			// �����ͺ��̽� ����
			con = ConnUtil.getConnection();

			pstmt = con.prepareStatement(sql.toString());
			// ������ �Ķ���� ����
			// ������ ?(���ε� ����)�� ��ü�� �������� �����Ѵ�.

			pstmt.setInt(1, 9920);
			pstmt.setString(2, "ȫ�浿");
			pstmt.setString(3, "gildongHong");
			pstmt.setString(4, "����");
			pstmt.setInt(5, 250);
			pstmt.setInt(6, 32);
			pstmt.setInt(7, 203);

			// ���� ����
			int i = pstmt.executeUpdate(); // �̰� ������Ʈ�� ó���Ѵ�. db�� ������ ���� ��, select�� �� next�� ���

//			if (pstmt.executeUpdate() == 1) {
//
//				System.out.println("���Լ���");
//
//			} else {
//				System.out.println("���Խ���");
//			}

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
