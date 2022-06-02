package com.excp1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, a = 0;
		System.out.println("정수 3개 입력 해.");
		for (int i = 0; i < 3; i++) {
			System.out.print((i + 1) + "번째 정수: ");
			try {
				a = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("정수를 입력해야 돼!");
				// 현재 입력 스트림에 남아있는 토근을 지운다.

				sc.nextLine();
				i--; // 인덱스를 미리 감소
				continue;

			}
			sum += a;
			System.out.println("정수 3개의 합: " + sum);
		}
	}

}
