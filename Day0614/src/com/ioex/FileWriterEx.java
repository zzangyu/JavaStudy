package com.ioex;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

// File에 문자를 기록한다.

public class FileWriterEx {

	public static void main(String[] args) {

		FileWriter fw = null;

		try {
			// 파일에 한 문자 단위로 기록할 수 있는 FileWriter 객체 생성

			fw = new FileWriter("c:/ppp/song.txt");
			// fw는 문자열을 바로 기록할 수 있다.

			fw.write("노래 시작했다~ 노래 끝났다~ 아리랑 독도는 우리땅!!!");
			// 한글자 단위로 읽고 쓸 수 있는 Reader, Writer 계열의 스트림은 내부적으로 Buffer를 내장하고 있다.
			// 내장된 Buffer가 가득 채워질 때에만 스트림을 통해 내보낸다.
			// 그래서 가득 채워지지 않은 상태에서 buffer를 비워야할 경우 flush() method를 활용한다.

			fw.flush();

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}

	}

}
