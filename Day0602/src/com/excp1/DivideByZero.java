package com.excp1;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dividend;
		int divisor;
		// ���� �� - dividend
		System.out.print("���� �� �Է�: ");
		dividend = sc.nextInt();
		// ���� �� - divisor
		System.out.print("���� �� �Է�: ");
		divisor = sc.nextInt();
		try {
			System.out.println(dividend + "��" + divisor + "�� ������ ���� " + dividend / divisor + "�Դϴ�.");
		} catch (ArithmeticException e) {
//			e.printStackTrace();
//			e.getMessage();
			System.out.println("���� 0���� �����̳׿�.. �Ĵ��� ;;");
		} finally {
			sc.close();
		}
	}

}
