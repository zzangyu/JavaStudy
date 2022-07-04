package com.awtex;

import java.awt.Frame;

public class FrameEx02_exitOnOff_2 extends Frame {

	public FrameEx02_exitOnOff_2() {
		super("프레임"); // 제목 넣은거임
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 200); // 상속해서 객체 필요 없음
		setVisible(true);
	}

	public static void main(String[] args) {
		new FrameEx02_exitOnOff_2();
	}

}
