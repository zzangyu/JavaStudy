package com.excp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOExceptionEx {

	public static void main(String[] args) {
		// 3��, ���� ���� ���� ,���� �Է¹ް� ����/��� ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] subname = { "����", "����", "����" };
		int[][] sub = new int[3][subname.length + 2]; // ����, ������ ������ ���� Ȯ��
		float[] avg = new float[3];
		for (int i = 0; i < sub.length; i++) { // ���
			for (int j = 0; j < sub[i].length - 2; j++) {

				do {
					System.out.print(subname[j] + "����");
					// ����@@@@@@@@@@@@@@@@@@@@@@@@@@@
					try {
						sub[i][j] = Integer.parseInt(br.readLine());
					} catch (NumberFormatException | IOException e) {
						e.printStackTrace();
					}
					// ����@@@@@@@@@@@@@@@@@@@@@@@@@@@
				} while (sub[i][j] < 0 || sub[i][j] > 100);
				// ����
				sub[i][sub[i].length - 2] += sub[i][j];
			}
			avg[i] = sub[i][sub[i].length - 2] / (float) (sub[i].length - 2);
			sub[i][sub[i].length - 1] = 1;
		}
		for (int i = 0; i < sub.length; i++) {
			for (int j = 0; j < sub.length; j++) {
				if (sub[i][sub[i].length - 2] < sub[j][sub[j].length - 2]) {
					sub[i][sub[i].length - 1]++;
				}
			}
		}

		// ���
		for (int i = 0; i < sub.length; i++) {
			System.out.println();
			System.out.println("����: " + sub[i][sub[i].length - 2]);
			System.out.println("���: " + avg[i]);
			System.out.println("����: " + sub[i][sub[i].length - 1] + "��");
		}

	}

}
