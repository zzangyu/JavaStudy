package com.tokenex;

import java.util.StringTokenizer;

public class StringTokenizer03_test {

	public static void main(String[] args) {
		String str = "���� �״븦 �������� �����ϰų� �뿩����������.";
		StringTokenizer st = new StringTokenizer(str);

		System.out.println("Token count:" + st.countTokens());

		while (st.hasMoreElements()) {
			String stst = st.nextToken();
			System.out.println(stst);
		}

	}

}
