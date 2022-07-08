package com.unicastex;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class UnicastServer {

	public UnicastServer() {

		ServerSocket server = null;

		try {
			// ServerSocket ����
			server = new ServerSocket(5000);

		} catch (IOException e) {
			System.out.println("�ش� ��Ʈ�� ��� ���Դϴ�.");
			System.exit(0);
		}

		// ������ �Ǹ� ���
		try {

			while (true) {
				System.out.println("Server Ready");
				Socket socket = server.accept();

				/*
				 * Ŭ���̾�Ʈ�� �޽����� �ۼ��� �� �� �ִ� Thread ���� ������ ������ socket�� ���޹޾Ƽ� ������ �����带 ������
				 */

				UnicastServerThread thread = new UnicastServerThread(socket); // ������ ����� ���� �Ǵ� ��
				thread.start();

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new UnicastServer();
	}

}
