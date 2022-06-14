package com.ioex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx01 {

	public static void main(String[] args) {
		FileInputStream fis = null;

		byte _console[] = new byte[100]; // Ű����� �Է��� ���� console �迭�� �����Ѵ�.
		byte _read[] = new byte[100]; // ������ �б����� �迭 ����, 100byte�� �о ����

		try {
			System.out.print("���ϸ� : ");
			System.in.read(_console);

			String file = new String(_console).trim(); // trim: ���� ������ �����Ѵ�.

			fis = new FileInputStream(file);
			fis.read(_read, 0, _read.length);
			System.out.println(new String(_read).trim());

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if(fis != null) // ������ ������ �ݾ�.
				fis.close(); 
			} catch (IOException ii) {
				ii.printStackTrace();
			}
		}

	}

}
