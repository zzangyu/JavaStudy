package com.member;

import java.util.Scanner;

public class ListAction implements Action {

	@Override
	public void execute(Scanner sc) {
		MemberVO[] members = MemberMain.members;
		if (members.length >= 1) {
			for (int i = 0; i < members.length; i++) {
				System.out.println("�̸�: " + members[i].getName());
				System.out.println("��ȭ��ȣ: " + members[i].getTel());
				System.out.println("����: " + members[i].getNation());
				System.out.println("����: " + members[i].getAge());
				System.out.println("�̸���: " + members[i].getEmail());

			}
		} else {
			System.out.println("ȸ�� ������ �������� �ʽ��ϴ�.");
		}
	}

}
