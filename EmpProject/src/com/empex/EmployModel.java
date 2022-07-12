package com.empex;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

// ��� ��ü�� ���� ���� ��ü
public class EmployModel extends AbstractTableModel {

	Object[][] data;
	Object[] columnName;

	EmployeeDAO emDao = new EmployeeDAO(); // db ����
	EmployeeVO emVo;
	ArrayList<String> title; // column Name
	ArrayList<EmployeeVO> list;

	public EmployModel() {
		// ���� ������ ���� ������ �˾ƾ� 2���� �迭�� ������ �� �ִ�.
		// ���̺��� column�� �̸��� ���ͼ� 1���� �迭�� �����Ѵ�.

		title = emDao.getColumnName();
		columnName = title.toArray(); // �迭�� ���� !

		int columnCount = title.size();
		list = emDao.getEmployeeTotal();

		int rowCount = list.size(); // ���� ������ ����

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
