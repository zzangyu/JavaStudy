package com.project;

import java.util.Scanner;

public class ccc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = "";

		while (true) {
			while (!a.equals("y") || !a.equals("n")) {
				System.out.print("y/n");
				a = sc.next();
				if (a.equals("y") || a.equals("n")) {
					break;
				} else {
					System.out.println("�ٽ� �Է����ּ���");
					continue;
				}
			}
			if (a.equals("y")) {
				System.out.println("������ �����մϴ�.");
				continue;
			} else if (a.equals("n")) {
				System.out.println("������ �����մϴ�.");
				break;
			}

		}
	}

}
