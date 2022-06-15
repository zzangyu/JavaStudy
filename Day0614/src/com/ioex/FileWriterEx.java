package com.ioex;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

// File�� ���ڸ� ����Ѵ�.

public class FileWriterEx {

	public static void main(String[] args) {

		FileWriter fw = null;

		try {
			// ���Ͽ� �� ���� ������ ����� �� �ִ� FileWriter ��ü ����

			fw = new FileWriter("c:/ppp/song.txt");
			// fw�� ���ڿ��� �ٷ� ����� �� �ִ�.

			fw.write("�뷡 �����ߴ�~ �뷡 ������~ �Ƹ��� ������ �츮��!!!");
			// �ѱ��� ������ �а� �� �� �ִ� Reader, Writer �迭�� ��Ʈ���� ���������� Buffer�� �����ϰ� �ִ�.
			// ����� Buffer�� ���� ä���� ������ ��Ʈ���� ���� ��������.
			// �׷��� ���� ä������ ���� ���¿��� buffer�� ������� ��� flush() method�� Ȱ���Ѵ�.

			fw.flush();

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}

	}

}
