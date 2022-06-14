package com.ioex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// byte ������ �����ߴ�.
public class FileCopyEx01 {

	public static void main(String[] args) {
		System.out.println("���� ���� ����.....");
		long start = System.currentTimeMillis();

		FileInputStream src = null; // ������ �о��༭
		FileOutputStream dest = null; // ���⿡ ���ž�!

		try {

			// ���� ���� �б� ���� FileInputStream ��ü ����
			src = new FileInputStream(new File("C:/windows/win.ini"));
			// ���� ������ �����ϱ� ���� FileOutputStream ��ü ����
			dest = new FileOutputStream(new File("C:/ppp/dest.txt"));

			// FileInputStream �� ���� �о���� ���� ������ ���� ����
			int readValue = 0;
			// FileInputStream �� read() method�� ���ؼ� �о���� ���� readValue�� ����
			while ((readValue = src.read()) != -1) { // ������ ���� �� -1�� �Ǵϱ� �� ������ ����
				// readValue�� ����� ���� FileOutputStream�� write() method�� ���ؼ� ���Ͽ� �����Ѵ�.
				dest.write(readValue);
			}

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
