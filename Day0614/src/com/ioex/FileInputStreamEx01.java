package com.ioex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx01 {

	public static void main(String[] args) {
		FileInputStream fis = null;

		byte _console[] = new byte[100]; // 키보드로 입력한 값을 console 배열에 저장한다.
		byte _read[] = new byte[100]; // 파일을 읽기위한 배열 선언, 100byte를 읽어서 저장

		try {
			System.out.print("파일명 : ");
			System.in.read(_console);

			String file = new String(_console).trim(); // trim: 양쪽 공백을 제거한다.

			fis = new FileInputStream(file);
			fis.read(_read, 0, _read.length);
			System.out.println(new String(_read).trim());

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if(fis != null) // 내용이 있으면 닫아.
				fis.close(); 
			} catch (IOException ii) {
				ii.printStackTrace();
			}
		}

	}

}
