package com.awtex;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;

public class ChoiceEx extends Frame {

	private Label la = new Label("생일");
	private Button bt = new Button("확인");
	private Choice co = new Choice();

	public ChoiceEx() {
		super("Choice");
		setLayout(new GridLayout(3, 1));

		add(la);
		add(co); // drop-down 버튼을 만들어준 것! ▼ 누르면 목록 좌르륵 나옴
		add(bt);

		for (int i = 1; i <= 12; i++) {
			co.add(String.valueOf(i) + "월");
		}

		WinEvent we = new WinEvent();
		addWindowListener(we);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new ChoiceEx();
	}

}
