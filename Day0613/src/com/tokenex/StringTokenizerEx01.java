package com.tokenex;

import java.util.StringTokenizer;

/*
 * java.util pakage에 포함
 * "2022/06/13"이라는 문자열을 delim(구분자를 /로) 각각 2022, 06, 13으로 분리할 때 사용한다.
 * 각각의 문자열을 토큰이라고 한다.
 * defaul value는 space(공백)이다.
 */

public class StringTokenizerEx01 {

	StringTokenizer st;

	public StringTokenizerEx01(String str) {
		System.out.println("str : " + str);
		st = new StringTokenizer(str);
	}

	public StringTokenizerEx01(String str, String delim) {
		System.out.println("str : " + str);
		st = new StringTokenizer(str, delim);
	}

	public void print() {
		System.out.println("Token count:" + st.countTokens());
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}

	}

	public static void main(String[] args) {
		StringTokenizerEx01 st1 = new StringTokenizerEx01("아 뭐라는거야 진짜!?!!? 아오");
		st1.print();
		System.out.println("\n");
		StringTokenizerEx01 st2 = new StringTokenizerEx01("2022/06/13", "/");
		st2.print();
	}

}
