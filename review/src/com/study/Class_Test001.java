package com.study;

/*
 * ���� ������ �ʱ�ȭ ������ ��ġ�� ������ ����� �� ����.
 * (�ڵ� �ʱ�ȭ ����� �������� �ʴ´�.)
 */
public class Class_Test001 {
	static int c; // ��������()
	int d; // ��������(�ν��Ͻ� �������)
	// ����ϴ� �������� �ʱ�ȭ�� ���� ���� ��� int���� �����Ϸ��� �ڵ����� 0���� �ʱ�ȭ �ȴ�.
	// �迭�̸� null ��, boolean�̸� false

	public static void main(String[] args) {
		int a;
		// System.out.println(a); compile error �� !
		int b = 10;
		System.out.println("b: " + b);
		System.out.println("c: " + c); // static�̶� �ٷ� ��� ���� !
		System.out.println("d: " + new Class_Test001().d);

	}

}
