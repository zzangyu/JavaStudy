package com.socex;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketEx {

	public static void main(String[] args) throws Exception {
		// ����ڵ��� �޾Ƶ��̱� ���� serverSocket�� �ʿ��ϴ�.
		ServerSocket ss = new ServerSocket(3000);

		while (true) {
			// ������ Ŭ���̾�Ʈ�� ���� �� ������ ������ ���
			// Ŭ���̾�Ʈ �� �ʿ��� ~!
			Socket s = ss.accept();
			InetAddress iaddr = s.getInetAddress();
			String u_ip = iaddr.getHostAddress();
			System.out.println(u_ip + "���� ���� �ϼ̽��ϴ�.");

		}
	}

}
