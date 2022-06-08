package com.boardex;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardSVC {
	// ��� ������ ����
	ArrayList<BoardVO> boardList;

	public BoardSVC() {
		boardList = new ArrayList<BoardVO>();
	}

	// �� ����
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

		BoardVO boardVO = new BoardVO(register, subject, email, content, pw);
		// ����Ʈ�� �߰�
		addArticle(boardVO);
	}

	// ���� ����Ʈ�� �߰�
	private void addArticle(BoardVO boardVO) {
		boardList.add(boardVO);
	}

	// ��� ����
	public void listArticle(Scanner sc) {
		if (boardList.size() > 0) {
			for (int i = 0; i < boardList.size(); i++) {
				System.out.println(boardList.get(i));
			}
		} else {
			System.out.println("��ϵ� �Խñ��� �����ϴ�.");
		}
	}

	// �� ����
	public void deleteArticle(Scanner sc) {
		System.out.println("�Խñ��� ������ ���� ���� �ۼ��ڿ� ��й�ȣ�� �Է��ϼ���.");
		System.out.print("�ۼ���: ");
		String register = sc.next();
		System.out.print("��й�ȣ: ");
		String pw = sc.next();

		deleteArticle(register, pw);

	}

	private void deleteArticle(String register, String pw) {
		// ���� ��� ����
		if (boardList.size() > 0) {
			int index = -1;

			for (int i = 0; i < boardList.size(); i++) {
				if (boardList.get(i).getRegister().equals(register)) {
					if (boardList.get(i).getPw().equals(pw)) {
						boardList.remove(boardList.get(i));
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
		if (boardList.size() > 0) {
			for (int i = 0; i < boardList.size(); i++) {
				if (boardList.get(i).getRegister().equals(name)) {
					System.out.println(boardList.get(i));
				}
			}
		} else {
			System.out.println("��ϵ� �Խñ��� �����ϴ�.");
		}
	}

	public void updateArticle(Scanner sc) {
		System.out.println("�̸��� ��й�ȣ�� �Է����ּ���.");
		System.out.println("�̸�: ");
		String register = sc.next();
		System.out.println("��й�ȣ: ");
		String pw = sc.next();
		if (boardList.size() > 0) {
			for (int i = 0; i < boardList.size(); i++) {
				if (boardList.get(i).getRegister().equals(register)) {
					if (boardList.get(i).getPw().equals(pw)) {

					}
				}
			}
		} else {
			System.out.println("��ϵ� �Խñ��� �����ϴ�.");
		}
	}

}