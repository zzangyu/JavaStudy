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
					System.out.println("다시 입력해주세요");
					continue;
				}
			}
			if (a.equals("y")) {
				System.out.println("게임을 시작합니다.");
				continue;
			} else if (a.equals("n")) {
				System.out.println("게임을 종료합니다.");
				break;
			}

		}
	}

}
