package com.project;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class calculator extends JFrame implements ActionListener {

	JFrame jf = new JFrame("°è»ê±â");
	JButton jb[] = { new JButton("C"), new JButton("0"), new JButton("¢¸"), new JButton("="), new JButton("1"), new JButton("2"), new JButton("3"), new JButton("+"), new JButton("4"), new JButton("5"), new JButton("6"), new JButton("-"), new JButton("7"), new JButton("8"), new JButton("9"), new JButton("X"), new JButton("."), new JButton("%"), new JButton("x©÷"), new JButton("/") };
	JTextField jtf1 = new JTextField(6);
	JTextField jtf2 = new JTextField(6);
	JTextField jtf3 = new JTextField(6);

	public calculator() {
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setPreferredSize(new Dimension(300, 150));
		Container contentPane = jf.getContentPane();

		JPanel jpTextField = new JPanel();
		jpTextField.setLayout(new GridLayout(3, 1));
		jpTextField.add(jtf1);
		jpTextField.add(jtf2);
		jpTextField.add(jtf3);
		jtf1.setEditable(false);
		jtf1.setBorder(new EmptyBorder(10, 10, 10, 10));
		jtf2.setEditable(false);
		jtf2.setBorder(new EmptyBorder(10, 10, 10, 10));
		jtf3.setEditable(false);
		jtf3.setBorder(new EmptyBorder(10, 10, 10, 10));

		contentPane.setLayout(new BorderLayout());
		contentPane.add(jpTextField, BorderLayout.NORTH);

		JPanel jpButton = new JPanel();
		jpButton.setLayout(new GridLayout(5, 4));
		for (int i = 19; i >= 0; i--) {
			jpButton.add(jb[i]);
			jb[i].addActionListener(this);
		}
		contentPane.add(jpButton, BorderLayout.CENTER);

		jf.setSize(300, 400);
		jf.setVisible(true);
	}

	public static void main(String[] args) {
		new calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == jb[0]) {
			jtf1.setText("");
			jtf2.setText("");
			jtf3.setText("");
		} else if (e.getSource() == jb[1]) {
			jtf2.setText("0");
		} else if (e.getSource() == jb[2]) {
			jtf2.setText("");
		} else if (e.getSource() == jb[3]) {

		} else if (e.getSource() == jb[4]) {
			jtf2.setText("1");
		} else if (e.getSource() == jb[5]) {
			jtf2.setText("2");
		} else if (e.getSource() == jb[6]) {
			jtf2.setText("3");
		} else if (e.getSource() == jb[7]) {

		} else if (e.getSource() == jb[8]) {
			jtf2.setText("4");
		} else if (e.getSource() == jb[9]) {
			jtf2.setText("5");
		} else if (e.getSource() == jb[10]) {
			jtf2.setText("6");
		} else if (e.getSource() == jb[11]) {

		} else if (e.getSource() == jb[12]) {
			jtf2.setText("7");
		} else if (e.getSource() == jb[13]) {
			jtf2.setText("8");
		} else if (e.getSource() == jb[14]) {
			jtf2.setText("9");
		} else if (e.getSource() == jb[15]) {

		} else if (e.getSource() == jb[16]) {

		} else if (e.getSource() == jb[17]) {

		} else if (e.getSource() == jb[18]) {

		} else if (e.getSource() == jb[19]) {

		}

	}
}
