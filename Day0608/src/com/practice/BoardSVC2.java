package com.practice;

import java.util.HashMap;
import java.util.Scanner;

public class BoardSVC2 {
	HashMap<String, String> board;
	HashMap<String, BoardVO2> board_;

	public BoardSVC2() {
		board = new HashMap<String, String>();
		board_ = new HashMap<String, BoardVO2>();
	}

	public void writeArticle(Scanner sc) {
		System.out.println("�Խ��� ���� �ۼ��ϼ���.");
		System.out.print("�ۼ���: ");
		String register = sc.next();
		System.out.print("�̸���: ");
		String email = sc.next();
		System.out.print("��й�ȣ: ");
		String pw = sc.next();
		System.out.print("����: ");
		String subject = sc.next();
		System.out.print("�� ����: ");
		String content = sc.next();
		BoardVO2 boardVO2 = new BoardVO2(register, subject, email, content, pw);
		addArticle(pw, boardVO2);
	}

	private void addArticle(String pw, BoardVO2 boardVO2) {
		board_.put(pw, boardVO2);
	}

	public void listArticle(Scanner sc) {
		if (board_.size() > 0) {
			for (int i = 0; i < board_.size(); i++) {
				System.out.println(board_.get(i));
			}
		} else {
			System.out.println("��ϵ� �Խñ��� �����ϴ�.");
		}
	}

	public void deleteArticle(Scanner sc) {
		System.out.println("�Խñ��� ������ ���� ���� �ۼ��ڿ� ��й�ȣ�� �Է��ϼ���.");
		System.out.print("�ۼ���: ");
		String register = sc.next();
		System.out.print("��й�ȣ: ");
		String pw = sc.next();

		deleteArticle(register, pw);
	}

	private void deleteArticle(String register, String pw) {
		if (board_.size() > 0) {
			int index = -1;

			for (int i = 0; i < board_.size(); i++) {
				if (board_.get(i).getRegister().equals(register)) {
					if (board_.get(i).getPw().equals(pw)) {
						board_.remove(board_.get(i));
						index = 1;
						System.out.println(register + "���� �Խñ��� �����Ǿ����ϴ�.");
					}
				}
			}
			if (index == -1) { // ���� ã�� ���� ���� ��, �̸�&��й�ȣ�� ���� ���� ��
				System.out.println("�ش� ���� �ۼ���&��й�ȣ�� ������ ��ġ���� �ʽ��ϴ�.");
				return;
			}

		} else {
			System.out.println("��ϵ� �Խñ��� �����ϴ�.");
		}
	}

	public void searchArticle(Scanner sc) {
		System.out.print("�̸��� �Է����ּ���.");
		String name = sc.next();
		if (board_.size() > 0) {
			for (int i = 0; i < board_.size(); i++) {
				if (board_.get(i).getRegister().equals(name)) {
					System.out.println(board_.get(i));
				}
			}
		} else {
			System.out.println("��ϵ� �Խñ��� �����ϴ�.");
		}
	}

	public void updateArticle(Scanner sc) {
		System.out.println("�̸��� ��й�ȣ�� �Է����ּ���.");
		System.out.print("�̸�: ");
		String register = sc.next();
		System.out.print("��й�ȣ: ");
		String pw = sc.next();

		if (board_.size() > 0) {
			for (int i = 0; i < board_.size(); i++) {
				if (board_.get(i).getRegister().equals(register)) {
					if (board_.get(i).getPw().equals(pw)) {
						writeArticle(sc);
					}
				}
			}
		} else {
			System.out.println("��ϵ� �Խñ��� �����ϴ�.");
		}
	}
}
