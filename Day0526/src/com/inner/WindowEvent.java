package com.inner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingContainer;

public class WindowEvent extends JFrame {
	// ��ư�� Ŭ�� ������ �ϴ� �ൿ���� event��� �Ѵ�.

	public WindowEvent() {

		super("�̺�Ʈ");
		JButton j1 = new JButton("Ȯ��");
		JButton j2 = new JButton("Ȯ��");
		SwingContainer con = (SwingContainer) getContentPane();

	}

	public static void main(String[] args) {

	}

}
