package com.awtex;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;

//	public LabelEx() {
//		WinEvent we = new WinEvent();
//		addWindowListener(we);
//		setSize(300, 200);
//		setVisible(true);
//	}
// 위 넷이랑 main에서 생성자 불러오는것 까지가 기본 세팅

public class LabelEx extends Frame {

	Label la1;
	Label la2;
	Label la3;
	Label la4;

	Font f1;
	Font f2;

	public LabelEx() {

		super("Label test");

		la1 = new Label("Hello ! ");
		la2 = new Label("I'm changyu ! ", Label.CENTER);
		la3 = new Label("I'm a Student ! ", Label.RIGHT);
		la4 = new Label("Nice to meet you ! ");

		f1 = new Font("굴림체", Font.BOLD, 20);
		f2 = new Font("바탕체", Font.ITALIC, 25);
		// ----------- 적용 전 -----------
		// ----------- 레이아웃 설정 -----------
		// GridLayout으로 만들거임 (격자모양)

		setLayout(new GridLayout(4, 1)); // 4행 1열로 설정한거임
		// 폰트 지정
		la1.setFont(f1);
		la2.setFont(f1);
		la3.setFont(f2);
		la4.setFont(f2);

		add(la1);
		add(la2);
		add(la3);
		add(la4);

		la1.setBackground(Color.red); // 배경색 넣기
		la2.setBackground(Color.blue);
		la3.setBackground(Color.green);
		la4.setBackground(Color.magenta);

		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new LabelEx();
	}

}
