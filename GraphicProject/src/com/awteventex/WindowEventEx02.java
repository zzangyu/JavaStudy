package com.awteventex;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEventEx02 extends Frame implements WindowListener { // 다중상속이 안되니까 Listener를 부를 수 밖에 없음

	public WindowEventEx02() {
		super("WinEvent2");
		addWindowListener(this);
		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		new WindowEventEx02();
	}

	@Override
	public void windowOpened(WindowEvent e) {

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {

	}

	@Override
	public void windowIconified(WindowEvent e) {

	}

	@Override
	public void windowDeiconified(WindowEvent e) {

	}

	@Override
	public void windowActivated(WindowEvent e) {

	}

	@Override
	public void windowDeactivated(WindowEvent e) {

	}

}
