package com.awteventex;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.awtex.WinEvent;

public class ActionEventEx01 extends Frame implements ActionListener {

	private TextField tf = new TextField(10);
	private Button bt = new Button("전송");

	public ActionEventEx01() {

		super("ActionEvent Test");

		setLayout(new FlowLayout());
		Panel p = new Panel(new FlowLayout());

		p.add(tf);
		p.add(bt);

		add(p);

		bt.addActionListener(this); // 이러면 버튼 눌러야 메시지 출력, tf로 바꾸면 엔터 누르면 출력
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		new ActionEventEx01();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bt) {
			String imsi = tf.getText();
			System.out.println("메시지: " + imsi);
			tf.setText(""); // TextField를 초기화 해준다.
		}
	}

}
