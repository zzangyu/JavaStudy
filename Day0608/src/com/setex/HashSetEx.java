package com.setex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		// set: �ߺ� ���x, ����x
		Set<String> dog = new HashSet<>();

		dog.add("������");
		dog.add("ǳ�갳");
		dog.add("����Ʈ");
		System.out.println("���� set ������:" + dog);
		dog.add("������"); // �ߺ���� ���Ѵ�.
		System.out.println("�߰� �� set ������: " + dog);

		Iterator<String> it = dog.iterator();
		int i = 1;
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(i + "��° ������ ������: " + str);
			i++;
		}

	}

}
