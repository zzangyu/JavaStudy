package com.setex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		// set: 중복 허용x, 순서x
		Set<String> dog = new HashSet<>();

		dog.add("진돗개");
		dog.add("풍산개");
		dog.add("세퍼트");
		System.out.println("기존 set 데이터:" + dog);
		dog.add("진돗개"); // 중복허용 안한다.
		System.out.println("추가 후 set 데이터: " + dog);

		Iterator<String> it = dog.iterator();
		int i = 1;
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(i + "번째 강아지 데이터: " + str);
			i++;
		}

	}

}
