package com.study;

import java.util.Stack;

public class StackTest { // pop: 뺄 때, push: 넣을 때
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
		while (!st.empty()) { // 스택이 비어 있지 않으면 pop해라.
			System.out.println(st.pop());
		}

	}

	public static void main(String[] args) {
		StackTest st = new StackTest();
	}

}
