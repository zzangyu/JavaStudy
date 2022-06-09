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

//		map.put("홍길동", new Integer(90));
		map.put("홍길동", 90);
		map.put("이순신", 100);
		map.put("이기자", 60);
		map.put("빅자바", 50);
		Set<Map.Entry<String, Integer>> set1 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it1 = set1.iterator();
		/*
		 * 키와 값을 set 형태로 저장(HashMap)을 이용해서 key와 value를 묶어주기 위해서 entry를 이용함 map.entry :
		 * 키와 값의 한쌍(페어)이다. map.entrySet() : 현재(이 클래스) 클래스에 속하는 요소를 가지는 맵의 컬렉션뷰를 돌려준다.
		 * (컬렉션뷰: 컬렉션이 가지고 있는걸 보여줌) map entry 참조를 취득하는 유일한 방법은 반복자(iterator)를 이용하여 취득함
		 */

		while (it1.hasNext()) {
			Map.Entry<String, Integer> e = it1.next();
			System.out.println("이름:" + e.getKey() + ", 정수:" + e.getValue());
		}

		Set set2 = map.keySet();
		System.out.println("이름:" + set2);

		Collection<Integer> v = map.values();
		System.out.println("정수:" + v);

		Iterator<Integer> it2 = v.iterator();
		Integer sum = 0;
		while (it2.hasNext()) {
			Integer i = it2.next();
			System.out.println("정수:" + i);
			sum += i;
		}
		System.out.println("정수 합:" + sum);
		System.out.println("정수 평균:" + sum / set2.size());
		System.out.println("최대값:" + Collections.max(v));
		System.out.println("최소값:" + Collections.min(v));

		System.out.println(map);
	}

}
