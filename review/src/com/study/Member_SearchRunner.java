package com.study;

import java.util.Scanner;

public class Member_SearchRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member_Search mr = new Member_Search();
		do {
			System.out.print("�̸� �Է� ������ ~!  ");
			String name = sc.next();
			boolean searchResult = mr.searchMember(name); // ã������ true, �� ã������ false
			if (searchResult)
				break; // false�� �������� print ��� �� �ݺ�
			System.out.println("�˻��Ͻ� �̸��� �����ϴ���");
		} while (true);
	}

}
