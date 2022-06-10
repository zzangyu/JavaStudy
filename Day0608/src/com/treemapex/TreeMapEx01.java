package com.treemapex;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx01 {

	public static void main(String[] args) {

		TreeMap<String, String> map = new TreeMap<>();
		map.put("��ȭ", "���ǽ�");
		map.put("ȣ��", "��ũ��");
		map.put("��ȭ", "Ȳȥ���� ��������");
		map.put("��ȭ", "����");
		map.put("����", "��ȿ��");
		map.put("tv", "���ѵ���");

		System.out.println(map);

		Map<String, String> submap = map.subMap("����", "��ȭ");
		Map<String, String> submap2 = map.subMap("����", false, "ȣ��", true);
		System.out.println(submap);
		System.out.println(submap2);

		/*
		 * TreeMap class�� sort(����)�� ���·� �ڷᰡ �߰��ȴ�. 
		 * TreeMap class�� SortedMap<K,V> subMap(K fromkey, K toKey) method 
		 * fromkey, tokey�� �̿��� ������ �����Ѵ�. (fromkey - ����, tokey-������)
		 * ��� �ϰ������-true, ��� �ϰ���� ������-false
		 */

	}

}
