package com.excp4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalaExam {

	private static BufferedReader br;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	public static void main(String[] args) throws IOException {
		int su1 = 0, su2 = 0, tot = 0;
		char yon = 0, flag = 0;

		while (true) {

			do {
				flag = 0;
				System.out.print("ù��° ��: ");
				try {
					su1 = Integer.parseInt(br.readLine());
				} catch (NumberFormatException e) {
					System.out.println("���ڸ� �Է���!");
					flag = 1;
				}
			} while (flag != 0);
			do {
				do {
					flag = 0;
					String str = "";
					try {
						System.out.println("������( + - * / ) :");
						str = br.readLine();
						yon = str.charAt(0);
					} catch (StringIndexOutOfBoundsException e) {
						System.out.println("�ϴ� �Է��� !!!");
						flag = 1;
					}

					if (str.length() != 1) {
						System.out.println("�����ڴ� ���ڸ��� �ϼž� �մϴ�.");
						flag = 1;
					}

				} while (flag != 0 || (yon != '+' && yon != '-' && yon != '*' && yon != '/'));
			} while (flag != 0);
			do {
				flag = 0;
				System.out.print("�ι�° ��: ");
				try {
					su2 = Integer.parseInt(br.readLine());
				} catch (NumberFormatException e) {
					System.out.println("���ڸ� �Է���!");
					flag = 1;
				}
			} while (flag != 0);

			flag = 0;
			try {

				switch (yon) {

				case '+':
					tot = su1 + su2;
					break;
				case '-':
					tot = su1 - su2;
					break;
				case '*':
					tot = su1 * su2;
					break;
				case '/':
					tot = su1 / su2;
					break;

				}

			} catch (ArithmeticException e) {
				System.out.println("0���� ���� �� ������!");
				flag = 1;
			}
			System.out.println(su1 + " " + yon + " " + su2 + " = " + tot);
		} // end while

	}

}
