
package com.ioex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// byte[] ������ ����
public class FileCopyEx02 {

	public static void main(String[] args) {
		System.out.println("���� ���� ����.....");
		long start = System.currentTimeMillis();

		FileInputStream src = null; // ������ �о��༭
		FileOutputStream dest = null; // ���⿡ ���ž�!

		try {

			// ���� ���� �б� ���� FileInputStream ��ü ����
			src = new FileInputStream(new File("C:/ppp/src.txt"));
			// ���� ������ �����ϱ� ���� FileOutputStream ��ü ����
			dest = new FileOutputStream(new File("C:/ppp/des.txt"));

			// �ӽ� ����ҿ� ����� data�� ��ü ������ ������ ������ ����
			int length = 0;
			// �ӽ� ����ҷ� ����� byte �迭 ����
			byte[] buffer = new byte[1024 * 8]; // 1kbyte = 2^10

			// InputStream�� ���ؼ� �о���� �����͸� �ӽ� ����ҿ� �����ϰ� ����� �������� ���̸�ŭ length�� �����Ѵ�.

			while ((length = src.read(buffer)) != -1) {
				// OutputStream�� ���ؼ� �ӽ� ����ҿ� ����Ǿ� �ִ� �����͸� length��ŭ ���Ͽ� ������
				dest.write(buffer, 0, length);
				System.out.println(length);
			}
			System.out.println(length);

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (dest != null) // ������ ������ �ݾ�.
					dest.close();
			} catch (IOException ii) {
				ii.printStackTrace();
			}
			try {
				if (src != null) // ������ ������ �ݾ�.
					src.close();
			} catch (IOException ii) {
				ii.printStackTrace();
			}
		}

		long end = System.currentTimeMillis();
		long copyTime = (end - start) / 1000; // �� ������ ȯ��
		System.out.println("���翡 �ɸ� �ð�:" + copyTime + "��");

	}

}
