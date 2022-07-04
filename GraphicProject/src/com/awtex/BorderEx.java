package com.awtex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;

public class BorderEx extends Frame {

	Label a, b, c, d, e;

	public BorderEx() {

		super("BorderLayout");
		setLayout(new BorderLayout(5, 5)); // ������ �� ���̴�. h(����), v(����)

		a = new Label("��", Label.CENTER);
		b = new Label("��", Label.CENTER);
		c = new Label("��", Label.CENTER);
		d = new Label("��", Label.CENTER);
		e = new Label("�̵�", Label.CENTER);

		setBackground(Color.gray);
		// ������
		a.setBackground(Color.red);
		b.setBackground(Color.green);
		c.setBackground(Color.blue);
		d.setBackground(Color.magenta);
		e.setBackground(Color.yellow);

		// ����� ����
		a.setForeground(Color.white);
		b.setForeground(Color.white);
		c.setForeground(Color.white);
		d.setForeground(Color.white);
		e.setForeground(Color.white);

		// ���̾ƿ� �߰�
		add("North", a); // �տ� �빮�ڷ� �־�ߵ�
		add("South", b);
		add(c, BorderLayout.WEST);
		add(d, BorderLayout.EAST);
		add("Center", e);

		WinEvent we = new WinEvent();
		addWindowListener(we);
//		setLocation(300, 300);
//		pack(); // �ּ� ũ��� ����
		setBounds(300, 300, 300, 200); // setLocation(300,300)�̶� pack �ΰ��� �ѹ��� �ۼ��ϴ� setBounds
//		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		new BorderEx();
	}

}
