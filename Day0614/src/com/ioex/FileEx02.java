package com.ioex;

import java.io.File;

public class FileEx02 {

	public static void main(String[] args) {
		File directory = new File("c:/");

		if (directory.exists()) { // ���� ���� ���� �˻�
			if (directory.isDirectory()) { // ���丮���� �˻�
				// ���� ���丮 ���� ��� ���� ����Ʈ ���, ��Ʈ�� �迭�� ����
				String[] fileNameList = directory.list();

				// ���� ��� ���
				for (String fileName : fileNameList) {
					System.out.println("���� �̸�:" + fileName);
				}

			}
		}

	}

}
