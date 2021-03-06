package com.awtex;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;

public class CheckboxGroupEx extends Frame {

	private Label lb = new Label("당신의 성별은 ?");
	private Button bt = new Button("확인");
	CheckboxGroup cg = new CheckboxGroup();

	Checkbox man = new Checkbox("남성", cg, true);
	Checkbox woman = new Checkbox("여성", cg, false);

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
