package com.DBex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcEx06 {

	public static void main(String[] args) {

		StringBuffer sql = new StringBuffer();

		sql.append("update professor "); // ���ٷ� �� �ᵵ �ȴ�, �˻� �ȵ�
		sql.append("set sal = ? where name= ?");

		Connection con = null;
		PreparedStatement pstmt = null; // ���� ��ü ����

		try {
			// �����ͺ��̽� ����
			con = ConnUtil.getConnection();

			pstmt = con.prepareStatement(sql.toString());

			pstmt.setInt(1, 500);
			pstmt.setString(2, "ȫ�浿");

			// ���� ����
			int i = pstmt.executeUpdate(); // �̰� ������Ʈ�� ó���Ѵ�. db�� ������ ���� ��, select�� �� next�� ���

//			if (pstmt.executeUpdate() == 1) {
//
//				System.out.println("���Լ���");
//
//			} else {
//				System.out.println("���Խ���");
//			}

			System.out.println(i + "�� ���� ���� �Ǿ����ϴ�.");

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
