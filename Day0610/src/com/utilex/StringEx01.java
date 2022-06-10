package com.utilex;

/*
 * String class
 * - ���ڿ��� �ǹ��ϴ� Ŭ����
 * - ��ü �ڷ��������� �⺻ �ڷ���ó�� ����Ѵ�.
 *
 * ������
 * String() : ����ִ� ���ڿ� ��ü�� �����ϰ� �ʱ�ȭ
 * String(char[] value) : ������ char�迭 ���� ������ ���������� �����Ͽ� ���ο� ���ڿ��� ������
 * String(String original) : String���� original ���ڿ��� ���Ӱ� ������ ���ڿ� ��ü �ʱ�ȭ��
 *
 * ��ü������
 * �ڵ�(�Ͻ��� ��ü����) - String s1 = " ";
 * ����(����� ��ü����) - String s2 = new String(" ");
 */
public class StringEx01 {

	public static void main(String[] args) {
		String s1 = "TEST";
		String s2 = "TEST";

		if (s1 == s2) {
			System.out.println("s1�� s2�� ����.");
		} else {
			System.out.println("s1�� s2�� ���� �ʴ�.");
		}
		System.out.println();
		String s3 = new String("Test");
		String s4 = new String("Test");
		if (s3 == s4) {
			System.out.println("s3�� s4�� ����.");
		} else {
			System.out.println("s3�� s4�� ���� �ʴ�.");
		}

//	�Ͻ��� ��ü ������ ����� ��ü������ ������
//	1. == �����ڴ� ��ü�� �ּҰ��� ���Ѵ�.
//	2. equals�� ��ü�� ���� ���Ѵ�.

		System.out.println();
		if (s1.equals(s2)) {
			System.out.println("s1�� s2�� ���� ����.");
		} else {
			System.out.println("s1�� s2�� ���� ���� �ʴ�.");
		}
		System.out.println();
		if (s3.equals(s4)) {
			System.out.println("s3�� s4�� ���� ����.");
		} else {
			System.out.println("s3�� s4�� ���� ���� �ʴ�.");
		}

//		String str = "hello";
//		StringBuffer(str); -> hello�� 5 + �⺻ ũ�� 16 -> ũ��: 21

	}

}
