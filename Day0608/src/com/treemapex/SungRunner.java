package com.treemapex;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class SungRunner {

	public static void main(String[] args) {

		TreeMap<String, SungRec> map = new TreeMap<String, SungRec>();

		map.put("1111", new SungRec("김말자", 80, 70, 80));
		map.put("3333", new SungRec("님말자", 60, 40, 80));
		map.put("2222", new SungRec("딤말자", 90, 90, 90));
		map.put("0000", new SungRec("림말자", 100, 100, 100));
		map.put("0101", new SungRec("밈말자", 30, 70, 40));

		String key;
		Set set = map.keySet();

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			key = it.next();
			SungRec data = map.get(key);
			System.out.printf("%4s, %3s, 국어:%3d점 영어:%3d점 수학:%3d점 총점:%5d점\n", key, data.getName(), data.getKor(),
					data.getEng(), data.getMat(), data.getTot());
		}
	}

}
