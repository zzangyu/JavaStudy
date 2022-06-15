package com.ioex;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamEx01 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		DataInputStream dis = null;

		try {
			fis = new FileInputStream("c:/ppp/data.sav");
			// �⺻ �ڷ����� Ÿ���� ������ä ����� ���� �о����
			// ������ �ݵ�� ����� ������� �о�;��Ѵ�.
			dis = new DataInputStream(fis);
			int i = dis.readInt();
			double d = dis.readDouble();
			String s = dis.readUTF();

			System.out.printf("i�� ��:%d, d�� ��:%.2	f s�� ��:%s", i, d, s);

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException ie2) {
				ie2.printStackTrace();
			}
			try {
				if (dis != null) {
					dis.close();
				}
			} catch (IOException ie3) {
				ie3.printStackTrace();
			}
		}
	}

}
