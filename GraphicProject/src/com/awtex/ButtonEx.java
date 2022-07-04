package com.awtex;

import java.awt.Button;
import java.awt.Frame;

public class ButtonEx extends Frame {

	private String[] str = {};
	private Button[] bt = new Button[str.length];

	public ButtonEx() {

		super();
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonEx();
	}

}
