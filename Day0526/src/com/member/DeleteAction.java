package com.member;

import java.util.Scanner;

public class DeleteAction implements Action {
	MemberVO[] members = MemberMain.members;
	MemberVO[] member = new MemberVO[members.length];

	@Override
	public void execute(Scanner sc) {
		System.out.println("���� �� ȸ�� ����");
		System.out.println("���� �� ȸ�� ���� �̸�");
		System.out.println("�̸� �Է�: ");
		String name = sc.next();

		deleteMember(name);
		for (int i = 0; i < MemberMain.members.length; i++) {
			if (!members[i].getName().equals(name)) {
				System.out.println("���� �� ȸ�� ������ �������� �ʽ��ϴ�.");
				return;
			} else {

			}

		}
	}

	private void deleteMember(String name) {

		for (int i = 0; i < members.length; i++) {
			if (!members[i].getName().equals(name)) {

				member[i] = members[i];
				members[i] = member[i];
			}

		}
	}

}
