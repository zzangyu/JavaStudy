package com.DBex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcEx07 {
	public static void main(String[] args) {

		StringBuffer sql = new StringBuffer();

		sql.append("select a.name, a.profno, a.position, b.dname ");
		sql.append("from professor a, department b ");
		sql.append("where a.deptno = b.deptno ");
		sql.append("and a.deptno = ? ");

		Connection con = null;
		PreparedStatement pstmt = null; // 동적 객체 선언
		ResultSet rs = null;

		try {
			// 데이터베이스 연결
			con = ConnUtil.getConnection();

			pstmt = con.prepareStatement(sql.toString());

			pstmt.setInt(1, 203);

			// 쿼리 실행
			rs = pstmt.executeQuery();
			// 결과 집합에서 값 추출하기
			while (rs.next()) {
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getInt("profno") + "\t");
				System.out.print(rs.getString("position") + "\t");
				System.out.println(rs.getString("dname") + "\t");

			}

		} catch (SQLException ss) {
			ss.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
			} catch (SQLException s) {
				s.printStackTrace();
			}
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
