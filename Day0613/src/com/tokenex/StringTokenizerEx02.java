package com.tokenex;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerEx02 {

	public static void main(String[] args) {
		String str = "�б�,��,,���ӹ�";

		StringTokenizer tokens = new StringTokenizer(str, ",");

		for (int x = 1; tokens.hasMoreTokens(); x++) {
			System.out.print("���� " + x + ":" + tokens.nextToken() + "\t");
		}
		// StringTokenizer class�� ��쿡�� delim ���̿� ���ڿ��� ������ �����Ѵ�.
		// ���ǹ��� ������ �����ϰ� ����!
		System.out.println();

		System.out.println("=======================");
		String[] values = str.split(",");
		// ����� delim ���̿� �ƹ��͵� ��� ���� ���Ѵ�.
		// String class�� split() method�� ���ǹ��� ���鵵 �ϳ��� �ڸ��� �����Ѵ�.
		System.out.println(Arrays.toString(values));
		for (String string : values) {
			System.out.print(string + " ");
		}
		System.out.println();
		for (int x = 0; x < values.length; x++) {
			System.out.print("���� " + (x + 1) + ":" + values[x] + "\t");
		}

	}

}
