package com.ioex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx01 {

	public static void main(String[] args) {
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream("C:/ppp/fileout.txt");
			String message = "Study hard Java Programming !!! 아 진짜 집가고싶어서 미쳐버릴것같아 보내줘 제발";
			fos.write(message.getBytes());
			fos.close();
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (fos != null) // 내용이 있으면 닫아.
					fos.close();
			} catch (IOException ii) {
				ii.printStackTrace();
			}
		}

	}

}
