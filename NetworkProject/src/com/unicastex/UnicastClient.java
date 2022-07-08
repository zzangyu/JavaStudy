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
			// 소켓 생성
			socket = new Socket("192.168.0.133", 5000);

		} catch (UnknownHostException uhe) {
			System.out.println("서버를 찾을 수 없습니다.");
			System.exit(0);
		} catch (IOException ie) {
			System.out.println("서버와 연결할 수 없습니다.");
			System.exit(0);
		}

		// 스트림 연결
		try {

			keyboard = new BufferedReader(new InputStreamReader(System.in));

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			// 서버와 메시지를 주고 받음
			while (true) {
				// 키보드로부터 입력한 내용을 읽기
				System.out.print("전송 메시지: ");
				String msg = keyboard.readLine();

				// 메시지를 서버로 전송
				bw.write(msg + "\n");
				bw.flush();

				String getMsg = br.readLine();
				System.out.println("수신된 메시지: " + getMsg);

			}

		} catch (IOException e) {
			System.out.println("서버와 연결할 수 없습니다.");
			System.exit(0);
		}

	}

	public static void main(String[] args) {
		new UnicastClient();
	}

}
