package com.ioex;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWiterEx {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintWriter pw = null;

		try {
			fos = new FileOutputStream("c:/ppp/hello.txt");
			bos = new BufferedOutputStream(fos);
			pw = new PrintWriter(bos, true); // true : autoflush 기능을 쓸 것인가 말 것인가 묻는거임!

			pw.println("오늘도 즐거운 !!");
			pw.println("점심시간이 찾아왔습니다 !");
			pw.println(100.0);
			pw.println(true);

		} catch (FileNotFoundException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}

				if (pw != null) {
					pw.close();
				}

				if (bos != null) {
					bos.close();
				}
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}

	}

}
