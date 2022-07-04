package com.awtex;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WinEvent extends WindowAdapter {
	@Override
	public void windowClosing(WindowEvent e) {
		// 화면 끄기(x표 / 우측 상단 최소화, 최대크기, *끄기* << 요놈) 동작시키는 메소드, 얘가 없으면 종료가 안됨!
		System.exit(0);
	}
}
