package com.test;

import java.util.Scanner;

/*
[����]
�л� ���� �Է� �޾Ƽ� �Է� ���� �ο��� ��ŭ �л��� �̸��� ��ȭ��ȣ�� �Է¹ް� (�̸��� ��ȭ��ȣ�� �������� ����)
�Է� ���� ������ ��ü�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
��, �迭�� �̿��Ͽ� �ۼ��Ͻÿ�.

�л���:3
�̸� ��ȭ��ȣ �Է�(1)[���鱸��] : ȫ�浿 010-1111-1111
�̸� ��ȭ��ȣ �Է�(2)[���鱸��] : �̼��� 010-2222-2222
�̸� ��ȭ��ȣ �Է�(3)[���鱸��] : ������ 010-3333-3333

-----------------------
�Է¹��� �л� �� : 3
-----------------------
�̸�     ��ȭ��ȣ
ȫ�浿 010-1111-1111
�̼��� 010-2222-2222
������ 010-3333-3333
-----------------------
 */
public class Test_Array01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int student;
		student = sc.nextInt();
		String[] name = new String[student];
		String[] phno = new String[student];

		for (int i = 0; i < student; i++) {
			System.out.print("�̸� ��ȭ��ȣ �Է�(" + (i + 1) + "):[���鱸��]: ");
			name[i] = sc.next();
			phno[i] = sc.next();
		}
		System.out.println("------------------------");
		System.out.printf("�Է� ���� �л� ��: %d\n", student);
		System.out.println("------------------------");
		System.out.println("�̸�           ��ȭ��ȣ");
		System.out.println("------------------------");
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + "  " + phno[i]);
		}
		System.out.println("------------------------");
	}

}
