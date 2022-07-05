package com.awteventex;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.awtex.WinEvent;

public class ActionEventEx02 extends Frame implements ActionListener {

	private Button bt = new Button("Á¾·á");

	public ActionEventEx02() {

		super("ActionEvent2");
		setLayout(new FlowLayout());
		add(bt);
		bt.addActionListener(this);

		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {

		new ActionEventEx02();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

}
