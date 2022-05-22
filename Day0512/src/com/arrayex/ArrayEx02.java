package com.arrayex;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 배열을 선언해서 과목을 받는다.
		for (int i = 0; i < args.length; i++) {
			System.out.println((i + 1) + "번째 과목: " + args[i]);
		}
	}

}
