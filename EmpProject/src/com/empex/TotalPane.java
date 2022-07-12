package com.empex;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TotalPane extends JPanel {

	public TotalPane() {

		setLayout(null); // ¼öµ¿
		JTable table = new JTable(new EmployModel());
		JScrollPane jp = new JScrollPane(table);
		jp.setBounds(10, 100, 500, 400);
		add(jp);

	}

}
