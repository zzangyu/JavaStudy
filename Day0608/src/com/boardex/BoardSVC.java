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
		System.out.println("�ۼ���: ");
		String register = sc.next();
		System.out.println("�̸���: ");
		String email = sc.next();
		System.out.println("��й�ȣ: ");
		String pw = sc.next();
		System.out.println("����: ");
		String subject = sc.next();
		System.out.println("�� ����: ");
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
	public void subjectList() {

	}

	// �� ����
	public void deleteSubject() {

	}

}