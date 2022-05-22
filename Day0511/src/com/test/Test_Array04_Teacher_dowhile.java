package com.test;

import java.util.Random;
import java.util.Scanner;

public class Test_Array04_Teacher_dowhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = { "가위", "바위", "보" };

		Random rd = new Random();
		int com = rd.nextInt(3) + 1;
		// 난수(랜덤 수)를 발생시킨다.
		int user;
		do {
			System.out.println("1: 가위, 2: 바위, 3: 보 중 입력");
			user = sc.nextInt();
		} while (user < 1 || user > 3);
		String result;
		result = "무승부 예이예이에~!";
		if ((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2))
			result = "사용자가 승리하셨습니다잇!";
		if ((user == 1 && com == 2) || (user == 2 && com == 3) || (user == 3 && com == 1))
			result = "사용자님 졌다데스~잇!";
		System.out.println("최종 승부 결과: " + result);

	}

}
