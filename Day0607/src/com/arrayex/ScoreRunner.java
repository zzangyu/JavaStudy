package com.arrayex;

import java.io.IOException;

public class ScoreRunner {

	public static void main(String[] args) {
		char ch;
		// �������̽� ������
		Score score = new Scoreimpl();
		try {
			while (true) {
				do {
					System.out.print("1. �߰� 2. ���� 3. ���� 4. ��ü��� 5. �й� �˻� 6. �̸� �˻� 7. ���� ---");
					ch = (char) System.in.read();
					System.in.read();
					System.in.read();
				} while (ch < '1' || ch > '7');

				switch (ch) {
				case '1':
					score.insert();
					break;
				case '2':
					score.update();
					break;
				case '3':
					score.delete();
					break;
				case '4':
					score.listAll();
					break;
				case '5':
					score.searchHak();
					break;
				case '6':
					score.searchName();
					break;
				case '7':
					System.exit(0);
				}

			}
		} catch (IOException io) {
			io.printStackTrace();
		}

	}

}
