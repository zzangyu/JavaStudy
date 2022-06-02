package com.excp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOExceptionEx {

	public static void main(String[] args) {
		// 3명, 국어 영어 수학 ,점수 입력받고 총점/평균 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] subname = { "국어", "영어", "수학" };
		int[][] sub = new int[3][subname.length + 2]; // 총점, 석차를 저장할 공간 확보
		float[] avg = new float[3];
		for (int i = 0; i < sub.length; i++) { // 사람
			for (int j = 0; j < sub[i].length - 2; j++) {

				do {
					System.out.print(subname[j] + "점수");
					// 여기@@@@@@@@@@@@@@@@@@@@@@@@@@@
					try {
						sub[i][j] = Integer.parseInt(br.readLine());
					} catch (NumberFormatException | IOException e) {
						e.printStackTrace();
					}
					// 여기@@@@@@@@@@@@@@@@@@@@@@@@@@@
				} while (sub[i][j] < 0 || sub[i][j] > 100);
				// 누적
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

		// 출력
		for (int i = 0; i < sub.length; i++) {
			System.out.println();
			System.out.println("총점: " + sub[i][sub[i].length - 2]);
			System.out.println("평균: " + avg[i]);
			System.out.println("석차: " + sub[i][sub[i].length - 1] + "등");
		}

	}

}
