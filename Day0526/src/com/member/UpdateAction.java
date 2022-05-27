package com.member;

import java.util.Scanner;

public class UpdateAction implements Action {

	@Override
	public void execute(Scanner sc) {
		System.out.println("���� �� ȸ�� ����");
		System.out.println("���� �� ȸ�� ���� �̸�");
		System.out.println("�̸� �Է�: ");
		String name = sc.next();

		MemberVO member = getUpdateMember(name);
		if (member == null) {
			System.out.println("���� �� ȸ�� ������ �������� �ʽ��ϴ�.");
			return;
		} else {
			System.out.print("����: ");
			int age = sc.nextInt();

			System.out.print("�̸���: ");
			String email = sc.next();

			System.out.print("����: ");
			String nation = sc.next();

			System.out.print("��ȭ��ȣ: ");
			String tel = sc.next();

			member = new MemberVO(age, name, tel, email, nation);

			for (int i = 0; i < MemberMain.members.length; i++) {
				if (MemberMain.members[i].getName().equals(name)) {
					MemberMain.members[i] = member;
				}
			}

		}

	}

	private MemberVO getUpdateMember(String name) {
		MemberVO[] members = MemberMain.members;
		MemberVO member = null;

		for (int i = 0; i < members.length; i++) {
			if (members[i].getName().equals(name)) {
				member = members[i];
			}
		}
		return member;
	}

}
