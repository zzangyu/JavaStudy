package com.awteventex;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.awtex.WinEvent;

public class ActionEventEx03 extends Frame implements ActionListener {

	private Button bt = new Button("Á¾·á");

	public ActionEventEx03() {

		super("ActionEvent3");

		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {

		new ActionEventEx03();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
