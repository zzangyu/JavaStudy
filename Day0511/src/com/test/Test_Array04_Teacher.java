package com.test;

import java.util.Scanner;

public class Test_Array04_Teacher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] com = { "가위", "바위", "보" };

		System.out.println("컴터와 가위 바위 보 게임을 시작합니다.");
		while (true) {
			System.out.print("가위 바위 보 :");
			String a = sc.next();

			if (a.equals("그만")) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			int n = (int) (Math.random() * 3);
			String b = com[n];
			System.out.println("사용자: " + a + ", 컴터: " + b);

			if (a.equals("가위")) {
				if (b.equals("가위")) {
					System.out.println("비겼습니다.");
				} else if (b.equals("바위")) {
					System.out.println("컴퓨터가 이겼습니다.");
				} else {
					System.out.println("사용자가 이겼습니다.");
				}
			} else if (a.equals("바위")) {
				if (b.equals("가위")) {
					System.out.println("사용자가 이겼습니다.");
				} else if (b.equals("바위")) {
					System.out.println("비겼습니다.");
				} else {
					System.out.println("컴퓨터가 이겼습니다.");
				}
			} else if (a.equals("보")) {
				if (b.equals("가위")) {
					System.out.println("컴퓨터가 이겼습니다.");
				} else if (b.equals("바위")) {
					System.out.println("사용자가 이겼습니다.");
				} else {
					System.out.println("비겼습니다.");
				}
			} else {
				System.out.println("다시 입력해잇!");
			}
		}

	}

}
