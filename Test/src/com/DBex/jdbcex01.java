package com.DBex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
* JDBC(Java data base connetion�� ����)�� �̿��� �����ͺ��̽� ���� ���
*
* �� 6�ܰ� �̷�����ִ�.
* 1.�ܰ�
* - import java.sql.*;
* 2.�ܰ�
* - Driver �˻��ܰ�
*   oracle : oracle.jdbc.driver.OracleDriver
* 3.�ܰ�
* - DataBase ����
*   Connection con = DriverManager.getConnetion(url, id, password);
*
*      oracle url �̶�?
*      jdbc:oracle:thin:@localhost:1521:SID(oracle�� SID)
*        id : ����Ŭ ����� ���� ex) scott
*      password : ����Ŭ ����� ������ ��й�ȣ
* ------------------------------��������� ������ �⺻�̴� --------------------------------------------
* 4.�ܰ�
*   -������ �ۼ�
*
*   ���� -- ���� �������ִ°�
*   statement Class(����)
*   -Statement stmt = con.createStatement();
      ResultSet re = stmt.ecequte(Query);// select
*    ResultSet re = stmt.insert);//  insert, update, delete
*   ���� -- ���� ��Ȳ�� ���� �޸�
*   PreparedStatment(����)
*    -PreparedStatment pmst = con.prepareStatement(����);
*
*       ResultSet re = stmt.execute(Query); //select
*  ResultSet re = stmt.ecequte(Query);insert, update, delete
*
*
* 5.�ܰ� : ���� ��� ����
* ResultSet re = stmt.ecequte(Query);//
* ResultSet re = stmt.insert);//
*  ResultSet re = stmt.ecequte(Query); //
*  ResultSet re = stmt.ecequte(Query);
*
*  6�ܰ�
*  - ����� �ݵ�� close() �޼ҵ带 �����Ѵ�
*     ��������
* 123,6�ܰ�� ������ ������Ѵ�.
*/
public class jdbcex01 {

	public static void main(String[] args) {
		// DB ������ �⺻ !!!!!!!!!!!!!!!!!!!!!!!!! �����ؼ� ���Ŷ�
		StringBuffer sql = new StringBuffer();

		sql.append(""); // ���ٷ� �� �ᵵ �ȴ�, �˻� �ȵ�
		sql.append("");
		sql.append("");

		Connection con = null;
		Statement stmt = null;

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
				if (con != null)
					con.close();
			} catch (SQLException s) {
			}
		}

	}
}
