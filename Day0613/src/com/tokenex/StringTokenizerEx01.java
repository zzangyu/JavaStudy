package com.tokenex;

import java.util.StringTokenizer;

/*
 * java.util pakage�� ����
 * "2022/06/13"�̶�� ���ڿ��� delim(�����ڸ� /��) ���� 2022, 06, 13���� �и��� �� ����Ѵ�.
 * ������ ���ڿ��� ��ū�̶�� �Ѵ�.
 * defaul value�� space(����)�̴�.
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
		StringTokenizerEx01 st1 = new StringTokenizerEx01("�� ����°ž� ��¥!?!!? �ƿ�");
		st1.print();
		System.out.println("\n");
		StringTokenizerEx01 st2 = new StringTokenizerEx01("2022/06/13", "/");
		st2.print();
	}

}
