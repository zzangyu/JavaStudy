package com.DBex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * Transaction
 *		- Ʈ������� �������� �۾��� �ϳ��� ������ �۾� ������ �����ִ� ���� ���Ѵ�.
 * 		- �ϳ��� �۾��������� ��ü �۾����� ��� �ùٸ��� ����ǰų�, �Ǵ� ��ü �۾��� ��� ������� �ʵ��� �Ѵ�.
 *
 * 		method ����
 * 		1. commit()
 * 		2. rollback()
 * 		3. rollback(Savepoint)
 * 		4. setSavepoint(String name)
 * 		5. setAutoCommit(boolean value)
 */

public class jdbcEx08 {

	public static void main(String[] args) {
		/*
		 * Transaction: ������ �۾����� inset, delete, update���� �۾����� �ϳ��� ������ �۾������� ��� ���� �����
		 * ��� �۾��� ����ó�� �� ��쿡�� commit�� �����ؼ� db�� �ݿ��ϰ�, ���� ���� �� �ϳ��� ����ó���� �ȵ� ��쿡��
		 * rollback�� �����ؼ� �۾��������� ��� �۾��� ����Ѵ�.
		 */
		StringBuffer sql1 = new StringBuffer();
		sql1.append("insert into department values(?,?,?,?)");

		StringBuffer sql2 = new StringBuffer();
		sql2.append("update department set dname = ?, loc = ? where deptno = ?");

		Connection con = null;
		PreparedStatement pstmt = null; // ���� ��ü ����

		try {
			// ------------Ʈ����� ����------------
			// �ϳ��� ������ �۾� ���� ����
			// �����ͺ��̽� ����
			con = ConnUtil.getConnection();

			// autoCommit ��� ��Ȱ��ȭ ��Ŵ
			con.setAutoCommit(false);

			// ------------ù��° �۾� ����------------
			pstmt = con.prepareStatement(sql1.toString());
			pstmt.setInt(1, 255);
			pstmt.setString(2, "�ٹ����а�");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "9ȣ��");
			pstmt.executeUpdate();
			// ------------ù��° �۾� ����------------
			// ------------�ι�° �۾� ����------------
			pstmt = con.prepareStatement(sql2.toString());
			pstmt.setString(1, "������а�");
			pstmt.setString(2, "8ȣ��");
			pstmt.setInt(3, 255);
			pstmt.executeUpdate();
			// ------------�ι�° �۾� ����------------
			// ������ ���������� ����� ��� db�� �ݿ��Ѵ�.
			con.commit();
			System.out.println("db�� ���������� �ݿ��Ǿ����ϴ�.");

		} catch (SQLException ss) {
			// ������ ���������� ������� ���� ���
			try {
				con.rollback();
				System.out.println("db�� �۾��� ��� �Ǿ����ϴ�.");
			} catch (SQLException s) {
				s.printStackTrace();
			}
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

			// ------------Ʈ����� ����------------
		}

	}

}
