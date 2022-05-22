package com.test;

import java.util.Scanner;

/*
[문제]
키보드로 돈의 액수를 입력받아 오만원, 만원권, 천원권, 500원짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전으로 변환.
단 배열과 반복문을 활용
배열명: unit
금액: 65123
 */

public class Test_Array03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };

		System.out.print("돈 입력해!");
		int money = sc.nextInt();

		for (int i = 0; i < unit.length; i++) {
			int use = money / unit[i];
			money = money % unit[i];
			System.out.println(unit[i] + "원은 " + use + "개 사용해이예이에~");
		}

	}
}
