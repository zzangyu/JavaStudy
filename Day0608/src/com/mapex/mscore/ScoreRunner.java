package com.mapex.mscore;

import java.io.IOException;

public class ScoreRunner {

	public static void main(String[] args) throws IOException {

		Score score = new ScoreImpl();
		char ch;
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡ� ����ó�� �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		while (true) {
			do {
				System.out.println("\n(1)�Է� (2)���� (3)�̸� �˻� (4)���� ");
				System.out.println("(5)��ü ��� (6)��ü��� - ������ (7)����");
				System.out.print("�޴� ����: ");
				ch = (char) System.in.read();
				System.in.read();
				System.in.read();
			} while (ch < '1' || ch > '7');

			switch (ch) {
			case '1':
				score.Insert();
				break;
			case '2':
				score.Update();
				break;
			case '3':
				score.Search();
				break;
			case '4':
				score.Delete();
				break;
			case '5':
				score.WriteAll();
				break;
			case '6':
				score.WriteSort();
				break;
			case '7':
				System.exit(0);
			}

		}

	}

}
