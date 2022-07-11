package com.DBex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
* JDBC(Java data base connetion의 약자)를 이용한 데이터베이스 연결 방법
*
* 총 6단계 이루어져있다.
* 1.단계
* - import java.sql.*;
* 2.단계
* - Driver 검색단계
*   oracle : oracle.jdbc.driver.OracleDriver
* 3.단계
* - DataBase 연결
*   Connection con = DriverManager.getConnetion(url, id, password);
*
*      oracle url 이란?
*      jdbc:oracle:thin:@localhost:1521:SID(oracle의 SID)
*        id : 오라클 사용자 계정 ex) scott
*      password : 오라클 사용자 계정의 비밀번호
* ------------------------------여기까지는 무조건 기본이다 --------------------------------------------
* 4.단계
*   -쿼리문 작성
*
*   정적 -- 같이 정해져있는거
*   statement Class(정적)
*   -Statement stmt = con.createStatement();
      ResultSet re = stmt.ecequte(Query);// select
*    ResultSet re = stmt.insert);//  insert, update, delete
*   동적 -- 값이 상황에 따라 달름
*   PreparedStatment(동적)
*    -PreparedStatment pmst = con.prepareStatement(쿼리);
*
*       ResultSet re = stmt.execute(Query); //select
*  ResultSet re = stmt.ecequte(Query);insert, update, delete
*
*
* 5.단계 : 쿼리 결과 저장
* ResultSet re = stmt.ecequte(Query);//
* ResultSet re = stmt.insert);//
*  ResultSet re = stmt.ecequte(Query); //
*  ResultSet re = stmt.ecequte(Query);
*
*  6단계
*  - 사용후 반드시 close() 메소드를 실행한다
*     연결해제
* 123,6단계는 무조건 실행야한다.
*/
public class jdbcex01 {

	public static void main(String[] args) {
		// DB 연결의 기본 !!!!!!!!!!!!!!!!!!!!!!!!! 저장해서 쓰거라
		StringBuffer sql = new StringBuffer();

		sql.append(""); // 한줄로 쭉 써도 된다, 검색 안됨
		sql.append("");
		sql.append("");

		Connection con = null;
		Statement stmt = null;

		try {
			// 드라이버 검색
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "scott";
			String password = "tiger";

			// DB연결
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
