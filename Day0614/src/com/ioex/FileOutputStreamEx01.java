package com.ioex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx01 {

	public static void main(String[] args) {
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream("C:/ppp/fileout.txt");
			String message = "Study hard Java Programming !!! �� ��¥ ������; ���Ĺ����Ͱ��� ������ ����";
			fos.write(message.getBytes());
			fos.close();
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (fos != null) // ������ ������ �ݾ�.
					fos.close();
			} catch (IOException ii) {
				ii.printStackTrace();
			}
		}

	}

}
