package com.DBex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcEx06 {

	public static void main(String[] args) {

		StringBuffer sql = new StringBuffer();

		sql.append("update professor "); // 한줄로 쭉 써도 된다, 검색 안됨
		sql.append("set sal = ? where name= ?");

		Connection con = null;
		PreparedStatement pstmt = null; // 동적 객체 선언

		try {
			// 데이터베이스 연결
			con = ConnUtil.getConnection();

			pstmt = con.prepareStatement(sql.toString());

			pstmt.setInt(1, 500);
			pstmt.setString(2, "홍길동");

			// 쿼리 실행
			int i = pstmt.executeUpdate(); // 이걸 업데이트로 처리한다. db에 변동이 있을 때, select일 땐 next를 사용

//			if (pstmt.executeUpdate() == 1) {
//
//				System.out.println("삽입성공");
//
//			} else {
//				System.out.println("삽입실패");
//			}

			System.out.println(i + "개 행이 수정 되었습니다.");

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
