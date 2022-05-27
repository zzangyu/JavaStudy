package pratice;

import java.util.Scanner;

public class Integer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ют");
		int a = sc.nextInt();

		for (int i = 0; i <= (a - 2); i++) {
			if (i % 2 == 0) {
				System.out.print((i + 2) + " ");
			}
		}
	}

}
