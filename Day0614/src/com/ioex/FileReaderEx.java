package com.ioex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		FileReader fr = null;

		try {
			// ���Ϸκ��� �ѹ��ڴ����� �о� �� �� �ִ� FileReader ��ü ����
			fr = new FileReader("c:/ppp/song.txt");
			// Stream�� ���ؼ� �о���� �����ڵ� ���� ������ ���� ����

			int readValue = 0;

			while ((readValue = fr.read()) != -1) {
				System.out.print((char) readValue);
			}

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}

}
