package com.empex;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class MainFrame extends JFrame {

	private JTabbedPane tp; // �� �޴��� ����
	private AddPane ap;
	private FindPane fp;
	private TotalPane tpa;

	public MainFrame() {

		tp = new JTabbedPane();
		ap = new AddPane();
		fp = new FindPane();
		tpa = new TotalPane();

		tp.addTab("��� ���� �Է�", ap);
		tp.addTab("��� ���� ��ȸ", fp);
		tp.addTab("��� ���� ��ü ��ȸ", tpa);

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
