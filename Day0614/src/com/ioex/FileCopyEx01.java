package com.ioex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// byte 단위로 복사했다.
public class FileCopyEx01 {

	public static void main(String[] args) {
		System.out.println("파일 복사 시작.....");
		long start = System.currentTimeMillis();

		FileInputStream src = null; // 원본을 읽어줘서
		FileOutputStream dest = null; // 여기에 쓸거야!

		try {

			// 원본 파일 읽기 위한 FileInputStream 객체 생성
			src = new FileInputStream(new File("C:/windows/win.ini"));
			// 복사 파일을 생성하기 위한 FileOutputStream 객체 생성
			dest = new FileOutputStream(new File("C:/ppp/dest.txt"));

			// FileInputStream 을 통해 읽어들인 값을 저장할 변수 선언
			int readValue = 0;
			// FileInputStream 의 read() method를 통해서 읽어들인 값을 readValue에 저장
			while ((readValue = src.read()) != -1) { // 파일의 끝일 때 -1이 되니까 그 전까지 복사
				// readValue에 저장된 값을 FileOutputStream의 write() method를 통해서 파일에 저장한다.
				dest.write(readValue);
			}

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (dest != null) // 내용이 있으면 닫아.
					dest.close();
			} catch (IOException ii) {
				ii.printStackTrace();
			}
			try {
				if (src != null) // 내용이 있으면 닫아.
					src.close();
			} catch (IOException ii) {
				ii.printStackTrace();
			}
		}

		long end = System.currentTimeMillis();
		long copyTime = (end - start) / 1000; // 초 단위로 환산
		System.out.println("복사에 걸린 시간:" + copyTime + "초");

	}

}
