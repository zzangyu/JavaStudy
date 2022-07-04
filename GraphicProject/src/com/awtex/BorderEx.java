package com.awtex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;

public class BorderEx extends Frame {

	Label a, b, c, d, e;

	public BorderEx() {

		super("BorderLayout");
		setLayout(new BorderLayout(5, 5)); // 간격을 준 것이다. h(수평), v(수직)

		a = new Label("↑", Label.CENTER);
		b = new Label("↓", Label.CENTER);
		c = new Label("←", Label.CENTER);
		d = new Label("→", Label.CENTER);
		e = new Label("이동", Label.CENTER);

		setBackground(Color.gray);
		// 바탕색
		a.setBackground(Color.red);
		b.setBackground(Color.green);
		c.setBackground(Color.blue);
		d.setBackground(Color.magenta);
		e.setBackground(Color.yellow);

		// 전경색 설정
		a.setForeground(Color.white);
		b.setForeground(Color.white);
		c.setForeground(Color.white);
		d.setForeground(Color.white);
		e.setForeground(Color.white);

		// 레이아웃 추가
		add("North", a); // 앞에 대문자로 넣어야됨
		add("South", b);
		add(c, BorderLayout.WEST);
		add(d, BorderLayout.EAST);
		add("Center", e);

		WinEvent we = new WinEvent();
		addWindowListener(we);
//		setLocation(300, 300);
//		pack(); // 최소 크기로 나옴
		setBounds(300, 300, 300, 200); // setLocation(300,300)이랑 pack 두개를 한번에 작성하는 setBounds
//		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		new BorderEx();
	}

}
