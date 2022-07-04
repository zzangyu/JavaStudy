package com.awtex;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;

public class CheckboxEx extends Frame {

	private Button bt = new Button("Ȯ��");
	private Label lb = new Label("�����ϴ� ������ ����� !");
	private Checkbox[] cb = { new Checkbox("�ٳ���"), new Checkbox("���"), new Checkbox("�θ���"),
			new Checkbox("����ġŲ", true) };
	// true �����ִ� �ְ� ó������ ���������

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
