package com.study;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListEx {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		list1.add("�����⵿��");
		list1.add("���ɰ���");

		List<String> list2 = new ArrayList<>(list1);
		list2.add("��ǻŸ");

		List<String> list3 = new ArrayList<>();
		list3.addAll(list2);
		list3.add("����~");
		int n = list3.indexOf("���ɰ���");
		list3.add(n + 1, "�ڳ�");
		System.out.println(list3);

		ListIterator<String> it = list3.listIterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

	}

}
