package com.loginex;

import java.util.Scanner;

public class LoginRunner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean isStop = false;

		LoginService loginService = new LoginService();

		do {
			System.out.println("로그인 화면입니다.");
			System.out.println("아이디와 비밀번호를 입력하세요.");
			System.out.print("아이디 입력:");
			String id = sc.next();
			System.out.print("비밀번호 입력:");
			String passwd = sc.next();

			UserVO user = loginService.login(id, passwd);

			if (user == null) {
				System.out.println("아이디와 비밀번호가 일치하지 않습니다.");
			} else {
				System.out.println("로그인한 사용자 정보입니다.");
				System.out.println(user);
				isStop = true;
			}

		} while (!isStop);

	}

}
