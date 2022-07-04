package com.awtex;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;

public class CheckboxGroupEx extends Frame {

	private Label lb = new Label("����� ������ ?");
	private Button bt = new Button("Ȯ��");
	CheckboxGroup cg = new CheckboxGroup();

	Checkbox man = new Checkbox("����", cg, true);
	Checkbox woman = new Checkbox("����", cg, false);

	public CheckboxGroupEx() {
		super("Checkbox Grouping");
		setLayout(new GridLayout(4, 1));

		add(lb);
		add(man);
		add(woman);
		add(bt);

		WinEvent we = new WinEvent();
		addWindowListener(we);
		pack();
		setVisible(true);

	}

	public static void main(String[] args) {
		new CheckboxGroupEx();
	}

}
