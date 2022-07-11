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

	// ㅡㅡㅡㅡㅡㅡ로그인ㅡㅡㅡㅡㅡㅡ
	// 로그인 패널
	private JPanel loginPanel;
	// 로그인 버튼
	private JButton loginButton;
	// 로그인 대화명
	private JLabel label1;
	// 대화명 입력 텍스트 필드
	private JTextField idInput;

	// ㅡㅡㅡㅡㅡㅡ로그아웃ㅡㅡㅡㅡㅡㅡ
	// 로그아웃 패널
	private JPanel logoutPanel;
	// 로그아웃 버튼
	private JButton logoutButton;
	// 로그아웃 대화명
	private JLabel label2;

	// ㅡㅡㅡㅡㅡㅡ입력 패널 구성ㅡㅡㅡㅡㅡㅡ
	// 메시지 입력
	private JPanel msgPanel;
	// 입력 텍스트 필드
	private JTextField msgInput;
	// 종료 버튼
	private JButton exitButton;
	// 메인 윈도우 창
	private JFrame jframe;
	// 채팅 내용을 출력할 창
	private JTextArea msgOut;
	// 카드 레이어
	private Container tab;
	private CardLayout clayout;
	private Thread thread;

	// ㅡㅡㅡㅡㅡㅡ상태 플래그ㅡㅡㅡㅡㅡㅡ
	boolean status;

	public MultiChatClient(String ip) {
		this.ip = ip;

		// 로그인 패널 구성
		loginPanel = new JPanel();
		// 레이아웃 설정
		loginPanel.setLayout(new BorderLayout());
		idInput = new JTextField(15);
		loginButton = new JButton("로그인");

		// 대화명 라벨
		label1 = new JLabel("대화명");

		// 로그인 패널에 대한 레이아웃 설정
		loginPanel.add(label1, BorderLayout.WEST);
		loginPanel.add(idInput, BorderLayout.CENTER);
		loginPanel.add(loginButton, BorderLayout.EAST);

		// 로그아웃 패널 구성
		logoutPanel = new JPanel();
		logoutPanel.setLayout(new BorderLayout());
		label2 = new JLabel(); // 공간만 만들어 놓은 것
		logoutButton = new JButton("로그아웃");

		logoutPanel.add(label2, BorderLayout.CENTER);
		logoutPanel.add(logoutButton, BorderLayout.EAST);

		// 입력 패널 구성
		msgPanel = new JPanel();
		msgPanel.setLayout(new BorderLayout());
		msgInput = new JTextField(30);

		exitButton = new JButton("종료");

		msgPanel.add(msgInput, BorderLayout.CENTER);
		msgPanel.add(exitButton, BorderLayout.EAST);

		// 로그인/로그아웃 패널 선택을 위한 카드 레이아웃

		tab = new JPanel();
		clayout = new CardLayout();
		tab.setLayout(clayout);
		tab.add(loginPanel, "login");
		tab.add(logoutPanel, "logout");

		// 메인 frame 구성
		jframe = new JFrame("멀티 채팅 프로그램");
		msgOut = new JTextArea("", 10, 30); // 행 10, 열 30
		msgOut.setEditable(false); // 다른 사람 메시지 수정 불가능

		// 스크롤바 설정 (수직은 항상 나타나고, 수평은 긴 메시지일 때만 나타남)
		JScrollPane jsp = new JScrollPane(msgOut, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jframe.add(tab, BorderLayout.NORTH);
		jframe.add(jsp, BorderLayout.CENTER);
		jframe.add(msgPanel, BorderLayout.SOUTH);

		clayout.show(tab, "login");

		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		jframe.pack();
		jframe.setResizable(false); // 크기 조절x
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
