package com.multiex;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiChatServer {

	private ServerSocket ss = null;
	private Socket s = null;

	// 연결된 클라이언트 스레드를 관리하는 arrayList
	ArrayList<ChatThread> chatList = new ArrayList<>();

	// 멀티 채팅메인 프로그램
	public void start() {

		// 서버 소켓 생성
		try {
			ss = new ServerSocket(4000);
			System.out.println("Server Start");

			// 무한 루프를 돌면서 클라이언트 접속을 기다림
			while (true) {
				s = ss.accept();

				// 연결된 클라이언트에서 스레드 생성
				ChatThread chat = new ChatThread();
				// 클라이언트 리스트에 스레드 추가
				chatList.add(chat);

				// 스레드 시작
				chat.start();

			}

		} catch (Exception e) {
			System.out.println("[MultiChatServer]Start() Exception 발생");
		}

	}

	// 각 클라이언트 관리를 위한 스레드 클래스 구현
	class ChatThread extends Thread {

		// 수신메시지와 파싱메시지를 처리하는 변수 선언
		String msg;
		String[] rmsg;

		// 입출력 스트림 생성
		private BufferedReader inMsg = null;
		private PrintWriter outMsg = null;

		@Override
		public void run() {

			boolean status = true;
			System.out.println("##ChatThread start");

		}

	}

	// 연결된 모든 클라이언트에게 메시지를 전달하는 기능 구현
	public void msgSendAll(String msg) {
		for (ChatThread ct : chatList) {
			ct.outMsg.println(msg);
		}
	}

	public static void main(String[] args) {

		new MultiChatServer();

	}

}
