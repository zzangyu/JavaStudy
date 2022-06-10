package com.sortex;

import java.util.Arrays;
import java.util.Comparator;

class Descending implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
//		if (o1 instanceof Comparable && o2 instanceof Comparable) {
		Comparable c1 = (Comparable) o1;
		Comparable c2 = (Comparable) o2;
		return c1.compareTo(c2) * -1; // -1�� ���ؼ� �⺻ ���Ĺ�Ŀ��� ������ �����Ѵ�.
//		}
//		return -1;
	}
}

public class ComparatorEx {

	public static void main(String[] args) {
		String[] strArr = { "dog", "lion", "cat", "tiger" };

		// �������� ����
		Arrays.sort(strArr);
		System.out.println("strArr:" + Arrays.toString(strArr));
		String[] strArr2 = { "aog", "bion", "cat", "diger" };

		// ��ҹ��� ���о���
		Arrays.sort(strArr2, String.CASE_INSENSITIVE_ORDER);
		System.out.println("strArr:" + Arrays.toString(strArr2));

		// �������� ����
		Arrays.sort(strArr2, new Descending());
		System.out.println("strArr:" + Arrays.toString(strArr2));
	}

}
