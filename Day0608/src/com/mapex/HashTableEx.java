package com.mapex;

import java.util.Hashtable;

public class HashTableEx {

	private static final String[] name = { "�ö���", "��ũ���׽�", "����", "����", "�Ƹ������ڷ���", "�����" };
	private static final String[] tel = { "111-1111", "222-2222", "333-3333", "555-5555", "666-6666", "555-5555" };

	public static void main(String[] args) {

		Hashtable<String, String> ht = new Hashtable<String, String>();
		// �ؽ� ���̺� Ű, �����͸� �Է�
		for (int i = 0; i < name.length; i++) {
			ht.put(name[i], tel[i]);
		}
//		System.out.println(ht);

		// �ؽ� ���̺��� ���� Ű�� �̿��ؼ� �˻�
		String str = ht.get("�����");
		if (str != null) {
			System.out.println("������� ��ȭ��ȣ:" + str);
		}

		// Ű�� �����ϴ��� �˻�
		if (ht.contains("�ɽ���")) {
			System.out.println("�ɽ��� �ڷᰡ �����մϴ�.");
		} else {
			System.out.println("�ڷᰡ �������� �ʽ��ϴ�.");
		}

		// ���� �����ϴ��� �˻�
		if (ht.containsValue("555-5555")) {
			System.out.println("555-5555 �ڷᰡ �����մϴ�.");
		} else {
			System.out.println("�ڷᰡ �������� �ʽ��ϴ�.");
		}

		ht.remove("�����");
		if (ht.containsKey("�����")) {
			System.out.println("����찡 �����մϴ�.");
		} else {
			System.out.println("����찡 �������� �ʽ��ϴ�.");
		}

	}

}
