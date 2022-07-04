package com.awtex;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;

public class CheckboxEx extends Frame {

	private Button bt = new Button("확인");
	private Label lb = new Label("좋아하는 과일을 골라잇 !");
	private Checkbox[] cb = { new Checkbox("바나나"), new Checkbox("사과"), new Checkbox("두리안"),
			new Checkbox("초코치킨", true) };
	// true 박혀있는 애가 처음부터 골라져있음

	public CheckboxEx() {
		super("Checkbox Test");
		setLayout(new GridLayout(6, 1));

		WinEvent we = new WinEvent();
		addWindowListener(we);

		add(lb);
		for (int i = 0; i < cb.length; i++) {
			add(cb[i]);
		}
		add(bt);

		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new CheckboxEx();
	}

}
