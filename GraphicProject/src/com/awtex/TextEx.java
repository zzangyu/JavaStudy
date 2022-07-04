package com.awtex;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

public class TextEx extends Frame {

	private TextField tf = new TextField("제목:");
	private TextArea ta = new TextArea("메모", 5, 10); // 가로(row) 5줄, 세로(column) 10줄

	private Button bt = new Button("확인");
	private Label la = new Label("내용");

	public TextEx() {
		super("TextField");
		setLayout(new BorderLayout());

		add("North", tf);
		add("South", bt);
		add("Center", ta);
		add("West", la);

		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TextEx();
	}

}
