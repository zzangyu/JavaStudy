package com.awtex;

import java.awt.Frame;

public class FrameEx01_exitOnOff_1 {

	public static void main(String[] args) {
		// ������ ��ü ����
		Frame frame = new Frame();
		WinEvent we = new WinEvent(); // ���� package�ȿ� �־ �׳� �ҷ����� ��
		frame.addWindowListener(we); // �� �ּ�ó���ϰ� ���� ���Ѻ�. �׷��� ���ᰡ �ȵɰ��� �ܼ� ���� ���� ��ư ������ ����
		frame.setSize(300, 200); // ���� 300, ���� 200 ũ��
		frame.setVisible(true); // â���� ���ڴ���!? *true�� �����, �⺻�� false��*

	}

}
