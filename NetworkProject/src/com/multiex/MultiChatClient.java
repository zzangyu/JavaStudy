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
	private JButton looutButton;
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

	}

	@Override
	public void run() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
