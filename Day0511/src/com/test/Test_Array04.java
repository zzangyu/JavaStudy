package com.test;

import java.util.Scanner;

/*
��ǻ�Ϳ� ����� ������ ���� ���� �� ������ ����
����ڰ� ���� �������� �ϳ��� �Է��ϰ� ����
��ǻ�ʹ� �������� �ϳ��� �����Ͽ� ���Ѵ�.
���� �̰������ �Ǵ��ϰ� ������� �׸��� �Է��ϸ� ������ ������
 */
public class Test_Array04 {

	public static void main(String[] args) {

		String[] win = { "����", "����", "��" };
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("���� ���� ��~!");
			String hm = sc.next();
			int str = (int) (Math.random() * 3);

			if (win[str].equals("����")) {
				if (hm.equals("����")) {
					System.out.println("�����:" + hm + " ��ǻ��:" + win[str] + "  \n�����ϴ�.");
				} else if (hm.equals("����")) {
					System.out.println("�����:" + hm + " ��ǻ��:" + win[str] + "  \n�����ϴ�.");
				} else if (hm.equals("��")) {
					System.out.println("�����:" + hm + " ��ǻ��:" + win[str] + "  \n�̰���ϴ�.");
				}
			}
			if (win[str].equals("����")) {
				if (hm.equals("��")) {
					System.out.println("�����:" + hm + " ��ǻ��:" + win[str] + "  \n�����ϴ�.");
				} else if (hm.equals("����")) {
					System.out.println("�����:" + hm + " ��ǻ��:" + win[str] + "  \n�����ϴ�.");
				} else if (hm.equals("����")) {
					System.out.println("�����:" + hm + " ��ǻ��:" + win[str] + "  \n�̰���ϴ�.");
				}
			}
			if (win[str].equals("��")) {
				if (hm.equals("����")) {
					System.out.println("�����:" + hm + " ��ǻ��:" + win[str] + "  \n�����ϴ�.");
				} else if (hm.equals("��")) {
					System.out.println("�����:" + hm + " ��ǻ��:" + win[str] + "  \n�����ϴ�.");
				} else if (hm.equals("����")) {
					System.out.println("�����:" + hm + " ��ǻ��:" + win[str] + "  \n�̰���ϴ�.");
				}
			}
			if (hm.equals("�׸�")) {
				System.out.println("������ �����մϴ�.");
				System.exit(0);
				break;
			}
		}
	}
}