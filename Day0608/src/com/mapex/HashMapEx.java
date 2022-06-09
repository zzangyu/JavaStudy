package com.mapex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map<key, value>
 * key�� �ߺ��� ������� ������ value�� �ߺ��� ����Ѵ�.
 * key���� �ߺ��� �� ��� ���� �����ؾ��Ѵ�.
 */

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("����", "��ȿ��");
		map.put("��ȭ", "���ǽ�");
		map.put("ȣ��", "��ũ��");
		map.put("��ȭ", "Ȳȥ���� ��������");
		System.out.println(map);
		String key;
		Set set = map.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			key = it.next();
			System.out.println(map.get(key) + "  ");
			System.out.println(key + "  ");
		}

		map.put("��ȭ", "�޸��߳���");
		System.out.println(map); // key���� ���� �ȵǰ� value�� �ٲ�,,

	}

}
