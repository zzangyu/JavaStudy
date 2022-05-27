package com.member;

import java.util.Scanner;

/*
��ü Ŭ���� ����

MemberMain: ���� Ŭ����

MemberVO: ȸ�� ������ �����ϴ� Ŭ����

Action: �޼ҵ带 ������ �������̽�
MemberService: �������̽��� ����Ͽ� ������

���, ȸ�����, ����, ����
WriterAction: ���	AddAction
ListAction: ���		ListAction
DeleteAction: ����	DeleteAction
UpdateAction: ����	UpdateAction


 */

public class MemberMain {
	static MemberVO[] members;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		members = new MemberVO[0];
		MemberService memberService = new MemberService();

		boolean isStop = false;

		do {
			System.out.println("���� �޴� �� �ϳ��� �����ϼ���.");
			System.out.println("[1 - ȸ�� ����]");
			System.out.println("[2 - ȸ�� ��� ����]");
			System.out.println("[3 - ȸ�� ���� ����]");
			System.out.println("[4 - ȸ�� ���� ����]");
			System.out.println("[5 - ����]");

			String command = sc.next();

			switch (command) {
			case "1":
				WriteAction writeAction = new WriteAction();
//				writeAction.execute(sc);
				memberService.process(writeAction, sc);
				break;
			case "2":
				ListAction listAction = new ListAction();
				memberService.process(listAction, sc);
				break;
			case "3":
				DeleteAction deleteaction = new DeleteAction();
				memberService.process(deleteaction, sc);
				break;
			case "4":
				UpdateAction updateaction = new UpdateAction();
				memberService.process(updateaction, sc);
				break;
			case "5":
				isStop = true;
			}
		} while (!isStop);

	}

}
