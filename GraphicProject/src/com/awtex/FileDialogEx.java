package com.awtex;

import java.awt.FileDialog;
import java.awt.Frame;

public class FileDialogEx extends Frame {

	FileDialog fd = new FileDialog(this, "내 마음속에 저~장!", FileDialog.SAVE);

	public FileDialogEx() {

		super("FileDialog Test");

		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 200);
		setVisible(true);

		fd.setVisible(true); // file dialog 보이게 하기 위함
		System.out.println(fd.getFile()); // get 파일
		System.out.println(fd.getDirectory()); // get 폴더

	}

	public static void main(String[] args) {
		new FileDialogEx();
	}

}
