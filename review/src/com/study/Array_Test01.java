package com.study;

import java.util.Scanner;

public class Array_Test01 {

	public static void main(String[] args) {

		String names[] = { "ȫ�浿", "����ġ", "�̵�", "�������", "�̼���", "������", "�縸��", "���ο�" };

		Scanner sc = new Scanner(System.in);
		int index = -1;

		for (String s : names) {
			System.out.print(s + "  ");
		}

		do {
			System.out.print("\n�˻��� �̸� �Է�: ");
			String name = sc.next();

			for (int i = 0; i < names.length; i++) {
				if (name.equals(names[i])) {
					index = i;
				}
			}
			if (index != -1) {
				System.out.println(name + "�� �迭�� [" + index + "] �ε��� ��ġ���� ã�ҽ��ϴ�.");
				break;
			}
			System.out.println("�Է��Ͻ� �̸��� �迭�� �������� �ʽ��ϴ�.");
		} while (true);

	}

}
