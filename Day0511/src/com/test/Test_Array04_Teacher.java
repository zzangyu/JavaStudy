package com.test;

import java.util.Scanner;

public class Test_Array04_Teacher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] com = { "����", "����", "��" };

		System.out.println("���Ϳ� ���� ���� �� ������ �����մϴ�.");
		while (true) {
			System.out.print("���� ���� �� :");
			String a = sc.next();

			if (a.equals("�׸�")) {
				System.out.println("������ �����մϴ�.");
				break;
			}
			int n = (int) (Math.random() * 3);
			String b = com[n];
			System.out.println("�����: " + a + ", ����: " + b);

			if (a.equals("����")) {
				if (b.equals("����")) {
					System.out.println("�����ϴ�.");
				} else if (b.equals("����")) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				} else {
					System.out.println("����ڰ� �̰���ϴ�.");
				}
			} else if (a.equals("����")) {
				if (b.equals("����")) {
					System.out.println("����ڰ� �̰���ϴ�.");
				} else if (b.equals("����")) {
					System.out.println("�����ϴ�.");
				} else {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}
			} else if (a.equals("��")) {
				if (b.equals("����")) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				} else if (b.equals("����")) {
					System.out.println("����ڰ� �̰���ϴ�.");
				} else {
					System.out.println("�����ϴ�.");
				}
			} else {
				System.out.println("�ٽ� �Է�����!");
			}
		}

	}

}
