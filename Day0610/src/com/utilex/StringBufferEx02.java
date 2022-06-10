package com.utilex;

public class StringBufferEx02 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("1234567890");
		System.out.println("sb의 크기:" + sb.capacity()); // 0~9 (10) + 기본 (16)
		System.out.println("sb의 길이:" + sb.length());
		sb.append("ABCDEFGHIJKLMNOPQ");
		System.out.println(sb);
		System.out.println("sb의 크기:" + sb.capacity()); // 추가 전 - 26에 27개가 안들어가니까 26을 만들어내서 52가 되고 버퍼가 2개니까 54
		System.out.println("sb의 길이:" + sb.length()); // 버퍼의 저장 공간은 자동적으로 소멸된다.

		sb.delete(1, 20);
		System.out.println("sb의 크기:" + sb.capacity());
		System.out.println("sb의 길이:" + sb.length());

	}

}
