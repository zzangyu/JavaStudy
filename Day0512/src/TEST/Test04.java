package TEST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test04 {

	public static void main(String[] args) throws IOException {
		// 3명, 국어 영어 수학 ,점수 입력받고 총점/평균 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] subname = { "국어", "영어", "수학" };
		int[][][] sub = new int[2][3][subname.length + 3]; // 총점, 석차를 저장할 공간 확보
		float[][] avg = new float[2][3];
		for (int h = 0; h < sub.length; h++) {
			for (int i = 0; i < sub[h].length; i++) { // 사람
				for (int j = 0; j < sub[h][i].length - 3; j++) {

					do {
						System.out.print(subname[j] + "점수");
						sub[h][i][j] = Integer.parseInt(br.readLine());
					} while (sub[h][i][j] < 0 || sub[h][i][j] > 100);
					// 누적
					sub[h][i][sub[h][i].length - 3] += sub[h][i][j];
				}
				avg[h][i] = sub[h][i][sub[h][i].length - 3] / (float) (sub[h][i].length - 3);
				sub[h][i][sub[h][i].length - 2] = 1;
				sub[h][i][sub[h][i].length - 1] = 1;
			}
		} // 반 석차
		for (int h = 0; h < sub.length; h++) {
			for (int i = 0; i < sub[h].length; i++) {
				for (int j = 0; j < sub[h].length; j++) {
					if (sub[h][i][sub[h][i].length - 3] < sub[h][j][sub[h][j].length - 3]) {
						sub[h][i][sub[h][i].length - 2]++;
					}
				}
			}
		} // 전교 석차
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
		String[] name = { "한찬규", "규찬한", "찬규한" };
		// 출력
		for (int h = 0; h < sub.length; h++) {
			for (int i = 0; i < sub[h].length; i++) {
				System.out.print(name[i] + "\t");
				System.out.print("총점: " + sub[h][i][sub[h][i].length - 3] + "\t");
				System.out.printf("평균: %.2f\t", avg[h][i]);
				System.out.print("반석차: " + sub[h][i][sub[h][i].length - 2] + "등\t");
				System.out.println("전교석차: " + sub[h][i][sub[h][i].length - 1] + "등");
			}
		}
	}
}
