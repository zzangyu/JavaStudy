package com.awteventex;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowEventEx04 extends Frame {

	public WindowEventEx04() {

		super("WinEvent4");

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});

		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {

		new WindowEventEx04();

	}

}
