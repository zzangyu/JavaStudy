package com.tokenex;

import java.util.Random;
import java.util.Stack;

public class stack01 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();

		// �� Ǯ��
		System.out.print("���� push ����: ");
		for (int i = 0; i < 10; i++) {
			int a = (int) (Math.random() * 200) - 100;
			stack.push(a);
			System.out.print(a + " ");
		}
		System.out.print("\n���� pop ����: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println();

		// ������ Ǯ��
		Random r = new Random();
		int nNum, n; // nNum: �������� ������ ������ �����ϴ� ����
		System.out.print("���� push ����: ");
		for (n = 0; n < 10; n++) {
			r.setSeed(r.nextLong()); // seed ����, ���� ū ������ ������ذ��̴�. (�ܼ��� �����صа�)

			nNum = (r.nextInt() % 100); // 0~99 ������ ���ڸ� �����϶�.
			stack2.push(nNum);
			System.out.print(nNum + " ");
		}
		// ���ÿ� ����� ���� ���
		System.out.print("\n���� pop ����: ");
		for (n = 0; n < 10; n++) {
			System.out.print(stack2.pop() + " ");
		}

	}

}
