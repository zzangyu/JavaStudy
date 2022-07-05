package com.awteventex;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import com.awtex.WinEvent;

public class MouseMotionEventEx extends Frame implements MouseMotionListener {

	public MouseMotionEventEx() {
		super("MouseMotion Test");

		addMouseMotionListener(this);

		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 200);
		setVisible(true);

	}

	@Override
	public void mouseDragged(MouseEvent e) {

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		if (e.getSource() == this) {
			System.out.println("X=" + e.getX() + ", Y=" + e.getY());
		}
	}

	public static void main(String[] args) {

		new MouseMotionEventEx();

	}

}
