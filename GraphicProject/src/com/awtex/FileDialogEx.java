package com.awtex;

import java.awt.FileDialog;
import java.awt.Frame;

public class FileDialogEx extends Frame {

	FileDialog fd = new FileDialog(this, "�� �����ӿ� ��~��!", FileDialog.SAVE);

	public FileDialogEx() {

		super("FileDialog Test");

		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 200);
		setVisible(true);

		fd.setVisible(true); // file dialog ���̰� �ϱ� ����
		System.out.println(fd.getFile()); // get ����
		System.out.println(fd.getDirectory()); // get ����

	}

	public static void main(String[] args) {
		new FileDialogEx();
	}

}
