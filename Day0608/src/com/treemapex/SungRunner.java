package com.treemapex;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class SungRunner {

	public static void main(String[] args) {

		TreeMap<String, SungRec> map = new TreeMap<String, SungRec>();

		map.put("1111", new SungRec("�踻��", 80, 70, 80));
		map.put("3333", new SungRec("�Ը���", 60, 40, 80));
		map.put("2222", new SungRec("������", 90, 90, 90));
		map.put("0000", new SungRec("������", 100, 100, 100));
		map.put("0101", new SungRec("�Ҹ���", 30, 70, 40));

		String key;
		Set set = map.keySet();

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			key = it.next();
			SungRec data = map.get(key);
			System.out.printf("%4s, %3s, ����:%3d�� ����:%3d�� ����:%3d�� ����:%5d��\n", key, data.getName(), data.getKor(),
					data.getEng(), data.getMat(), data.getTot());
		}
	}

}
