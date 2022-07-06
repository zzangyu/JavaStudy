package com.awteventex;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.awtex.WinEvent;

public class KeyEventEx extends Frame implements KeyListener {

	TextField jumin1 = new TextField(6);
	TextField jumin2 = new TextField(7);

	Label la = new Label("주민번호", Label.RIGHT);
	Label la1 = new Label("-", Label.CENTER);

	Button bt = new Button("확인");

	public KeyEventEx() {

		super("KeyEvent Test");

		setForm();

		jumin1.addKeyListener(this);
		jumin2.addKeyListener(this);

		WinEvent we = new WinEvent();
		addWindowListener(we);
//		setSize(350, 100);
		pack();
		setVisible(true);

	}

	public void setForm() {
		setLayout(new BorderLayout());
		add("West", la);

		Panel p = new Panel(new FlowLayout(FlowLayout.LEFT));
		p.add(jumin1);
		p.add(la1);
		p.add(jumin2);
		add("Center", p);

		Panel p1 = new Panel(new FlowLayout(FlowLayout.RIGHT));
		p1.add(bt);
		add("East", p1);

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

		if (e.getSource() == jumin1) {
			if (jumin1.getText().trim().length() == 6) {
				jumin2.requestFocus();
			}
		}
		if (e.getSource() == jumin2) {
			if (jumin2.getText().trim().length() == 7) {
				bt.requestFocus();
			}
		}

	}

	public static void main(String[] args) {
		new KeyEventEx();
	}

}
