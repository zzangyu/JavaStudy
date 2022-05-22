package com.arrayex;

public class ArrayEx03 {

	public static void main(String[] args) {
		int[][] score = { { 99, 92 }, { 78, 48, 78, 98 }, { 95, 92, 30 }, { 37, 98, 23, 21, 19 }, { 29, 64, 83 } };

//		score[0] = new int[2]; // 99, 92
//		score[1] = new int[4]; // 78, 48, 78, 98
//		score[2] = new int[3]; // 95, 92, 30
//		score[3] = new int[5]; // 37, 98, 23, 21, 19
//		score[4] = new int[3]; // 29, 64, 83

		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			for (int k = 0; k < score[i].length; k++) {
				sum += score[i][k];
				System.out.print(score[i][k] + "\t");
			}
			System.out.printf("ÃÑÁ¡: %d, Æò±Õ: %.2f", sum, (double) (sum / score[i].length));
			System.out.println();
		}
	}

}
