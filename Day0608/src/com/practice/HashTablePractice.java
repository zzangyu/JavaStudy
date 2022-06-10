package com.practice;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashTablePractice {

	private static final int[] number = { 1, 2, 3, 4, 5 };
	private static final int[] numberMultiple10 = { 10, 20, 30, 40, 50 };

	public static void main(String[] args) {

		Hashtable<Integer, Integer> ht = new Hashtable<>();

		for (int i = 0; i < number.length; i++) {
			ht.put(number[i], numberMultiple10[i]);
		}
//		int a = ht.get(1);
//		System.out.println("1을 10 곱하면 " + a);
		Scanner sc = new Scanner(System.in);
		System.out.println("value를 구하기 위한 정수(key값)를 입력 해주세요.");
		int A = sc.nextInt();
		if (ht.containsKey(A)) {
			System.out.println("value [" + ht.get(A) + "]");
		} else {
			System.out.println("key값이 존재하지 않습니다.");
		}

		System.out.println("정수(key값)를 입력 해주세요.");
		int B = sc.nextInt();
		Set<Integer> set = ht.keySet();
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			if (B == key) {
				System.out.println("key [" + B + "]");
			}
		}
	}

}
