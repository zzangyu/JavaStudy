package com.unicastex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

// 클라이언트와 연결된 소켓객체를 가지고 있으며 접속을 유지하고 통신을 담당하는 클래스다.
public class UnicastServerThread extends Thread {

	// 서버로부터 전달된 socket을 저장한다.

	Socket socket = null;
	BufferedReader br = null; // 서버로부터 받은걸 읽고
	BufferedWriter bw = null; // 쓰기

	// 객체를 생성할 때 socket을 전달 받아서 멤버 변수에 저장한다.
	public UnicastServerThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		// 스트림 연결
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			// 클라이언트와 메시지를 송수신한다.
			while (true) {
				// 클라이언트가 보낸 메시지를 수신한다.
				String msg = br.readLine();
				System.out.println(msg);

				// 클라이언트에게 메시지를 송신한다.
				bw.write(msg + "\n");
				bw.flush(); // 버퍼 지움!

			}
		} catch (IOException e) {
			// 클라이언트와 연결이 끊어진 경우 예외가 발생한다.
			InetAddress ip = socket.getInetAddress();
			String address = ip.getHostAddress();
			System.out.println("[" + address + "]와의 연결이 끊어졌습니다.");

		}
	}

}
