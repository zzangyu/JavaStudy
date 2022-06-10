package com.treemapex;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx01 {

	public static void main(String[] args) {

		TreeMap<String, String> map = new TreeMap<>();
		map.put("만화", "원피스");
		map.put("호러", "스크림");
		map.put("영화", "황혼에서 새벽까지");
		map.put("방화", "쉬리");
		map.put("가수", "박효신");
		map.put("tv", "무한도전");

		System.out.println(map);

		Map<String, String> submap = map.subMap("가수", "영화");
		Map<String, String> submap2 = map.subMap("가수", false, "호러", true);
		System.out.println(submap);
		System.out.println(submap2);

		/*
		 * TreeMap class는 sort(정렬)된 상태로 자료가 추가된다. 
		 * TreeMap class의 SortedMap<K,V> subMap(K fromkey, K toKey) method 
		 * fromkey, tokey를 이용해 범위를 지정한다. (fromkey - 포함, tokey-불포함)
		 * 출력 하고싶으면-true, 출력 하고싶지 않으면-false
		 */

	}

}
