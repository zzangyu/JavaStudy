package com.awtex;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;

public class ButtonEx extends Frame {

	private String[] str = { "N L", "-", "+", "7", "8", "9", "4", "5", "6", "1", "2", "3", "#", "0", "*" };
	private Button[] bt = new Button[str.length];

	public ButtonEx() {

		super("Button test");
		setLayout(new GridLayout(5, 3, 5, 5));

		for (int i = 0; i < bt.length; i++) {
			bt[i] = new Button(str[i]);
			bt[i].setFont(new Font("±¼¸²Ã¼", Font.BOLD, 30));
			add(bt[i]);
		}

		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonEx();
	}

}
