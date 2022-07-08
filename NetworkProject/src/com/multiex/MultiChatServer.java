package com.multiex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiChatServer {

	private ServerSocket ss = null;
	private Socket s = null;

	// ����� Ŭ���̾�Ʈ �����带 �����ϴ� arrayList
	ArrayList<ChatThread> chatList = new ArrayList<>();

	// ��Ƽ ä�ø��� ���α׷�
	public void start() {

		// ���� ���� ����
		try {
			ss = new ServerSocket(4000);
			System.out.println("Server Start");

			// ���� ������ ���鼭 Ŭ���̾�Ʈ ������ ��ٸ�
			while (true) {
				s = ss.accept();

				// ����� Ŭ���̾�Ʈ���� ������ ����
				ChatThread chat = new ChatThread();
				// Ŭ���̾�Ʈ ����Ʈ�� ������ �߰�
				chatList.add(chat);

				// ������ ����
				chat.start();

			}

		} catch (Exception e) {
			System.out.println("[MultiChatServer]Start() Exception �߻�");
		}

	}

	// �� Ŭ���̾�Ʈ ������ ���� ������ Ŭ���� ����
	class ChatThread extends Thread {

		// ���Ÿ޽����� �Ľ̸޽����� ó���ϴ� ���� ����
		String msg;
		String[] rmsg;

		// ����� ��Ʈ�� ����
		private BufferedReader inMsg = null;
		private PrintWriter outMsg = null;

		@Override
		public void run() {

			boolean status = true;
			System.out.println("##ChatThread start");

			try {

				inMsg = new BufferedReader(new InputStreamReader(s.getInputStream()));
				outMsg = new PrintWriter(s.getOutputStream(), true); // true ��ġ: flush ��� ������ ��� ��

				// ���� ������ true�� ������ ���鼭 ��������׼� ���ŵ� �޽����� ó���Ѵ�.
				while (status) {

					// ���ŵ� �޽����� msg ������ �����Ѵ�.
					msg = inMsg.readLine();
					// '/'�� �����ڸ� �������� �޽����� ���ڿ� �迭�� �Ľ���
					rmsg = msg.split("/");

					// �Ľ̵� ���ڿ� �迭�� �ι�° ��� ���� ���� ó���ϰ� �ȴ�.

					if (rmsg[1].equals("logout")) {
						// logout message�� ��
						chatList.remove(this);
						// �ش� Ŭ���̾�Ʈ ������ ����� ���� Status�� false�� ����
						msgSendAll("server/" + rmsg[0] + "���� ���� �߽��ϴ�.");
						status = false;

					} else if (rmsg[1].equals("login")) {
						// login message�� ��
						msgSendAll("server/" + rmsg[0] + "���� �α��� �߽��ϴ�.");
					} else {
						// �� ���� �޽��� �� ��
						msgSendAll(msg);
					}

				}

				// ������ ����� Ŭ���̾�Ʈ ������ ����ǹǷ� �������� ���ͷ�Ʈ�� �߻�
				this.interrupt();
				System.out.println("## " + this.getName() + "stop");

			} catch (IOException ie) {
				chatList.remove(this);
				System.out.println("[ChatThread]run() IOException �߻�");
			}

		}

	}

	// ����� ��� Ŭ���̾�Ʈ���� �޽����� �����ϴ� ��� ����
	public void msgSendAll(String msg) {
		for (ChatThread ct : chatList) {
			ct.outMsg.println(msg);
		}
	}

	public static void main(String[] args) {

		MultiChatServer ser = new MultiChatServer();
		ser.start();

	}

}
