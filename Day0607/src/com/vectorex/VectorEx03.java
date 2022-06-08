package com.vectorex;

import java.util.Vector;

public class VectorEx03 {

	private static final String colors[] = { "������", "�����", "���", "�Ķ���", "��Ȳ��", "���λ�", "�����" };

	public static void main(String[] args) {

		Vector<String> v = new Vector<>();

		for (String str : colors)
			v.add(str);
		System.out.println("���� �� vector: " + v);
		System.out.println("ù��° ���: " + v.firstElement());
		System.out.println("����° ���: " + v.get(3));
		System.out.println("������ ���: " + v.lastElement());
		System.out.println("vector�� size: " + v.size());
		System.out.println("vector�� ũ��: " + v.capacity());
		System.out.println("********************");

		v.set(0, "��");
		v.insertElementAt("��", 1);
		System.out.println("ù��° ��ġ�� �߰�: " + v.get(1));
		System.out.println("�ٲ� ù��° ���: " + v.firstElement());
		System.out.println("size: " + v.size());
		System.out.println("�ٲ�� �� �� vector�� element\n" + v);
		System.out.println("vector�� ũ��: " + v.capacity());
		System.out.println("********************");
		// ��ü ���
		for (String str : v)
			System.out.print(str + "  ");
		System.out.println();

		// �������� ����

	}

}
