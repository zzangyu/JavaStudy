package com.multiex;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		loginButton.addActionListener(this);
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
		logoutButton.addActionListener(this);

		logoutPanel.add(label2, BorderLayout.CENTER);
		logoutPanel.add(logoutButton, BorderLayout.EAST);

		// �Է� �г� ����
		msgPanel = new JPanel();
		msgPanel.setLayout(new BorderLayout());
		msgInput = new JTextField(30);
		msgInput.addActionListener(this);

		exitButton = new JButton("����");
		exitButton.addActionListener(this);

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
		// thread�� ���� �޽����� ó���ϴ� ������ �ʿ��ϴ�.
		String msg;
		String[] rmsg;

		status = true;

		while (status) {

			try {
				msg = inMsg.readLine();
				rmsg = msg.split("/");

				// JTextArea�� ���ŵ� �޽��� �߰�
				msgOut.append(rmsg[0] + ">" + rmsg[1] + "\n");

				// Ŀ���� ���� ��ȭ �޽����� ǥ���Ѵ�. ������ �� �������� ��Ÿ���� ������ ������ ���̵� �˾ƾ��Ѵ�.
				msgOut.setCaretPosition(msgOut.getDocument().getLength());

			} catch (IOException ie) {
				status = false;
			}

		}
		System.out.println("[MultiChatClient]" + thread.getName() + "�����");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();

		// ���� ��ư ó��
		if (obj == exitButton) {
			System.exit(0);
		} else if (obj == loginButton) {
			id = idInput.getText(); // ���̵� ���ڿ��� �������
			label2.setText("��ȭ��" + id);
			clayout.show(tab, "logout");

			// ������ ���� �޼ҵ� ȣ��
			connectServer();

		} else if (obj == logoutButton) {
			// �α׾ƿ� �޽��� ����
			outMsg.println(id + "/" + "�α׾ƿ�");
			// ��ȭâ Ŭ����
			msgOut.setText("");
			// �α��� �гη� ��ȯ (�α׾ƿ� �����ϱ�!)
			clayout.show(tab, "login");
			outMsg.close();
			try {
				inMsg.close();
				socket.close();
			} catch (IOException io) {
				io.printStackTrace();
			}
			status = false;

		} else if (obj == msgInput) {
			// �޽��� ����
			outMsg.println(id + "/" + msgInput.getText());
			// �Է�â�� �ʱ�ȭ
			msgInput.setText("");
		}

	}

	public void connectServer() {
		try {
			socket = new Socket(ip, 4000);
			System.out.println("[Client]Server ���� ���� !!");
			inMsg = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			outMsg = new PrintWriter(socket.getOutputStream(), true);
			// ������ �α��� �޽����� �����Ѵ�.
			outMsg.println(id + "/" + "login");

			// thread message ������ ���� thread ����
			thread = new Thread(this);
			thread.start();

		} catch (Exception e) {
			System.out.println("[MultiChatClient]connectionServer() Exception �߻� !!!");
		}

	}

	public static void main(String[] args) {
		new MultiChatClient("192.168.0.17");
	}

}
