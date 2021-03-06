package com.member;

import java.util.Scanner;

public class UpdateAction implements Action {

	@Override
	public void execute(Scanner sc) {
		System.out.println("수정 할 회원 정보");
		System.out.println("수정 할 회원 정보 이름");
		System.out.println("이름 입력: ");
		String name = sc.next();

		MemberVO member = getUpdateMember(name);
		if (member == null) {
			System.out.println("수정 할 회원 정보가 존재하지 않습니다.");
			return;
		} else {
			System.out.print("나이: ");
			int age = sc.nextInt();

			System.out.print("이메일: ");
			String email = sc.next();

			System.out.print("국적: ");
			String nation = sc.next();

			System.out.print("전화번호: ");
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
