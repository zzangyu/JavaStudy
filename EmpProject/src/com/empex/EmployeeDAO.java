package com.empex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * [DAO : Data Access Object ]
 * - �������� ó���� �ϴ� �ܰ�
 * - �ڷḦ �Է¹޾Ƽ� �����ͺ��̽��� �Է°� ��ȸ�۾��� �Ѵ�.
 */

public class EmployeeDAO {

	// �ű� ����� ���
	public EmployeeVO getEmployeeRegist(EmployeeVO evo) throws Exception {

		// �ű� ��� ���� ��� ������ �ۼ�
		String dml = "insert into employee(no, name, jobGrade, department, email) values(employee_seq.nextval, ?, ?, ?, ?)";

		Connection con = null;
		PreparedStatement pstmt = null;
		EmployeeVO retval = null;

		try {
			// db�� ����
			con = DBUtil.getConnection();

			// �Է¹��� ����� ������ ó���ϱ� ���� sql�� ����
			pstmt = con.prepareStatement(dml);

			pstmt.setString(1, evo.getName());
			pstmt.setString(2, evo.getJobGrade());
			pstmt.setInt(3, evo.getDepartment());
			pstmt.setString(4, evo.getEmail());

			// ������ ���� �� ó�� ����� ���´�.
			int i = pstmt.executeUpdate();
			retval = new EmployeeVO();

			// �������� ����� VO�� �����Ѵ�.
			retval.setStatus(i + " ");

		} catch (SQLException e) {
			System.out.println("e:[" + e + "]");
		} catch (Exception ee) {
			System.out.println("e:[" + ee + "]");
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException s) {
				System.out.println("e:[" + s + "]");
			}
		}

		return retval;

	} // end getEmployeeregiste()

	// ������� ��ȣ, �̸��� �Է¹޾� ��� ������ ��ȸ�ϴ� ��� ����
	public EmployeeVO getEmployeeCheck(int no, String name) throws Exception {
		String dml = "select * from employee where no = ? and name = ?";

		Connection con = null;
		PreparedStatement pstmt = null;
		EmployeeVO retval = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnection();

			pstmt = con.prepareStatement(dml);

			pstmt.setInt(1, no);
			pstmt.setString(2, name);

			rs = pstmt.executeQuery(); // select������ ����

			if (rs.next()) {
				retval = new EmployeeVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
			}

		} catch (SQLException e) {
			System.out.println("e:[" + e + "]");
		} catch (Exception ee) {
			System.out.println("e:[" + ee + "]");
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException s) {
				System.out.println("e:[" + s + "]");
			}
		}

		return retval;

	}

	// ������� ��ȣ�� �Է¹޾Ƽ� ��� ������ ��ȸ
	public EmployeeVO getEmployeeNo(int no) throws Exception {
		String dml = "select * from employee where no = ? ";

		Connection con = null;
		PreparedStatement pstmt = null;
		EmployeeVO retval = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnection();

			pstmt = con.prepareStatement(dml);

			pstmt.setInt(1, no);

			rs = pstmt.executeQuery(); // select������ ����

			if (rs.next()) {
				retval = new EmployeeVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
			}

		} catch (SQLException e) {
			System.out.println("e:[" + e + "]");
		} catch (Exception ee) {
			System.out.println("e:[" + ee + "]");
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException s) {
				System.out.println("e:[" + s + "]");
			}
		}

		return retval;

	}

	// ������� �̸��� �Է¹޾Ƽ� ��� ������ ��ȸ
	public EmployeeVO getEmployeeName(String name) throws Exception {
		String dml = "select * from employee where name = ?";

		Connection con = null;
		PreparedStatement pstmt = null;
		EmployeeVO retval = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnection();

			pstmt = con.prepareStatement(dml);

			pstmt.setString(1, name);

			rs = pstmt.executeQuery(); // select������ ����

			if (rs.next()) {
				retval = new EmployeeVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
			}

		} catch (SQLException e) {
			System.out.println("e:[" + e + "]");
		} catch (Exception ee) {
			System.out.println("e:[" + ee + "]");
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException s) {
				System.out.println("e:[" + s + "]");
			}
		}

		return retval;

	}

	// ��ü ��� ��� ��ȸ
	public ArrayList<EmployeeVO> getEmployeeTotal() {

		ArrayList<EmployeeVO> list = new ArrayList<EmployeeVO>();
		String dml = "select * from employee";

		Connection con = null;
		PreparedStatement pstmt = null;
		EmployeeVO emVO = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnection();

			pstmt = con.prepareStatement(dml);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				emVO = new EmployeeVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
				list.add(emVO);
			}

		} catch (SQLException e) {
			System.out.println("e:[" + e + "]");
		} catch (Exception ee) {
			System.out.println("e:[" + ee + "]");
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException s) {
				System.out.println("e:[" + s + "]");
			}
		}

		return list;

	}

	public ArrayList<String> getColumnName() {

		ArrayList<String> columnName = new ArrayList<String>();
		String dml = "select * from employee";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;

		try {
			con = DBUtil.getConnection();

			pstmt = con.prepareStatement(dml);

			rs = pstmt.executeQuery();
			rsmd = rs.getMetaData();

			int cols = rsmd.getColumnCount();

			for (int i = 1; i < cols; i++) {
				columnName.add(rsmd.getColumnName(i));
			}

		} catch (SQLException e) {
			System.out.println("e:[" + e + "]");
		} catch (Exception ee) {
			System.out.println("e:[" + ee + "]");
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException s) {
				System.out.println("e:[" + s + "]");
			}
		}

		return columnName;

	}
}
