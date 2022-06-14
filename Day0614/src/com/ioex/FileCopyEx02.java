
package com.ioex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// byte[] 단위로 복사
public class FileCopyEx02 {

	public static void main(String[] args) {
		System.out.println("파일 복사 시작.....");
		long start = System.currentTimeMillis();

		FileInputStream src = null; // 원본을 읽어줘서
		FileOutputStream dest = null; // 여기에 쓸거야!

		try {

			// 원본 파일 읽기 위한 FileInputStream 객체 생성
			src = new FileInputStream(new File("C:/ppp/src.txt"));
			// 복사 파일을 생성하기 위한 FileOutputStream 객체 생성
			dest = new FileOutputStream(new File("C:/ppp/des.txt"));

			// 임시 저장소에 저장된 data의 전체 개수를 저장할 변수를 선언
			int length = 0;
			// 임시 저장소로 사용할 byte 배열 생성
			byte[] buffer = new byte[1024 * 8]; // 1kbyte = 2^10

			// InputStream을 통해서 읽어들인 데이터를 임시 저장소에 저장하고 저장된 데이터의 길이만큼 length에 저장한다.

			while ((length = src.read(buffer)) != -1) {
				// OutputStream을 통해서 임시 저장소에 저장되어 있는 데이터를 length만큼 파일에 저장한
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
