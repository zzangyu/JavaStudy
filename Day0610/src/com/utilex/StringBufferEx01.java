package com.utilex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//버퍼란 ?
//- 버퍼는 데이터를 한곳에서 다른 한곳으로 전송하는 동안 일시적으로 그 데이터를 보관하는 메모리영역(임시메모리)
//버퍼링이란 ?
//- 버퍼를 채우는 동작을 의미한다.

public class StringBufferEx01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.print("문자열 입력: ");
//		String str = br.readLine(); // : 이후에 입력되는 공간이 버퍼다! enter를 치면 버퍼가 비워지는것(메모리로 이동함)
//		System.out.println(str);

		StringBuffer sb = new StringBuffer("JAVA");
		System.out.println(sb);
		System.out.println(sb.capacity()); // java 4개 + 기본 16개
		sb.append("1.8"); // 추가
		System.out.println(sb);
		sb.delete(3, 5);// 3에서부터 5까지지만 3,4가 지워짐
		System.out.println(sb);
		sb.insert(3, "A1");
		System.out.println(sb);
		sb.replace(4, 7, "일점팔");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

	}

}
