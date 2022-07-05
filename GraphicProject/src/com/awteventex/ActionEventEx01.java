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
	private Button bt = new Button("����");

	public ActionEventEx01() {

		super("ActionEvent Test");

		setLayout(new FlowLayout());
		Panel p = new Panel(new FlowLayout());

		p.add(tf);
		p.add(bt);

		add(p);

		bt.addActionListener(this); // �̷��� ��ư ������ �޽��� ���, tf�� �ٲٸ� ���� ������ ���
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
			System.out.println("�޽���: " + imsi);
			tf.setText(""); // TextField�� �ʱ�ȭ ���ش�.
		}
	}

}
