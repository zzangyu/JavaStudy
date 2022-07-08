package com.unicastex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class UnicastClient {

	Socket socket = null;
	BufferedReader br = null;
	BufferedWriter bw = null;
	BufferedReader keyboard = null;

	public UnicastClient() {

		try {
			// ���� ����
			socket = new Socket("192.168.0.133", 5000);

		} catch (UnknownHostException uhe) {
			System.out.println("������ ã�� �� �����ϴ�.");
			System.exit(0);
		} catch (IOException ie) {
			System.out.println("������ ������ �� �����ϴ�.");
			System.exit(0);
		}

		// ��Ʈ�� ����
		try {

			keyboard = new BufferedReader(new InputStreamReader(System.in));

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			// ������ �޽����� �ְ� ����
			while (true) {
				// Ű����κ��� �Է��� ������ �б�
				System.out.print("���� �޽���: ");
				String msg = keyboard.readLine();

				// �޽����� ������ ����
				bw.write(msg + "\n");
				bw.flush();

				String getMsg = br.readLine();
				System.out.println("���ŵ� �޽���: " + getMsg);

			}

		} catch (IOException e) {
			System.out.println("������ ������ �� �����ϴ�.");
			System.exit(0);
		}

	}

	public static void main(String[] args) {
		new UnicastClient();
	}

}
