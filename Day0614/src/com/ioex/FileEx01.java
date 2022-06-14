package com.ioex;

import java.io.File;

public class FileEx01 {

	public static void main(String[] args) {
//		File f = new File("C:\\ppp\\hello.txt"); ���� ��ġ�� �޴� ��! ��, �Ʒ� �����ؼ� ����
		File f = new File("C:/ppp/hello.txt");
		File d = new File("C:/ppp");

		System.out.println("�������� ����: " + f.isFile());
		System.out.println("���丮���� ����: " + f.isDirectory());
		System.out.println("���丮���� ����: " + d.isDirectory()); // ���丮 --> ����

		// ����� vs ������
		// ����� : ���� ��ġ�� �������� �� ���� ��ġ�� �ǹ��Ѵ�.
		// ������ : ��� ��� C:/ppp/hello.txt
		// . : ���� ��ġ
		// .. : ���� ��ġ�� �ٷ� ������ ���丮�� �ǹ�
		// / : ��Ʈ�� �ǹ� (\)

		System.out.println("��� ��� : " + f.getPath()); // wep���� Ȱ��ȴ�.
		System.out.println("���� ��� : " + f.getAbsolutePath());
		System.out.println("������ �̸� : " + f.getName());
		System.out.println("������ ���� : " + f.length()); // �ѱ� ���̰� 3..
		System.out.println("������ ���� ���� ��¥ : " + f.lastModified());

	}

}
