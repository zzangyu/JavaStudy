package com.inner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingContainer;

public class WindowEvent extends JFrame {
	// 버튼을 클릭 했을때 하는 행동들을 event라고 한다.

	public WindowEvent() {

		super("이벤트");
		JButton j1 = new JButton("확인");
		JButton j2 = new JButton("확인");
		SwingContainer con = (SwingContainer) getContentPane();

	}

	public static void main(String[] args) {

	}

}
