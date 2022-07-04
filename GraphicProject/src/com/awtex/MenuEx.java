package com.awtex;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CheckboxMenuItem;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;

public class MenuEx extends Frame {
	// ����, ����, ����, ����
	// ��
	// ��ư ��ư

	private MenuBar mb = new MenuBar();

	private Menu file = new Menu("����");
	private Menu edit = new Menu("����");
	private Menu view = new Menu("����");
	private Menu help = new Menu("����");

	// ���� > ���� �޴���
	private MenuItem fnew = new MenuItem("������");
	private MenuItem fopen = new MenuItem("���� ����");
	private MenuItem fsave = new MenuItem("���� ����");
	private MenuItem fsaveAs = new MenuItem("�ٸ� �̸����� �����ϱ�");
	private MenuItem fexit = new MenuItem("������");

	// ���� > ����
	private Menu ecolor = new Menu("����");
	private CheckboxMenuItem ecred = new CheckboxMenuItem("����");
	private CheckboxMenuItem ecgreen = new CheckboxMenuItem("�ʷ�");
	private CheckboxMenuItem ecblue = new CheckboxMenuItem("�Ķ�");

	// ���� > ũ��
	private Menu esize = new Menu("ũ��");
	private CheckboxMenuItem es10 = new CheckboxMenuItem("10");
	private CheckboxMenuItem es20 = new CheckboxMenuItem("20");
	private CheckboxMenuItem es30 = new CheckboxMenuItem("30");

	private Label lb = new Label("�����ϼ̽��ϴ�...", Label.CENTER);
	private Font font = new Font("����ü", Font.ITALIC, 10);
	private Button bt1 = new Button("Ȯ��");
	private Button bt2 = new Button("���");

	public MenuEx() {
		super("Menu Test");

		// ū Ʋ�� �޴� ����
		setMenuBar(mb);
		mb.add(file);
		mb.add(edit);
		mb.add(view);
		mb.add(help);

		// ���� > ���� > ����� �߰�
		ecolor.add(ecred);
		ecolor.add(ecgreen);
		ecolor.add(ecblue);

		// ���� > ũ�� > ũ�� ���� �߰�
		esize.add(es10);
		esize.add(es20);
		esize.add(es30);

		// ���� > ����, �з����ִ� �� �߰�, ���� > ũ��
		edit.add(ecolor);
		edit.addSeparator();
		edit.add(esize);

		// borderLayout���� ��ġ ����ֱ�
		setLayout(new BorderLayout());
		add("North", lb); // ���ʿ� Label�ε� ����� ����
		lb.setFont(font);

		add("Center", new TextArea());

		Panel p = new Panel(new GridLayout(1, 2)); // ��ư 2�� �����ֱ� ���� panel �̿�
		p.add(bt1);
		p.add(bt2);

		// ��ư 2�� �Ʒ��� ������
		add(p, BorderLayout.SOUTH);

		// ���� > ���� ���� �޴��� �߰�
		file.add(fnew);
		file.add(fopen);
		file.add(fsave);
		file.add(fsaveAs);
		file.addSeparator();
		file.add(fexit);

		WinEvent we = new WinEvent();
		addWindowListener(we);

		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new MenuEx();
	}

}
