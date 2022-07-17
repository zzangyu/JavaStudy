package com.swingex;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class WindowExam02 {

	public static void main(String[] args) {

		JFrame frame = new JFrame("adsadasds");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(300, 150));

		Container contentPane = frame.getContentPane();

		String[] colNames = { "�̸�", "����", "����" };
		Object data[][] = {

				{ "ȫ�浿", 24, "����" }, { "�����", 21, "����" }, { "��ȿ��", 30, "����" },

		};

		JTable table = new JTable(data, colNames);
		JScrollPane scrollpane = new JScrollPane(table);

		contentPane.add(scrollpane, BorderLayout.CENTER);
		JButton button = new JButton("���");
		contentPane.add(button, BorderLayout.SOUTH);

		button.addActionListener(new PrintActionListener(table));

		frame.setLocation(500, 400);
		frame.pack();
		frame.setVisible(true);

	}

}
