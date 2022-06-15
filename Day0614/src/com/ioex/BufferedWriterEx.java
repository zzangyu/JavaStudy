package com.ioex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// 텍스트 파일에 문자 기록
public class BufferedWriterEx {

	public static void main(String[] args) {

		// Buffered Stream : Stream의 읽고 쓰는 기능을 위해 스트림 내부에 버퍼를 가지고 있는 스트림
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {

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
			try {
				if (bw != null) {
					bw.close();
				}
			} catch (IOException e3) {
				e3.printStackTrace();
			}
		}

	}

}
