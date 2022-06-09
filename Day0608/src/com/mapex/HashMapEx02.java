package com.mapex;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx02 {

//	@SuppressWarnings("removal")
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

//		map.put("ȫ�浿", new Integer(90));
		map.put("ȫ�浿", 90);
		map.put("�̼���", 100);
		map.put("�̱���", 60);
		map.put("���ڹ�", 50);
		Set<Map.Entry<String, Integer>> set1 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it1 = set1.iterator();
		/*
		 * Ű�� ���� set ���·� ����(HashMap)�� �̿��ؼ� key�� value�� �����ֱ� ���ؼ� entry�� �̿��� map.entry :
		 * Ű�� ���� �ѽ�(���)�̴�. map.entrySet() : ����(�� Ŭ����) Ŭ������ ���ϴ� ��Ҹ� ������ ���� �÷��Ǻ並 �����ش�.
		 * (�÷��Ǻ�: �÷����� ������ �ִ°� ������) map entry ������ ����ϴ� ������ ����� �ݺ���(iterator)�� �̿��Ͽ� �����
		 */

		while (it1.hasNext()) {
			Map.Entry<String, Integer> e = it1.next();
			System.out.println("�̸�:" + e.getKey() + ", ����:" + e.getValue());
		}

		Set set2 = map.keySet();
		System.out.println("�̸�:" + set2);

		Collection<Integer> v = map.values();
		System.out.println("����:" + v);

		Iterator<Integer> it2 = v.iterator();
		Integer sum = 0;
		while (it2.hasNext()) {
			Integer i = it2.next();
			System.out.println("����:" + i);
			sum += i;
		}
		System.out.println("���� ��:" + sum);
		System.out.println("���� ���:" + sum / set2.size());
		System.out.println("�ִ밪:" + Collections.max(v));
		System.out.println("�ּҰ�:" + Collections.min(v));

		System.out.println(map);
	}

}
