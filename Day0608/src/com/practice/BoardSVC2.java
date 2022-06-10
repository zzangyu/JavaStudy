package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BoardSVC2 {

	ArrayList<HashMap<String, String>> boardList;

	public BoardSVC2() {
		boardList = new ArrayList<HashMap<String, String>>();
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
		HashMap<String, String> boardMap = new HashMap<String, String>();
		boardMap.put("register", register);
		boardMap.put("email", email);
		boardMap.put("pw", pw);
		boardMap.put("subject", subject);
		boardMap.put("content", content);

		addArticle(boardMap);
	}

	private void addArticle(HashMap<String, String> boardMap) {
		boardList.add(boardMap);
	}

	public void listArticle(Scanner sc) {
		if (boardList.size() > 0) {
			for (int i = 0; i < boardList.size(); i++) {
				System.out.println("�ۼ���:" + boardList.get(i).get("register"));
				System.out.println("�̸���:" + boardList.get(i).get("email"));
				System.out.println("��й�ȣ:" + boardList.get(i).get("pw"));
				System.out.println("����:" + boardList.get(i).get("subject"));
				System.out.println("�� ����" + boardList.get(i).get("content") + "\n");
			}
		} else {
			System.out.println("��ϵ� �Խñ��� �����ϴ�.");
		}
	}

	public void deleteArticle(Scanner sc) {
		int limit = 0;
		while (limit < 3) {
			if (limit > 0) {
				System.out.println(3 - limit + "�� ���ҽ��ϴ�.");
			}
			System.out.println("\n�Խñ��� ������ ���� ���� �ۼ��ڿ� ��й�ȣ�� �Է��ϼ���.");
			System.out.print("�ۼ���: ");
			String register = sc.next();
			System.out.print("��й�ȣ: ");
			String pw = sc.next();
			deleteArticle(register, pw);
			if (limit == 2) {
				System.out.print("���̵� �Ǵ� ��й�ȣ�� ���� �ʾ� �����մϴ�. ");
				System.exit(0);
			}
			limit++;
		}
	}

	private void deleteArticle(String register, String pw) {
		int limit = 0;
		if (boardList.size() > 0) {
			int index = -1;

			for (int i = 0; i < boardList.size(); i++) {
				if (boardList.get(i).get("register").equals(register)) {
					if (boardList.get(i).get("pw").equals(pw)) {
						boardList.remove(boardList.get(i));
						index = 1;
						System.out.println(register + "���� �Խñ��� �����Ǿ����ϴ�.");
					}
				}
			}
			if (index == -1) { // ���� ã�� ���� ���� ��, �̸�&��й�ȣ�� ���� ���� ��
				System.out.println("�ش� ���� �ۼ���&��й�ȣ�� ������ ��ġ���� �ʽ��ϴ�.");
			}

		} else {
			System.out.println("��ϵ� �Խñ��� �����ϴ�.");
			return;
		}

	}

	public void searchArticle(Scanner sc) {
		System.out.print("�̸��� �Է����ּ���.");
		String name = sc.next();
		if (boardList.size() > 0) {
			for (int i = 0; i < boardList.size(); i++) {
				if (boardList.get(i).get("register").equals(name)) {
					System.out.println("�ۼ���:" + boardList.get(i).get("register"));
					System.out.println("�̸���:" + boardList.get(i).get("email"));
					System.out.println("��й�ȣ:" + boardList.get(i).get("pw"));
					System.out.println("����:" + boardList.get(i).get("subject"));
					System.out.println("�� ����" + boardList.get(i).get("content") + "\n");
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

		if (boardList.size() > 0) {
			for (int i = 0; i < boardList.size(); i++) {
				if (boardList.get(i).get("register").equals(register)) {
					if (boardList.get(i).get("pw").equals(pw)) {
						boardList.remove(i);
						writeArticle(sc);
					}
				}
			}
		} else {
			System.out.println("��ϵ� �Խñ��� �����ϴ�.");
		}
	}
}
