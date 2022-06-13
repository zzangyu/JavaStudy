package com.tokenex;

import java.util.StringTokenizer;

public class StringTokenizer03_test {

	public static void main(String[] args) {
		String str = "삶이 그대를 속일지라도 슬퍼하거나 노여워하지말라.";
		StringTokenizer st = new StringTokenizer(str);

		System.out.println("Token count:" + st.countTokens());

		while (st.hasMoreElements()) {
			String stst = st.nextToken();
			System.out.println(stst);
		}

	}

}
