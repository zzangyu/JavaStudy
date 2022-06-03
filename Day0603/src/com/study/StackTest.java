package com.study;

import java.util.Stack;

public class StackTest { // pop: �� ��, push: ���� ��
	private static final String colors[] = { "Black", "Yellow", "Green", "Blue", "Red", "Yellowish Green" };

	public StackTest() {
		Stack<String> st = new Stack<String>();

		for (String color : colors)
//			System.out.println(st.push(color));
			st.push(color);
		popStack(st);

	}

	public void popStack(Stack<String> st) {
		System.out.println("pop");
		while (!st.empty()) { // ������ ��� ���� ������ pop�ض�.
			System.out.println(st.pop());
		}

	}

	public static void main(String[] args) {
		StackTest st = new StackTest();
	}

}
