package com.swingex;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class WindowExam01 {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Swing Programming");
		frame.setPreferredSize(new Dimension(200, 70));
		frame.setLocation(500, 400);
		Container contentPane = frame.getContentPane();
		JTextField text = new JTextField();
		JLabel label = new JLabel("Hello !");
		JButton button = new JButton("Ȯ��");
		contentPane.add(text, BorderLayout.CENTER);
		contentPane.add(button, BorderLayout.EAST);
		contentPane.add(label, BorderLayout.SOUTH);

		ActionListener listener = new ConfirmButtonActionListener(text, label);

		button.addActionListener(listener);

		// â �߰� �ϱ�
		frame.setVisible(true);

		// ���� ��ư
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// â ũ��
		frame.pack();

	}

}
