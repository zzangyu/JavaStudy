package com.ioex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		FileReader fr = null;

		try {
			// 파일로부터 한문자단위로 읽어 올 수 있는 FileReader 객체 생성
			fr = new FileReader("c:/ppp/song.txt");
			// Stream을 통해서 읽어들인 유니코드 값을 저장할 변수 선언

			int readValue = 0;

			while ((readValue = fr.read()) != -1) { // 유니코드 -> 정수형으로 읽어오기 -> char로 강제형변환해서 출력
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
