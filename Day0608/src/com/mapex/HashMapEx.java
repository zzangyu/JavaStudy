package com.mapex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map<key, value>
 * key는 중복을 허용하지 않지만 value는 중복을 허용한다.
 * key값이 중복이 될 경우 값을 변경해야한다.
 */

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("가수", "박효신");
		map.put("만화", "원피스");
		map.put("호러", "스크림");
		map.put("영화", "황혼에서 새벽까지");
		System.out.println(map);
		String key;
		Set set = map.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			key = it.next();
			System.out.println(map.get(key) + "  ");
			System.out.println(key + "  ");
		}

		map.put("영화", "달마야놀자");
		System.out.println(map); // key값은 변경 안되고 value만 바뀜,,

	}

}
