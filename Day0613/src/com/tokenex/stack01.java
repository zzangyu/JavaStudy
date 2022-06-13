package com.tokenex;

import java.util.Random;
import java.util.Stack;

public class stack01 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();

		// 내 풀이
		System.out.print("스택 push 순서: ");
		for (int i = 0; i < 10; i++) {
			int a = (int) (Math.random() * 200) - 100;
			stack.push(a);
			System.out.print(a + " ");
		}
		System.out.print("\n스택 pop 순서: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println();

		// 선생님 풀이
		Random r = new Random();
		int nNum, n; // nNum: 랜덤으로 생성된 정수를 저장하는 변수
		System.out.print("스택 push 순서: ");
		for (n = 0; n < 10; n++) {
			r.setSeed(r.nextLong()); // seed 생성, 가장 큰 범위를 만들어준것이다. (단순히 배정해둔것)

			nNum = (r.nextInt() % 100); // 0~99 사이의 숫자를 생성하라.
			stack2.push(nNum);
			System.out.print(nNum + " ");
		}
		// 스택에 저장된 수를 출력
		System.out.print("\n스택 pop 순서: ");
		for (n = 0; n < 10; n++) {
			System.out.print(stack2.pop() + " ");
		}

	}

}
