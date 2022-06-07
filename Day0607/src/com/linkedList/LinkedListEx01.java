package com.linkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListEx01 {

	private static final String colors1[] = { "검정", "노랑", "녹색", "파랑", "주황", "연두" };
	private static final String colors2[] = { "초록", "빨강", "흰색", "남색", "보라" };

	public LinkedListEx01() {
		List<String> list1 = new LinkedList<String>();
		List<String> list2 = new LinkedList<String>();

		for (String color : colors1) {
			list1.add(color);
		}
		for (String color : colors2) {
			list2.add(color);
		}
		printList(list1);

		list1.addAll(list2);

		removeItems(list1, 4, 7); // 4~6까지 지워진다.
		printList(list1);
		printList(list2);
		printReverseList(list1);

	}

	// 자료 제거
	private void removeItems(List<String> list, int start, int end) {
		list.subList(start, end).clear();

	}

	// 자료 출력
	public void printList(List<String> list) {
		for (String color : list) {
			System.out.printf("%s\t", color);
		}
		System.out.println();
	}

	// 역순 출력
	private static void printReverseList(List<String> list) {
		ListIterator<String> it = list.listIterator(list.size());
		while (it.hasPrevious()) {
			System.out.printf("%s\t", it.previous());
		}
	}

	public static void main(String[] args) {
		new LinkedListEx01();

	}

}
