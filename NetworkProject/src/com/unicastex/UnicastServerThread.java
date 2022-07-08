package com.unicastex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

// Ŭ���̾�Ʈ�� ����� ���ϰ�ü�� ������ ������ ������ �����ϰ� ����� ����ϴ� Ŭ������.
public class UnicastServerThread extends Thread {

	// �����κ��� ���޵� socket�� �����Ѵ�.

	Socket socket = null;
	BufferedReader br = null; // �����κ��� ������ �а�
	BufferedWriter bw = null; // ����

	// ��ü�� ������ �� socket�� ���� �޾Ƽ� ��� ������ �����Ѵ�.
	public UnicastServerThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		// ��Ʈ�� ����
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			// Ŭ���̾�Ʈ�� �޽����� �ۼ����Ѵ�.
			while (true) {
				// Ŭ���̾�Ʈ�� ���� �޽����� �����Ѵ�.
				String msg = br.readLine();
				System.out.println(msg);

				// Ŭ���̾�Ʈ���� �޽����� �۽��Ѵ�.
				bw.write(msg + "\n");
				bw.flush(); // ���� ����!

			}
		} catch (IOException e) {
			// Ŭ���̾�Ʈ�� ������ ������ ��� ���ܰ� �߻��Ѵ�.
			InetAddress ip = socket.getInetAddress();
			String address = ip.getHostAddress();
			System.out.println("[" + address + "]���� ������ ���������ϴ�.");

		}
	}

}
