package com.empex;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class MainFrame extends JFrame {

	private JTabbedPane tp; // �� �޴��� ����
	private AddPane ap;
	private FindPane fp;

	public MainFrame() {

		tp = new JTabbedPane();
		ap = new AddPane();
		fp = new FindPane();
		tp.addTab("��� ���� �Է�", ap);
		tp.addTab("��� ���� ��ȸ", fp);

		getContentPane().add(tp);

		setTitle("������� ���α׷�");

		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		MainFrame mf = new MainFrame();
		mf.setSize(600, 600);
	}

}
