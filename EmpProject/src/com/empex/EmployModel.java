package com.empex;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

// 사원 전체를 보기 위한 객체
public class EmployModel extends AbstractTableModel {

	Object[][] data;
	Object[] columnName;

	EmployeeDAO emDao = new EmployeeDAO(); // db 연결
	EmployeeVO emVo;
	ArrayList<String> title; // column Name
	ArrayList<EmployeeVO> list;

	public EmployModel() {
		// 열의 개수와 행의 개수를 알아야 2차원 배열을 선언할 수 있다.
		// 테이블에서 column의 이름을 얻어와서 1차원 배열로 선언한다.

		title = emDao.getColumnName();
		columnName = title.toArray(); // 배열로 삽입 !

		int columnCount = title.size();
		list = emDao.getEmployeeTotal();

		int rowCount = list.size(); // 행의 개수가 나옴

		data = new Object[rowCount][columnCount];

		for (int index = 0; index < rowCount; index++) {
			emVo = list.get(index);

			data[index][0] = emVo.getNo();
			data[index][1] = emVo.getName();
			data[index][2] = emVo.getJobGrade();
			data[index][3] = emVo.getDepartment();
			data[index][4] = emVo.getEmail();
		}

	}

	@Override
	public int getRowCount() {
		if (data == null) {
			return 0;
		} else {
			return data.length;
		}
	}

	@Override
	public int getColumnCount() {

		if (columnName == null) {
			return 0;
		} else {
			return columnName.length;
		}
	}

	@Override
	public String getColumnName(int column) {

		return (String) columnName[column];

	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		return data[rowIndex][columnIndex];

	}

}
