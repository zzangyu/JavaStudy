package com.study.member;

public class Member_Search {
	Member[] members = new Member[5];

	public Member_Search() {

		// members ��ü�迭�� ȸ������ ������ ����
		members[0] = new Member("ȫ�浿", 195, 120, "������");
		members[1] = new Member("����", 187, 97, "�ѳ���");
		members[2] = new Member("��������", 167, 73, "������");
		members[3] = new Member("������", 152, 58, "���");
		members[4] = new Member("�̼���", 182, 90, "���");
	}

	public boolean searchMember(String name) {

		boolean searchResult = false;

		for (Member member : members) {
			if (member.getName().equals(name)) {
				prtInfo(member);
				searchResult = true;
			}
		}

		return searchResult;
	}

	// �Ķ���� ������ ȸ����ü�� ������ �޾Ƽ� ����ϴ� �޼ҵ�
	private void prtInfo(Member member) {
		System.out.println(member.getName() + "���� ã�� ��� ��");
		System.out.println("�̸�: " + member.getName());
		System.out.println("Ű: " + member.getHeight());
		System.out.println("������: " + member.getWeight());
		System.out.println("����: " + member.getNation());
	}

}
