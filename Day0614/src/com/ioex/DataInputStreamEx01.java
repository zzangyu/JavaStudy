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
			// 기본 자료형의 타입을 유지한채 저장된 값을 읽어들임
			// 읽을땐 반드시 기록한 순서대로 읽어와야한다.
			dis = new DataInputStream(fis);
			int i = dis.readInt();
			double d = dis.readDouble();
			String s = dis.readUTF();

			System.out.printf("i의 값:%d, d의 값:%.2	f s의 값:%s", i, d, s);

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
