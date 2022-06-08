package com.vectorex;

import java.util.Collections;
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
		Collections.sort(v);

		// �������� ��
		System.out.println("********************");
		System.out.println("�������� ����\n" + v);

		// �˻��� �������� ���ĵ� �ڷῡ���� �����ϴ�.
		int idx1 = Collections.binarySearch(v, "���λ�");
		System.out.println("���λ�: " + idx1 + " index�� ����"); // ������ index ���
		int idx2 = Collections.binarySearch(v, "����");
		System.out.println("����: " + idx2); // ������ ���� ���

		// �������� ����
		Collections.sort(v, Collections.reverseOrder());
		System.out.println("********************");
		System.out.println("�������� ����\n" + v);

		// �������� �˻�
		idx1 = Collections.binarySearch(v, "���λ�", Collections.reverseOrder());
		System.out.println("���λ�: " + idx1 + " index�� ����"); // �Ǵ�
		int idx4 = Collections.binarySearch(v, "����");
		System.out.println("����: " + idx4);

		// ���� �ٸ� ������� �˻�(���� ���ϰ�!)
		System.out.println("********************");
		String s = "�����";
		if (v.contains(s)) {
			int i = v.indexOf(s) + 1; // index+1 �Ѱ�
			System.out.println(s + "--> ��ġ: " + i);
		}

		// ����
		System.out.println("********************");
		v.remove(3);
		System.out.println("���λ��� ���� ��\n" + v);
		v.remove("��Ȳ��");
		System.out.println("��Ȳ���� ���� ��\n" + v);

	}

}
