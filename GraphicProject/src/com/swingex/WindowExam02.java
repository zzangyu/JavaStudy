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

		JFrame frame = new JFrame("참가자 명단 프로그램");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(300, 150));

		Container contentPane = frame.getContentPane();

		String[] colNames = { "이름", "나이", "성별" };
		Object data[][] = {

				{ "홍길동", 24, "남자" }, { "사토미", 21, "여자" }, { "박효신", 30, "남자" },

		};

		JTable table = new JTable(data, colNames);
		JScrollPane scrollpane = new JScrollPane(table);

		contentPane.add(scrollpane, BorderLayout.CENTER);
		JButton button = new JButton("출력");
		contentPane.add(button, BorderLayout.SOUTH);

		button.addActionListener(new PrintActionListener(table));

		frame.setLocation(500, 400);
		frame.pack();
		frame.setVisible(true);

	}

}
