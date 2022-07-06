package com.swingex;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderEx01 extends JFrame {

	private JButton[] jb = new JButton[6];

	public BorderEx01() {

		super("Border Test");

		Container con = getContentPane();
		con.setLayout(new GridLayout(3, 2, 10, 10));

		for (int i = 0; i < jb.length; i++) {
			jb[i] = new JButton(i + 1 + "¹ø ¹öÆ°");
			con.add(jb[i]);
		}

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {

		new BorderEx01();

	}

}
