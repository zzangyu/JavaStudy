package com.excp1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, a = 0;
		System.out.println("���� 3�� �Է� ��.");
		for (int i = 0; i < 3; i++) {
			System.out.print((i + 1) + "��° ����: ");
			try {
				a = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("������ �Է��ؾ� ��!");
				// ���� �Է� ��Ʈ���� �����ִ� ����� �����.

				sc.nextLine();
				i--; // �ε����� �̸� ����
				continue;

			}
			sum += a;
			System.out.println("���� 3���� ��: " + sum);
		}
	}

}
