package com.test;

import java.util.Scanner;

/*
컴퓨터와 사용자 사이의 가위 바위 보 게임을 만듦
사용자가 먼저 세가지중 하나를 입력하고 실행
컴퓨터는 랜덤으로 하나를 선택하여 비교한다.
누가 이겼는지를 판단하고 사용하자 그만을 입력하면 게임을 종료함
 */
public class Test_Array04 {

	public static void main(String[] args) {

		String[] win = { "가위", "바위", "보" };
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("가위 바위 보~!");
			String hm = sc.next();
			int str = (int) (Math.random() * 3);

			if (win[str].equals("바위")) {
				if (hm.equals("가위")) {
					System.out.println("사용자:" + hm + " 컴퓨터:" + win[str] + "  \n졌습니다.");
				} else if (hm.equals("바위")) {
					System.out.println("사용자:" + hm + " 컴퓨터:" + win[str] + "  \n비겼습니다.");
				} else if (hm.equals("보")) {
					System.out.println("사용자:" + hm + " 컴퓨터:" + win[str] + "  \n이겼습니다.");
				}
			}
			if (win[str].equals("가위")) {
				if (hm.equals("보")) {
					System.out.println("사용자:" + hm + " 컴퓨터:" + win[str] + "  \n졌습니다.");
				} else if (hm.equals("가위")) {
					System.out.println("사용자:" + hm + " 컴퓨터:" + win[str] + "  \n비겼습니다.");
				} else if (hm.equals("바위")) {
					System.out.println("사용자:" + hm + " 컴퓨터:" + win[str] + "  \n이겼습니다.");
				}
			}
			if (win[str].equals("보")) {
				if (hm.equals("바위")) {
					System.out.println("사용자:" + hm + " 컴퓨터:" + win[str] + "  \n졌습니다.");
				} else if (hm.equals("보")) {
					System.out.println("사용자:" + hm + " 컴퓨터:" + win[str] + "  \n비겼습니다.");
				} else if (hm.equals("가위")) {
					System.out.println("사용자:" + hm + " 컴퓨터:" + win[str] + "  \n이겼습니다.");
				}
			}
			if (hm.equals("그만")) {
				System.out.println("게임을 종료합니다.");
				System.exit(0);
				break;
			}
		}
	}
}