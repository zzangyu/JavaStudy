package com.excp1;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dividend;
		int divisor;
		// 나뉨 수 - dividend
		System.out.print("나뉨 수 입력: ");
		dividend = sc.nextInt();
		// 나눌 수 - divisor
		System.out.print("나눌 수 입력: ");
		divisor = sc.nextInt();
		try {
			System.out.println(dividend + "를" + divisor + "로 나누면 몫은 " + dividend / divisor + "입니다.");
		} catch (ArithmeticException e) {
//			e.printStackTrace();
//			e.getMessage();
			System.out.println("세상에 0으로 나누셨네요.. 후덜덜 ;;");
		} finally {
			sc.close();
		}
	}

}
