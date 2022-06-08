package com.vectorex;

import java.util.Collections;
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
		Collections.sort(v);

		// 오름차순 후
		System.out.println("********************");
		System.out.println("오름차순 정렬\n" + v);

		// 검색은 오름차순 정렬된 자료에서만 가능하다.
		int idx1 = Collections.binarySearch(v, "연두색");
		System.out.println("연두색: " + idx1 + " index에 있음"); // 있으면 index 출력
		int idx2 = Collections.binarySearch(v, "초초");
		System.out.println("초초: " + idx2); // 없으면 음수 출력

		// 내림차순 정렬
		Collections.sort(v, Collections.reverseOrder());
		System.out.println("********************");
		System.out.println("내림차순 정렬\n" + v);

		// 내림차순 검색
		idx1 = Collections.binarySearch(v, "연두색", Collections.reverseOrder());
		System.out.println("연두색: " + idx1 + " index에 있음"); // 또는
		int idx4 = Collections.binarySearch(v, "초초");
		System.out.println("초초: " + idx4);

		// 위와 다른 방법으로 검색(정렬 안하고!)
		System.out.println("********************");
		String s = "노란색";
		if (v.contains(s)) {
			int i = v.indexOf(s) + 1; // index+1 한것
			System.out.println(s + "--> 위치: " + i);
		}

		// 삭제
		System.out.println("********************");
		v.remove(3);
		System.out.println("연두색을 지운 뒤\n" + v);
		v.remove("주황색");
		System.out.println("주황색을 지운 뒤\n" + v);

	}

}
