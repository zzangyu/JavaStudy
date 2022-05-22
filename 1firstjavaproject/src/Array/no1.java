package Array;

import java.util.Scanner;

public class no1 {
	public static void main(String[] args) {

		int a, int1 = 0, i = 0;
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		int aa[] = new int[a];
		while (i < a && 1<= a && a<=1000000) {
			aa[i] = sc.nextInt();
			if(-1000000 <= aa[i] && aa[i] <= 1000000) {
				i++;
			}else{
				break;
			}
		}

		for (int b : aa) {
			if (b < min) {
				min = b;
			}
		}
		System.out.print(min + " ");

		for (int b : aa) {
			if (b > max) {
				max = b;
			}
		}
		System.out.print(max + " ");
	}
}
