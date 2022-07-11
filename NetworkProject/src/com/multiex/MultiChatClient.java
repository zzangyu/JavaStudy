package com.multiex;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiChatClient implements ActionListener, Runnable {

	private String ip;
	private String id;
	private Socket socket;
	private BufferedReader inMsg = null;
	private PrintWriter outMsg = null;

	// �ѤѤѤѤѤѷα��ΤѤѤѤѤѤ�
	// �α��� �г�
	private JPanel loginPanel;
	// �α��� ��ư
	private JButton loginButton;
	// �α��� ��ȭ��
	private JLabel label1;
	// ��ȭ�� �Է� �ؽ�Ʈ �ʵ�
	private JTextField idInput;

	// �ѤѤѤѤѤѷα׾ƿ��ѤѤѤѤѤ�
	// �α׾ƿ� �г�
	private JPanel logoutPanel;
	// �α׾ƿ� ��ư
	private JButton logoutButton;
	// �α׾ƿ� ��ȭ��
	private JLabel label2;

	// �ѤѤѤѤѤ��Է� �г� �����ѤѤѤѤѤ�
	// �޽��� �Է�
	private JPanel msgPanel;
	// �Է� �ؽ�Ʈ �ʵ�
	private JTextField msgInput;
	// ���� ��ư
	private JButton exitButton;
	// ���� ������ â
	private JFrame jframe;
	// ä�� ������ ����� â
	private JTextArea msgOut;
	// ī�� ���̾�
	private Container tab;
	private CardLayout clayout;
	private Thread thread;

	// �ѤѤѤѤѤѻ��� �÷��פѤѤѤѤѤ�
	boolean status;

	public MultiChatClient(String ip) {
		this.ip = ip;

		// �α��� �г� ����
		loginPanel = new JPanel();
		// ���̾ƿ� ����
		loginPanel.setLayout(new BorderLayout());
		idInput = new JTextField(15);
		loginButton = new JButton("�α���");

		// ��ȭ�� ��
		label1 = new JLabel("��ȭ��");

		// �α��� �гο� ���� ���̾ƿ� ����
		loginPanel.add(label1, BorderLayout.WEST);
		loginPanel.add(idInput, BorderLayout.CENTER);
		loginPanel.add(loginButton, BorderLayout.EAST);

		// �α׾ƿ� �г� ����
		logoutPanel = new JPanel();
		logoutPanel.setLayout(new BorderLayout());
		label2 = new JLabel(); // ������ ����� ���� ��
		logoutButton = new JButton("�α׾ƿ�");

		logoutPanel.add(label2, BorderLayout.CENTER);
		logoutPanel.add(logoutButton, BorderLayout.EAST);

		// �Է� �г� ����
		msgPanel = new JPanel();
		msgPanel.setLayout(new BorderLayout());
		msgInput = new JTextField(30);

		exitButton = new JButton("����");

		msgPanel.add(msgInput, BorderLayout.CENTER);
		msgPanel.add(exitButton, BorderLayout.EAST);

		// �α���/�α׾ƿ� �г� ������ ���� ī�� ���̾ƿ�

		tab = new JPanel();
		clayout = new CardLayout();
		tab.setLayout(clayout);
		tab.add(loginPanel, "login");
		tab.add(logoutPanel, "logout");

		// ���� frame ����
		jframe = new JFrame("��Ƽ ä�� ���α׷�");
		msgOut = new JTextArea("", 10, 30); // �� 10, �� 30
		msgOut.setEditable(false); // �ٸ� ��� �޽��� ���� �Ұ���

		// ��ũ�ѹ� ���� (������ �׻� ��Ÿ����, ������ �� �޽����� ���� ��Ÿ��)
		JScrollPane jsp = new JScrollPane(msgOut, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jframe.add(tab, BorderLayout.NORTH);
		jframe.add(jsp, BorderLayout.CENTER);
		jframe.add(msgPanel, BorderLayout.SOUTH);

		clayout.show(tab, "login");

		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		jframe.pack();
		jframe.setResizable(false); // ũ�� ����x
		jframe.setVisible(true);

	}

	@Override
	public void run() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

	public static void main(String[] args) {
		new MultiChatClient("127.0.0.1");
	}

}
