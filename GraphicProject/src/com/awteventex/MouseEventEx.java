package com.awteventex;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.awtex.WinEvent;

public class MouseEventEx extends Frame implements MouseListener {

	private Button bt = new Button("확인");
	private Button bt1 = new Button("취소");

	public MouseEventEx() {
		super("Mouse Test");
		setLayout(new FlowLayout());

		add(bt);
		add(bt1);

		bt.addMouseListener(this);
		bt1.addMouseListener(this);

		WinEvent we = new WinEvent();

		addWindowListener(we);
		setSize(300, 200);
		setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == bt) {
			System.out.println("확인 버튼 눌렀당 ... ");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getSource() == bt1) {
			System.out.println("취소 버튼 눌렀당 ... ");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (e.getSource() == bt1) {
			System.out.println("취소 버튼을 눌렀다 뗐다 ... ");
		} else if (e.getSource() == bt) {
			System.out.println("확인 버튼을 눌렀다 뗐다 ... ");
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == bt || e.getSource() == bt1) {
			System.out.println("마우스가 버튼 위에 있습니다 ... ");
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == bt || e.getSource() == bt1) {
			System.out.println("마우스가 버튼에서 내려왔다 ... ");
		}
	}

	public static void main(String[] args) {
		new MouseEventEx();
	}

}
