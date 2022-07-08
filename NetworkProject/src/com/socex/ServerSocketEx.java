package com.socex;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketEx {

	public static void main(String[] args) throws Exception {
		// 사용자들을 받아들이기 위해 serverSocket이 필요하다.
		ServerSocket ss = new ServerSocket(3000);

		while (true) {
			// 접속자 클라이언트가 접속 할 때까지 무한정 대기
			// 클라이언트 꼭 필요해 ~!
			Socket s = ss.accept();
			InetAddress iaddr = s.getInetAddress();
			String u_ip = iaddr.getHostAddress();
			System.out.println(u_ip + "님이 접속 하셨습니다.");

		}
	}

}
