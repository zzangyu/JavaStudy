package com.vectorex;

import java.util.Vector;

public class VectorEx03 {

	private static final String colors[] = { "검정색", "노란색", "녹색", "파란색", "주황색", "연두색", "보라색" };

	public static void main(String[] args) {

		Vector<String> v = new Vector<>();

		for (String str : colors)
			v.add(str);
		System.out.println("변경 전 vector: " + v);
		System.out.println("첫번째 요소: " + v.firstElement());
		System.out.println("세번째 요소: " + v.get(3));
		System.out.println("마지막 요소: " + v.lastElement());
		System.out.println("vector의 size: " + v.size());
		System.out.println("vector의 크기: " + v.capacity());
		System.out.println("********************");

		v.set(0, "흰");
		v.insertElementAt("빨", 1);
		System.out.println("첫번째 위치에 추가: " + v.get(1));
		System.out.println("바뀐 첫번째 요소: " + v.firstElement());
		System.out.println("size: " + v.size());
		System.out.println("바뀌고 난 뒤 vector의 element\n" + v);
		System.out.println("vector의 크기: " + v.capacity());
		System.out.println("********************");
		// 전체 출력
		for (String str : v)
			System.out.print(str + "  ");
		System.out.println();

		// 오름차순 정렬

	}

}
