package com.awtex;

import java.awt.Frame;

public class FrameEx02_exitOnOff_2 extends Frame {

	public FrameEx02_exitOnOff_2() {
		super("������"); // ���� ��������
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 200); // ����ؼ� ��ü �ʿ� ����
		setVisible(true);
	}

	public static void main(String[] args) {
		new FrameEx02_exitOnOff_2();
	}

}
