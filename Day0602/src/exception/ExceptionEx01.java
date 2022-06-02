package exception;

import java.util.Scanner;

public class ExceptionEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int[] aa = { 1, 2 };
			System.out.println(aa[3]);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("인덱스 넘었자나");
		} finally {
			System.out.println("빠이널리~~~");
			sc.close();
		}

	}

}
