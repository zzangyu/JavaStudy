package 과제;

import java.util.Scanner;
public class 구구단 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k, i, j;
		System.out.println("한줄에 몇개 !?");
		int limit = sc.nextInt();
		
		for (i = 2; i < 10; i += 3) {
			for (j = 1; j < 10; j++) {
				for (k = i; k < i + limit; k++)
					if(k<10) {
					System.out.print(k + "X" + j + "=" + k * j + "\t");
					}
					System.out.println();

			}
			System.out.println();

		}

	}

}
