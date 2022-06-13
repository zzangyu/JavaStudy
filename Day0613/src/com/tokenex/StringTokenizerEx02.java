package com.tokenex;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerEx02 {

	public static void main(String[] args) {
		String str = "학교,집,,게임방";

		StringTokenizer tokens = new StringTokenizer(str, ",");

		for (int x = 1; tokens.hasMoreTokens(); x++) {
			System.out.print("문자 " + x + ":" + tokens.nextToken() + "\t");
		}
		// StringTokenizer class의 경우에는 delim 사이에 문자열이 없으면 무시한다.
		// 무의미한 공백을 무시하고 제거!
		System.out.println();

		System.out.println("=======================");
		String[] values = str.split(",");
		// 요놈은 delim 사이에 아무것도 없어도 무시 안한다.
		// String class의 split() method는 무의미한 공백도 하나의 자리로 인정한다.
		System.out.println(Arrays.toString(values));
		for (String string : values) {
			System.out.print(string + " ");
		}
		System.out.println();
		for (int x = 0; x < values.length; x++) {
			System.out.print("문자 " + (x + 1) + ":" + values[x] + "\t");
		}

	}

}
