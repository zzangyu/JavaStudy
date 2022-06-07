package com.linkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SearchExam01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("우리나라");
		list.add("우산");
		list.add("우리은행");
		list.add("대한민국");
		list.add("대한제국");
		list.add("대구");
		list.add("대형마트");
		list.add("자바");
		list.add("자연");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String search;
		// 입력받은 문자열로 시작하는 문자열 검색
		try {
			System.out.println("검색. 단어. 해.");
			search = br.readLine();

			ListIterator<String> it = list.listIterator();
			while (it.hasNext()) {
				String temp = it.next();
				if (temp.startsWith(search)) {
					System.out.println(temp);
				}
			}
		} catch (IOException io) {
			io.printStackTrace();
		}

	}
}
