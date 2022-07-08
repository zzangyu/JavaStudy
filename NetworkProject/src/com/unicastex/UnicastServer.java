package com.unicastex;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class UnicastServer {

	public UnicastServer() {

		ServerSocket server = null;

		try {
			// ServerSocket 생성
			server = new ServerSocket(5000);

		} catch (IOException e) {
			System.out.println("해당 포트가 사용 중입니다.");
			System.exit(0);
		}

		// 연결이 되면 대기
		try {

			while (true) {
				System.out.println("Server Ready");
				Socket socket = server.accept();

				/*
				 * 클라이언트와 메시지를 송수신 할 수 있는 Thread 생성 스레드 생성시 socket을 전달받아서 구현함 스레드를 시작함
				 */

				UnicastServerThread thread = new UnicastServerThread(socket); // 소켓이 여기로 전달 되는 것
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
