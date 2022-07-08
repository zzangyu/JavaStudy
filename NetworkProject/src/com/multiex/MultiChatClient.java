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
	private JButton looutButton;
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

	}

	@Override
	public void run() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
