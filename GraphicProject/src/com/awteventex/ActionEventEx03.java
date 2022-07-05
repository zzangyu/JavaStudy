package com.awteventex;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.awtex.WinEvent;

public class ActionEventEx03 extends Frame implements ActionListener {

	private MenuBar mb = new MenuBar();
	private Menu file = new Menu("File");
	private MenuItem now = new MenuItem("Now");
	private MenuItem exit = new MenuItem("Exit");

	public ActionEventEx03() {

		super("ActionEvent3");

		// 메뉴바 만들기
		setMenuBar(mb);

		// 메뉴바에 메뉴 넣기
		mb.add(file);

		// 메뉴에 요소 넣기
		file.add(now);
		file.addSeparator();
		file.add(exit);

		exit.addActionListener(this);

		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {

		new ActionEventEx03();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

}
