package com.test;

import java.util.Scanner;

/*
[����]
���� ���� 10���� �Է¹޾� �迭�� �����ϰ�, �迭�� �ִ� �����߿��� 3�� ������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

public class Test_Array02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] xx = new int[10];

		int i;

		for (i = 0; i < xx.length; i++) {
			System.out.print((i + 1) + "��° ���� ���� �־�.");
			xx[i] = sc.nextInt();
		}
		for (i = 0; i < xx.length; i++) {
			if (xx[i] % 3 == 0) {
				System.out.print(xx[i] + "  ");
			}
		}
	}

}
