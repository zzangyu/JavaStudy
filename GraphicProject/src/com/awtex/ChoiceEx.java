package com.awtex;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;

public class ChoiceEx extends Frame {

	private Label la = new Label("기모띠");
	private Button bt = new Button("아아");
	private Choice co = new Choice();

	public ChoiceEx() {
		super("Choice");
		setLayout(new GridLayout(3, 1));

		add(la);
		add(co); // drop-down ��ư�� ������� ��! �� ������ ��� �¸��� ����
		add(bt);

		for (int i = 1; i <= 12; i++) {
			co.add(String.valueOf(i) + "메롱");
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
