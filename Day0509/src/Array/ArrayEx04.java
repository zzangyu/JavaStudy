package Array;

import java.util.Scanner;

public class ArrayEx04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, k, a = 0;

		System.out.print("행 입력해! - ");
		k = sc.nextInt();
		System.out.print("열 입력해! - ");
		j = sc.nextInt();

		int[][] aa = new int[k][j];

		for (i = 0; i < k; i++) {
			aa[i] = new int[i+1];
			for (j = 0; j < aa[i].length; j++) {
				aa[i][j] = a;
				a++;
				System.out.print(aa[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
