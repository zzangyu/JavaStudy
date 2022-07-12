package com.empex;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class MainFrame extends JFrame {

	private JTabbedPane tp; // 탭 메뉴를 만듦
	private AddPane ap;
	private FindPane fp;

	public MainFrame() {

		tp = new JTabbedPane();
		ap = new AddPane();
		fp = new FindPane();
		tp.addTab("사원 정보 입력", ap);
		tp.addTab("사원 정보 조회", fp);

		getContentPane().add(tp);

		setTitle("사원관리 프로그램");

		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		MainFrame mf = new MainFrame();
		mf.setSize(600, 600);
	}

}
