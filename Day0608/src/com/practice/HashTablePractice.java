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
//		System.out.println("1�� 10 ���ϸ� " + a);
		Scanner sc = new Scanner(System.in);
		System.out.println("value�� ���ϱ� ���� ����(key��)�� �Է� ���ּ���.");
		int A = sc.nextInt();
		if (ht.containsKey(A)) {
			System.out.println("value [" + ht.get(A) + "]");
		} else {
			System.out.println("key���� �������� �ʽ��ϴ�.");
		}

		System.out.println("����(key��)�� �Է� ���ּ���.");
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
