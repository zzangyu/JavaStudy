package com.loginex;

import java.util.Scanner;

public class LoginRunner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean isStop = false;

		LoginService loginService = new LoginService();

		do {
			System.out.println("�α��� ȭ���Դϴ�.");
			System.out.println("���̵�� ��й�ȣ�� �Է��ϼ���.");
			System.out.print("���̵� �Է�:");
			String id = sc.next();
			System.out.print("��й�ȣ �Է�:");
			String passwd = sc.next();

			UserVO user = loginService.login(id, passwd);

			if (user == null) {
				System.out.println("���̵�� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			} else {
				System.out.println("�α����� ����� �����Դϴ�.");
				System.out.println(user);
				isStop = true;
			}

		} while (!isStop);

	}

}
