package TEST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test04 {

	public static void main(String[] args) throws IOException {
		// 3��, ���� ���� ���� ,���� �Է¹ް� ����/��� ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] subname = { "����", "����", "����" };
		int[][][] sub = new int[2][3][subname.length + 3]; // ����, ������ ������ ���� Ȯ��
		float[][] avg = new float[2][3];
		for (int h = 0; h < sub.length; h++) {
			for (int i = 0; i < sub[h].length; i++) { // ���
				for (int j = 0; j < sub[h][i].length - 3; j++) {

					do {
						System.out.print(subname[j] + "����");
						sub[h][i][j] = Integer.parseInt(br.readLine());
					} while (sub[h][i][j] < 0 || sub[h][i][j] > 100);
					// ����
					sub[h][i][sub[h][i].length - 3] += sub[h][i][j];
				}
				avg[h][i] = sub[h][i][sub[h][i].length - 3] / (float) (sub[h][i].length - 3);
				sub[h][i][sub[h][i].length - 2] = 1;
				sub[h][i][sub[h][i].length - 1] = 1;
			}
		} // �� ����
		for (int h = 0; h < sub.length; h++) {
			for (int i = 0; i < sub[h].length; i++) {
				for (int j = 0; j < sub[h].length; j++) {
					if (sub[h][i][sub[h][i].length - 3] < sub[h][j][sub[h][j].length - 3]) {
						sub[h][i][sub[h][i].length - 2]++;
					}
				}
			}
		} // ���� ����
		for (int h = 0; h < sub.length; h++) {
			for (int k = 0; k < sub[h].length; k++) {
				for (int i = 0; i < sub.length; i++) {
					for (int j = 0; j < sub[i].length; j++) {
						if (sub[h][k][sub[h][k].length - 3] < sub[i][j][sub[i][j].length - 3]) {
							sub[h][k][sub[h][k].length - 1]++;
						}
					}
				}
			}
		}
		String[] name = { "������", "������", "������" };
		// ���
		for (int h = 0; h < sub.length; h++) {
			for (int i = 0; i < sub[h].length; i++) {
				System.out.print(name[i] + "\t");
				System.out.print("����: " + sub[h][i][sub[h][i].length - 3] + "\t");
				System.out.printf("���: %.2f\t", avg[h][i]);
				System.out.print("�ݼ���: " + sub[h][i][sub[h][i].length - 2] + "��\t");
				System.out.println("��������: " + sub[h][i][sub[h][i].length - 1] + "��");
			}
		}
	}
}
