package com.test;

import java.util.Scanner;

/*
[����]
Ű����� ���� �׼��� �Է¹޾� ������, ������, õ����, 500��¥�� ����, 100��¥�� ����, 50��¥�� ����, 10��¥�� ����, 1��¥�� �������� ��ȯ.
�� �迭�� �ݺ����� Ȱ��
�迭��: unit
�ݾ�: 65123
 */

public class Test_Array03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };

		System.out.print("�� �Է���!");
		int money = sc.nextInt();

		for (int i = 0; i < unit.length; i++) {
			int use = money / unit[i];
			money = money % unit[i];
			System.out.println(unit[i] + "���� " + use + "�� ������̿��̿�~");
		}

	}
}
