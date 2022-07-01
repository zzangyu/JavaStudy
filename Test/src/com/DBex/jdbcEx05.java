package com.DBex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/*
 * 오라클로 전송된 SQL문은 Parsing - > execute plan - > fetch(cache안에서 데이터를 빼오는 작업)의 작업을 한 이후에
 * SQL문의 수행결과를 Data Buffer Cache에 저장한다.
 * parsing: 데이터를 분해 분석하여 원하는 형태로 조립하고 다시 빼내는 프로그램을 말합니다.
 * 웹상에서 주어진 정보를 내가 원하는 형태로 가공하여 서버에서 불러들이는 것입니다.
 *
 * 똑같은 SQL이 전송되면 Library cache에 저장된 SQL의 Parsing 결과와 execute plan의 그대로 사용하게 됨으로 속도 향상에 도움을 준다.
 * PreparedStatement는 SQL의 형태는 Statement와 동일하나 조건이나 변수값이 다른 문장을 바인딩 변수를 사용해서 변수처리함으로써
 * 항상 동일한 SQL문을 동일하게 처리하게 할 수 있다.
 *
 * -- PreparedStatement 객체의 생성과 바인딩 변수의 사용
 * 		바인딩 변수: 실제값으로 대체될 부분에 사용한다.
 * 																	deptno, dname, college, loc순
 * 		String sql = "insert into department values(?,?,?,?)"; << department column이 4개라 물음표 4개, 물음표가 바인딩 변수임
 * 																				 	 << index값은 1부터 시작한다.
 * 		PreparedStatement pstmt = con.preparedStatement(sql);
 * 		바인딩 변수의 개수만큼 순서대로 해당 변수와 대체될 값을 지정해준다.
 * 		pstmt.setInt(1, 203);
 * 		pstmt.setString(2,"컴퓨터공학");
 * 		pstmt.setInt(3, 200);
 * 		pstmt.setInt(4, "7호관");
 *
 * 		※※※※※※ 바인딩 변수는 절대 컬럼명에는 사용할 수 없다.
 *
 * 		PreparedStatement는 PreparedStatement의 바인딩 변수에 값을 지정해주는 setXXX() method를 제공한다.
 *
 */

public class jdbcEx05 {
	public static void main(String[] args) {

		// PreparedStatement를 사용하는 경우 반드시
		// SQL쿼리에서 실제 값으로 대체될 부분을 ?로 처리한다. ★★★★★★★★★★
		// ?는 DataBase에서 SQL실행 시에 실제 값으로 대체된다.

		StringBuffer sql = new StringBuffer();

		sql.append("insert into professor "); // 한줄로 쭉 써도 된다, 검색 안됨
		sql.append("values(?,?,?,?,?,sysdate,?,?)");

		Connection con = null;
		PreparedStatement pstmt = null; // 동적 객체 선언

		try {
			// 데이터베이스 연결
			con = ConnUtil.getConnection();

			pstmt = con.prepareStatement(sql.toString());
			// 쿼리의 파라미터 세팅
			// 쿼리의 ?(바인딩 변수)에 대체될 실제값을 지정한다.

			pstmt.setInt(1, 9920);
			pstmt.setString(2, "홍길동");
			pstmt.setString(3, "gildongHong");
			pstmt.setString(4, "점임");
			pstmt.setInt(5, 250);
			pstmt.setInt(6, 32);
			pstmt.setInt(7, 203);

			// 쿼리 실행
			int i = pstmt.executeUpdate(); // 이걸 업데이트로 처리한다. db에 변동이 있을 때, select일 땐 next를 사용

//			if (pstmt.executeUpdate() == 1) {
//
//				System.out.println("삽입성공");
//
//			} else {
//				System.out.println("삽입실패");
//			}

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
