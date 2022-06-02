package com.excp1;

import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 100;
		int result = 0;
		for (int i = 0; i < 10; i++) {
			try {
				result = num / (int) (Math.random() * 10);
				System.out.println(result);
			} catch (ArithmeticException e) {
//				e.printStackTrace();
				System.out.println("0으로 나눌 수 없어요 !! 바보야 !!");
			}
		}
	}

}
