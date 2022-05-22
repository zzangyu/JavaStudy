package com.test;

import java.util.Scanner;

/*
[문제]
양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수중에서 3의 배수만을 출력하는 프로그램을 작성하시오.
 */

public class Test_Array02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] xx = new int[10];

		int i;

		for (i = 0; i < xx.length; i++) {
			System.out.print((i + 1) + "번째 양의 정수 넣어.");
			xx[i] = sc.nextInt();
		}
		for (i = 0; i < xx.length; i++) {
			if (xx[i] % 3 == 0) {
				System.out.print(xx[i] + "  ");
			}
		}
	}

}
