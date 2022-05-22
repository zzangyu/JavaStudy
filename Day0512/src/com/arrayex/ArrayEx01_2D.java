package com.arrayex;

public class ArrayEx01_2D {

	public static void main(String[] args) {
		/*
		 * 2차원 배열의 선언과 초기화 방법1 int[][] arr12312312312 = new int[3][]; // 자바는 1차원만 관리하기
		 * 때문에 오류가 없음 ! int[][] arr = new int[3][3]; // 행: row, 열: col
		 */
		int[][] arr = new int[5][5];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;

		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] arr3 = new int[5][5];
		int n = 1;
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				arr3[i][j] = n;
				n++;
				System.out.printf("%d\t", arr3[i][j]);
			}
			System.out.println();
		}

		// 출력

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.printf("%2d", arr2[i][j]);
			}
			System.out.println();
		}

	}

}
