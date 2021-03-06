package com.DBex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * Transaction
 *		- 트랜잭션은 여러개의 작업을 하나의 논리적인 작업 단위로 묶어주는 것을 말한다.
 * 		- 하나의 작업단위내에 전체 작업들이 모두 올바르게 수행되거나, 또는 전체 작업이 모두 수행되지 않도록 한다.
 *
 * 		method 종류
 * 		1. commit()
 * 		2. rollback()
 * 		3. rollback(Savepoint)
 * 		4. setSavepoint(String name)
 * 		5. setAutoCommit(boolean value)
 */

public class jdbcEx08 {

	public static void main(String[] args) {
		/*
		 * Transaction: 논리적인 작업단위 inset, delete, update등의 작업들을 하나의 논리적인 작업단위로 묶어서 쿼리 실행시
		 * 모든 작업이 정상처리 된 경우에는 commit을 실행해서 db에 반영하고, 쿼리 실행 중 하나라도 정상처리가 안된 경우에는
		 * rollback을 실행해서 작업단위내의 모든 작업을 취소한다.
		 */
		StringBuffer sql1 = new StringBuffer();
		sql1.append("insert into department values(?,?,?,?)");

		StringBuffer sql2 = new StringBuffer();
		sql2.append("update department set dname = ?, loc = ? where deptno = ?");

		Connection con = null;
		PreparedStatement pstmt = null; // 동적 객체 선언

		try {
			// ------------트랜잭션 시작------------
			// 하나의 논리적인 작업 단위 시작
			// 데이터베이스 연결
			con = ConnUtil.getConnection();

			// autoCommit 기능 비활성화 시킴
			con.setAutoCommit(false);

			// ------------첫번째 작업 시작------------
			pstmt = con.prepareStatement(sql1.toString());
			pstmt.setInt(1, 255);
			pstmt.setString(2, "핵물리학과");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "9호관");
			pstmt.executeUpdate();
			// ------------첫번째 작업 종료------------
			// ------------두번째 작업 시작------------
			pstmt = con.prepareStatement(sql2.toString());
			pstmt.setString(1, "생명공학과");
			pstmt.setString(2, "8호관");
			pstmt.setInt(3, 255);
			pstmt.executeUpdate();
			// ------------두번째 작업 종료------------
			// 쿼리가 정상적으로 실행된 경우 db에 반영한다.
			con.commit();
			System.out.println("db에 정상적으로 반영되었습니다.");

		} catch (SQLException ss) {
			// 쿼리가 정상적으로 실행되지 않을 경우
			try {
				con.rollback();
				System.out.println("db에 작업이 취소 되었습니다.");
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

			// ------------트랜잭션 종료------------
		}

	}

}
