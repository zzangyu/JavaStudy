package com.utilex;

public class StringBufferEx02 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("1234567890");
		System.out.println("sb�� ũ��:" + sb.capacity()); // 0~9 (10) + �⺻ (16)
		System.out.println("sb�� ����:" + sb.length());
		sb.append("ABCDEFGHIJKLMNOPQ");
		System.out.println(sb);
		System.out.println("sb�� ũ��:" + sb.capacity()); // �߰� �� - 26�� 27���� �ȵ��ϱ� 26�� ������ 52�� �ǰ� ���۰� 2���ϱ� 54
		System.out.println("sb�� ����:" + sb.length()); // ������ ���� ������ �ڵ������� �Ҹ�ȴ�.

		sb.delete(1, 20);
		System.out.println("sb�� ũ��:" + sb.capacity());
		System.out.println("sb�� ����:" + sb.length());

	}

}
